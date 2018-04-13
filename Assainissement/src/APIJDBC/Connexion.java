package APIJDBC;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Connexion {

	public static void main(String[] argv) throws SQLException {

		System.out.println("-------- PostgreSQL "
				+ "JDBC Connection Testing ------------");

		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return;

		}

		System.out.println("PostgreSQL JDBC Driver Registered!");

		Connection connection = null;

		try {
		System.out.println("Mot de passe de la base : ");
		Scanner sc = new Scanner(System.in);
		String mdp = sc.next();
		sc.close();
			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost/base_projet_sbd", "postgres",
					mdp);
			
		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
			
			Statement state = connection.createStatement();
			String requete="SELECT * FROM adult;";
			state.executeUpdate(requete);
			
		} else {
			System.out.println("Failed to make connection!");
		}
	}

}