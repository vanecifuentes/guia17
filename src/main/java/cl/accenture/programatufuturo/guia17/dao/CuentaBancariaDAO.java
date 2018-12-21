package cl.accenture.programatufuturo.guia17.dao;
import cl.accenture.programatufuturo.guia17.exceptions.SinconexionException;
import cl.accenture.programatufuturo.guia17.model.cuentaBancaria;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CuentaBancariaDAO {
    private Conexion conexion;
    private PreparedStatement psinsertar;                              //permite escribir en java en SQL
    private Statement Statement;                 //

    public CuentaBancariaDAO() {

        this.conexion = new Conexion();
    }


    public void agregarCuentaBancaria(cuentaBancaria a) {
        try {
            conexion.getConexion().createStatement();
            psinsertar = conexion.getConexion().prepareStatement("INSERT INTO cuentaBancaria(idCuenta,saldoDisponible,tipoCuenta) VALUES (?,?,?)");
            psinsertar.setString(1, a.getIdCuenta());

            psinsertar.setInt(2, a.getSaldoDisponible());

            psinsertar.setString(3, a.getTipocuenta());
            psinsertar.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void mostrarcuentas() {
        try {
            Statement = conexion.getConexion().createStatement();
            ResultSet rs = Statement.executeQuery("SELECT * FROM cuentaBancaria");
            while (rs.next()) {
                System.out.println(rs.getString("IdCuenta"));
                System.out.println(rs.getString("Tipocuenta"));
                System.out.println((rs.getInt("SaldoDisponible")));
                System.out.println(" ");
            }
        } catch (SQLException ex) {

            System.out.println("Error al mostrar cuentas" + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
