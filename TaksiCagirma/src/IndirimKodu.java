import java.util.Scanner;

public class IndirimKodu {
    private String kuponKodu;
    public int kupon;

    public String kod;

    Scanner scanner=new Scanner(System.in);


    public void setKuponKodu(String KuponKodu){
        this.kuponKodu=KuponKodu;

    }

    public void varMı(){
        System.out.println("İndirim kodunuz var mı ?(Varsa 1 e yoksa herhangi bir rakama tıklayınız");
        kod=scanner.nextLine();
        if(kod.equals("1")){
            kazan();
        } else {
            kupon=0;
        }
    }
    public void kazan() {
        System.out.println("Lütfen indirim kodunuzu giriniz");
        kuponKodu=scanner.nextLine();
        System.out.println("İndirim kodu işleniyor...");
        switch(kuponKodu){
            case "bdk532":
                kupon = 20;
                System.out.println("20 TL İndirim Kodu Tanımlanmıştır"); break;
            case "v3yv8t": kupon = 50; System.out.println("50 TL İndirim Kodu Tanımlanmıştır"); break;
            case "k004m7":  kupon = 30;System.out.println("30 TL İndirim Kodu Tanımlanmıştır");  break;
            case "35mkl2": System.out.println("Bu İndirim Kodu Tükenmiştir"); break;
            default:System.out.println("Yanlış İndirim Kodu Girdiniz"); break;
        }

    }
    public int indirimDondur(){
        return kupon;
    }
}