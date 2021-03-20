FROM openjdk:8
EXPOSE 8080
ADD build/libs/order-service-ecr.jar order-service-ecr.jar
ENTRYPOINT ["java","-jar","/order-service-ecr.jar"]