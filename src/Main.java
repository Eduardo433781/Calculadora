import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        String num1 = JOptionPane.showInputDialog("Digite o primeiro número:");
//        String num2 = JOptionPane.showInputDialog("Digite o segundo número:");
//        String operacao = JOptionPane.showInputDialog("Digite a operação (+, -, *, /):");
//
//        double n1 = Double.parseDouble(num1);
//        double n2 = Double.parseDouble(num2);
//        double resultado = 0;
//
//        switch (operacao) {
//            case "+":
//                resultado = n1 + n2;
//                break;
//            case "-":
//                resultado = n1 - n2;
//                break;
//            case "*":
//                resultado = n1 * n2;
//                break;
//            case "/":
//                if (n2 != 0) {
//                    resultado = n1 / n2;
//                } else {
//                    JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!");
//                    return;
//                }
//                break;
//            default:
//                JOptionPane.showMessageDialog(null, "Operação inválida!");
//                return;
//        }
//
//        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Adivinhe um número entre 1 e 100:");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroAleatorio) {
                System.out.println("Tente um número menor.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            }
        } while (palpite != numeroAleatorio);

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");

        scanner.close();


























    }
}