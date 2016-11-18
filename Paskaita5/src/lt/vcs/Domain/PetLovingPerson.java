package lt.vcs.Domain;

import lt.vcs.VcsUtils;
import lt.vcs.interFace.PetLover;

/**
 *
 * @author Ernest
 */
public class PetLovingPerson extends Person implements PetLover {
    
    private Pet pet;
    
    public PetLovingPerson(String name, String lastName, String id){
        super(name,lastName,id);
    }
    
    protected void talk(){
        VcsUtils.println("PetLovingPerson is talking");
    }
    
    @Override
    public Pet getPet() {
        VcsUtils.println("I have a pet");
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
}
