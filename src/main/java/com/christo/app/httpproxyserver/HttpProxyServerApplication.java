package com.christo.app.httpproxyserver;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import picocli.CommandLine;
import java.util.TimeZone;

@SpringBootApplication
@RequiredArgsConstructor
@CommandLine.Command(subcommands = {ForwardProxyCommand.class})
public class HttpProxyServerApplication implements CommandLineRunner {
	private final CommandLine.IFactory factory;

	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	public static void main(String[] args) {
		SpringApplication.run(HttpProxyServerApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		final int exitCode = new CommandLine(this, factory).execute(args);
		if (exitCode != 0) {
			throw new CommandLine.PicocliException("Exit code: " + exitCode);
		}
	}

}
