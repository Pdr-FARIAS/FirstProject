package FirstProject;

import javax.swing.*;
import java.util.Random;

public class Calculadora {
    private int Operacao;
    private int valor1;
    private int valor2;
    private int resultado;
    public Dificuldade dificuldade;

    public Calculadora() {
    }

    public Calculadora(String dificuldade) {
        Random random = new Random();

        try {

            this.dificuldade = Dificuldade.valueOf(dificuldade);
        } catch (IllegalArgumentException e) {
            this.dificuldade = Dificuldade.IMPOSSIVEL;
        } finally {


            this.Operacao = random.nextInt(3);
            if (this.dificuldade == Dificuldade.FACIL) {
                this.valor1 = random.nextInt(10);
                this.valor2 = random.nextInt(10);
            } else if (this.dificuldade == Dificuldade.MEDIO) {
                this.valor1 = random.nextInt(100);
                this.valor2 = random.nextInt(100);

            } else if (this.dificuldade == Dificuldade.DIFICIL) {
                this.valor1 = random.nextInt(1000);
                this.valor2 = random.nextInt(1000);

            } else if (this.dificuldade == Dificuldade.INSANO) {
                this.valor1 = random.nextInt(10000);
                this.valor2 = random.nextInt(10000);
            } else {
                this.valor1 = random.nextInt(100000);
                this.valor2 = random.nextInt(100000);

            }

        }
    }


    public int getValor1() {
        return (int) valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getOperacao() {
        return Operacao;
    }

    public void setOperacao(int operacao) {
        Operacao = operacao;
    }

    public int getValor2() {
        return (int) valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        String op;
        if (this.getOperacao() == 0) {
            op = "soma";
        } else if (this.getOperacao() == 1) {
            op = "subtrair";

        } else if (this.getOperacao() == 2) {
            op = "multiplicaçao";



        } else {
            op = "nao encontrada a operaçao";

        }
        return "Valor1:" + this.getValor1() + "\nValor2: " + this.getValor2() + "\nDificulda: " + this.dificuldade + "\nOperaçao: " + op;
    }

    public boolean somar(int resposta) {
        setResultado(getValor1() + getValor2());

        boolean certo = false;
        if (resposta == this.getResultado()) {
            JOptionPane.showInternalMessageDialog(null, "Resposta correta");
            certo = true;
        } else {
            JOptionPane.showInternalMessageDialog(null, "Resposta errada");

        }
        JOptionPane.showInternalMessageDialog(null, "A resposta  correta é de :" + getResultado());
        return certo;
    }

    public boolean subtrair(int resposta) {
        setResultado(getValor1() - getValor2());
        boolean certo = false;
        if (resposta == this.getResultado()) {
            JOptionPane.showInternalMessageDialog(null, "Resposta correta");
            certo = true;
        } else {
            JOptionPane.showInternalMessageDialog(null, "Resposta errada");

        }
        JOptionPane.showInternalMessageDialog(null, "A resposta  correta é de:" + getResultado());
        return certo;

    }

    public boolean multiplicaçao(int resposta) {
        setResultado(getValor1() * getValor2());
        boolean certo = false;
        if (resposta == this.getResultado()) {
            JOptionPane.showInternalMessageDialog(null, "Resposta correta");
            certo = true;
        } else {
            JOptionPane.showInternalMessageDialog(null, "Resposta errada");

        }
        JOptionPane.showInternalMessageDialog(null, "A resposta  correta é de  :" + getResultado());
        return certo;

    }
}
