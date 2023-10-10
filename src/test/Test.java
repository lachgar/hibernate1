/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.User;
import java.util.Date;
import org.hibernate.Hibernate;
import services.UserService;
import util.HibernateUtil;

/**
 *
 * @author Lachgar
 */
public class Test {
    public static void main(String[] args) {
        UserService us = new UserService();
       // us.create(new User("aa", "aa", new Date()));
        User uu = us.findById(3);
        uu.setNom("ENSA");
        us.update(uu);
        for(User u : us.findAll())
            System.out.println(u.getNom());
    }
}
