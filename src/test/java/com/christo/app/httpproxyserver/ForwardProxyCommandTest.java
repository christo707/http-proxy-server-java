package com.christo.app.httpproxyserver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import picocli.CommandLine;

class ForwardProxyCommandTest {

    @Test
    void assertFlowAndParams() {
        Proxy proxy = mock(Proxy.class);
        doNothing().when(proxy).start();
        ForwardProxyCommand forwardProxyCommand = new ForwardProxyCommand(proxy);
        final int retVal = new CommandLine(forwardProxyCommand).execute();
        assertThat(retVal).isZero();
        verify(proxy).start();
    }

}
