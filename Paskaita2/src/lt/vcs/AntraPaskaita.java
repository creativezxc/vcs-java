package lt.vcs;

/**
 *
 * @author Ernest
 */

public class AntraPaskaita {
    static float kas;

    /**
     * @param args the command line arguments
     * void reiskia kad nieko negrazina
     */
    public static void main(String[] args) {
        System.out.println("Antra paskaita");
        
        byte baitas = 77;           Byte baitas2 = new Byte(baitas);
        baitas = 88;
        short trumpas = 7777;       Short trumpas2 = new Short(trumpas);
        int intas = 777777777;      Integer intas2 = new Integer(777);
        long longas = 7777777777777777777L;     Long longas2 = new Long(777);
        
        
        float floatas = 13.0F;      Float floatas2 = new Float(floatas);
        double doublas = 123.456;       Double dbl = new Double(doublas);
        
        char charas = 'f'; Character charas2 = new Character(charas); //char vienguba kabute
        String stringas = "laba diena mokyniai";
        boolean boolas = true;          Boolean boolas2 = new Boolean(true); //arba false;
        
        
        int $_belenkoks = 0;
        
        System.out.println("" + $_belenkoks);
        
        System.out.println(kas);
    }
    
}
