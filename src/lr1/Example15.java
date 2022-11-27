package lr1;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        int firstnum;
        int secondnum;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        firstnum= in.nextInt();
        System.out.println("Введите второе число: ");
        secondnum = in.nextInt();
        int sum=firstnum+secondnum;
        int raz = firstnum-secondnum;
        System.out.println("Сумма первого и второго числа:");
        System.out.println(sum);
        System.out.println("Разница первого и второго числа:");
        System.out.println(raz);
}
}