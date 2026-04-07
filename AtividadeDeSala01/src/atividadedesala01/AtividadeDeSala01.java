/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadedesala01;

import java.util.Scanner;

/**
 *
 * @author 32614169
 */
public class AtividadeDeSala01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

        // Lê o tamanho do vetor
        System.out.print("Digite o tamanho do vetor (n): ");
        int n = entrada.nextInt();

        int[] X = new int[n];
        int[] Y = new int[n];

        // Lê os elementos do vetor X
        System.out.println("Digite os elementos do vetor X:");
        for (int i = 0; i < n; i++) {
            System.out.print("X[" + i + "]: ");
            X[i] = entrada.nextInt();
        }

        // Gera o vetor Y com os elementos de X em ordem inversa
        for (int i = 0; i < n; i++) {
            Y[i] = X[n - 1 - i];
        }

        // Imprime o resultado
        System.out.print("Vetor Y (Invertido) = { ");
        for (int i = 0; i < n; i++) {
            System.out.print(Y[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
    
}
