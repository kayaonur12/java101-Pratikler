package Pratikler;

import java.util.Scanner;

public class Not_Ortalamasi {
    public static void main(String[] args) {

        int mat,fiz,kim,tur, tar,muz;

        Scanner Input = new Scanner(System.in); // burda input tanımladım
        System.out.print("Matematik Notunuzu Girin: "); // burda altta gireceğim input için değer yazdırdım
        mat = Input.nextInt();

        System.out.print("Fizik Notunuzu Girin: ");
        fiz = Input.nextInt();

        System.out.print("Kimya Notunuzu Girin: ");
        kim = Input.nextInt();

        System.out.print("Turkce Notunuzu Girin: ");
        tur = Input.nextInt();

        System.out.print("Tarih Notunuzu Girin: ");
        tar = Input.nextInt();

        System.out.print("Müzik Notunuzu Girin: ");
        muz = Input.nextInt();

        double sonuc = (mat+fiz+kim+tur+tar+muz)/6.0; //buraya 6ya böl yazınca tam veriyor sonucu, 6.0a yazınca küsuratlı
        System.out.println("Ortalamanız: " + sonuc);

        boolean durum = sonuc >= 60;
        String gecis = durum ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Geçme Durumu: " + gecis);
        /*
        Alternatif Yöntem 1
        System.out.println((sonuc > 60) ? "sınıfı gecti" : "kaldı"); böyle bir kodlada üstteki boolean kısmı yazılabiliyormuş

        Alternatif Yöntem 2
        if(ortalama>=50){
            System.out.println("Ortalamanız: "+ortalama+"\nTebrikler Geçtiniz !");
        }
        else if(ortalama<=45 && ortalama <50){
            System.out.println("Sorumlu Geçtiniz !");
        }
        else{
            System.out.println("Maalesef Kaldınız !");
        bir de if döngüsüyle böyle de yazılabilirmiş*/
    }
}
