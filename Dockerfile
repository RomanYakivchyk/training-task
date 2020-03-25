COPY ./target/firestore-connector-1.0.jar /usr/src/firestore-connector/firestore-connector-1.0.jar
WORKDIR /usr/src/firestore-connector
CMD ["java", "-jar", "firestore-connector-1.0.jar"]