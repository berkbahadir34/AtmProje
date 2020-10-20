import java.util.Scanner;

public class Main {
    public static void main(String[] argc){



        ATM atm =new ATM();
        atm.paraKasalari();

        Scanner scanner=new Scanner(System.in);

        System.out.println("*********************************");
        String islemler = "1- Kasayı Görüntüle \n"
                +"2- Para Çekme \n"
                +"3- Çıkış";
        System.out.println(islemler);
        System.out.println("*********************************");
        while(true){
            System.out.print("İşlemi Seçiniz :");
            String islem =scanner.nextLine();

            if(islem.equals("1")){
                System.out.println("*********************************");
                System.out.println("Kasadaki Para : "+atm.meblag);
                System.out.println("*********************************");
            }
            else if(islem.equals("2")){

                if(atm.meblag>0){
                    System.out.println("*********************************");
                    System.out.print("Çekmek İstediğini Tutarı Giriniz : ");
                    int tutar = scanner.nextInt();
                    scanner.nextLine();
                    if(tutar<= atm.meblag){
                        atm.paraCek(tutar);
                        atm.meblag -=tutar;
                        System.out.println("Kasada Kalan Para : "+(atm.meblag));
                        System.out.println("*********************************");
                    }
                    else{
                        System.out.println("Kasada Yeterli Para Bulunmamaktadır...");
                    }

                }
                else{
                    System.out.println("Kasada Para Kalmamıştır. Lütfen Daha Sonra Tekrar Deneyiniz..");
                }

            }
            else if(islem.equals("3")){
                break;
            }
            else{
                System.out.println("*********************************");
                System.out.println("Geçersiz İşlem Tuşladınız..");
                System.out.println("*********************************");
            }

        }


    }
}
