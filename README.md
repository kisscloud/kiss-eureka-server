# 服务发现中心

## 1. 程序运行

```
$ git clone github.com/kisscloud/kiss-eureka-server.git
$ cd kiss-eureka-server
$ mvn install && mvn package
$ java -jar kiss-eureka-server.jar -Dspring.config.location=/path/to/application.yml 
```

## 2. 配置文件

编辑配置文件：

```
$ vim application.yml
```

配置文件内容：

```
server:
  port: 8761
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
spring:
  application:
    name: eureka-server
```
