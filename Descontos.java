/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.pkg2.dsi;

/**
 *
 * @author Pessoal
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class RafaellaFelipe_agenda05_DS_I {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       
    //declaracao da variavel
    double valortotal;
    String aux;
    double desconto;
    double valorTotalDesconto;
            
    //inicio do programa
   JOptionPane.showMessageDialog (null,"Este programa ira exibir o valor do desconto a ser aplicado no produto e o valor total da compra");
    
    //entrada de dados
    aux = JOptionPane.showInputDialog("Informe o valor total da compra");
    valortotal =  Double.parseDouble(aux);
    
    //processamento
    if (valortotal < 200) { //if 1
    desconto = valortotal * 0.05;
    valorTotalDesconto = valortotal - desconto;  
    JOptionPane.showMessageDialog (null, "Desconto a ser aplicado: R$ " + String.format("%.2f", desconto) + "\n" + "Valor total a ser pago: R$ " + String.format("%.2f", valorTotalDesconto));
    } else {
         if (valortotal >= 200 &&  valortotal < 300) { //if 2
         desconto = valortotal * 0.10;
         valorTotalDesconto = valortotal - desconto;  
         JOptionPane.showMessageDialog (null, "Desconto a ser aplicado: R$ " + String.format("%.2f", desconto) + "\n" + "Valor total a ser pago: R$ " + String.format("%.2f", valorTotalDesconto));
         } else {
              if (valortotal >= 300) { //if 3
              desconto = valortotal * 0.15;
              valorTotalDesconto = valortotal - desconto;
              JOptionPane.showMessageDialog (null, "Desconto a ser aplicado: R$ " + String.format("%.2f", desconto) + "\n" + "Valor total a ser pago: R$ " + String.format("%.2f", valorTotalDesconto));
              } //fim do if 3
         } //fim do if 2
    } //fim do if 1                     
  } //fim do metodo main
} //fim da classe