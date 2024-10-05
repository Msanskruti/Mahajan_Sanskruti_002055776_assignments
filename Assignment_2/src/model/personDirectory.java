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
    private ArrayList<person> ListPerson;
    
    public personDirectory() {
        this.ListPerson= new ArrayList<person>() ;
    }

    public ArrayList<person> getListPerson() {
        return ListPerson;
    }

    public void setListPerson(ArrayList<person> ListPerson) {
        this.ListPerson = ListPerson;
    }
    
    public person addPerson() {
        
        person person = new person();
        ListPerson.add(person);
        return person;
        
    }
    
    public void deletePerson(person person) {
        ListPerson.remove(person);
    }
    
    
    public person searchPerson(String searchPerson) {
        for (person person : ListPerson) {
        
            if (person.getHomeAddress().getStreet().contains(searchPerson) ||
                    person.getWorkAddress().getStreet().contains(searchPerson) ||
                    person.getLastName().contains(searchPerson) ||
                    person.getFirstName().contains(searchPerson)) {
            
                return person;
            }
        }
        return null; 
    }

    
        
      
    }

