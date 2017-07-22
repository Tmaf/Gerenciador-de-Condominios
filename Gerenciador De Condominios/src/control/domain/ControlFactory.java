/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain;

import control.domain.impl.*;

/**
 *
 * @author Tarcísio M. Almeida
 */
public abstract class ControlFactory {
        
    
       public static Control getAreaComumControl(){
           return new AreaComumControlImpl();
       }
       public static Control getEmpresaControl(){
           return new EmpresaControlImpl();
       }
       public static Control getEncomendaControl(){
           return new EncomendaControlImpl();
       }
       public static Control getFinanceiroControl(){
           return new FinanceiroControlImpl();
       }
       public static Control getFuncionarioControl(){
           return new FuncionarioControlImpl();
       }
       public static Control getMoradorControl(){
           return new MoradorControlImpl();
       }
       public static Control getReclamacaoControl(){
           return new ReclamacaoControlImpl();
       }
       public static Control getUsuarioControl(){
           return new UsuarioControlImpl();
       }
       public static Control getVeiculoControl(){
           return new VeiculoControlImpl();
       }
       public static Control getVisitanteControl(){
           return new VisitanteControlImpl();
       }
       
        public static Control getReservaControl(){
           return new ReservaControlImpl();
       }
}
