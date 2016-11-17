package lt.vcs.klases;

import java.util.Date;

/**
 *
 * @author Ernest
 */
public class Person {
    private String name;
    private String lastName;
    private String Id;
    private Date birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public Person(String name,String lastName,String Id,Date birthDate){
        this.Id = Id;
        this.birthDate = birthDate;
        this.lastName = lastName;
        this.name = name;
    }
}
