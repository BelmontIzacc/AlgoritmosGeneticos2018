/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosgeneticos2018;

import tsp.Entidades.Individuo;
import tsp.Herramientas;

/**
 *
 * @author Roberto Cruz Leija
 */
public class AlgoritmosGeneticos2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  //      Herramientas.guardarInstancia(Herramientas.generarMatrizDistanciasAleatoria(1000, 100));
          Individuo.distancias = Herramientas.abrirInstancia();
          Individuo i = new Individuo(0);
        System.out.println();
    }
    
}
