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
