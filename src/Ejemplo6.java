public class Ejemplo6 {
    //Requiero crear un array de dos dimensiones de 4 notas de 5 materias que son "Lenguaje, matematicas, ciencias, sociales, ingles" y tambien requiero el promedio de cada materia
    public static void main(String[] args) {
        double[][] notas = {
            {2.9, 3, 0, 5, 4},
            {3.9, 4, 1, 5, 5},
            {4.9, 5, 2, 5, 3},
            {2.9, 5, 2, 5, 3.9},
            {5, 5, 3, 5, 2}
        };
        String[] materias = {"Lenguaje", "Matematicas", "Ciencias", "Sociales", "Ingles"};
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = 0;
            System.out.println("Las notas de la materia " + materias[i] + " son:");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
                suma += notas[i][j];
            }
            System.out.println("\nEl promedio de la materia " + materias[i] + " es " + suma / notas[i].length);
        }
    }
}
