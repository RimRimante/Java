
public class Pirkinys implements Comparable{

    private int zmogausId;
    private int prekesKodas;
    private int vnt;

    private String prekesPav;
    
    public Pirkinys() {      
    }

    public Pirkinys(int zmId, int prId, int vienetai) {
        zmogausId = zmId;
        prekesKodas = prId;
        vnt = vienetai;
    }
    
    @Override
    public String toString() { 
        String rez = "Pirkinys: zmogausId=" + getZmogausId() 
                + "; prekesKodas=" + getPrekesKodas()
                + "; prekesPav=" + getPrekesPav() 
                + "; vnt=" + getVnt();
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
        Pirkinys p = (Pirkinys) obj;
        if(this.zmogausId > p.zmogausId) 
            return 1;
        else if(this.zmogausId < p.zmogausId)
            return -1;
        else {
            if(this.prekesKodas > p.prekesKodas) return 1;
            else if(this.prekesKodas < p.prekesKodas) return -1;
            else return 0;
        } 
    }

    // Right mouse click -> Generate -> Getters/Setters

    /**
     * @return the zmogausId
     */
    public int getZmogausId() {
        return zmogausId;
    }

    /**
     * @param zmogausId the zmogausId to set
     */
    public void setZmogausId(int zmogausId) {
        this.zmogausId = zmogausId;
    }

    /**
     * @return the prekesKodas
     */
    public int getPrekesKodas() {
        return prekesKodas;
    }

    /**
     * @param prekesKodas the prekesKodas to set
     */
    public void setPrekesKodas(int prekesKodas) {
        this.prekesKodas = prekesKodas;
    }

    /**
     * @return the prekesPav
     */
    public String getPrekesPav() {
        return prekesPav;
    }

    /**
     * @param prekesPav the prekesPav to set
     */
    public void setPrekesPav(String prekesPav) {
        this.prekesPav = prekesPav;
    }
    
    /**
     * @return the vnt
     */
    public int getVnt() {
        return vnt;
    }

    /**
     * @param vnt the vnt to set
     */
    public void setVnt(int vnt) {
        this.vnt = vnt;
    }
}
