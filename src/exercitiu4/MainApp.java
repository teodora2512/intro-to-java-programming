package exercitiu4;

import java.sql.SQLOutput;
import java.util.Random;

/*4. Să se determine cmmdc a două numere naturale, a căror valoare maximă este 30. Numerele
vor fi generate aleatoriu cu ajutorul unui obiect de tip Random și metodei nextInt();*/
public class MainApp {
    public static void main(String[] args) {
        Random random=new Random();
        int a= random.nextInt(30);
        System.out.println("Primul nr random: "+a);
        int b= random.nextInt(30);
        System.out.println("Al doilea nr random: "+b);

        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        System.out.println("CMMDC: "+a);


    }
}
