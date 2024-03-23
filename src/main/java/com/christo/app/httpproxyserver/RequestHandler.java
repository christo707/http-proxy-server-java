package com.christo.app.httpproxyserver;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import java.net.Socket;

@RequiredArgsConstructor
public class RequestHandler implements Runnable {

    private final Socket clientSocket;

    @Override
    @SneakyThrows
    public void run() {
        System.out.println("RequestHandler started");
        clientSocket.close();
    }
}
