import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan Nilai A :");
        int a = masuk.nextInt();
        System.out.print("Masukkan Nilai B: ");
        int b = masuk.nextInt();

        if (a>b){
            System.out.println("Bilangan Terbesar Adalah : "+a+" (A).");
        }else if (b>a){
            System.out.println("Bilangan Terbesar Adalah : "+b+" (B).");
        }else{
            System.out.println("Kedua Bilangan Bernilai Sama");
        }
        masuk.close();
    }
}
