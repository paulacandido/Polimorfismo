
public class Cavalo extends Animal {
	@Override
	public String emitirsom() {
		return "Hinn in in.";
	}
	public String Correr() {
		return this.getNome()+" correndo...";
	}
	@Override
	String mostrarinfo() {
		// TODO Auto-generated method stub
		return "O cavalo "+ getNome()+" com "+ getIdade()+" anos faz "+this.emitirsom()+Correr();
		
	}
}
