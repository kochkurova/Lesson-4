import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {

        // включаем возможность ввода с клавиатуры
        Scanner in = new Scanner(System.in);

        // переменные
        String name;
        int x, y, z, a, b, c, umnozh, sum;


        // математические операторы

        // сложение двух чисел
        System.out.println("привет! как тебя зовут?");
        name = in.nextLine();
        System.out.println("привет, " + name + "!");
        System.out.println("программа сложения двух чисел");
        System.out.print("введите первое число: ");
        x = in.nextInt();
        System.out.print("введите второе число: ");
        y = in.nextInt();
        sum = x + y;
        System.out.println(name + ", сумма чисел = " + sum);
        System.out.println();

        // умножение 3х чисел
        System.out.println("а теперь, " + name + ", программа умножения 3х чисел");
        System.out.print("введите первое число: ");
        x = in.nextInt();
        System.out.print("введите второе число: ");
        y = in.nextInt();
        System.out.print("введите третье число: ");
        z = in.nextInt();
        umnozh = x * y * z;
        System.out.println(name + ", произведение чисел = " + umnozh);
        System.out.println();

        // разность двух чисел
        System.out.println("Это программа разности двух чисел");
        System.out.println("Введи первое число");
        x = in.nextInt();
        System.out.println("Веди второе число");
        y = in.nextInt();
        System.out.println(name + ", разность двух чисел " + (x-y));

        // деление двух чисел с остатком
        System.out.println("А теперь деление!");
        System.out.println(name + ", введи первое число");
        x = in.nextInt();
        System.out.println("Введи второе число");
        y = in.nextInt();
        System.out.println("Результат получившийся при делении " + x/y + ", а неделимый остаток равен " + x%y);


        // логические операторы

        // проверка числа на <>=0
        System.out.print("Введи число: ");
        x = in.nextInt();
        if (x>0) {
            System.out.println("Число больше 0");
        }
        else {
            if(x==0) {
                System.out.println("Число равно 0");
            }
            else {
                System.out.println("Число меньше 0");
            }
        }

        // проверка числа с помощью && ||
        b = 2;
        c = 3;
        System.out.println("введи число от 1 до 5");
        x = in.nextInt();
        if (x>b && x>c) {
            System.out.println("твое число больше 2 и 3");
            System.out.println("введи еще одно число");
            x = in.nextInt();
            if ((x>b || x>c)) {
                System.out.println("твое число больше 2 или 3");
            }
            else {
                System.out.println("твое число меньше 2 или 3");
            }
        }
        else {
            System.out.println("твое число меньше 2 и 3");
        }


        // переполнение при вычислениях

        a = 2147483647;
        System.out.println("a=" +a);
        System.out.println("введи любое число кроме 0 для переполнения переменной");
        x = in.nextInt();
        a = a+x;
        System.out.println("a=" +a);


        // вычисления комбинаций типов данных (int и double)

        int j;
        double k;
        j = 1;
        k = 2;
        var u = j+k;
        System.out.println("сумма int и double = " + u);
    }
}
