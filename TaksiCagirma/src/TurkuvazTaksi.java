import java.util.Scanner;

class TurkuvazTaksi extends TaksiCagir {
    TurkuvazTaksiUcretHesaplama turkuvazTaksiUcretHesaplama = new TurkuvazTaksiUcretHesaplama();
    IndirimKodu indirimKodu=new IndirimKodu();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void taksicagir(int kapasite) {
        System.out.println("Turkuvaz taksi çağırıldı.");
        super.kapasiteKontrol(kapasite);

        System.out.println("Lütfen indirim kodunu giriniz:");
        indirimKodu.varMı();
        int kupon = indirimKodu.indirimDondur();

        System.out.print("Lütfen kaç kilometre yolculuk yapmak istediğinizi giriniz: ");
        int km = scanner.nextInt();

        turkuvazTaksiUcretHesaplama.hesapla(km, kupon);
    }
}