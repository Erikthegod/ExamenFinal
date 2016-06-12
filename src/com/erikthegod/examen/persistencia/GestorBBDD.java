/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikthegod.examen.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author kinton
 */
public class GestorBBDD {
    public Connection c = null;//Conexión
    public Statement stmt = null;//Sentencia
    public String sql = null;//Cadena con la sentencia sql
    public ResultSet rs = null;//Conjunto de resultados
    public static final String CONEXION_NETBEANS = "jdbc:sqlite:pedidos.db";//Constante conexion clase
    public static final String CONEXION_JAR = "jdbc:sqlite:../pedidos.db";//Constante conexion clase
    
    public void getConexion() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");//Carga del driver
        c = DriverManager.getConnection(CONEXION_NETBEANS);
        stmt = c.createStatement();
    }
    
}
