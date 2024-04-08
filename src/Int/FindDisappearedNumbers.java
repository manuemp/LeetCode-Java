package Int;

import java.util.ArrayList;
import java.util.List;

//Encontrar los números faltantes en el rango [1, nums.length]

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //Creo un array nuevo con ceros
        int[] arr = new int[nums.length];
        List<Integer> res = new ArrayList<Integer>();

        //Pongo el número en el índice del array nuevo que le corresponde
        for(int i = 0 ; i < nums.length ; i ++)
            arr[nums[i] - 1] = nums[i];

        //Lo que haya permanecido en 0 es el número que falta
        //Al índice del número faltante le sumo 1 para obtener el número
        //Lo agrego en la lista de resultado
        for(int i = 0 ; i < nums.length ; i++)
            if(arr[i] == 0) res.add(i + 1);

        return res;
    }
}
