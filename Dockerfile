FROM java:8
ADD MSMoveETB-0.0.1-SNAPSHOT.jar MSMoveETB-0.0.1-SNAPSHOT.jar 
EXPOSE 9009 
CMD ["java","-Xms1024m","-Xmx5120m","-XX:PermSize=1024m","-XX:MaxPermSize=1024m","-jar","MSMoveETB-0.0.1-SNAPSHOT.jar","log.out","&"] 
