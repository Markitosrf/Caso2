/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso2;

/**
 *
 * @author Marco
 */
public class Gasto {
    public String descri;
    public int monto;
    public String moneda;
    public String grupo;
    public String pago;
    public int montoamig;
    public Gasto(String descri, int monto, String moneda, String grupo,String pago, int montoamig){
        this.descri = descri;
        this.monto = monto;
        this.moneda = moneda;
        this.grupo = grupo;
        this.pago = pago;
        this.montoamig = montoamig;
    } 

    Gasto(String descri, int monto, String moneda, Amigo[] grupo, String montoamig, int pago) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public int getMontoamig() {
        return montoamig;
    }

    public void setMontoamig(int montoamig) {
        this.montoamig = montoamig;
    }
    

}
