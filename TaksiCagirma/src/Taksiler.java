import java.util.Scanner;

import java.util.Scanner;

public class Taksiler {
    private Scanner scanner = new Scanner(System.in);
    private int secilen;
    private String taksiler = "1-)Sarı, 2-)Turkuvaz, 3-)Siyah";

    public void Taksilerimiz() {

        System.out.println("Lütfen taksi modelini seçiniz:");
        System.out.println(taksiler);
        secilen = scanner.nextInt();

        if (secilen < 1 || secilen > 3) {
            System.out.println("Geçersiz seçim!");
            return;
        }

        int kapasiteSiniri;

        switch (secilen) {
            case 1:
                kapasiteSiniri = 4;
                break;
            case 2:
                kapasiteSiniri = 5;
                break;
            case 3:
                kapasiteSiniri = 12;
                break;
            default:
                System.out.println("Geçersiz seçim!");
                return;
        }

        System.out.println("Lütfen kişi sayısını giriniz:");
        int kisiSayisi = scanner.nextInt();

        while (kisiSayisi > kapasiteSiniri) {
            System.out.println("Seçtiğiniz taksi için kapasite aşıldı. Başka bir taksi seçiniz.");
            System.out.println("Lütfen kişi sayısını giriniz:");
            kisiSayisi = scanner.nextInt();
        }


        TaksiCagir taksi = null;

        switch (secilen) {
            case 1:
                taksi = new SariTaksi();
                break;
            case 2:
                taksi = new TurkuvazTaksi();
                break;
            case 3:
                taksi = new SiyahTaksi();
                break;
        }

        if (taksi != null) {
            taksi.taksicagir(kisiSayisi);
        }
    }

    public int getSecilenTaksi() {
        return secilen;
    }
}
