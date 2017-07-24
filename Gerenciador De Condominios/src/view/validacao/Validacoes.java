/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.validacao;

import java.util.InputMismatchException;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

/**
 *
 * @author Daniel Marques
 */
public class Validacoes{
    public static boolean isCPF(String CPF) {
        
        if(CPF.length()<11) return false;
        
        CPF = CPF.replace(".", "");
        CPF = CPF.replace("-", "");
    
        char dig10, dig11;
        int soma, i, r, num, peso;

        try {
          soma = 0;
          peso = 10;
          for (i=0; i<9; i++) {              
    // converte o i-esimo caractere do CPF em um numero:
    // por exemplo, transforma o caractere '0' no inteiro 0         
    // (48 eh a posicao de '0' na tabela ASCII)         
            num = (int)(CPF.charAt(i) - 48); 
            soma += (num * peso);
            peso = peso - 1;
          }

          r = 11 - (soma % 11);
          if ((r == 10) || (r == 11))
             dig10 = '0';
          else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

    // Calculo do 2o. Digito Verificador
          soma = 0;
          peso = 11;
          for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            soma = soma + (num * peso);
            peso = peso - 1;
          }

          r = 11 - (soma % 11);
          if ((r == 10) || (r == 11))
             dig11 = '0';
          else dig11 = (char)(r + 48);

    // Verifica se os digitos calculados conferem com os digitos informados.
          if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
             return(true);
          else return(false);
        } catch (InputMismatchException erro) {
            return(false);
        }
    }
 
        //Método que valida o Cep
    public static boolean isCep(String cep)
    {
        if (cep.length() == 8)
        {
            cep = cep.substring(0, 5) + "-" + cep.substring(5, 3);
            //txt.Text = cep;
        }
        return cep.matches("[0-9]{5}-[0-9]{3}");
    }

    //Método que valida o Email
    public static boolean isEmail(String email){
        return email.matches("(?<user>[^@]+)@(?<host>.+)");
    }
    
    public static boolean isTelefone(String telefone) {
        if(telefone.length()>11){
            telefone=telefone.replace("-", "");
            telefone=telefone.replace("(", "");
            telefone=telefone.replace(")", "");
        }
        return telefone.matches("^[1-9]{2}[2-9][0-9]{7,8}$");
    }
    
    
 
 
}