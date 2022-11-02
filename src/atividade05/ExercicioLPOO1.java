package atividade05;

public class ExercicioLPOO1 {
    public static void main(String[] args) {

        Carro carro1 = new Carro("FIAT", "Palio");

        carro1.printVelocidade();

        carro1.acelerar(20);
        carro1.acelerar(40);
        carro1.acelerar(140);
        carro1.acelerar(1);

        carro1.printVelocidade();

        carro1.frear(100);
        carro1.frear(60);
        carro1.frear(45);

        carro1.printVelocidade();
    }
}