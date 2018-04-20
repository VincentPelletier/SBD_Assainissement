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
	
	public double bruit() {
		double bruit = 0;
		double min;
		min = -0.5;
		double max;
		max = 0.5;
		
		double nombreAleatoire = min + (double)(Math.random() * ((max - min) + 1));
		
		int signe;
		if(nombreAleatoire > 0) {
			signe = 1;
		}else if(nombreAleatoire < 0) {
			signe = -1;
		}else {
			signe = 0;
		}
		
		bruit = - (1*signe)*Math.log(1 - 2 * Math.abs(nombreAleatoire));
		
		return bruit;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}	

}
