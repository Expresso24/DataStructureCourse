import java.util.HashSet;

public class CheckDuplicates {


    // Método para verificar si un array tiene duplicados
    public static boolean containsDuplicate(int[] nums) {
        
        // Usamos un HashSet para almacenar elementos únicos
        HashSet<Integer> seenNumbers = new HashSet<>();

        // Recorremos el array
        for (int num : nums) {
            // Si el número ya está en el HashSet, hay un duplicado
            if (seenNumbers.contains(num)) {
                return true; // Se encontró un duplicado, retornamos true
            }
            // Si no está en el HashSet, lo agregamos
            seenNumbers.add(num);
        }
        // Si terminamos el recorrido y no encontramos duplicados, retornamos false
        return false;
    }

    // Método principal para probar el código
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5}; // No tiene duplicados
        int[] array2 = {1, 2, 3, 4, 1}; // Tiene duplicados

        // Probamos la función con los dos arreglos
        System.out.println("¿Array1 tiene duplicados? " + containsDuplicate(array1)); // false
        System.out.println("¿Array2 tiene duplicados? " + containsDuplicate(array2)); // true
    }
}