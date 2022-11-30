package bonstudente1_bogolostudente2_verificagit;

public class Aereoporto {
    private String città;
    private int superficie;
    private Aereo aerei[];

    public Aereoporto() {
        Aereo a1=new Aereo("8M9G5U",30,"businAir","Carmani");
        Aereo a2=new Aereo("4Z5R3T",25,"Santonov","Gusci");
        Aereo a3=new Aereo("4D6Y9U",40,"Sokker","Tha sustene");
        
        this.aerei = new Aereo[3];
        
        aerei[0]=a1;
        aerei[1]=a2;
        aerei[2]=a3;
        
        città="Ronchi";
        
        superficie=2830;
        
    }

    public Aereoporto(String città, int superficie, Aereo[] aerei) {
        this.città = città;
        this.superficie = superficie;
        this.aerei = aerei;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public Aereo[] getAerei() {
        return aerei;
    }
    
}
