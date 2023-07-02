import java.util.Scanner;

class SiyahTaksi extends TaksiCagir {
    SiyahTaksiUcretHesaplama siyahTaksiUcretHesaplama = new SiyahTaksiUcretHesaplama();
    IndirimKodu indirimKodu=new IndirimKodu();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void taksicagir(int kapasite) {
        System.out.println("Siyah taksi çağırıldı.");
        super.kapasiteKontrol(kapasite);

        System.out.println("Lütfen indirim kodunu giriniz:");
        indirimKodu.varMı();
        int kupon = indirimKodu.indirimDondur();

        System.out.print("Lütfen kaç kilometre yolculuk yapmak istediğinizi giriniz: ");
        int km = scanner.nextInt();

        siyahTaksiUcretHesaplama.hesapla(km, kupon);
    }
}