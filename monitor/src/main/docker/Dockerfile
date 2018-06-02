FROM java:8
VOLUME /tmp/docker
RUN mkdir /app
ADD monitor-1.1-SNAPSHOT.jar /app/app.jar
ADD runboot.sh /app/
RUN bash -c 'touch /app/app.jar'
WORKDIR /app
RUN chmod a+x runboot.sh
EXPOSE 8989
CMD /app/runboot.sh