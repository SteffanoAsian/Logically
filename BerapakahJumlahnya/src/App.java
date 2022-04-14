import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int jumlah =0;
        int n;
        
        Scanner wkwk = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        n = wkwk.nextInt();
        wkwk.close();

        for(int i =1; i<=n; i++){
            jumlah+=i;
            System.out.print(i+" + ");
        }
        System.out.println("\nJumlah Bilangan: "+jumlah);
    }
}