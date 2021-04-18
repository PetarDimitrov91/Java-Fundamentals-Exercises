import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] array1 = console.nextLine().split(" ");
        String[] array2 = console.nextLine().split(" ");

        for (int i = 0; i < array2.length  ; i++) {
            for (int j = 0; j < array1.length  ; j++) {

                if(array2[i].equals(array1[j])){
                    System.out.print(array2[i] + " ");
                }

            }

        }

    }
}
