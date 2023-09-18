import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Classe Objeto = Construtor
        Turista mochileiro = new Turista("Lindsay");
        Turista mochileira = new Turista();
        // Definir forma de cada turista
        mochileiro.setCpf(Validacao.cpf("123"));
        mochileira.setNome("Namor");
        mochileira.setCpf("456");
        // Definir comportamento
        String retorno = mochileira.viajar();
        // Atribuindo dinâmica
        String nome = JOptionPane.showInputDialog("Entre com o nome da pessoa Turista:");
        // Criação do objeto do tipo Turista
        Turista pessoaTurista = new Turista(nome);
        // Saída de dados - nome armazenado acima
        System.out.println(pessoaTurista.getNome());
        // Pedir CPF e mostrar
        String cpf = JOptionPane.showInputDialog("Entre com o CPF do Turista:");
        // Adicionar CPF no objeto pessoaTurista
        pessoaTurista.setCpf(cpf);
        System.out.println(pessoaTurista.getCpf());


    }
}