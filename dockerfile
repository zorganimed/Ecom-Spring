FROM openjdk:17-jdk

COPY ./target/light-ecom-v1-0.0.1-SNAPSHOT.jar usr/app/ecom.jar

WORKDIR usr/app

EXPOSE 8086

ENTRYPOINT ["java", "-jar" , "ecom.jar"]
