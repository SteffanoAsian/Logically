public class App {
    public static void main(String[] args) throws Exception {
        int[] Array = new int[5];
        Array[0] = 4;
        Array[1] = 6;
        Array[2] = 1;
        Array[3] = 3;
        Array[4] = 5;
        System.out.print("Bilangan : ");
        for (int element : Array) {
            System.out.print(element + " ");
        }
        int max_num = Array [0];
        int arr_count = 5;
    // proses mencari nilai terbesar
    for(int i = 0; i < arr_count; i++){
      if(Array[i] > max_num){
        max_num = Array[i];
      }
    }
    System.out.println("\nAngka terbesar adalah: " + max_num);
    }
}