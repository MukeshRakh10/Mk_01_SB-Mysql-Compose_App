FROM openjdk:11

COPY target/spring-boot-application-2.3.8.RELEASE.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "spring-boot-application-2.3.8.RELEASE.jar"]
