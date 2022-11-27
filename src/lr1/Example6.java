package lr1;
import java.util.Locale;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        String name;
        String soname;
        String second_name;
            Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
         name = in.nextLine();
        System.out.println("Введите фамилию:");
         soname = in.nextLine();
        System.out.println("Введите отчество");
         second_name = in.nextLine();
        System.out.println("Ваше ФИО: "+soname.toUpperCase(Locale.ROOT)+" "+name.toUpperCase(Locale.ROOT)+" "+second_name.toUpperCase(Locale.ROOT));
    }
}