FROM openjdk:11
WORKDIR /usr/src/axon-server
COPY axonserver-4.3.1.jar /usr/src/axon-server/axonserver-4.3.1.jar
CMD ["java", "-jar", "axonserver-4.3.1.jar"]