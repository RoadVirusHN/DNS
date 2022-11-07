FROM mysql:8

# COPY schema.sql /docker-entrypoint-initdb.d
# VOLUME /opt/lib/mysql:/var/lib/mysql
VOLUME ./storage:/var/lib/mysql
        
EXPOSE 3306