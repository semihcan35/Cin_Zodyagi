import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dogum_yili;

        System.out.println("Doğum yılınızı giriniz:");
        dogum_yili=input.nextInt();

        if(dogum_yili%12==0){
            System.out.println("Çin Zodyağı burcunuz" );
        }
        else if(dogum_yili%12== 1){
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        }
        else if(dogum_yili%12== 2){
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        }
        else if(dogum_yili%12== 3){
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        }
        else if(dogum_yili%12== 4){
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        }
        else if(dogum_yili%12== 5){
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        }
        else if(dogum_yili%12== 6){
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        }
        else if(dogum_yili%12== 7){
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        }
        else if(dogum_yili%12== 8){
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        }
        else if(dogum_yili%12== 9){
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        }
        else if(dogum_yili%12== 10){
            System.out.println("Çin Zodyağı Burcunuz: At");
        }
        else if(dogum_yili%12== 11){
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        }
    }
}