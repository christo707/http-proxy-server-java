package com.christo.app.httpproxyserver;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import java.net.Socket;

class RequestHandlerTest implements WithAssertions {

    @Test
    void testRequestHandler() {
        Socket clientSocket = new Socket();
        RequestHandler requestHandler = new RequestHandler(clientSocket);
        assertThatNoException().isThrownBy(requestHandler::run);
        assertThat(clientSocket.isClosed()).isTrue();
    }

}
