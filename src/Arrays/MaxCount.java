package Arrays;

//Hay que encontrar en una matriz de dimensiones MxN la cantidad de veces que aparece
//el número máximo

public class MaxCount {
    public int maxCount(int m, int n, int[][] ops) {

        //El array ops indica las operaciones a hacer en la matriz. Indica el rango
        //en el que se tienen que sumar en 1 las casillas de la matriz.

        if(ops.length == 0) return m*n;
        int[] min = ops[0];

        //El intervalo mínimo en las operaciones indefectiblemente será el que se
        //repita más veces. Cualquiera que sea mayor va a tener dentro del mismo
        //a este. Ejemplo {2,1} va a estar siempre dentro de {3,3}
        //Lo que hago es entonces buscar el rango mínimo de celdas entre las operaciones
        //y la cantidad de números que integren (Mmin x Nmin) va a ser la cantidad de
        //mayores, ya que va a adicionar 1 en todas las operaciones.
        for(int i = 0 ; i < ops.length ; i++){
            if(ops[i][0] < min[0]) min[0] = ops[i][0];
            if(ops[i][1] < min[1]) min[1] = ops[i][1];
        }

        return min[0] * min[1];
    }
}
