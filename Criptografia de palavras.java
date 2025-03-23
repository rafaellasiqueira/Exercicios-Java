
package agenda05;

//Importando a classe JOptionPane
import javax.swing.JOptionPane;

public class Agenda05 {

    public static void main(String[] args) {
        //Declaracao de variaveis
        String palavra;
        String resultado = "";
        
        //Exibindo mensagem
        JOptionPane.showMessageDialog(null, "Criptografia");
        
        //Entrada de dados
        do {
            palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
            if (palavra == null || palavra.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Entrada invalida. Digite novamente");
            }    
        } while (palavra == null || palavra.isEmpty());
        
        //Vetor de caracteres
        char[] caracteres = new char[palavra.length()];;
        
        for (int i = 0; i < palavra.length(); i++) {
            caracteres[i] =  palavra.charAt(i); 
            resultado += caracteres[i] + " ";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
         
        //Converte os caracteres em numeros inteiros (codigos ASCII)
        int[] ascii = new int[caracteres.length];
        String asciiResultado = "";  
        
        for (int i = 0; i < caracteres.length; i++) {
            ascii[i] = (int) caracteres[i]; 
            asciiResultado += ascii[i] + " ";  
        }
        
        JOptionPane.showMessageDialog(null, "Em codigo ASCII:\n" + asciiResultado);
        
        //Soma com 10 unidades
        asciiResultado = "";
        
        int[] somaAscii = new int[ascii.length];
        
        for (int i = 0; i < ascii.length; i++) {
            somaAscii[i] = ascii[i] +10; 
            asciiResultado += somaAscii[i] + " ";  
        }

        JOptionPane.showMessageDialog(null, "Somado com mais 10:\n" + asciiResultado);
        
        //String final convertida
        asciiResultado = "";  
        
        char[] criptografia = new char [somaAscii.length];
        
        for (int i = 0; i < somaAscii.length; i++) {
            criptografia[i] = (char) somaAscii[i]; 
            asciiResultado += criptografia[i] + " ";  
        }
        
        JOptionPane.showMessageDialog(null, "Sua palavra criptografada:\n" + asciiResultado);
    }
}
