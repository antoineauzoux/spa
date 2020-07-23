package com.cda.dao.config;

import java.sql.Connection;

public interface IDatabaseConnection {
	Connection getConnection();
	void stop();
}
