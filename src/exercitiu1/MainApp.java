package exercitiu1;
/*1. Se cere să se scrie un program Java care să calculeze şi să afişeze perimetru şi aria unui
dreptunghi. Valorile pentru lungime şi lățime se citesc de la tastatura. Sa se adauge un break
point pe prima linie care citește valoarea unei laturi si din acel punct să se ruleze programul
linie cu linie urmărind valorile variabilelor în memorie.*/

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti lungimea: ");
        int L=scanner.nextInt();
        System.out.println("Introduceti latimea: ");
        int l=scanner.nextInt();

        int P=2*(L+l);
        int A=L*l;

        System.out.println("Arie dreptunghi: "+A);
        System.out.println("Perimetru dreptunghi: "+P);

    }
}
