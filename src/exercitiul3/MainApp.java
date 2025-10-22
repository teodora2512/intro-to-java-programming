package exercitiul3;

import java.util.Scanner;

/*Să se scrie un program care citește un număr n natural de la tastatură și afișează toți
divizorii acestuia pe ecran. Dacă numărul este prim se va afișa un mesaj corespunzător.*/
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti un nr natural: ");
        int n= scanner.nextInt();

        if(n<0)
        {
            System.out.println("Introduceti un numar natural! ");
            return;
        }
        if(n==0)
        {
            System.out.println("Numarul zero e divizibil cu orice numar nenul! ");
            return;
        }
        if (n == 1) {
            System.out.println("Divizorii lui 1 sunt: 1");

            return;
        }
        int count=0;
        System.out.println("Divizorii: ");
        System.out.println(1);
        count++;

        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(n);
        count++;
        if(count==2)
        {
            System.out.println("Numarul este PRIM! ");
        }

    }
}
