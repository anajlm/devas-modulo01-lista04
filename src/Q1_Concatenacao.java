public class Q1_Concatenacao {

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4};
        int[] B = new int[]{5, 6, 7, 8};

        int[] output = concatenaDoisArrays(A, B);

        for(int o : output){
            System.out.print(o + " ");
        }
    }
    
    public static int[] concatenaDoisArrays(int[] A, int[] B){

        int[] output = new int[2*A.length];

        for (int i=0; i<A.length; i++){
            output[2*i] = A[i];
            output[2*i + 1] = B[i];
        }

        return output;
    }

}
