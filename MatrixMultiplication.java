// Programa en Java para multiplicar dos matrices
public class MatrixMultiplication {

    // Método para multiplicar dos matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {

        // Obtener las dimensiones de las matrices
        int filasA = A.length; // Número de filas de A
        int columnasA = A[0].length; // Número de columnas de A
        int columnasB = B[0].length; // Número de columnas de B

        // Matriz resultado de tamaño filasA x columnasB
        int[][] resultado = new int[filasA][columnasB];

        // Multiplicación de matrices
        for (int i = 0; i < filasA; i++) { // Recorre filas de A
            for (int j = 0; j < columnasB; j++) { // Recorre columnas de B
                for (int k = 0; k < columnasA; k++) { // Suma y multiplica elementos
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return resultado; // Devuelve la matriz resultante
    }

    // Método para imprimir una matriz
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) { // Itera sobre cada fila
            for (int value : row) { // Itera sobre cada valor en la fila
                System.out.print(value + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }

    public static void main(String[] args) {
        // Definir dos matrices de ejemplo
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Verificamos si la multiplicación es posible (columnas de A == filas de B)
        if (A[0].length != B.length) {
            System.out.println("No se pueden multiplicar estas matrices.");
            return;
        }

        // Multiplicar las matrices
        int[][] resultado = multiplyMatrices(A, B);

        // Mostrar la matriz resultante
        System.out.println("Resultado de la multiplicación:");
        printMatrix(resultado);
    }
}
