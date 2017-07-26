/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Marques
 */
public class Validacoes{
    public static String isCPF(String CPF) throws CpfInvalidoException {
        
        if(CPF.length()<11) throw new CpfInvalidoException("O CPF é inválido: "+CPF);
        
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
             return CPF;
          else throw new CpfInvalidoException("O CPF é inválido: "+CPF);
        } catch (InputMismatchException erro) {
            throw new CpfInvalidoException("O CPF é inválido: "+CPF);
        }
    }
 
        //Método que valida o Cep
    public static String isCep(String cep) throws CepInvalidoException
    {
        if (cep.length() == 8)
        {
            cep = cep.substring(0, 5) + "-" + cep.substring(5, 3);
            //txt.Text = cep;
        }
        if (cep.matches("[0-9]{5}-[0-9]{3}")) return cep;
        else throw new CepInvalidoException("O cep é inválido:" + cep);
    }

    //Método que valida o Email
    public static String isEmail(String email) throws EmailInvalidoException{
        if (email.matches("(?<user>[^@]+)@(?<host>.+)"))
                return email ;
        else throw new EmailInvalidoException("O email é inválido: "+email);
    }
    
    public static String isTelefone(String telefone) throws TelefoneInvalidoException {
        if(telefone.length()>11){
            telefone=telefone.replace("-", "");
            telefone=telefone.replace("(", "");
            telefone=telefone.replace(")", "");
        }
        if (telefone.matches("^[1-9]{2}[2-9][0-9]{7,8}$"))
            return telefone;
        else throw new TelefoneInvalidoException("O telefone é inválido: "+telefone);
    }
    
    public static String isPlaca(String placa) throws PlacaInvalidaException{
        placa = placa.replace("-", "");
        if (placa.matches("[A-Z]{3}[0-9]{4}"))
            return placa;
        else throw new PlacaInvalidaException("A placa é inválida: "+placa);
    }
     
    public static Date isData(String data) throws DataInvalidaException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date newData=null;
        try{
            newData = formato.parse(data);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "A data informada não é válida.");
        }
        
        if(newData==null) throw new DataInvalidaException("A data informada é inválida: "+data);
        else return newData;
    }
    
    public static Date isHora(String hora) throws HoraInvalidaException{
        SimpleDateFormat formato = new SimpleDateFormat("hh:mm");
        Date newHora = null;
        try {
            newHora = formato.parse(hora);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Hora inválida.");
        }
        if(newHora==null) throw new HoraInvalidaException("Hora inválida.");
        else return newHora;
    }
}