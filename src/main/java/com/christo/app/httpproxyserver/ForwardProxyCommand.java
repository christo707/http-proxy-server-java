package com.christo.app.httpproxyserver;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import picocli.CommandLine;

@Component
@CommandLine.Command(name = "forward-proxy", mixinStandardHelpOptions = true, version = "1.0")
@RequiredArgsConstructor
public class ForwardProxyCommand implements Runnable {

    private final Proxy proxy;

    @Override
    public void run() {
        proxy.start();
        proxy.listen();
    }
}
