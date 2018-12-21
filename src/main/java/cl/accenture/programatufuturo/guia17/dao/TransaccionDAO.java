package cl.accenture.programatufuturo.guia17.dao;

import cl.accenture.programatufuturo.guia17.model.Transaccion;
import cl.accenture.programatufuturo.guia17.model.cuentaBancaria;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TransaccionDAO {
    private Conexion conexion;
    private Statement statement;
    private PreparedStatement psInsertar;

    public TransaccionDAO() {
        this.conexion = new Conexion();
    }

    public void insertarTransaccion(Transaccion o){
        try{
            statement=conexion.getConexion().createStatement();
            psInsertar=conexion.getConexion().prepareStatement("INSERT INTO transaccion(idTransaccion,idCuenta,tipoTransaccion,monto VALUES(?,?,?,?)" );
            psInsertar.setInt(1,o.getIdTransaccion());
            psInsertar.setString(2,o.getIdCuenta());
            psInsertar.setString(3,o.getTipotransaccion());
            psInsertar.setInt(4,o.getMonto());

        }catch (SQLException e){
            System.out.println("error al ingresar datos"+ e);
        }
    }
    public void transaccionesporId(cuentaBancaria a){
        try{
            statement=conexion.getConexion().createStatement();
            String query ="SELECT DISTINCT transaccion * FROM transaccion,cuentaBancaria WHERE transaccion=?";
            PreparedStatement statement=conexion.getConexion().prepareStatement(query);
            statement.setString(1,a.getIdCuenta());
            ResultSet rs =statement.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("idtransaccion"));
                System.out.println((rs.getString("IdCuenta")));
                System.out.println((rs.getString("Tipotransaccion")));
                System.out.println( rs.getInt("monto"));
                System.out.println("");
            }
            rs.close();
            statement.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void tipoTransaccion(String tipo){
        try{
            statement=conexion.getConexion().createStatement();
            String query="SELECT*FROM transaccion WHERE tipotransaccio=?";
            PreparedStatement statement=conexion.getConexion().prepareStatement(query);
            statement.setString(1,tipo);
            ResultSet rs=statement.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("IdTansaccion"));
                System.out.println(rs.getString("tipoTransaccion"));
                System.out.println(rs.getString("Tipotransaccion"));
                System.out.println(rs.getInt("monto"));
                System.out.println("");
            }
            statement.close();
            rs.close();
        }catch (SQLException O){
            O.printStackTrace();
        }
    }
}

