FROM maven:3.6.3 as MVN

#tao thu muc lam viec
WORKDIR /app

#ENV HOST=192.168.238.129
#ENV DB=webshop
#ENV USER=root
#ENV PASSWORD=123456

#copy file pom.xml form local to /app
VOLUME C:\Users\lotus\.m2 /root/.m2
COPY pom.xml /app 
COPY src /app/src 

#run cmd
RUN mvn package 

#/app/target/ShopOnline-1.jar

FROM openjdk:8

WORKDIR /project

COPY --from=MVN /app/target/ShopOnline-1.jar /project

EXPOSE 8081

CMD ["java", "-jar", "ShopOnline-1.jar"]