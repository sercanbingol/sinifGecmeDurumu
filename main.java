import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;
        double average = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notu : ");
        mat = input.nextInt();
        if (mat >= 0 && mat<=100){
            average += mat ;}

        System.out.print("Fizik Notu : ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik<=100){
            average += fizik ;}

        System.out.print("Kimya Notu : ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya<=100){
            average += kimya;}

        System.out.print("Türkçe Notu : ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce<=100){
            average += turkce ;}


        System.out.print("Müzik Notu : ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik<=100){
            average += muzik ;}

        double avarage = (mat + fizik + kimya + turkce + muzik) / 5;
        if (avarage <= 55){
            System.out.println("Sınıfta kaldınız! Seneye görüşürüz... ");
        }else{
            System.out.println("Tebrikler sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız :" +avarage);
    }



}
