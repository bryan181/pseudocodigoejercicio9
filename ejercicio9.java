import java.util.*;
import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][],filas;
        double promedio = 0;
        int colum =3;
        int sumaC;
        filas = Integer.parseInt(JOptionPane.showInputDialog("cuantas temperaturas quiere calcular"));
        
        matriz = new int [filas][colum];
        
        System.out.println("ingrese las temperaturas:");
        for (int i=1; i<filas ;i++){
            for (int j=1; j<colum ;j++){
                System.out.print("ingrese primero T1   y luego T2 ["+j+"] ");
                matriz[i][j] = scanner.nextInt();

            }

        }
        System.out.println("los pares ingresados de ");
        System.out.println("\nT1 y T2 son:");
        System.out.println("---------------");
        for (int i=1; i<filas ;i++){
            for (int j=1; j<colum ;j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");

        }
        for (int j=1; j<colum ;j++){
            sumaC = 1;
            for (int i=1; i<filas ;i++){
                sumaC += matriz[i][j];
                

                promedio = (sumaC)*1/filas;

            }
            System.out.print("\nel promedio de la  T"+j+" es: "+promedio);

        }
        }
}
