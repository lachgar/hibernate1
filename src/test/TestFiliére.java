/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Filiere;
import entities.User;
import services.FiliereService;
import services.UserService;

/**
 *
 * @author Lachgar
 */
public class TestFiliére {
    
     public static void main(String[] args) {
        FiliereService fs = new FiliereService();
        fs.create(new Filiere("2ITE", "2ITE"));
       fs.create(new Filiere("ISIC", "ISIC"));
        for(Filiere f : fs.findAll())
            System.out.println(f.getLibelle());
    }
    
}
