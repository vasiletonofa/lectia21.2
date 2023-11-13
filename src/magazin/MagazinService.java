package magazin;

import javax.swing.plaf.PanelUI;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class MagazinService {

    private Set<String> produse = new TreeSet<>(); // produsele sunt unice

    private Map<String, Integer> nrVanzariPerProdus = new TreeMap<>(); // Un singur produs, valoarea se modifica

    private Map<String, Integer> preturi = new TreeMap<>(); // Un singur produs, valoarea se modifica

    List<String> tranzactie = new ArrayList<>(); // Tranzactia nu este unica per produs

    public void vinde(String produs) {
        if(produse.contains(produs)) {
            Integer nrVanzari = nrVanzariPerProdus.get(produs);
            if (nrVanzari == null) {
                nrVanzari = 0;
            }
            nrVanzari++;
            nrVanzariPerProdus.put(produs, nrVanzari);
            tranzactie.add(produs);
        } else {
            System.out.println("Produsul nu exista");
        }
    }

    public void afiseazaRaportNrVanzariPerProdus() {
        for (Map.Entry<String, Integer> entry  : nrVanzariPerProdus.entrySet()) {
            System.out.print("Produsul: " + entry.getKey());
            System.out.println(" Vanzari: " + entry.getValue());
        }
    }

    public void afisareTranzactii() {
        for (String produs: tranzactie) {
            System.out.print("Produs: " + produs);
            System.out.println(" Pret: " + preturi.get(produs));
        }
    }

    public void addPret(String produs, Integer pret) {
        produse.add(produs);
        preturi.put(produs, pret);
    }

    public void afisareSumaVanzariProdus(String produs) {
        int sumaVanzari = 0;

        for (String produsVandut : tranzactie) {
            if (produs.equals(produsVandut)) {
                sumaVanzari = sumaVanzari + preturi.get(produs);
            }
        }

        System.out.println("Produsul " + produs + " suma: " + sumaVanzari);
    }
}
