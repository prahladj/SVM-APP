package com.svmapp.repo.db;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import org.sql2o.Sql2o;

@Configuration
@EnableTransactionManagement
public class DatabaseContext implements TransactionManagementConfigurer{
	   @Bean
	   public DataSource dataSource() {
	      final BasicDataSource dataSource = new BasicDataSource();
	      dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	      dataSource.setUrl("jdbc:mysql://localhost:3306/krishna_mantra");
	      dataSource.setUsername("root");
	      dataSource.setPassword("rootadmin");
	      return dataSource;
	   }

	   @Bean
	   @Override
	   public PlatformTransactionManager annotationDrivenTransactionManager() {
	      return new DataSourceTransactionManager(dataSource());
	   }

	   @Bean
	   public Sql2o sql2o() {
	      return new Sql2o(dataSource());
	   }
}
