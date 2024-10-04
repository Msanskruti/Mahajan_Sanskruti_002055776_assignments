/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author sanskruti
 */
public class personDirectory {
      private ArrayList<person> person;
      
      
        public personDirectory() {
        this.person = new ArrayList<>();
    }
        
       public person addPerson(String firstName, String lastName, String ssn, int age, Address homeAddress, Address workAddress) {
        person person = new Person(firstName, lastName, ssn, age, homeAddress, workAddress);
        person.add(person);
        return person;
    }
}
