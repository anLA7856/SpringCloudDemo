##本文件供记录运行中的get

1.  启动eureka服务时候报错：`localhost.localdomain: localhost.localdomain: 未知的名称或服务`
 经查，是由于系统启动时候，回去读取系统hostname值，本系统读出是localhost.localdomain
 但是这个值，在/etc/hosts下面，并没有对应的ip，所以就报错了！
 解决方法两个：
 
  - 讲hostname值修改为hosts里面有的
  - 讲localhost.localdomain名字，写道hosts中对应127.0.0.1那一列
  
2.  linux报java.net.SocketException: 权限不够
  因为linux下1024以下端口需要root权限，所以最好将其改为1024以上
  还有解决方法：使用iptable转发，或者更改权限

3.  运行monitor时候，报错： A child container failed during start
  深究原因发现是这句：Caused by: java.lang.NoSuchMethodError: javax.servlet.ServletContext.addServ
  据猜测是servlet3.0相关依赖没有引入的关系 
  后面经过stackoverflow解决：https://stackoverflow.com/questions/24080541/getting-nosuchmethoderror-javax-servlet-servletcontext-addservlet-in-spring-boo
  加入一个依赖：
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-tomcat</artifactId>
      <scope>provided</scope>
  </dependency>
  
