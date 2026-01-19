package org.example;

public class Personagem {
    private String nome;
    private String classe;
    private int nivel;

    public Personagem( String nome, String classe, int nivel){
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
    }

    public void printFicha(){
        System.out.println("--- FICHA DO PERSONAGEM ---");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("nível: " + nivel);
    }

    public static void main(String [] args){
        Personagem meuHeroi = new Personagem("Arzothar", "Gloom Stalker Ranger", 7);
        meuHeroi.printFicha();
    }
}
