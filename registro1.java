import java.util.*;
import java.text.SimpleDateFormat;

class registro1 {
	private String nome;
	private int idade;
	private String dataNascimento;
	private String gmail;
	private String id;
	
	public REGISTRO(String nome, int idade, String dataNascimento, String gmail) {
		 this.nome = nome;
		 this.idade = idade;
		 this.dataNascimento = dataNascimento;
		 this.gmail = gmail;
		 this.id = gerarIdAleatoria();
	}
	
	private String gerarIdAleatoria() {
		Random random = new Random();
		return String.format("%04d", random.nextInt(10000000));
		
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + 
			   "\nIdade:" + idade +
			   "\nData de Nascimento: " + dataNascimento +
	           "\nID: " + id;
	}

	//resultado final do registro
	
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}
	
	public int getIdade() {
			return idade;
		}
		
	public String dataNascimento() {
				return dataNascimento;
			}
	
	public String id() {
		return id;
	}
	
}
import java.util.Scanner;

public class registro2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite a idade: ");
		int idade = scanner.nextInt();
		scanner.nextLine(); // limpa buffer

		System.out.print("Digite a data de nascimento (dd/mm/aaaa): ");
		String dataNascimento = scanner.nextLine();
		
		System.out.print("Digite o Gmail: ");
		String gmail = scanner.nextLine();
		
		REGISTRO registro = new REGISTRO(nome, idade, dataNascimento, gmail);
		
		System.out.println("\nRegistro criado:\n" + registro);
		
	}
}
