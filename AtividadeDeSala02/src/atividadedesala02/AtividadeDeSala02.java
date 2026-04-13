/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadedesala02;

import java.util.Scanner;

/**
 *
 * @author 32614169
 */
public class AtividadeDeSala02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

        
        System.out.print("Digite o tamanho do vetor X (n): ");
        int n = entrada.nextInt();
        int[] X = new int[n];
        
        System.out.println("Digite os elementos do vetor X:");
        for (int i = 0; i < n; i++) {
            System.out.print("X[" + i + "]: ");
            X[i] = entrada.nextInt();
        }

  
        System.out.print("Digite o tamanho do vetor Y (m): ");
        int m = entrada.nextInt();
        int[] Y = new int[m];
        
        System.out.println("Digite os elementos do vetor Y:");
        for (int i = 0; i < m; i++) {
            System.out.print("Y[" + i + "]: ");
            Y[i] = entrada.nextInt();
        }

        
        int[] tempZ = new int[n + m];
        int tamanhoZ = 0;

        
        for (int i = 0; i < n; i++) {
            boolean repetido = false;
            // Verifica se o elemento já existe no vetor tempZ
            for (int j = 0; j < tamanhoZ; j++) {
                if (tempZ[j] == X[i]) {
                    repetido = true;
                    break;
                }
            }
            
            if (!repetido) {
                tempZ[tamanhoZ] = X[i];
                tamanhoZ++;
            }
        }

        
        for (int i = 0; i < m; i++) {
            boolean repetido = false;
           
            for (int j = 0; j < tamanhoZ; j++) {
                if (tempZ[j] == Y[i]) {
                    repetido = true;
                    break;
                }
            }
            
            if (!repetido) {
                tempZ[tamanhoZ] = Y[i];
                tamanhoZ++;
            }
        }

        
        int[] Z = new int[tamanhoZ];
        for (int i = 0; i < tamanhoZ; i++) {
            Z[i] = tempZ[i];
        }

        
        System.out.print("Vetor Z (Uniao) = { ");
        for (int i = 0; i < tamanhoZ; i++) {
            System.out.print(Z[i]);
            if (i < tamanhoZ - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
    
}
