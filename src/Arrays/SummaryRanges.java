package Arrays;

import java.util.ArrayList;
import java.util.List;

//Identificar rangos de números consecutivos en un array de enteros.

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {

        List<String> res = new ArrayList<String>();

        if(nums.length == 0) return res;
        if(nums.length == 1)
        {
            res.add(String.valueOf(nums[0]));
            return res;
        }

        int range_start = nums[0];
        int next = nums[0];


        for(int i = 0 ; i < nums.length ; i++){
            //Repito el procedimiento hasta el anteúltimo número
            if(i != nums.length - 1){
                //Guardo el número siguiente, me va a servir para el último caso
                next = nums[i+1];
                //Si el número siguiente no es consecutivo al actual cierro el rango
                if(nums[i + 1] != nums[i] + 1){
                    //Si no hubo ningún número de por medio, simplemente guardo el número
                    if(range_start == nums[i])
                        res.add(String.valueOf(range_start));
                    else
                        //Sino, guardo el rango agregando una flecha para indicar inicio y fin
                        res.add(range_start + "->" + nums[i]);
                    //En ambos casos, reinicio el número que indique el inicio del próximo rango
                    range_start = nums[i + 1];
                }
                //Analizo el último número
            } else {
                if(next - nums[i-1] != 1) res.add(String.valueOf(nums[i]));
                else res.add(range_start + "->" + nums[i]);
            }
        }

        return res;
    }
}
