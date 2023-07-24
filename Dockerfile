FROM openjdk:8
EXPOSE 8181
ADD target/proj_gitaction.jar  proj_gitaction.jar
ENTRYPOINT ["java","-jar","/proj_gitaction.jar"]