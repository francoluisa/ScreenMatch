package br.com.alura.screenmatch.modelos;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Item: " + nome + " Preço: R$ " + preco;
    }


    public static void main(String[] args) {
        Produto pao = new Produto("Pão", 2.5);
        Produto acucar = new Produto("Açucar", 2.99);
        Produto leite = new Produto("Leite", 4.5);
        Produto manga = new Produto("Manga", 7.30);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(pao);
        listaProdutos.add(acucar);
        listaProdutos.add(leite);
        listaProdutos.add(manga);

        double somaPrecos = 0;

        for (Produto produto : listaProdutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();

        System.out.println("Preço médio dos produtos: " + precoMedio);
    }


}
