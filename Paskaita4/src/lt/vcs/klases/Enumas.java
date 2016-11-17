package lt.vcs.klases;

/**
 *
 * @author Ernest
 */
public enum Enumas {
    
    REIKSME1("lietuviskai1","angliskai1"),
    REISKME2("lietuviskai2","angliskai2"),
    REIKSME3("lietuviskai3","angliskai3");
    
    private final String lt;

    public static Enumas getREIKSME1() {
        return REIKSME1;
    }

    public static Enumas getREISKME2() {
        return REISKME2;
    }

    public static Enumas getREIKSME3() {
        return REIKSME3;
    }

    public String getLt() {
        return lt;
    }

    public String getEn() {
        return en;
    }
    private final String en;
    
    private Enumas(String lt,String en){
        this.lt = lt;
        this.en = en;
    }
    public String getDescription(String kalba){
        String result = null;
        if("lt".equals(kalba)){
            result = this.lt;
        }else if ("en".equals(kalba)){
            result = this.en;
        }
        
        return result;
    }
}
