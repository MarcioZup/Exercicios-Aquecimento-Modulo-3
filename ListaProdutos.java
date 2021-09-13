import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class ListaProdutos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<String,Double> produtos = new HashMap<String,Double>();
        boolean loop = true;
        int opcao = 0;
        String nomeProduto;
        double precoProduto;
        while (loop){
            System.out.println("\nDigite a opção desejada: \n");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR CADASTRADOS");
            System.out.println("3 - EXCLUIR");
            System.out.println("4 - SAIR");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1: {
                    teclado.nextLine();
                    System.out.println("Digite o nome do produto: ");
                    nomeProduto = teclado.nextLine();
                    System.out.println("Digite o preço do produto: ");
                    precoProduto = teclado.nextDouble();
                    produtos.put(nomeProduto,precoProduto);
                    System.out.println("Produto cadastrado com sucesso.");
                    break;
                }
                case 2: {
                    if (produtos.isEmpty()) {
                        System.out.println("Não existe nenhum produto cadastrado.\n");
                    }else{
                        for (String referencia: produtos.keySet()) {
                            System.out.println("Produto: " + referencia + "\t\t\t\t" + " Preço: " + produtos.get(referencia));
                        }
                    }
                    break;
                }
                case 3: {
                    teclado.nextLine();
                    System.out.println("Digite o nome do produto a ser excluído: ");
                    String produtoASerExcluido = teclado.nextLine();
                    if (produtos.containsKey(produtoASerExcluido)) {
                        produtos.remove(produtoASerExcluido);
                        System.out.println("Produto excluído com sucesso. ");
                        }else{
                        System.out.println("Produto não encontrado");
                    }


                break;
                }
                case 4: {
                    loop = false;
                    System.out.println("Você saiu do sistema.");
                    break;
                }
                default: {
                    System.out.println("Você digitou uma opção inválida! ");

                }            }
        }


    }
}
