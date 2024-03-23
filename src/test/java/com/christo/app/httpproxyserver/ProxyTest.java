package com.christo.app.httpproxyserver;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class ProxyTest implements WithAssertions {

    @Test
    void testStart() {
        Proxy proxy = new Proxy();
        assertThatNoException().isThrownBy(proxy::start);
    }

}
