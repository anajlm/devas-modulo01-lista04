public class Q2_MediaNotas {

    public static void main(String[] args) {
        int[][] notas = new int[][]{{9, 8, 7, 8},
                                    {10, 9, 8, 9},
                                    {9, 8, 7, 8}};

        mostraMediaNotas(notas);
    }
    
    public static void mostraMediaNotas(int[][] notas){

        int numAlunos = notas.length;

        double somaTurma = 0;

        for(int i=0; i<numAlunos; i++) {

            int numNotas = notas[i].length;

            double somaAluno = 0;

            for (int j = 0; j<numNotas; j++) {
                somaAluno += notas[i][j];
            }
            double mediaAluno = somaAluno / numNotas;
            System.out.printf("Aluno %d - Media %.2f %n", i, mediaAluno);

            somaTurma += mediaAluno;

        }

        System.out.println();

        double mediaTurma = somaTurma / numAlunos;
        System.out.printf("Média da turma: %.2f %n", mediaTurma);

    }
}
