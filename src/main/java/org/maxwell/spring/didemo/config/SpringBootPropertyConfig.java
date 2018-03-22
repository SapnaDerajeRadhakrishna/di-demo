package org.maxwell.spring.didemo.config;

import org.maxwell.spring.didemo.examplebeans.DefaultDataSource;
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

	@Bean
	public DefaultDataSource dataSource() {
		DefaultDataSource dataSource = new DefaultDataSource();
		dataSource.setUserName(userName);
		dataSource.setPassword(password);
		dataSource.setUrl(url);
		return dataSource;
	}
}
