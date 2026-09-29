package menu;

import input.Input;
import function.GalpoesFunction;

public class Menu {
    
    public static void mainMenu() {
        int escolha = 0;
        do {
            System.out.println("\n+++ MENU PRINCIPAL +++");
            System.out.println("1 - Galpões");
            System.out.println("2 - Produtos");
            System.out.println("0 - Sair");
            
            escolha = Input.inputInt(); 

            switch (escolha) {
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                case 1:
                    galpoesMenu();
                    break;
                case 2:
                    produtosMenu();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (escolha != 0);
    }

    public static void galpoesMenu() {
        int escolha = 0;
        do {
            System.out.println("\n+++ MENU GALPÕES +++");
            System.out.println("1 - Cadastrar Galpão");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            
            escolha = Input.inputInt();

            switch (escolha) {
                case 0:
                    System.out.println("Voltando...");
                    break;
                case 1:
                    System.out.println("\n+++ CRIAR GALPÕES +++");
                    GalpoesFunction.criarGalpoes();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (escolha != 0);
    }

    public static void produtosMenu() {
        int escolha = 0;
        do {
            System.out.println("\n+++ MENU PRODUTOS +++");
            System.out.println("1 - Cadastrar Produto"); //TODO: Criar funções de produtos
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            
            escolha = Input.inputInt();

            switch (escolha) {
                case 0:
                    System.out.println("Voltando...");
                    break;
                case 1:
                    System.out.println("Funcionalidade em desenvolvimento...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (escolha != 0);
    }
}