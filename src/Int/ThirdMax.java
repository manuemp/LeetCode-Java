package Int;
import java.util.*;

//Encontrar el tercer mayor (obviando números repetidos)

public class ThirdMax {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        //Declaro un máximo parcial. De no encontrar el tercero, retorno
        //el máximo que guardé antes de iniciar el bucle.
        int partial = max;
        //El array está ordenado, por lo que ya se cual es el primer máximo.
        //Quedan dos para encontrar el pedido por el ejercicio.
        int count = 2;

        for(int i = nums.length - 1 ; i >= 0 ; i--){
            //Chequeo que el número no haya sido tomado en cuenta ya
            if(nums[i] != partial){
                //Si ya pasé por el segundo, entonces devuelvo el tercero
                if(count == 1) return nums[i];
                else{
                    partial = nums[i];
                    count--;
                }
            }
        }

        return max;
    }
}
