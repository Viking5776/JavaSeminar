
// Задача № 1

// import java.util.Scanner;

// public class Seminar1 {
//     public static void main(String[] args) {
//         Scanner user_input = new Scanner(System.in);
//         int number;
//         System.out.print("Введите число: ");
//         number = user_input.nextInt();
//         int triangle = Triangle(number);
//         int factorial = Factorial(number);
//         System.out.println(number + "-е по порядку треугольное число: " + triangle);
//         System.out.println("факториал числа " + number + ": " + factorial);
//     }

//     static int Triangle(int n) {
//         double b = 0.5 * n * (n + 1);
//         int a = (int) b;
//         return a;
//     }

//     static int Factorial(int n) {
//         int a = 1;
//         for (int i = 1; i <= n; i++) {
//             a *= i;
//         }
//         return a;
//     }
// }

// Задача № 2

// public class Seminar1 {
//     public static void main(String[] args) {
//         for (int i = 2; i < 1000; i++) {
//             int j, m = 0, flag = 0;
//             m = i / 2;
//             for (j = 2; j <= m; j++) {
//                 if (i % j == 0) {
//                     flag = 1;
//                     break;
//                 }
//             }
//             if (flag == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }


// Задача № 3

import java.util.Scanner;

public class Seminar1 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int number;
        System.out.print("Выберите действие: \n1.Сложение \n2.Вычитание \n3.Умножение \n4.Деление");
        number = user_input.nextInt();
        if {
            menu(number);    
        }
    }

    static void menu(int n) {
        if (n == 1) {
            Addition();
        }
        else if (n == 2) {
            Subtraction();
        }
        else if (n == 3) {
            Multiplication();
        }
        else if (n == 4) {
            Division();
        }
    }

}