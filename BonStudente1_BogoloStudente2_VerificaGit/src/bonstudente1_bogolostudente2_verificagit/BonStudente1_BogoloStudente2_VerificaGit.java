package bonstudente1_bogolostudente2_verificagit;

public class BonStudente1_BogoloStudente2_VerificaGit {

    public static void main(String[] args) {
    
        Aereoporto aeroporto=new Aereoporto("Ronchi dei legionari",2830);
        
        String str= "L'aeroporto di "+aeroporto.getCittà()+" ha una superfice di "+aeroporto.getSuperficie()+" e gli aerei disponibili sono: \n";
        
        for (int i=0;i<3;i++)
        {
            str+="codice: "+aeroporto.getAerei()[i].getCodice()+", ";
            str+="marca: "+aeroporto.getAerei()[i].getMarca()+", ";
            str+="modello: "+aeroporto.getAerei()[i].getModello()+", ";
            str+="numero posti:"+aeroporto.getAerei()[i].getnPosti()+"\n";


        }
        
        System.out.println(str);
    }
    
}
