package cl.accenture.programatufuturo.guia17.model;

public class Transaccion{
    private int idTransaccion,monto;
    private String tipotransaccion,idCuenta;

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getTipotransaccion() {
        return tipotransaccion;
    }

    public void setTipotransaccion(String tipotransaccion) {
        this.tipotransaccion = tipotransaccion;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Transaccion(int idTransaccion, int monto, String tipotransaccion, String idCuenta) {
        this.idTransaccion = idTransaccion;
        this.monto = monto;
        this.tipotransaccion = tipotransaccion;
        this.idCuenta = idCuenta;
    }


}
