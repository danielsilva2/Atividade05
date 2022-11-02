package atividade05;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidade;

    Carro (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        velocidade = 0;
    }

    public void acelerar (int a) {
        System.out.println(" ====== Acelerar ====== ");
        velocidade = velocidade + a;
        if (velocidade > 200) {
            System.out.println(" ====== Excede velocidade máxima. ====== ");
            velocidade = 200;
        } else {
            System.out.println("A velocidade atual do carro é de: " + velocidade + " km/h.");
        }
    }

    void frear (int f) {
        System.out.println(" ====== Freiar ====== ");
        velocidade = velocidade - f;
        if (velocidade < 0) {
            System.out.println("A velocidade atual é 0 km/h.");
            velocidade = 0;
        } else {
            System.out.println("A velocidade atual do carro é de: " + velocidade + " km/h.");
        }
    }

    @Override
    public String toString() {
        return "Carro {" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    public void printVelocidade () {
        System.out.println(toString());
    }
}