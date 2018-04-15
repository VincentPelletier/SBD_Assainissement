package APIJDBC;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Connexion {

	Connection connexion;
	
	public static void main(String[] args) throws SQLException {

		System.out.println("-------- PostgreSQL "
				+ "JDBC Connection Testing ------------");

		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();

		}

		System.out.println("PostgreSQL JDBC Driver Registered!");

		Connection connection = null;

		try {
		System.out.println("Mot de passe de la base : ");
		Scanner sc = new Scanner(System.in);
		String mdp = sc.next();
		sc.close();
			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5434/adult", "postgres",
					mdp);
			
		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
			Statement statement = connection.createStatement();
			ResultSet res = statement.executeQuery("SELECT \"education\" FROM \"adult\"");
			System.out.println(res);
			while(res.next()){
				System.out.println(res.getString(1));
			}
			
		} else {
			System.out.println("Failed to make connection!");
		}
	}

}