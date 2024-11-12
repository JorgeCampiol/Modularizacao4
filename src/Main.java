import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = gerarNumeroSecreto(random);
        jogar(scanner, numeroSecreto);

        scanner.close();
    }

    private static int gerarNumeroSecreto(Random random) {
        return random.nextInt(100) + 1;
    }

    private static void jogar(Scanner scanner, int numeroSecreto) {
        boolean acertou = false;
        while (!acertou) {
            int tentativa = lerTentativa(scanner);
            acertou = verificarTentativa(tentativa, numeroSecreto);
        }
    }

    private static int lerTentativa(Scanner scanner) {
        System.out.print("Adivinhe o número (1-100): ");
        return scanner.nextInt();
    }

    private static boolean verificarTentativa(int tentativa, int numeroSecreto) {
        if (tentativa < numeroSecreto) {
            System.out.println("Muito baixo!");
            return false;
        } else if (tentativa > numeroSecreto) {
            System.out.println("Muito alto!");
            return false;
        } else {
            System.out.println("Parabéns! Você acertou.");
            return true;
        }
    }
}
