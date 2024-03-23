# http-proxy-server-java

A simple HTTP proxy server written in Java.
Supports Forward proxy for HTTP requests

### Build

The maven build will build a jar, which needs to run in a JVM environment.
This project uses JDK 17 as build environment.

```shell
mvn verify
```

### Run

To run on local machine [ProxyRunnerTest](src/test/java/com/christo/app/httpproxyserver/ProxyRunnerTest.java) can be used.

To run jar for forward proxy server.

```shell
java -jar http-proxy-server-java-0.0.1-SNAPSHOT.jar forward-proxy
```


