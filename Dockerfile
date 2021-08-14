FROM adoptopenjdk/openjdk16:jre-16_36
ADD startup.sh /startup.sh
ADD target/spending-*.jar /spending.jar
RUN chmod +x /startup.sh
ENTRYPOINT ["/bin/bash","-c","/startup.sh"]