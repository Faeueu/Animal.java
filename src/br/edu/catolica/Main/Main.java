package br.edu.catolica.Main;

import br.edu.catolica.Model.Cachorro;
import br.edu.catolica.Model.Gato;
import br.edu.catolica.Model.Leao;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(
                "bob",
                2,
                "pincher"
        );
        cachorro.latir();
        cachorro.correr();


        Leao leao = new Leao(
                "Leo",
                5,
                "Leao da Jamaica"
        );
        leao.rugir();
        leao.comFome();


        Gato gato = new Gato(
                "Simba",
                6,
                "Laranja"
        );
        gato.miar();
        gato.sono();
    }
}