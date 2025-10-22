package exercitiu2;

/*2. Să se scrie un program care citește un set de numerele din fișierul de intrare in.txt, care
conține câte un număr pe un rând, având valorile din figura 18. Programul va determină suma
lor, media aritmetică, valoarea minimă, valoarea maximă, va afișa aceste valori pe ecran și le
va scrie în fișierul de ieșire out.txt. Media aritmetică va fi afișată ca un număr real.
*/

import java.io.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        int suma=0;
        int minim=Integer.MAX_VALUE;
        int maxim=Integer.MIN_VALUE;
        int count=0;
        try(Scanner scanner=new Scanner(new File("src/exercitiu2/in.txt"))){
            while(scanner.hasNext()){
                int nr=scanner.nextInt();
                suma+=nr;
                if(nr>maxim) maxim=nr;
                if(nr<minim) minim=nr;
                count++;
            }
        } catch (Exception e) {
            System.out.println("Fisierul de intrare nu a fost gasit! ");
            return;
        }
        if(count==0)
        {
            System.out.println("Fisierul nu contine numere!");
            return;
        }
        double media=(double)suma/count;
        System.out.println("Suma= "+suma);
        System.out.println("Media= "+media);
        System.out.println("Minim= "+minim);
        System.out.println("Maxim= "+maxim);

        try(PrintWriter pw=new PrintWriter("src/exercitiu2/out.txt"))
        {
            pw.println("Suma= "+suma);
            pw.println("Media= "+media);
            pw.println("Minim= "+minim);
            pw.println("Maxim= "+maxim);
        }catch(IOException e)
        {
            System.out.println("Eroare scriere in fisier! ");
        }



    }
}
