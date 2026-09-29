import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Setup
        Scanner sc = new Scanner(System.in);
        
        // Input
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        // Logic
        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = (24 - horaInicial) + horaFinal;
        }

        // Output
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}