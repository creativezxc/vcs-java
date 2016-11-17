package lt.vcs;

import java.text.SimpleDateFormat;
import java.util.Date;
import static lt.vcs.VcsUtils.*; //statnis vcs importas *=galima naudoti viska
import lt.vcs.klases.Person;

/**
 *
 * @author Ernest
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            if(i == 2){
                continue;
            }
            if(i == 4){
                break;
            }
            println("" + i);
        }
        println("_-_-_-_-_-");
        int[] mass = {1,2,3};
        //eisimper kiekviena masyvo elemnta
        for (int i : mass){
            println("" + i);
        }
        println("_-_-_-_-_-");
        int whileKint = 0;
        while(whileKint < 3){
            println(""+whileKint);
            whileKint++;
        }
        println("_-_-_-_-_-");
        int doWhile = 0;
        do{
            
            println(String.format("kasd %d sdfg %s",doWhile,"kazkas"));
            doWhile++;
        }while(false);
        println("_-_-_-_-_-");
        println( (new Date()).toString());
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String data = sdf.format(new Date());
        println(data);
        println("" + System.currentTimeMillis());
        println("" + new Date(System.currentTimeMillis()));
        println("_-_-_-_-_-");
        println("Metam kauliuka, ir rezultatas = " + rand(1,6));
        println("_-_-_-_-_-");
        // 5 kartus metamas kauliukas
        for (int i = 0; i < 5; i++){
            println("Metam kauliuka, ir rezultatas = " + rand(1,6));
        }
        println("_-_-_-_-_-");
        SuKonstruktorium obj = new SuKonstruktorium("vardenis");
        println(obj.getVardas());
        obj.setVardas("pavardenis");
        println(obj.getVardas());
        println("_-_-_-_-_-");
        Person person = new Person("vardenis","pavardenis","abc123",new Date());
        println(person.toString());
    }
}
