import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu mainMenu = new Menu();

        boolean programaRodando = false;
        while(programaRodando == false){
            int escolhaUsuario = mainMenu.mostrarMenu();
            programaRodando = mainMenu.opcoesMenu(escolhaUsuario);
        }
    }
}