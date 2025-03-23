
package ex.pkg08;

//importando a classe JOptionPane
import javax.swing.JOptionPane;

public class EX08 {

    public static void main(String[] args) {
    
    //declaracao das variaveis
    int idade;
    String opiniao;
    int numeroPessoas;
    
    //declaracao das variaveis e atribuindo o valor inicial = 0
    int totalOtimo = 0;
    int totalRuim = 0;
    float somaIdade = 0;
    float mediaIdade = 0;
    float porcenPessimo = 0;
    float totalPessimo = 0;  
    
    
    //declarando que o laco de repiticao ira iniciar o contador a partir da primeira pessoa
    numeroPessoas = 1;
    
    //inicio
    JOptionPane.showMessageDialog (null,"- Questionario -");
    
    
    //laco de repeticao
    while (numeroPessoas <= 40){
    
    //entrada e conversao de dados
    idade = Integer.parseInt (JOptionPane.showInputDialog ("Informe a sua idade: "));
    opiniao = JOptionPane.showInputDialog ("""
                                       Informe a sua opiniao sobre o filme: 
                                       A - Otimo 
                                       B - Bom
                                       C - Regular
                                       D - Ruim 
                                       E - Pessimo""");
    
    ///controle de selecao
    switch (opiniao){
        //calculando a soma total de opinioes OTIMAS
        case "A":
        totalOtimo++;
        break;
        
        //adicionando o valor da variavel 'idade' a variavel 'somaIdade' e somando o total de respostas RUINS
        case "D":
        somaIdade += idade;
        totalRuim++;
        break;
        
        //calculando a soma total de opinioes PESSIMAS
        case "E":   
        totalPessimo++;
        break;
        
    }//fim do switch       
    
    
    //calculando a media da idade das pessoas que escolheram a opcao RUIM
     mediaIdade = somaIdade / totalRuim;
    
    //calculando a porcentagem do total de pessoas que escolheram a opcao PESSIMO
    porcenPessimo = (totalPessimo / numeroPessoas) * 100;
    

    numeroPessoas++;
    }// fim do while
    
    
    //saida de dados
    JOptionPane.showMessageDialog (null, "A quantidade de respostas OTIMO: " + totalOtimo + "\n" + "A media de idade das pessoas que responderam RUIM: " + mediaIdade + "\n" + "A porcentagem de respostas PESSIMO: " +  String.format("%.2f",porcenPessimo ) + "%");

    }// fim do metodo main
}//fim da classe
        
    
