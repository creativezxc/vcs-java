package lt.vcs.Domain;

import lt.vcs.interFace.Identified;
import lt.vcs.interFace.Named;
import lt.vcs.interFace.PetLover;

/**
 *
 * @author Ernest
 */
public abstract class Person implements Named ,Identified{
    private String name;
    private String lastName;
    private String id;
    
    
    public Person(String name, String lastName, String id){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        talk();
    }
    
    protected abstract void talk();
    
    
    @Override
    public String toString(){
        return String.format(
                "Person(name-%s,lastName-%s object=%s",
                name,lastName, super.toString());
    }
    /**
     * 
     * @return 
     */
    @Override
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
    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
