import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int data;
        Scanner scan = new Scanner(System.in);
        

        System.out.println("Jumlah Angka yang ingin anda masukkan : ");
        data = scan.nextInt();
        int[] angka = new int[data];
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Masukkan Angka ke-" + (i + 1) + " : ");
            angka[i] = scan.nextInt();
        }
        for (int i = 0; i < angka.length; i++) { 
            for (int j = i + 1 ; j < angka.length; j++) {
               if (angka[i]==angka[j]) { 
                    System.out.println("ada Bilangan Kembar");
               }else{
                   System.out.println("Tidak ada Bilangan Kembar");
               }
            }
          }
          scan.close();
    }
}
