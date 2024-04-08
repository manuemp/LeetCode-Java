package Int;

//Verificar si dentro del rango K existen dos números iguales

public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k > nums.length) k = nums.length;

        for(int i = 0 ; i <= nums.length - k; i++){
            if(i != nums.length - k){
                if(check(i, k, nums)) return true;
            }
            else{
                //Cuando la cantidad de números que quedan son menores que k, pero al mismo tiempo, esa cantidad es
                //mayor que dos, puede que queden parejas de números por revisar que podrían ser iguales
                //Para no tener una excepción por sobrepasar el índice, por cada vuelta se resta 1 a k y se verifica
                //si todavía hay números que cumplan con la condición, o si no hay ninguno
                k--;
                if(k < 1) break;
                if(check(i, k, nums)) return true;
            }
        }
        return false;
    }

    public static boolean check(int i, int k, int[] nums){
        for(int j = i+1 ; j <= k + i ; j++)
            if(nums[j] == nums[i]) return true;
        return false;
    }
}
