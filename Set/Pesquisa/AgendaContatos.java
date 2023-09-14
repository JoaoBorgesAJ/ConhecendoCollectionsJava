package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // Atributo
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContatos(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if (!contatosSet.isEmpty()) {
            System.out.println(contatosSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public Set<Contato> pesquisaPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if (!contatosSet.isEmpty()) {
            for (Contato c : contatosSet) {
                if (c.getNome().startsWith(nome)) {
                    contatosPorNome.add(c);
                }
            }
            return contatosPorNome;
        } else {
            throw new RuntimeException("O conjuinto está vazio!");
        }
    }

    public Contato atualizarNumneroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if (!contatosSet.isEmpty()) {
            for (Contato c : contatosSet) {
                if (c.getNome().equals(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
        } else {
            throw new RuntimeException("O conjunto está vazio");
        }
    }

    public static void main(String[] args) {
        // Criando uma intância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContatos();

        // Adicionando contatos à agenda
        agendaContatos.adicionarContatos("João", 2134124);
        agendaContatos.adicionarContatos("Maria", 7893425);
        agendaContatos.adicionarContatos("Maria Fernandes", 555555);
        agendaContatos.adicionarContatos("Ana", 88889999);
        agendaContatos.adicionarContatos("Fernando", 77778888);
        agendaContatos.adicionarContatos("Carolina", 55555555);

        // Exibindo os contatos na agenda
        agendaContatos.equals(agendaContatos);

        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisaPorNome("Maria"));

        // Atualizando o número do contato
        Contato contatoAtualizado = agendaContatos.atualizarNumneroContato("Carolina", 44443333);
        System.out.println("Contato atualizado" + contatoAtualizado);

        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }
}
