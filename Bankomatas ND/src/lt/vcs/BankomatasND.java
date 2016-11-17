package lt.vcs;

import java.util.Scanner;

/**
 *
 * @author Ernest
 */
public class BankomatasND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bandymai = 0;
        int balansas = 350,isimti;
        Scanner klaviatura = new Scanner(System.in);
        System.out.print("Iveskite pin koda: ");
        String pin = null;
        String teisingasPin = "test";
        do{
            pin = klaviatura.next();
            bandymai++;
            if(!pin.equals(teisingasPin) && bandymai < 3 ){
                System.out.println("Neteisingas pin kodas bandykite dar karta");
            }
        }while(!pin.equals(teisingasPin) && bandymai < 3);
        if(pin.equals(teisingasPin) && bandymai <= 3){
            System.out.println("Sveiki jus sekmingai prisijungete jusu balansas yra: " + balansas);
        }
        else{
            System.out.println("3 kartus ivedete neteisingai kortele uzblokuota kreipkites i banka");
        }
        
        while(true){
            
            System.out.println("Ka noresite daryti toliau?");
            
            System.out.println("Spauskite 1 pinigams isimti");
            
            System.out.println("Spauskite 2 balansui patikrinti");
            
            System.out.println("Spauskite 3 kad iseiti");
            
            int operacijos = klaviatura.nextInt();
            
            switch(operacijos){
                case 1:
                    System.out.print("Kiek pinigu norite isimti?");
                    isimti = klaviatura.nextInt();
                    if(balansas >= isimti){
                        balansas = balansas - isimti;
                        System.out.println("paimkite pinigus");
                    }else{
                        System.out.println("Klaida nepakanka pinigu");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Balansas yra: "+ balansas);

                    System.out.println("");

                break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
