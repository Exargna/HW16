import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ФИО: ");
        String input = new Scanner(System.in).nextLine().trim();
        if(input.matches("([А-я -]+\\s){2}[А-я -]+")) {
            System.out.println("Фамилия: " + input.substring(0, input.indexOf(' ')).trim() +
                    "\nИмя: " + input.substring(input.indexOf(' '), input.lastIndexOf(' ')).trim() +
                    "\nОтчество: " + input.substring(input.lastIndexOf(' ')).trim());
        } else {
            System.out.println("Введеная вами ФИО неверно!");
        }

    }
}