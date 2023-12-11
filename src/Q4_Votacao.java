import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q4_Votacao {

    public static void main(String[] args) {
        votacao("Ana", "Luiz", "Maria");
    }

    public static void votacao(String nome1, String nome2, String nome3){
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> mapaVotos = new HashMap<>();

        mapaVotos.put(nome1, 0);
        mapaVotos.put(nome2, 0);
        mapaVotos.put(nome3, 0);
        mapaVotos.put("Abstencao", 0);

        for (int i=0; i<10; i++){

            System.out.println("Insira seu voto: ");
            String voto = scanner.nextLine();

            int numVotos = 0;

            if(voto.equals(nome1)) {
                numVotos = mapaVotos.get(nome1);
                mapaVotos.put(nome1, numVotos + 1);
            } else if(voto.equals(nome2)) {
                numVotos = mapaVotos.get(nome2);
                mapaVotos.put(nome2, numVotos + 1);
            } else if(voto.equals(nome3)) {
                numVotos = mapaVotos.get(nome3);
                mapaVotos.put(nome3, numVotos + 1);
            } else {
                numVotos = mapaVotos.get("Abstencao");
                mapaVotos.put("Abstencao", numVotos + 1);
            }


        }

        int numVotos = 0;
        String vencedor = nome1;
        int maxVotos = mapaVotos.get(nome1);
        for(Map.Entry<String, Integer> entry : mapaVotos.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votos");
            numVotos = entry.getValue();
            if (numVotos > maxVotos){
                maxVotos = numVotos;
                vencedor = entry.getKey();
            }

        }
        System.out.printf("O vencedor é %s, com %d votos. %n", vencedor, maxVotos);


    }

}
