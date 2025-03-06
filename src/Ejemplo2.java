public class Ejemplo2 {
    public static void main(String[] args) {
        int[] n = {26, -30, 0, 100, 7, 8}; // se define n como un array de enteros
        System.out.print("Los valores del array n son los siguientes: ");
        System.out.print(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);
        int suma = n[0] + n[5];
        System.out.println("\nEl primer elemento del array más el último suman " + suma);
    }
}
