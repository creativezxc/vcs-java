package lt.vcs;

import lt.vcs.Domain.Person;
import lt.vcs.Domain.PetHatingPerson;
import lt.vcs.Domain.PetLovingPerson;
import static lt.vcs.VcsUtils.*;


/**
 *
 * @author Ernest
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PetLovingPerson antanas = new PetLovingPerson("antanas","antanauskas","ak-antanas");
        println("" + antanas);
        PetHatingPerson petras = new PetHatingPerson("antanas","antanauskas","ak-petras");
        println("" + petras);
        nothing(antanas);
        nothing(petras);
        Person[] mass = {antanas,petras};
        //tikrasisAntanas.get
    }
    private static void nothing(Person person){
        println(person.toString());
        if(person instanceof PetLovingPerson){//patikrinimas ar turi galimybe pasiversti
            PetLovingPerson tikrasisAntanas = (PetLovingPerson) person;
            tikrasisAntanas.getPet();
        }
    }
}
