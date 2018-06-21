package org.test;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class ConnectToMongoDB {
	
	public static void main(String[] args) {
		MongoClient mongo=new MongoClient("localhost",27017);
		MongoCredential credential=MongoCredential.createCredential("mongo", "testdb", "mongo".toCharArray());
		System.out.println("Connection Sucessfuly!");
		
		//Accessing Database
		MongoDatabase database=mongo.getDatabase("testdb");
		System.out.println("Credentials: "+credential);
		
		// getting collection 
		MongoCollection<Document> collection=database.getCollection("Test_table");
		
		// getting iterable Document
		FindIterable<Document> itrdoc=collection.find();
		int i=1;
		Iterator itr=itrdoc.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Data: "+itr.next());
			i++;
		}
		
		/**Example inserting a Document
		 * */
//		Document document=new Document("title","bookstore")
//				.append("id", 1)
//				.append("description", "Bookstore of cOMPUTER SCIENCE ONLY")
//				.append("address", "Sea View Special economic Zone sector-135 Noida")
//				.append("phone", "0120213356");
//		collection.insertOne(document);
//		System.out.println("Document Added sucessfully");
	}
	
}
