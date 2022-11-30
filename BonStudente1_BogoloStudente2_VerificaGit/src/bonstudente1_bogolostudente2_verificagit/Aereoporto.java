package bonstudente1_bogolostudente2_verificagit;

public class Aereoporto {
    private String città;
    private int superficie;
    private int aerei[];
    private String piloti[];

    public Aereoporto() {
    }

    public Aereoporto(String città, int superficie, int[] aerei, String[] piloti) {
        this.città = città;
        this.superficie = superficie;
        this.aerei = aerei;
        this.piloti = piloti;
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

    public int[] getAerei() {
        return aerei;
    }

    public void setAerei(int[] aerei) {
        this.aerei = aerei;
    }

    public String[] getPiloti() {
        return piloti;
    }

    public void setPiloti(String[] piloti) {
        this.piloti = piloti;
    }
    
}
