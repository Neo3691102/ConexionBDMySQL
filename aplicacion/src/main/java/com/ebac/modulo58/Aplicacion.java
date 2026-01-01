package com.ebac.modulo58;
import conexion.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Aplicacion {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3307/BD1";
        String user = "root";
        String password = "root";

        MysqlConnection mysqlConnection = new MysqlConnection();
        Connection connection = mysqlConnection.getConnection(url,user,password);

        //System.out.println(connection);
        String sql = "SELECT * FROM usuarios";
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){
            System.out.println("idUsuario: " + resultSet.getInt("idUsuario"));
            System.out.println("nombre: " + resultSet.getString("nombre"));
            System.out.println("edad: " + resultSet.getInt("edad"));
            System.out.println("-------------------------------------------------");
        }
    }
}
