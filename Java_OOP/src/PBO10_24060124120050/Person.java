/**
* File: Person.java
* Deskripsi: Person database model
*/
package PBO10_24060124120050;

import java.io.Serializable;

public class Person implements Serializable{
    private String name;
    private int id;

    public Person (String n) {
        name = n;
    }

    public Person (int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}