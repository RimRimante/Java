/*
    A JavaBean is a Java object that satisfies certain programming conventions:
    - instance variables should be private
    - public setter and getter methods
    - no-arg constructor
*/
public class Preke implements Comparable {

    private int kodas;
    private String pavadinimas;
    private String salis;
    private float kainaVnt;
    private boolean valgomas;
	
    public Preke() {}
    
    public Preke(int pKodas, String pPav, String pSalis, float pKainaVnt) {
        if(pKodas < 0 || pPav == null)
            throw new NullPointerException();
        
        kodas = pKodas;
        pavadinimas = pPav;
        salis = pSalis;
        kainaVnt = pKainaVnt;
    }

    @Override
    public String toString() { 
        String rez = "Preke: kodas=" + getKodas() + "; pav=" + getPavadinimas()
                + "; salis=" + getSalis() + "; kainaVnt=" + getKainaVnt();
        return rez;
    }

    /**
     * Natural comparator
     * Compares the receiving object (this) with the specified object obj
     * @param obj
     * @return -1 if this < obj, 0 if this == obj, 1 if this > obj
     */
    @Override
    public int compareTo(Object obj) {
        Preke p = (Preke) obj;
        if(this.kodas > p.kodas)
            return 1;
        else if(this.kodas < p.kodas)
            return -1;
        else
            return 0;
    }

    // Right mouse click -> Generate -> Getters/Setters

    /**
     * @return the kodas
     */
    public int getKodas() {
        return kodas;
    }

    /**
     * @param kodas the kodas to set
     */
    public void setKodas(int kodas) {
        if(kodas < 0) {
            System.out.println("Preke.setKodas(): bandoma irasyti bloga prekes kodo reiksme: kodas=" + kodas);
            throw new NullPointerException();
        }
        this.kodas = kodas;
    }

    /**
     * @return the pavadinimas
     */
    public String getPavadinimas() {
        
        return pavadinimas;
    }

    /**
     * @param pavadinimas the pavadinimas to set
     */
    public void setPavadinimas(String pavadinimas) {
        if(pavadinimas == null) {
            System.out.println("Preke.setPavadinimas(): Blogas prekes pavadinimas=" + pavadinimas);
            throw new NullPointerException();
        }
        this.pavadinimas = pavadinimas;
    }

    /**
     * @return the salis
     */
    public String getSalis() {
        return salis;
    }

    /**
     * @param salis the salis to set
     */
    public void setSalis(String salis) {
        this.salis = salis;
    }

    /**
     * @return the kainaVnt
     */
    public float getKainaVnt() {
        return kainaVnt;
    }

    /**
     * @param kainaVnt the kainaVnt to set
     */
    public void setKainaVnt(float kainaVnt) {
        this.kainaVnt = kainaVnt;
    }
    
    /**
     * @return the valgomas
     */
    public boolean isValgomas() {
        return valgomas;
    }

    /**
     * @param valgomas the valgomas to set
     */
    public void setValgomas(boolean valgomas) {
        this.valgomas = valgomas;
    }
}
