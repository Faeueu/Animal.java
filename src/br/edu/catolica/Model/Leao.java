package br.edu.catolica.Model;

public class Leao extends Animal{
    public Leao(String nome, int idade, String especie){
        super(nome, idade, especie);
    }

    public void comFome(){
        System.out.println("O leão esta com fome!!");
    }

    public void rugir() {
        System.out.println("ROARRR");
    }

}
