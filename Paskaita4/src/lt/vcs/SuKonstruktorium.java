package lt.vcs;

/**
 *
 * @author Ernest
 */
public class SuKonstruktorium {
    
    private String vardas;
    private String bla; //inkapsuliacija alt+insert
    private String blabla;
    
    public SuKonstruktorium(String vardas){
        this.vardas = vardas;
    }
    
    public String getVardas(){
        return this.vardas;
    }
    
    public void setVardas(String vardas){
        this.vardas = vardas;
    }

    public String getBla() {
        return bla;
    }

    public void setBla(String bla) {
        this.bla = bla;
    }

    public String getBlabla() {
        return blabla;
    }

    public void setBlabla(String blabla) {
        this.blabla = blabla;
    }
    
}
