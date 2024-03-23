package com.christo.app.httpproxyserver;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.net.ServerSocket;
import java.net.Socket;

@Component
@RequiredArgsConstructor
@Slf4j
public class Proxy {

    @Value("${proxy.port:7070}")
    private int port;

    private ServerSocket serverSocket;

    @SneakyThrows
    public void start() {
        log.info("Starting Forward proxy on port {}", port);
        serverSocket = new ServerSocket(port);
        log.info("Waiting for client on port " + serverSocket.getLocalPort() + "..");
    }

    @SneakyThrows
    public void listen() {
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new RequestHandler(socket)).start();
        }
    }

}
