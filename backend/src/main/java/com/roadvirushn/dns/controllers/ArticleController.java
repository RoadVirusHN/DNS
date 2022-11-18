package com.roadvirushn.dns.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.roadvirushn.dns.entities.Article;
import com.roadvirushn.dns.repositories.ArticleRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path="/api") // This means URL's start with /api (after Application path)
public class ArticleController {
  @Autowired // This means to get the bean called userRepository
         // Which is auto-generated by Spring, we will use it to handle the data
  private ArticleRepository articleRepository;

  @PostMapping(path="/article") // Map ONLY POST Requests
  public @ResponseBody String addNewArticle (@RequestParam String content) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    Article n = new Article();
    n.setContent(content);
    articleRepository.save(n);
    return "Saved";
  }

  @GetMapping(path="/article/all")
  public @ResponseBody Iterable<Article> getAllArticles() {
    // This returns a JSON or XML with the users
    return articleRepository.findAll();
  }
}