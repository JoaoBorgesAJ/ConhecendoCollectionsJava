package main.java.generics;

import java.util.Arraylist;
import java.util.List;

public class GenericsExempleList{
    public static void main(String[] args){
        // Exemplo sem Generics
        List listaSemGenerics = new Arraylist();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); //Permite adicionar qualquer tipo de objeto
    }
}