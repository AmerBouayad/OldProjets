/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableau2d;

import static tableau2d.Tableau2D.estCarreMagique;
        
 /**
 *
 * @author g42392
 */

public class MainCarreMagique {
    public static void main(String[] args) {
       int tab1 [][] = {{ 1, 2},{0 , 4}};
        System.out.println(estCarreMagique(tab1));
    
    } 
}