package br.edu.catolica.Model;

public abstract class Animal {
    String nome;
    int idade;
    String especie;

    public Animal(String nome, int idade, String especie){
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", especie='" + especie + '\'' +
                '}';
    }
}
