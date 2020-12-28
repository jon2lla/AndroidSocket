package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Conexion {
		
	private static File DATOS_CONEXION = new File("src" + File.separator + "main" + File.separator + "conData.txt");
	private static String URL;

	public static Connection conectar() {
		
		Scanner sc;
		Connection con = null;
		String passwd = null;
		String usuario = null; 		
			
			try {
				sc = new Scanner(DATOS_CONEXION);
				usuario = sc.nextLine();
				passwd = sc.nextLine();
				sc.close();
			} catch (FileNotFoundException e1) {
				System.out.println("Fichero de datos de conexion no encontrado");
			}
		
			URL = "jdbc:mysql://localhost:3306/empresa?user=" + usuario + "&password=" + passwd;
		try {
			con = DriverManager.getConnection(URL);
			if (con != null) {
				System.out.println("\n -----------------------\n  Conectado a la BBDD\n -----------------------\n");
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se pudo conectar a la BBDD", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
		}
		return con;
	}

}
