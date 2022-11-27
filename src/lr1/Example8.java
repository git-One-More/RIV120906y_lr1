package lr1;
import java.time.Month;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Example8 {
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