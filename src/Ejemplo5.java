public class Ejemplo5 {
    public static void main(String[] args) {

        // se define nota como un array de 4 elementos
        double[] nota = {2.9, 3, 0, 5}; // se define n como un array de enteros

        System.out.println("Tus notas son: "+nota[0]+", "+nota[1]+", "+nota[2]+", "+nota[3]);
        double suma = 0;
        for (double n : nota) { // for al estilo foreach
            System.out.print(n + " ");
            suma += n;
        }
        System.out.println("\nLa media es " + suma / 4);
    }
}