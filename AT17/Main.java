import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        String[] alunos = new String[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.print("Informe o nome do " + " aluno " + (i+1)+": ");
            alunos[i] = sc.nextLine();
            
        }
        for (int i = 0; i > alunos.length; i++){
            System.out.println(alunos[i]);
        }
        ArrayList<String> aluno = new ArrayList<String>();
        aluno.add("Ana");
        aluno.add("Maria");
        aluno.add("Pedro");
        System.out.println("Lista de alunos: ");
        for (String n: aluno){
            System.out.println(aluno);
        }
        aluno.add("Júlio");
        System.out.println("Lista de alunos atualizada: ");
        for (String n: aluno){
            System.out.println(aluno);
        }
    }
}