package lt.vcs;

import java.util.Scanner;

/**
 *
 * @author Ernest
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String trl = args[1];
        int skaicius = 8;
        int antras =1;
        System.out.println(antras);
        antras = antras + skaicius; //arba tiesiog antras += skaicius;
        System.out.println(antras);
        int trecias = antras % 2;// grazina sveika liekana
        System.out.println(trecias);
        System.out.println(++antras);//tas pats su --
        
        boolean boolas = false;
        System.out.println(!boolas);//paneigia sakini
        System.out.println((5+3)*2);
        //! reiskia nelygu && ir || arba
        System.out.println(false || true && true); // pirma daugyba && po to ||
        System.out.println(siaip2()+ " " + skaicius1()); // iskvieciu metoda
        
        siaip("a1","a2","a3","a4"); //dinaminis parametru sarasas
        
        int[] intai2 = {5,4,3,2,1};
        
        System.out.println(intai2.length);
        
        int[] intai= new int[5];
        intai[2] = 7;
        
        String masyvas = "masyvas";
        char[] mass = masyvas.toCharArray();
        
        if(true){
        }else if (true){
        }else if(false){
        }else{
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int ivestas = scan.nextInt();
        System.out.println("Ivesta: " + ivestas);
        System.out.println("Ivesta " + inputInt("ivesk bokalu skaiciu"));
    }
    //... daugtaskis reiskia masyva
    public static void siaip(String param,String... param2) {
        
    }
    //metodas
    public static String siaip2() {
        return "Rezultatas:";
    }
    //metodas
    public static int skaicius1 (){
        int a = 5;
        int b = 20;
        return a + b/3*22;
    }
    public static int inputInt(String text){
          Scanner scan = new Scanner(System.in);
        System.out.println(text);
        return scan.nextInt();
    }
}
