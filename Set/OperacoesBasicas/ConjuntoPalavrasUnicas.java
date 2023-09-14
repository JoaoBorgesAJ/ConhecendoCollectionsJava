package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // Atributos 
    private Set<String> palavrasUnicaSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicaSet = new HashSet<>();
    }

    public void adicionarPalavras(String palavra) {
        palavrasUnicaSet.add(palavra);
    }
    public void removerPalavras(String palavra) {
        if (!palavrasUnicaSet.isEmpty()) {
            if(palavrasUnicaSet.contains(palavra)) {
                palavrasUnicaSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicaSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasUnicaSet.isEmpty()) {
            System.out.println(palavrasUnicaSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando Linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavras("Java");
        conjuntoLinguagens.adicionarPalavras("Python");
        conjuntoLinguagens.adicionarPalavras("JavaScript");
        conjuntoLinguagens.adicionarPalavras("Python");
        conjuntoLinguagens.adicionarPalavras("C++");
        conjuntoLinguagens.adicionarPalavras("Ruby");

        // Exibindo as Linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavras("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma Linguagem inexistente
        conjuntoLinguagens.removerPalavras("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("Alinguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("Alinguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
    
}
