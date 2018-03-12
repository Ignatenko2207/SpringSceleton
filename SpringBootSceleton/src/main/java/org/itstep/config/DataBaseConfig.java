package org.itstep.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataBaseConfig {

	@Bean
	@ConfigurationProperties("app.datasource")
	public DataSource dataSource() {
	    DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
	        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/spring_db");
	        dataSourceBuilder.username("postgres");
	        dataSourceBuilder.password("248842");
	        dataSourceBuilder.driverClassName("org.postgresql.Driver");
	        return dataSourceBuilder.build();   
	}
}
