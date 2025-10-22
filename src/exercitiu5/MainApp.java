package exercitiu5;

import java.util.Random;

/*5. Să se scrie un program care generează aleatoriu un număr întreg cuprins între 0 și 20.
Programul va determina dacă numărul aparține șirului lui Fobonacci.*/
public class MainApp {
    public static void main(String[] args) {

        Random random=new Random();
        int n= random.nextInt(21);
        System.out.println("n= "+n);
        if (isFibonacci(n)==true) {
            System.out.println("Nr random generat apartine sirului lui Fibonacci!  ");
        }
        else
            System.out.println("Nr random generat NU apartine sirului lui Fibonacci!  ");

    }

   static boolean isFibonacci(int n)
   {
       if(n==0 || n==1)
           return true;
       int f1=0;
       int f2=1;
       int f3=f1+f2;
       while(f3<n)
       {
           f1=f2;
           f2=f3;
           f3=f1+f2;
       }
        return f3==n;
   }
}

