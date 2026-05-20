/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO10_24060124120050.serialize;

import java.io.*;

/**
 * File: SerializePerson.java
 * Deskripsi: Program untuk serialisasi objek Person
 * @author olive
 */
// class Person
class Person implements Serializable {
    private String name;
    
    public Person(String n) {
        this.name = n;
    }
    
    public String getName() {
        return this.name;
    }
}

// class SerializePerson
public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Liv");
        
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}