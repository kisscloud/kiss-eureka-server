# 服务发现中心

## 1. 程序运行

```
$ git clone github.com/kisscloud/kiss-eureka-server.git
$ cd kiss-eureka-server
$ mvn install && mvn package
$ java -jar kiss-eureka-server.jar -Dspring.config.location=/path/to/application.properties 
```

## 2. 配置文件

编辑配置文件：

```
$ vim application.properties
```

配置文件内容：

```
# 项目监听地址
server.port=8761
eureka.instance.hostname=localhost
# 配置服务地址
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
eureka.client.service-url.defaultZone=http://${eureka.instance.hostname}:${server.port}/eureka/
#eureka.client.register-with-eureka=false
# 显示Eureka节点

#eureka.register-with-eureka=false

# 开发环境禁止自我保护
eureka.server.enable-self-preservation=false

# 配置服务名称
spring.application.name=eureka-server
```
