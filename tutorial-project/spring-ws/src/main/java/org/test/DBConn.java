package org.test;

import com.mongodb.MongoClient;

public class DBConn {
	
	public static MongoClient getConnection() {
		return new MongoClient("localhost", 27017);
	}
}
