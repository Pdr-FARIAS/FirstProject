package FirstProject;

import javax.swing.*;


public class Game {
    static int pontuaçao = 0;
    static Calculadora calculadora;


    public static void jogar() {
        String dif = JOptionPane.showInputDialog("Qual é a Dificuldade ?" + "\n Facil" + "\n Medio" + "\n Dificil" + "\n Insano").toUpperCase();
        Game.calculadora = new Calculadora(dif);
        JOptionPane.showInternalMessageDialog(null,"Informe o resultado do seguinte opreraçao:");

        if (calculadora.getOperacao() == 0) {
            String resultado = JOptionPane.showInputDialog(calculadora.getValor1() + "+" + calculadora.getValor2());
            int resposta = Integer.parseInt(resultado);
            if (calculadora.somar(resposta)) {
                Game.pontuaçao += 1;
                JOptionPane.showInternalMessageDialog(null,"Voce tem um total de pontos de "+Game.pontuaçao);
            }

        } else if (calculadora.getOperacao() == 1) {
            String resultado = JOptionPane.showInputDialog(calculadora.getValor1() + "-" + calculadora.getValor2());
            int resposta = Integer.parseInt(resultado);
            if (calculadora.subtrair(resposta)) {
                Game.pontuaçao += 1;
                JOptionPane.showInternalMessageDialog(null,"Voce tem um total de pontos de "+Game.pontuaçao);

            }
        } else if (calculadora.getOperacao() == 2) {
            String resultado = JOptionPane.showInputDialog(calculadora.getValor1() + "*" + calculadora.getValor2());
            int resposta = Integer.parseInt(resultado);
            if (calculadora.multiplicaçao(resposta)) {
                Game.pontuaçao += 1;
                JOptionPane.showInternalMessageDialog(null,"Voce tem um total de pontos de "+Game.pontuaçao);
            }

        } else {
            JOptionPane.showInputDialog("A operação" + calculadora.getOperacao() + "não é reconhecida.");
        }
        String entrada = JOptionPane.showInputDialog("Deseja continuar [1-sim]\n[2-não] ?");
        int continuar = Integer.parseInt(entrada);
        if (continuar == 1) {
            Game.jogar();

        } else {
            JOptionPane.showInternalMessageDialog(null,"Voce conseguiu um total de pontos igual a :"+Game.pontuaçao);
            JOptionPane.showInternalMessageDialog(null,"Nos vemos na proxima!!");
            System.exit(0);
        }

    }


}