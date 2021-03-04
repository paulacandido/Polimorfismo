import java.util.Scanner;

abstract class Animal {
Scanner input = new Scanner(System.in);
private String nome,som;
private int idade;


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getSom() {
	return som;
}
public void setSom(String som) {
	this.som = som;
}


public int getIdade() {
	return idade;
}


public void setIdade(int idade) {
	this.idade = idade;
}
abstract String emitirsom();

public void inseririnfo() {
	System.out.print("Qual o nome?");
	this.nome= input.next();
	System.out.print("Qual a idade");
	this.idade = input.nextInt();
}
abstract String mostrarinfo();



}
