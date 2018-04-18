package APIJDBC;

public class ResultSet {
	private java.sql.ResultSet res;
	
	public ResultSet(java.sql.ResultSet res){
		this.res = res;
	}
	
	public void setResultSetSum(java.sql.ResultSet res){
		this.res = res;
	}
	
	public void setResultSetCount(java.sql.ResultSet res){
		this.res = res;
	}
	
	public java.sql.ResultSet getDifferencialPrivacyCountResultSet(){
		return this.res;
	}
	
	public java.sql.ResultSet getDifferencialPrivacySumResultSet(){
		return this.res;
	}
	
	public java.sql.ResultSet getResultSet(){
		return this.res;
	}
}
