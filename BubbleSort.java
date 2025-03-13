public class BubbleSort {
    public static void main(String[] args) {
        
        // Definimos un arreglo desordenado
        int[] arreglo = {5, 3, 8, 4, 2};

        // Llamamos a la función de ordenamiento
        bubbleSort(arreglo);

        // Imprimimos el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }

    // Método que implementa el algoritmo de Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Tamaño del arreglo

        // Bucle externo: recorre todo el arreglo
        for (int i = 0; i < n - 1; i++) {
            // Bucle interno: compara y cambia elementos si es necesario
            for (int j = 0; j < n - i - 1; j++) {
                // Si el elemento actual es mayor que el siguiente, los intercambiamos
                if (arr[j] > arr[j + 1]) {
                    // Intercambio de elementos usando una variable temporal
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
