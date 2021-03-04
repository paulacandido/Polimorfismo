import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		System.out.print("Qual seu tipo de animal?");
		String e = input.next();
		switch(e) {
		case "cachorro":
			cachorro.inseririnfo();
			System.out.print(cachorro.mostrarinfo());
			
		case "cavalo":
			cavalo.inseririnfo();
			System.out.print(cavalo.mostrarinfo());
			
			
		case "preguiça":
			preguica.inseririnfo();
			System.out.print(preguica.mostrarinfo());
			
			
		default:
			System.out.print("Opção invalida.");
			
			
			
			
		}
		
		
		
		

	}

}
