package lr1;
import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        LocalDate w = LocalDate.now();
   int age;
   String name;
   Scanner in = new Scanner(System.in);
   System.out.println("Ваше возраст?:");
   age = in.nextInt();

   int aage= w.getYear()-age;
   System.out.println("Вы родились:  " +aage+" году" );
}
}