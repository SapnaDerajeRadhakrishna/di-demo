package org.maxwell.spring.didemo.config;

import org.maxwell.spring.didemo.examplebeans.FakeDataSource;
import org.maxwell.spring.didemo.examplebeans.FakeJMSDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySources({ @PropertySource("classpath:datasource.properties"), @PropertySource("classpath:jms.properties") })
public class PropertyConfig {

	@Value("${maxwell.username}")
	String userName;

	@Value("${maxwell.password}")
	String password;

	@Value("${maxwell.dburl}")
	String url;

	@Value("${maxwell.jms.username}")
	String jmsUserName;

	@Value("${maxwell.jms.password}")
	String jmsPassword;

	@Value("${maxwell.jms.url}")
	String jmsUrl;

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUserName(userName);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}

	@Bean
	public FakeJMSDataSource fakeJmsDataSource() {
		FakeJMSDataSource fakeJmsDataSource = new FakeJMSDataSource();
		fakeJmsDataSource.setJmsUserName(jmsUserName);
		fakeJmsDataSource.setJmsPassword(jmsPassword);
		fakeJmsDataSource.setJmsUrl(jmsUrl);
		return fakeJmsDataSource;
	}

	public static PropertySourcesPlaceholderConfigurer configurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
