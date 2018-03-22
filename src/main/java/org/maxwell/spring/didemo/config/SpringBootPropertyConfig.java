package org.maxwell.spring.didemo.config;

import org.maxwell.spring.didemo.examplebeans.DefaultDataSource;
import org.maxwell.spring.didemo.examplebeans.TestDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootPropertyConfig {

	@Value("${maxwell.default.username}")
	String userName;

	@Value("${maxwell.default.password}")
	String password;

	@Value("${maxwell.default.dburl}")
	String url;

	@Value("${maxwell.test.username}")
	String testUserName;

	@Value("${maxwell.test.password}")
	String testPassword;

	@Value("${maxwell.test.dburl}")
	String testUrl;

	@Bean
	public DefaultDataSource dataSource() {
		DefaultDataSource dataSource = new DefaultDataSource();
		dataSource.setUserName(userName);
		dataSource.setPassword(password);
		dataSource.setUrl(url);
		return dataSource;
	}

	@Bean
	public TestDataSource testDataSource() {
		TestDataSource testDataSource = new TestDataSource();
		testDataSource.setTestPassword(testPassword);
		testDataSource.setTestUrl(testUrl);
		testDataSource.setTestUserName(testUserName);
		return testDataSource;
	}
}
