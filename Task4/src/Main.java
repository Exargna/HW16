import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер телефона: ");
        String input = new Scanner(System.in).nextLine().trim();
        String transform = input.replaceAll("\\W", "");

        if(transform.matches("^7\\d{10}")) {
            System.out.println(formattedNumber(input));
        } else if (transform.matches("^8\\d{10}")) {
            String correctedNumber = transform.replaceFirst("^8", "7");

            System.out.println(formattedNumber(correctedNumber));

        } else if (transform.matches("\\d{10}")) {
            String correctedNumber = transform.replaceFirst("", "7");
            System.out.println(formattedNumber(correctedNumber));
        }
        else {
            System.out.println("Введеный вами номер неверен!");
        }
    }
    public static String formattedNumber(String input) {
        return input.replaceAll(
                "(\\d{1})(\\d{3})(\\d{3})(\\d{2})(\\d{2})",
                "+$1 ($2) $3 $4-$5");
    }
}