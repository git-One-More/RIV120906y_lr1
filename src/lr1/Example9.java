package lr1;
import java.time.Month;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
    int month;
    int i=0;
Scanner in = new Scanner(System.in);
System.out.println("Введите номер месяца: ");
month= in.nextInt();
        Month mn = Month.of(month);
do {
    System.out.println("месяц: "+mn.toString()+"; "+mn.maxLength()+" дней.");
    i++;
    return;
    }
while (i==month);
}
}