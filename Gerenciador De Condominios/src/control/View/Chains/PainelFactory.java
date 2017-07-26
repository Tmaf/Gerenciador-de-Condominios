/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.View.Chains;

import javax.swing.JPanel;
import view.paineis.*;

/**
 *
 * @author Tarcísio M. Almeida
 */
public abstract class PainelFactory {
    
     public static JPanel createPainel(String tela,String permissao){
    
       switch (tela){
           
           
           case "CadastroEncomenda": return new CadastroEncomendasView(permissao);
           case  "CadastroFuncionario":  return new CadastroFuncionarioView(permissao);
           case "CadastroMorador":  return new CadastroMoradorView(permissao);
           case "InformacoesPessoais":  return new InformacoesPessoaisView(permissao);
           case "ListarVisitantes": return new ListarVisitanteView(permissao);
           case "CadastroVisitante":  return new CadastroVisitanteView(permissao);
           case "ConsultarFinanceiro":  return new ConsultarFinanceiroView(permissao);
           case "ConsultarFuncionarios":  return new ConsultarFuncionariosView(permissao);
           case "ConsultarMoradores": return new ConsultarMoradoresView(permissao);
           case "ConsultarReserva": return new ConsultarReservaView(permissao);
           case  "IncluirFinanceiro":  return new IncluirFinanceiroView(permissao);
           case "ListarEncomendas":  return new ListarEncomendasView(permissao);
           case "RegistrarReclamacao":  return new RegistrarReclamacaoView(permissao);
           case "ReservarArea":  return new ReservarAreaView(permissao);
           case "InserirArea":  return new InserirAreaView(permissao);
           case "ResponderReclamacao":  return new ResponderReclamacaoView(permissao);
           case "VisualizarReclamacao":  return new VisualizarReclamacaoView(permissao);
           case "CadastrarVeiculo": return new CadastrarVeiculosView(permissao);
           case "ConsultarVeiculo": return new ConsultarVeiculosView(permissao);
           case "ConsultarAreaCadastrada": return new ConsultarAreaCadastradaView(permissao);
       }
       return new JPanel();
    }
    
}
