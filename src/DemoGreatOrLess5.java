import java.util.Scanner;

public class DemoGreatOrLess5 {
    public static void main(String[] args) {
        System.out.println("Введи число до 10");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String string = scanner.next();
            int i = Integer.parseInt(string);
            if (i > 5) {
                System.out.println("Число " + string + " > " + 5);
            } else {
                System.out.println("Число " + string + " <= " + 5);
            }
        }
    }
}
