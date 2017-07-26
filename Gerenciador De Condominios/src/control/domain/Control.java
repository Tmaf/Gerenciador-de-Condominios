/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain;

import java.io.Serializable;

/**
 *
 * @author Tarcísio M. Almeida
 */
public interface Control<E extends Serializable> {
    E bucarPorChave(E e);
    void excluir(E e);
    E getBufferIndex(int i);
    String[] pesquisar(E e);
    void salvar(E e);
}
