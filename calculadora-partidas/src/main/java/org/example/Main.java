package org.example;

public class Main {

    int vitorias;
    int derrotas;

    public int calculaVitorias(int vitorias, int derrotas){
        return vitorias - derrotas;
    }
    public String calculaHancking(int vitorias) {

        if (vitorias < 10) {
            return "Ferro";
        } else if (vitorias > 10 && vitorias <= 20) {
            return "Bronze";
        } else if (vitorias > 20 && vitorias <= 50) {
            return "Prata";
        } else if (vitorias > 50 && vitorias <= 80) {
            return "Ouro";
        } else if (vitorias > 80 && vitorias <= 90) {
            return "Diamante";
        } else if (vitorias > 90 && vitorias <= 100) {
            return "Lendário";
        }else {
            return "Imortal";
        }

    }
    public static void main(String[] args) {

        Main main = new Main();

      int saldo =  main.calculaVitorias(100, 40);
      String nivel = main.calculaHancking(saldo);


        System.out.println("O Herói tem de saldo de " + saldo + " vitórias e está no nível " + nivel);
    }
}