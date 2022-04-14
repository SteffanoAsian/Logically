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
    }
}