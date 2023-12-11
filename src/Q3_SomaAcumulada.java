public class Q3_SomaAcumulada {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};

        int[] output = calculaArraySomaAcumulada(nums);

        for (int o : output){
            System.out.print(o + " ");
        }
    }
    public static int[] calculaArraySomaAcumulada(int[] nums){

        int[] output = new int[nums.length];

        for(int i=0; i<nums.length; i++){

            for(int j=0; j<=i; j++){
                output[i] += nums[j];
            }

        }

        return output;
    }

}
