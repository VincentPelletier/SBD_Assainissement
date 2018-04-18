package APIJDBC;

import java.sql.Connection;
import java.sql.Statement;

public class Queries {
	private String query;
	private String type;
	
	public Queries(String query, String type){
		this.type=type;
		this.query = query;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
