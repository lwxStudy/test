FROM openjdk:8-jre-alpine

ADD . /home/otmsapi/p2p/

EXPOSE 8086 8086/tcp

WORKDIR /home/otmsapi/p2p

CMD java -jar /home/otmsapi/p2p/otms-p2p-service.jar


