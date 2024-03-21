package com.flipcart;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories("flipcart.*")
public class FlipkartJpaConfiguration {
	
	//DataBase Details
	@Bean 
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("system");
		dataSource.setPassword("tiger");
		return dataSource;
	}
	
	@Bean("entityManagerFactory")
	LocalContainerEntityManagerFactoryBean createEntityManagerFactory()
	{
		LocalContainerEntityManagerFactoryBean factory =new LocalContainerEntityManagerFactoryBean();
		
		//1. Setting DataSource Object  //DB details
		factory.setDataSource(getDataSource());
		
		//2. Providing package information of entity classes
		factory.setPackagesToScan("flipcart.*");
		
		//3.  providing Hibernate Properties to EntityManager
		factory.setJpaProperties(hibernateProperties());
		
		//4. passing Predefined Hibernate Adaptor Object to EntityManager
		HibernateJpaVendorAdapter adaptor=new HibernateJpaVendorAdapter();
		factory.setJpaVendorAdapter(adaptor);
		return factory;
	}
	//Spring JPA: configuring data based on your project req.
	
	@Bean("transactionManager")
	public PlatformTransactionManager createTransactionManager()
	{
		JpaTransactionManager transactionManager=new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(createEntityManagerFactory().getObject());
		return transactionManager;
	}
	
	//these are all from hibernate FW, Predefined Properties : Keys
	Properties hibernateProperties()
	{
		Properties hibernateProperties=new Properties();
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "create");
		
		//this is for printing internally generated SQL Queries
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		return hibernateProperties;
	}

}

