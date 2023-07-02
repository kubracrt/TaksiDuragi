import java.util.Scanner;

public class SariTaksiUcretHesaplama extends TaksiUcretHesaplama {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void hesapla(int km, int kupon) {
        int kmbası = 8;
        int taksimetreAcilis = 40;
        int verilenPara = 0;
        int paraUstu;
        int eksikPara;

        if (km >= 100) {
            System.out.println("%10 indirim kazandınız.\n");
            int total = (km * kmbası) + taksimetreAcilis;
            total = total - total * 10 / 100;
            System.out.println("Ödemeniz gereken ücret:");
            System.out.println(total - kupon);
            System.out.println("Lütfen ücreti veriniz:");
            verilenPara = scanner.nextInt();

            if (verilenPara > total) {
                paraUstu = verilenPara - total;
                System.out.println("Para üstünüz: " + paraUstu);
            } else {
                eksikPara = total - verilenPara;
                System.out.println(eksikPara+" TL eksik para verdiniz");
            }
        } else {
            int total = (km * kmbası) + taksimetreAcilis;
            System.out.println("Ödemeniz gereken ücret:");
            System.out.println(total - kupon);
            System.out.println("Lütfen ücreti veriniz:");
            verilenPara = scanner.nextInt();

            if (verilenPara > total) {
                paraUstu = verilenPara - total;
                System.out.println("Para üstünüz: " + paraUstu);
            } else {
                eksikPara = total - verilenPara;
                System.out.println(eksikPara+" TL eksik para verdiniz");
            }
        }
    }
}
