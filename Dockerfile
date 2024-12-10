FROM ubuntu:latest
LABEL authors="Aidana"

ENTRYPOINT ["top", "-b"]
FROM gradle:8.7.0-jdk21

# Устанавливаем рабочую директорию в контейнере
WORKDIR /project

# Копируем файлы в контейнер
COPY . .

# Устанавливаем зависимости
RUN gradle clean install
