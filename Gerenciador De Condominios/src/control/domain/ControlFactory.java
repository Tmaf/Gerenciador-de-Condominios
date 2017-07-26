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
        
    
       public static AreaComumControl getAreaComumControl(){
           return new AreaComumControlImpl();
       }
       public static EncomendaControl getEncomendaControl(){
           return new EncomendaControlImpl();
       }
       public static FinanceiroControl getFinanceiroControl(){
           return new FinanceiroControlImpl();
       }
       public static FuncionarioControl getFuncionarioControl(){
           return new FuncionarioControlImpl();
       }
       public static MoradorControl getMoradorControl(){
           return new MoradorControlImpl();
       }
       public static ReclamacaoControl getReclamacaoControl(){
           return new ReclamacaoControlImpl();
       }
       public static UsuarioControl getUsuarioControl(){
           return new UsuarioControlImpl();
       }
       public static VeiculoControl getVeiculoControl(){
           return new VeiculoControlImpl();
       }
       public static VisitanteControl getVisitanteControl(){
           return new VisitanteControlImpl();
       }  
        public static ReservaControl getReservaControl(){
           return new ReservaControlImpl();
       }
}
