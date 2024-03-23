package com.christo.app.httpproxyserver;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("used for local test")
class ProxyRunnerTest {

    @Test
    void forwardProxyCommandExceptionTest() {
        Assertions.assertThatNoException().isThrownBy(
            () -> HttpProxyServerApplication.main(new String[] {
                "forward-proxy"
            }));
    }

}
