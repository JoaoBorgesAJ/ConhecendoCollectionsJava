package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // Atributo
    private Map<String, Integer> agendaContatoMap;


    private AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContatos(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    public void exibirContatos() {
        if (!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        } else {
             System.out.println("A agenda de contatos está vazia.");
        }
    }

    public Integer pesquisaPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
            if (numeroPorNome == null) {
                System.out.println("Contato não encontrado na agenda.");
            }
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionar Contatos
        agendaContatos.adicionarContatos("Camila", 1234565);
        agendaContatos.adicionarContatos("João", 5665);
        agendaContatos.adicionarContatos("Carlos", 1111111);
        agendaContatos.adicionarContatos("Ana", 654987);
        agendaContatos.adicionarContatos("Maria", 1111111);
        agendaContatos.adicionarContatos("Camila", 44444);

        agendaContatos.exibirContatos();

        // Remover Contatos
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        // Pesquisa por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisaPorNome("João");
        System.out.println("Numero de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisaPorNome(nomePesquisaNaoExistente);
        System.out.println("Numero de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }
}
