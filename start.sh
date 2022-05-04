#!/bin/bash

# Pull new changes
git pull

# Prepare .jar
mvn clean
mvn package

# Stop docker-compose
docker-compose stop

# Start new deployment
docker-compose up --build -d