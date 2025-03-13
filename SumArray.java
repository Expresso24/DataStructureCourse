import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para recibir entrada del usuario
        Scanner scanner = new Scanner(System.in);


        // Pedimos al usuario que ingrese el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt(); // Leemos el tamaño del arreglo

        // Declaramos el arreglo de tamaño 'n'
        int[] array = new int[n];

        // Pedimos al usuario que ingrese los elementos del arreglo
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt(); // Guardamos cada número en el arreglo
        }

        // Llamamos a la función que suma los elementos del arreglo
        int sumaTotal = sumarElementos(array);

        // Mostramos el resultado de la suma
        System.out.println("La suma de los elementos del arreglo es: " + sumaTotal);

        // Cerramos el scanner para evitar fuga de recursos
        scanner.close();
    }

    // Función para sumar los elementos de un arreglo
    public static int sumarElementos(int[] arr) {
        int suma = 0; // Inicializamos la variable suma en 0

        // Recorremos el arreglo sumando cada elemento
        for (int num : arr) {
            suma += num; // Acumulamos el valor de cada elemento
        }

        // Retornamos la suma total
        return suma;
    }
}
