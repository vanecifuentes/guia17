package cl.accenture.programatufuturo.guia17.model;

public class cuentaBancaria {
    private String idCuenta,tipocuenta;
    private int saldoDisponible;

    public cuentaBancaria(String idCuenta, String tipocuenta, int saldoDisponible) {
        this.idCuenta = idCuenta;
        this.tipocuenta = tipocuenta;
        this.saldoDisponible = saldoDisponible;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }



}
