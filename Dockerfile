FROM ubuntu:latest
LABEL authors="Aidana"

ENTRYPOINT ["top", "-b"]
WORKDIR /project
RUN mkdir -p /project/app
RUN ls -l /project
COPY . /project/app

