/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Cours;
import services.CoursService;

/**
 *
 * @author Lachgar
 */
public class TestCours {
    public static void main(String[] args) {
        CoursService cs = new CoursService();
        cs.create(new Cours("Java", 30));
        cs.create(new Cours("Electronique", 30));
        cs.create(new Cours("IOT", 30));
        cs.create(new Cours("Anglais", 30));
    }
}
