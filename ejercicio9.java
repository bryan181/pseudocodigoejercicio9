import java.io.*;
import java.util.*;
import java.math.*;

public class ejercicio9{
    public static void main (String args []) throws IOException
    {BufferedReader in;
        in = new BufferedReader (new InputStreamReader (System.in));
        double g=0, p, e,n, t, s = 0, aux;
        System.out.print ("introduzca el numero de temperaturas a registrar: ");
        n = Integer.parseInt (in.readLine ());
        double [] vector = new double [20];
        for (int i = 0 ; i < n ; i++){
            System.out.println ((i+1)+")introduzca las temperaturas: ");
            t = (Double.valueOf (in.readLine ())).doubleValue ();
            vector [i] = t;
            s = s + t;
            }
            aux = s/n;
            System.out.println ("el promedio de la temperatura es: " + aux);
            /*System.out.println ("Las temperaturas por debajo de la temperatura media son: ");
            for (int k = 0 ; k < n ; k++){
                if (vector [k] < aux)
                System.out.print (" " + vector [k]);
                g = g+Math.pow((vector [k] - aux),2);
            }
            p =g/n;
            e = Math.sqrt (p);
            System.out.println ();
            System.out.println ("La desviacion es: " + e);*/
        }
    }
