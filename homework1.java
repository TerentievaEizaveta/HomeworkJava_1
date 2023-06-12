/*1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! 
(произведение чисел от 1 до n)
1 + 2 + 3 1*2*3
2) Вывести все простые числа от 1 до 1000
3) Реализовать простой калькулятор (+-/*)
sc.next() - считывает 1 элемент
sc.nextInt() - считывает только число
sc.nextLine() - считывает строчку
Введите число: 4 \n
Введите знак:

4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.
Под знаком вопроса - одинаковые цифры
Введите уравнение: ?? + ?? = 44
Ответ: 22 + 22 = 44
*/
import java.util.*;
public class homework1 {
    static int factorial(int n){
        if (n==1) return 1;
        return n*factorial(n-1);
    }    
    static int triangular_number(int n){
        if (n==1) return 1;
        return n+triangular_number(n-1);
    }
    static void task1(){
        Scanner iS=new Scanner(System.in);
        System.out.print("Input n:" );
        int n=iS.nextInt();
        System.out.print("factorial: " + factorial(n)+"\n");
        System.out.print("triangular number:"+triangular_number(n)+"\n");
        iS.close();
    }
    
    static void task2(){
        for (int j = 1; j < 1000; j++) {
            int k = 0;
             for (int i = 1; i < j+1; i++) {
                 if (j % i == 0) {
                     k++;
                 }
             }
             if (k == 2) {
                 System.out.print(j + " ");
             }
         }
        
    }
    static void task3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер операции 1 - сложить, 2- вычесть, 3-умножить, 4 - разделить :" );
        int a = sc.nextInt();
        System.out.print("a=");
        int n_1 = sc.nextInt();
        System.out.print("b=");
        int n_2 = sc.nextInt();
        switch (a){
            case 1: 
                System.out.printf("%d + %d = %d \n", n_1, n_2, n_1+n_2);
                break;
            case 2:
                System.out.printf("%d - %d = %d \n", n_1, n_2, n_1-n_2);
                break;
            case 3:
                System.out.printf("%d * %d = %d \n", n_1, n_2, n_1*n_2);
                break;
            case 4:
                double b= (double) n_1;
                double d = (b/n_2);
                System.out.printf("%d : %d = %.2f\n ", n_1, n_2, d);
                break;
        }
        sc.close();    
    }
    static void task4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string" );
        String s = sc.nextLine();
        sc.close();
        String [] parts=s.split("=");
        String left=parts[0];
        String right=parts[1];
        boolean found =false;
        for (int i =0;i<10;i++){
            for (int j =0;j<10;j++){
                String l=left.replace("?", String.valueOf(i));
                String r=right.replace("?", String.valueOf(j));
                int q=Integer.parseInt(l.substring(0,l.indexOf("+")));
                int w=Integer.parseInt(l.substring(0,l.indexOf("+")+1));
                int e=Integer.parseInt(r);
                if (check( q,w,e)) {
                    System.out.println(l+"+"+r);
                    found=true;
                }
            }
        }
        if (!found){
            System.out.println("No");
        }   
    }

    public static void main(String[] args)  {
        Scanner iS=new Scanner(System.in);
        System.out.print("Input number task:" );
        int tasks=iS.nextInt();
        switch(tasks){
            case 1: 
                task1();
            case 2: 
                task2();
            case 3: 
                task3();
            case 4: 
                task4();
        }
        
       iS.close();
    }
}
