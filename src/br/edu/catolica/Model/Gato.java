package br.edu.catolica.Model;

public class Gato extends Animal{
    public Gato(String nome, int idade, String especie){
        super(nome, idade, especie);
    }

    public void miar(){
        System.out.println("MEOW");
    }

    public void sono(){
        System.out.println("O gato esta com sono!!");
    }

}
