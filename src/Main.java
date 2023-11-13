import magazin.MagazinService;

public class Main {
    public static void main(String[] args) {

        MagazinService magazinService = new MagazinService();
        magazinService.addPret("Lapte", 16);

        magazinService.vinde("Lapte");
        magazinService.vinde("Lapte");
        magazinService.vinde("Lapte");

        magazinService.afisareTranzactii(); //
        magazinService.afiseazaRaportNrVanzariPerProdus(); //
        magazinService.afisareSumaVanzariProdus("Lapte"); //
    }
}