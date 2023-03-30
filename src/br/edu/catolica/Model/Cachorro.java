package br.edu.catolica.Model;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade, String especie){
        super(nome, idade, especie);
    }

    public void correr() {
        System.out.println("Cachorro esta correndo!!");
    }

    public void latir() {
        System.out.println("AU AU AU!");
    }
}



