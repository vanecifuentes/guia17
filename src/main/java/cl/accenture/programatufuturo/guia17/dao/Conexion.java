package cl.accenture.programatufuturo.guia17.dao;

import cl.accenture.programatufuturo.guia17.exceptions.SinconexionException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


    public class Conexion {
        private static final String DRIVER = "com.msql.jdbc.DRIVER";
        private static final int PORT = 3306;
        private static final String HOST = "localhost";
        private static final String DATEBASE = "banco";
        private static final String USER = "root";
        private static final String PASSWORD = "justinbieber12";

        public Connection obteerconenection() throws SinconexionException {
            try {
                Class.forName(DRIVER);
                Connection connectiom = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORT + "/" + DATEBASE, USER, PASSWORD);
                return connectiom;
            } catch (ClassNotFoundException e) {
                throw new SinconexionException("El driver no se ha cargado correctamente", e);
            } catch (SQLException e) {
                throw new SinconexionException("Ocurrio un error al establecer la conexion : " + e.getMessage(), e);
            }
        }
    }
