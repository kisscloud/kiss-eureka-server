# 服务发现中心

## 1. 程序运行

```
$ git clone git@github.com:kisscloud/kiss-eureka-server.git
$ cd kiss-eureka-server
$ mvn install -Dmaven.test.skip=true
$ mvn package -Dmaven.test.skip=true
$ java -jar /opt/apps/kiss-eureka-server/target/kiss-eureka-server-0.0.1-SNAPSHOT.jar 
  / -Dspring.config.location=/opt/configs/kiss-eureka-server/application.yml
```

## 2. 配置文件

编辑配置文件：

```
$ vim /opt/configs/kiss-eureka-server/application.yml
```

配置文件内容：

```
# 服务监听端口
server:
  port: 8761

# Eureka 配置
eureka:
  instance:
    hostname: localhost
  client:
    service-url:
      defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
    register-with-eureka: false
    fetch-registry: false
  server:
    enable-self-preservation: false
    
# Spring 配置    
spring:
  application:
    name: eureka-server
```
