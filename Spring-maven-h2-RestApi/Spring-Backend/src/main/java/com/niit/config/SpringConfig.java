package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;



import org.springframework.transaction.annotation.*;

@Configuration
@ComponentScan(basePackages={"com.niit.model"})
@EnableTransactionManagement
public class SpringConfig {

	private final static String DATABASE_URL="jdbc:h2:tcp://localhost/~/staffdb";
	private final static String DATABASE_DRIVER="org.h2.Driver";
	private final static String DATABASE_DIALECT="org.hibernate.dialect.H2Dialect";
	private final static String DATABASE_USERNAME="sa";
	private final static String DATABASE_PASSWORD="sa";
	
	// DataSource 
	@Bean
	public DataSource getDataSource() {
		
		BasicDataSource dataSource = new BasicDataSource();
		
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		
		return dataSource;
	}
	
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {
		
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("com.niit.model");
		return builder.buildSessionFactory();
	}

	//user defined methods..
	private Properties getHibernateProperties() {
		
		Properties property = new Properties();
		
		property.put("hibernate.dialect", DATABASE_DIALECT);				
		property.put("hibernate.show_sql", "true");
		property.put("hibernate.format_sql", "true");
		
		
		return property;
	}
	
	
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		return  new HibernateTransactionManager(sessionFactory);
		
	}
	
	public SpringConfig()  {
		
	}
	
}
