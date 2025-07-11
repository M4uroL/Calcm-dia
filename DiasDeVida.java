import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DiasDeVida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário
        System.out.println("Digite seu ano de nascimento (ex: 2005):");
        int ano = scanner.nextInt();

        System.out.println("Digite seu mês de nascimento (1 a 12):");
        int mes = scanner.nextInt();

        System.out.println("Digite seu dia de nascimento:");
        int dia = scanner.nextInt();

        // Criação da data de nascimento
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();

        // Verificação básica
        if (dataNascimento.isAfter(dataAtual)) {
            System.out.println("Data de nascimento inválida! Está no futuro.");
        } else {
            // Cálculo da diferença em dias
            long diasVividos = ChronoUnit.DAYS.between(dataNascimento, dataAtual);
            System.out.println("Você já viveu " + diasVividos + " dias.");
        }

        scanner.close();
    }
}
