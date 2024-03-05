import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        MaiorNumero app = new MaiorNumero();
        app.start();
    }

    private void start() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Quantos numeros vai digitar: ");
        n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();

        }
        int maior = 0;
        int pocisao = 0;

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]>maior){
                maior = vetor[i];
                pocisao = i;
            }

        }
        System.out.println("maior valor= " + maior);
        System.out.println("Pocisao do maior valor= "+ pocisao);

    }
}
