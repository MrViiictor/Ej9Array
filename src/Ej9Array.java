public class Ej9Array {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        int  countOnes=0, countFil = 0, countCol = 0;
        for (int fila = 0; fila < array[0].length; fila++) {
            for (int columna = 0; columna < array.length; columna++) {
                array[fila][columna] = 1;
            }
        }

        array[0][4] = 8;
        array[2][6] = 8;
        array[3][1] = 8;
        array[8][6] = 8;

        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                System.out.print(array[fila][columna] + " ");
            }
            System.out.println();

        }
        for (int fila = 0; fila < array.length; fila++) {
            countOnes=0;
            for (int columna = 0; columna < array[0].length; columna++) {
                if (array[fila][columna] == 1) {
                    countOnes++;
                }
            }
            if (countOnes == array[0].length) {
                countFil++;
            }
        }

        for (int columna = 0; columna < array[0].length; columna++) {
            countOnes = 0;
            for (int fila = 0; fila < array[0].length; fila++) {
                if (array[fila][columna] == 1){
                    countOnes++;
            }
        }
        if (countOnes == array[0].length){

        countCol++;
    }
}
        System.out.println("Filas de 1 = " + countFil);
        System.out.println("Columnas de 1 = " + countCol);
    }
}



