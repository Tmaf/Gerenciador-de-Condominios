/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain;

import java.sql.Date;
import java.util.Iterator;
import model.dao.CrudDao;
import model.domain.AreaComum;
import model.domain.pessoas.Pessoa;
import model.service.ServiceLocator;

/**
 *
 * @author aline.lima
 */
public class AreaComumControl {

    private final CrudDao dao;
    private static AreaComumControl areaComumControl;
    
    private AreaComumControl(){
    this.dao=ServiceLocator.getAreaComumDao();
    }
    
    public static AreaComumControl getAreaComumControl(){
        if(areaComumControl==null){
            areaComumControl= new AreaComumControl();
        }
        return areaComumControl;
    
    }
    
    public void salvarAreaComum(Pessoa pessoa, String nome,
            double valor,Date dataReserva,Date horaInicio,Date horaFim,boolean diaTodo){
        AreaComum m= new AreaComum();
        m.setPessoa(pessoa);
        m.setNome(nome);
        m.setValor(valor);
        m.setDataReserva(dataReserva);
        m.setHoraInicio(horaInicio);
        m.setHoraFim(horaFim);
        m.setDiaTodo(diaTodo);
        dao.salvar(m);
    }
    
    public void excluirAreaComum(Pessoa pessoa, String nome,
            double valor,Date dataReserva,Date horaInicio,Date horaFim,boolean diaTodo){
        AreaComum m= new AreaComum();
        m.setPessoa(pessoa);
        m.setNome(nome);
        m.setValor(valor);
        m.setDataReserva(dataReserva);
        m.setHoraInicio(horaInicio);
        m.setHoraFim(horaFim);
        m.setDiaTodo(diaTodo);
        dao.excluir(m);
    }
    
    public Iterator pesquisarAreaComum(Pessoa pessoa, String nome,
            double valor,Date dataReserva,Date horaInicio,Date horaFim,boolean diaTodo){
        AreaComum m= new AreaComum();
        m.setPessoa(pessoa);
        m.setNome(nome);
        m.setValor(valor);
        m.setDataReserva(dataReserva);
        m.setHoraInicio(horaInicio);
        m.setHoraFim(horaFim);
        m.setDiaTodo(diaTodo);
        return dao.pesquisar(m).iterator();
    }
}
