FROM openjdk:8
ADD target/.jar .jar

ENTRYPOINT ["java","-jar",".jar"]