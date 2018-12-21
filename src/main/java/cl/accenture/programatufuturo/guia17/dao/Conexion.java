package cl.accenture.programatufuturo.guia17.dao;

import cl.accenture.programatufuturo.guia17.exceptions.SinconexionException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


    public class Conexion {
        private static Connection conexion;
        private static final String DRIVER = "com.msql.jdbc";
        private static final int PORT = 3306;
        private static final String HOST = "localhost";
        private static final String DATEBASE = "banco";
        private static final String USER = "root";
        private static final String PASSWORD = "justinbieber12";
        public Conexion(){
            conexion = null;
            try{
                Class.forName(DRIVER);
                conexion = DriverManager.getConnection(DRIVER,USER,PASSWORD);

                if(conexion != null){
                    System.out.println("Conexion exitosa.");
                }

            }catch(Exception e){
                System.out.println("Error "+ e);
            }
        }

        //Retorna la conexion
        public Connection getConexion(){
            return conexion;
        }

        //Metodo que desconecta de la DB
        public void desconectar(){
            conexion = null;

            if( conexion == null ){
                System.out.println("Desconectado.");
            }
        }

    }


