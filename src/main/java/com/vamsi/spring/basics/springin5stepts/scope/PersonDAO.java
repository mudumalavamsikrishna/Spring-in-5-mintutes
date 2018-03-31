package com.vamsi.spring.basics.springin5stepts.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

	@Autowired
	JdbcConnetion jdbcConnection;

	public JdbcConnetion getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnetion jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
}
