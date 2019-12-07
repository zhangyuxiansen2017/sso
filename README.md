基于spring-security-oauth2的sso单点登录系统
先启动server端，再启动两个client端
client-01端口为8080，client-01端口为8090
访问localhost:8080/client/index.html
                ||
                ||
                ||
                \/  
重定向到:http://127.0.0.1:9999/server/login
然后输入任意User，Password：123456
点击login登录后回到之前请求页面：localhost:8080/client/index.html
                ||
                ||
                ||
                \/       
点击“访问Client-02”链接，可以不需要再次授权登录访问：localhost:8090/client/index.html
访问：localhost:8080/client/user、localhost:8090/client/user可以获取登录用户信息





                