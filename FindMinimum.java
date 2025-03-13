public class FindMinimum {
    public static void main(String[] args) {
        // Definir un arreglo de números
        int[] numeros = {34, 12, 56, 78, 1, 90, 23, 5};

        // Llamar a la función para encontrar el mínimo
        int minimo = encontrarMinimo(numeros);

        // Mostrar el resultado
        System.out.println("El número mínimo en el arreglo es: " + minimo);
    }





    public static int encontrarMinimo(int[] arr) {
        // Verificar que el arreglo no esté vacío
        if (arr.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío");
        }

        // Inicializar el mínimo con el primer elemento del arreglo
        int minimo = arr[0];

        // Recorrer el arreglo desde el segundo elemento
        for (int i = 1; i < arr.length; i++) {
            // Si encontramos un número menor, lo actualizamos
            if (arr[i] < minimo) {
                minimo = arr[i];
            }
        }

        // Retornar el valor mínimo encontrado
        return minimo;
    }
}
