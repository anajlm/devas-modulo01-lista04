public class Q5_Pivo {

    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 1, 1, 1};

        System.out.println(calculaPivo(array));
    }

    public static int calculaPivo(int[] array){

        for(int i=0; i<array.length; i++){

            double somaEsquerda = 0;
            for(int j=0; j<i; j++){
                somaEsquerda += array[j];
            }

            double somaDireita = 0;
            for(int k=i+1; k<array.length; k++){
                somaDireita += array[k];
            }

            if (somaDireita == somaEsquerda){
                return i;
            }

        }

        return -1;
    }

}
