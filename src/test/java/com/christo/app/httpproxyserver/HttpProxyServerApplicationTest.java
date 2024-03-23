package com.christo.app.httpproxyserver;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigDataApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {HttpProxyServerApplication.class},
                      initializers = ConfigDataApplicationContextInitializer.class)
class HttpProxyServerApplicationTest implements WithAssertions {

	@Autowired
	private Proxy proxy;

	@Test
	void testProxyBeanInit() {
		assertThat(proxy).isNotNull();
	}

	@Test
	void assertMainThrowsExceptionOnMissingArguments() {
		assertThatThrownBy(() -> HttpProxyServerApplication.main(new String[0])).hasMessage("Exit code: 2");
	}

	@Test
	void assertForwardProxyCommandHasHelpOption() {
		assertThatNoException().isThrownBy(() -> HttpProxyServerApplication.main(new String[] {"forward-proxy", "-h"}));
	}

}
