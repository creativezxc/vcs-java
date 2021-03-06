package lt.vcs;

import java.util.Scanner;

/**
 *
 * @author Ernest
 */
public class VcsUtils {
    public static int inputInt(String text){
        return (Integer) input (1, text);//choice 1
    }
    public static String inputWord(String text){
        return (String) input (2,text);//choice 2
    }
    public static String inputLine(String text){
        return (String) input (3,text);//choice 3
    }
    
    private static Object input(int choice, String text){
        println(text);
        Object result = null;
        if(choice == 1){
            result = newScan().nextInt();
        }
        else if (choice == 2){
            result = newScan().next();
        }
        else if (choice == 3){
            result = newScan().nextLine();
        }
        
        return result;
    }
    
    public static Scanner newScan(){
        return new Scanner(System.in);
    }
    public static void println(String txt){
        System.out.println(txt);
    }
}
