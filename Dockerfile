FROM openjdk:8u181-jdk
RUN mkdir -p /usr/local/myapp
COPY ./fs-app-backend/target/fs-app-backend-0.0.1-SNAPSHOT.jar /usr/local/myapp/fs-0.0.1-SNAPSHOT.jar
WORKDIR /usr/local/myapp
#OpenShift restrictions
CMD java -jar fs-0.0.1-SNAPSHOT.jar -Xms256m -Xmx256m -XX:MaxRAM=256000000, -XX:MaxHeapSize=256000000