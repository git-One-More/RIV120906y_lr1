package lr1;
import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        LocalDate w = LocalDate.now();
   int age;
   String name;
   Scanner in = new Scanner(System.in);
        System.out.println("Ваше имя?: ");
        name = in.nextLine();

   System.out.println("В каком году родились?: ");
   age = in.nextInt();

   int aage= w.getYear()-age;
   System.out.println("Ваше имя и возраст: " +name+" "+aage );
}
}