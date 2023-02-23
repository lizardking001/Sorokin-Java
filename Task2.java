import java.util.Scanner;

public class Task2 {
    public static void checkName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        if (name.equalsIgnoreCase("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
