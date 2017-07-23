package io.pivotal.scdf.sink.cassandratestsink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CassandraTestSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CassandraTestSinkApplication.class, args);
	}
}
