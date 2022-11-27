package lr1;
import java.time.LocalDate;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        LocalDate w = LocalDate.now();
   int age;
   Scanner in = new Scanner(System.in);
   System.out.println("В каком году родились?: ");
   age = in.nextInt();
   int aage= w.getYear()-age;
   System.out.println("Ваш возраст: " +aage );
}
}