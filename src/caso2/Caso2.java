/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso2;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Caso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i= Integer.parseInt(JOptionPane.showInputDialog("cuantas cuentas va a ingresar"));
        Gasto arrGasto[] = new Gasto[i];
        for(int x=0; x<arrGasto.length; x++){ 
          JOptionPane.showMessageDialog(null, "Se solicitarán los datos de la cuenta "+x);
          String descri = JOptionPane.showInputDialog("Escriba los descripcion");
          int monto = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba el monto de la cuenta"));
          String moneda = JOptionPane.showInputDialog("Escriba el tipo de moneda");
          int q= Integer.parseInt(JOptionPane.showInputDialog("cuantas personas participaron en la cuenta"));
          Amigo arrAmigo[] = new Amigo[q];
          for(int w=0; w<arrAmigo.length; w++){ 
          String nombre = JOptionPane.showInputDialog("Nombre del amigo "+w);
          arrAmigo[w]=new Amigo(nombre);
          int pago = monto/arrAmigo.length;
          JOptionPane.showMessageDialog(null, arrAmigo[w].getnombre()+" le debe "+pago+""+moneda+" a el amigo que pago la cuenta");
          }
          Amigo[] grupo = Arrays.copyOf(arrAmigo,arrAmigo.length);
          int r= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de la persona que pago"));
          String montoamig= arrAmigo[r].getnombre();
          int pago = monto/arrAmigo.length;
          arrGasto[x]=new Gasto(descri, monto, moneda,grupo,montoamig,pago);
        }
    }
    
}
