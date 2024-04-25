import java.util.Random;
	
public class pessoa1 {
    private String nome;
    private String dataNascimento;
    private String gmail;
    private String senha;
    private String CPF;	
    private String endereco;
    private String papel;
    private String id;
    
    public Pessoa(String nome, String dataNascimento, String gmail, String CPF, String endereco, String papel) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.gmail = gmail;
        this.senha = senha;
        this.CPF = CPF;
        this.endereco = endereco;
        this.papel = papel;
        this.id = gerarIdAleatorio();
    }

    private String gerarIdAleatorio() {
        Random random = new Random();
        return String.format("%04d", random.nextInt(10000000));
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nData de Nascimento: " + dataNascimento +
               "\nGmail: " + gmail + "\nCPF: " + CPF +
               "\nEndereço: " + endereco + "\nID: " + id + "\nPapel: " + papel;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSenha() {
        return senha;
    }
    
    public String getPapel() {
        return papel;
    }
    
        public String getId() {
            return id;
        }
    }

    import java.util.*;

public class Pessoa2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao sistema de registro!");
        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite o Gmail: ");
        String gmail = scanner.nextLine();
        
        System.out.print("Digite a sua Senha: ");
        String senha = scanner.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("A pessoa é estudante ou trabalhadora? ");
        String papel = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, dataNascimento, gmail, cpf, endereco, papel);

        System.out.println("\nRegistro criado:\n" + pessoa);	
        
    }
}
