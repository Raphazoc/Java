package Faculdade.Fila;
import javax.swing.*;

public class filaJava {
    static class Fila {
        int tamanho, inicio, fim, total;
        int vetor[];

        Fila(int tam) {
            tamanho = tam;
            inicio = 0;
            fim = 0;
            total = 0;
            vetor = new int[tam];
        }

        public boolean FilaVazia() {
            if (total == 0) {
                return true;
            } else {
                return false;
            }
        }

        public boolean FilaCheia() {
            if (total >= tamanho) {
                return true;
            } else {
                return false;
            }
        }

        public void Enfileirar(int valor) {
            if (FilaCheia()) {
                System.out.println("Fila cheia");
            } else {
                vetor[fim] = valor;
                fim = (fim + 1) % tamanho;
                total++;
            }
        }

        public int Desenfileirar() {
            int valor = -1;
            if (FilaVazia()) {
                System.out.println("Fila vazia");
            } else {
                valor = vetor[inicio];
                inicio = (inicio + 1) % tamanho;
                total--;
            }
            return valor;
        }

        public void ElementoInicio() {
            if (FilaVazia()) {
                System.out.println("Fila vazia");
            } else {
                System.out.println("Elemento do inicio: " + vetor[inicio]);
            }
        }

        public void MostrarFila() {
            if (FilaVazia()) {
                System.out.println("Fila vazia");
            } else {
                System.out.print("Fila: ");
                for (int i = 0; i < total; i++) {
                    System.out.print(vetor[(inicio + i) % tamanho] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Fila intFila = new Fila(10);
        int i, entrada = 0;
        boolean exibiu = false;

        for (i = 1; i < 10; i++) {
            entrada  = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));

            if (entrada % 2 == 0) {
                intFila.Enfileirar(entrada);
            } else {
                intFila.MostrarFila();
                exibiu = true;
                break;
            }
        }
        if (!exibiu) {
            intFila.MostrarFila();
        }
    }
}