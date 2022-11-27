package lr1;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
     int firstnum;

     Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
     firstnum= in.nextInt();
       int f = firstnum-1;
       int f1 = firstnum+1;
       int f2 = (firstnum+f+f1);
       int f3 = f2*f2;
        System.out.println("Ответы к задаче: ");
     System.out.println(f +" "+ firstnum+" "+f1);
        System.out.println("квадрат суммы трёх чисел "+f3);
}
}