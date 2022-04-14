import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int Bil;

        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        Bil = masuk.nextInt();
        masuk.close();

        if((Bil%2)==0){
            System.out.println("Bilangan "+Bil+" Adalah Bilangan Genap");
        }else{
            System.out.println("Bilangan "+Bil+" Adalah Bilangan Ganjil");
        }
    }
}
