package com.christo.app.httpproxyserver;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class Proxy {

    @Value("${proxy.port:7070}")
    private int port;

    public void start() {
        log.info("Starting proxy on port {}", port);
    }

}
