package lr1;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
      LocalDate w = LocalDate.now();
        String weak;
        String month;
        int day;
         Scanner in = new Scanner(System.in);
         System.out.println("Введите текущий день недели в формате(MONDAY-SUNDAY)");//SUNDAY
     weak = in.nextLine();
            System.out.println("Введите текущий месяц в формате(JANUARY-DECEMBER)");//NOVEMBER
         month = in.nextLine();
             System.out.println("Введите текущий день");//27
            day = in.nextInt();
          if (weak.toUpperCase(Locale.ROOT).equals(w.getDayOfWeek().toString()) &&
             month.toUpperCase(Locale.ROOT).equals(w.getMonth().toString())&&
             day==w.getDayOfMonth())
     {System.out.println("Текущая дата: "+w.getDayOfWeek()+" "+ w.getDayOfMonth()+" "+w.getMonth());}
     else {
         {System.out.println("Ошибка! вы ввели: "+weak.toUpperCase(Locale.ROOT)+" "+month.toUpperCase(Locale.ROOT)+" "+day);
             System.out.println("Текущая дата: "+w.getDayOfWeek()+" "+ w.getDayOfMonth()+" "+w.getMonth());}
     }
        }
    }





