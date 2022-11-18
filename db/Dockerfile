FROM mysql:8

# COPY schema.sql /docker-entrypoint-initdb.d
# VOLUME /opt/lib/mysql:/var/lib/mysql
VOLUME ./storage:/var/lib/mysql

ENV MYSQL_DATABASE=${MYSQL_DATABASE}
ENV MYSQL_ROOT_HOST=${MYSQL_ROOT_HOST}
ENV MYSQL_ROOT_PASSWORD=${MYSQL_ROOT_PASSWORD}

EXPOSE ${MYSQL_PORT}
# docker build . --tag sns_db:test
# docker run -d -p 3306:3306 --env-file ./.env --name sns_db sns_db:test