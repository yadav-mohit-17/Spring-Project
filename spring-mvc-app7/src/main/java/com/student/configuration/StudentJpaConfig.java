package com.student.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration 
@EnableTransactionManagement 
@EnableJpaRepositories 
public class StudentJpaConfig {
	//DB Details
		@Bean
		public DataSource getDataSource() {
			DriverManagerDataSource datasource=new DriverManagerDataSource();
			datasource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			datasource.setUsername("system");
			datasource.setPassword("tiger");
			
			datasource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
			
			return  datasource;
		}
		
		@Bean("entityManagerFactory")
		LocalContainerEntityManagerFactoryBean createEntityManagerFactory()
		{
			LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
			
			// 1. Setting DataSource Object // DB Details
			factory.setDataSource(getDataSource());
			
			//2. providing package information of entity classes
			factory.setPackagesToScan("com.*");
			
			//3. providing Hibernate properties to EM
			factory.setJpaProperties(hibernateProperties());
			
			//4. Passing predefined Hibernate Adaptor object EM
			HibernateJpaVendorAdapter adaptor =new HibernateJpaVendorAdapter();
			
			factory.setJpaVendorAdapter(adaptor);
			return factory;
		}
		
		//SpringJpa : Configuring data based on your project req.
		
		@Bean("transactionManager")
		public PlatformTransactionManager createTransactionManager() {
			JpaTransactionManager transactionManager=new JpaTransactionManager();
			
			transactionManager.setEntityManagerFactory(createEntityManagerFactory().getObject());
			return transactionManager;
		}
		
		//these are all from hibernate FW , Predefined properties :keys
		Properties hibernateProperties() {
			Properties hibernateProperties =new Properties();
			
			hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
			hibernateProperties.setProperty("hibernate.show_sql", "true");
			hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
			return hibernateProperties;
		}
		
		
//		 Model Mapper configration
		
		 @Bean
		    public ModelMapper getModelMapper() {
		        return new ModelMapper();
		    }

}
