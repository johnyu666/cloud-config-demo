# 完成spring cloud config 的演示
注： 配置中心的信息保存在： https://github.com/johnyu666/config-center.git
## 1. main 分支：
基础配置，可以在客户端使用 /actuator/refresh 进行刷新

## 2. 动态刷新
加入了RabbitMQ 做为消息总线，可以在服务器端使用 /actuator/bus-refresh 进行刷新，
从而使用所有的客户端都会获取更新后的信息

## 3. 加入注册中心

使用Eureka 做为服务发现中心