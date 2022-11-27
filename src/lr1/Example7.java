package lr1;
import java.util.Locale;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        String name;
    int age;
            Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
         name = in.nextLine();
        System.out.println("Сколько вам лет?:");
         age = in.nextInt();

        System.out.println("Ваше имя и возраст: "+name.toUpperCase(Locale.ROOT)+" "+age+" лет");
    }
}