#!/bin/sh
mvn clean package && docker build -t com.br.utfpr/ex01-ejb .
docker rm -f ex01-ejb || true && docker run -d -p 9080:9080 -p 9443:9443 --name ex01-ejb com.br.utfpr/ex01-ejb