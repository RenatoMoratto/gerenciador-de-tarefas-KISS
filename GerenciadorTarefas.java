import java.util.Scanner;
import java.util.ArrayList;

public class GerenciadorTarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);
        int acaoEscolhida = 0;
        int indexTarefa;

        while (acaoEscolhida != 4) {
            System.out.println("\n---- Tarefas ----");
            tarefas.forEach(item -> System.out.printf("%d - %s\n", tarefas.indexOf(item), item));

            System.out.print("\n[ 1 ] - Adicionar \n[ 2 ] - Editar \n[ 3 ] - Remover \n[ 4 ] - Sair \nEscolha: ");
            acaoEscolhida = entrada.nextInt();
            entrada.nextLine();

            switch (acaoEscolhida) {
                case 1:
                    System.out.print("\n---- Adicionar tarefa ----\nTarefa: ");
                    tarefas.add(entrada.nextLine());
                    break;
                case 2:
                    System.out.print("\n---- Editar tarefa ----\nID da tarefa: ");
                    indexTarefa = entrada.nextInt();
                    entrada.nextLine();

                    if (indexTarefa > tarefas.size()) {
                        System.out.println("\nId inválido");
                        break;
                    }

                    System.out.print("Novo conteúdo da tarefa: ");
                    tarefas.set(indexTarefa, entrada.nextLine());
                    break;
                case 3:
                    System.out.print("\n---- Remover tarefa ----\nID da tarefa: ");
                    indexTarefa = entrada.nextInt();
                    entrada.nextLine();

                    if (indexTarefa > tarefas.size()) {
                        System.out.println("\nId inválido");
                        break;
                    }

                    tarefas.remove(indexTarefa);
                    break;
            }
        }

        entrada.close();
    }
}