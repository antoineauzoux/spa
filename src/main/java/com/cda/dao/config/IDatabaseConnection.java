package com.cda.dao.config;

import java.sql.Connection;

public interface IDatabaseConnection {
	public Connection getConnection();
	public void stop();
}
