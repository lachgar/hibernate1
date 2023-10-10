/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Etudiant;
import entities.Filiere;
import java.util.Date;
import services.CoursService;
import services.EtudiantService;
import services.FiliereService;

/**
 *
 * @author Lachgar
 */
public class TestEtudiant {

    public static void main(String[] args) {
        FiliereService fs = new FiliereService();
        EtudiantService es = new EtudiantService();
//        es.create(new Etudiant("aa", "aa", new Date(2020, 02, 02), "aa", fs.findById(1)));
//        es.create(new Etudiant("aa", "aa", new Date(2020, 02, 02), "aa", fs.findById(1)));
//        es.create(new Etudiant("aa", "aa", new Date(2020, 02, 02), "aa", fs.findById(2)));
//        es.create(new Etudiant("aa", "aa", new Date(2020, 02, 02), "aa", fs.findById(2)));

//        Filiere f = fs.findById(1);
//        System.out.println(f.getCode());
//        for(Etudiant e : f.getEtudiants())
//            System.out.println(e.getNom());
        CoursService cs = new CoursService();
        Etudiant e = es.findById(2);
        //e.getCourses().add(cs.findById(1));
        e.getCourses().add(cs.findById(2));
        e.getCourses().add(cs.findById(3));
        es.update(e);
    }

}
