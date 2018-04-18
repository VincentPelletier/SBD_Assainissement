package APIJDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Statement {
	
	private int budget = 10;
	private java.sql.Statement statement;
	
	public Statement(Connection con) throws SQLException{
		this.statement=con.createStatement();
	}
	
	public ResultSet executeQuery(Queries query) throws SQLException{
		java.sql.ResultSet res = statement.executeQuery(query.getQuery());
		ResultSet resset = new ResultSet(res);
		if(budget>0){
			if(query.getType() == "SUM"){
				resset.setResultSetSum(res);
				budget--;
			} 
			if(query.getType() == "COUNT"){
					resset.setResultSetCount(res);
					budget--;
			} 
			budget--;
		} else {
			resset = null;
		}
		return resset;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}	

}
