import java.util.Scanner;

public class Task1 {
    public static void checkNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        if (number > 7){
            System.out.println("Привет");
        }
    }
}
