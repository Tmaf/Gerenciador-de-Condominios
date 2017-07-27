/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.View.Tela;
import model.Service.IniciaDerby;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class Main {
   
    public static void main(String[] args) {
        IniciaDerby Derby = new IniciaDerby();
        Tela.start();
    }
     
}
