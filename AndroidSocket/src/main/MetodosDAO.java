package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MetodosDAO {

	public static ArrayList<Departamento> buscarDepartamentos(String consulta){
		
		ArrayList<Departamento> listaDep = new ArrayList<>();
		
		Connection co = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
//		System.out.println("Consulta:" + consulta);
		String sql = consulta;

		try {			
			co = Conexion.conectar();
			stm = co.prepareStatement(sql);

			rs = stm.executeQuery();

			
			while (rs.next()) {
				Departamento dep = new Departamento();
				dep.setNumDept(rs.getInt(1));
				dep.setNombre(rs.getString(2));
				System.out.println(dep.getNombre());
				dep.setLocalidad(rs.getString(3));
				listaDep.add(dep);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println(" Error: Clase MetodosDAO, metodo buscarDepartamentos");
		}
		return listaDep;
	}
	
	public static ArrayList<Empleado> buscarEmpleados(String consulta){
		
		ArrayList<Empleado> listaEmp = new ArrayList<>();
			
		Connection co = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		
		String sql = consulta;

		try {			
			co = Conexion.conectar();
			stm = co.prepareStatement(sql);
			rs = stm.executeQuery();
			while (rs.next()) {
				Empleado emp = new Empleado();

				emp.setNumEmp(rs.getInt(1));
				emp.setApellido(rs.getString(2));
				emp.setOficio(rs.getString(3));
				emp.setDir(rs.getInt(4));
				emp.setFechaAlta(rs.getDate(5));
				emp.setSalario(rs.getFloat(6));
				emp.setComision(rs.getFloat(7));
				emp.setNumDept(rs.getInt(8));
				listaEmp.add(emp);
				System.out.println(emp.getApellido());
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println(" Error: Clase MetodosDAO, metodo buscarEmpleados");
		}	
		return listaEmp;
	}
}
