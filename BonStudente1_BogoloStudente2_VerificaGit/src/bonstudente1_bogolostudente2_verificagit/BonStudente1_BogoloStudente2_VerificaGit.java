package bonstudente1_bogolostudente2_verificagit;

import java.util.Arrays;

public class BonStudente1_BogoloStudente2_VerificaGit {

    public static void main(String[] args) {
        
        Aereoporto aereoporto= new Aereoporto();
        
        System.out.println("L'aereoporto della citta "+aereoporto.getCittà()+" di superfice "+aereoporto.getSuperficie()+" ha 3 aerei con le segenti informzioni: ");
        
        for(int i=0;i<3;i++){
            System.out.println("Il codice "+aereoporto.getAerei()[i].getCodice()+" numero di posti "+aereoporto.getAerei()[i].getnPosti()+" con marca "+aereoporto.getAerei()[i].getMarca()+" con modello "+aereoporto.getAerei()[i].getModello());
        }
    }
    
}
