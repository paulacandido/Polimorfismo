
public class Preguica extends Animal {
	
	@Override
	public String emitirsom() {
		return "Aaan aooun aan ãaanh.";
	}
	public String subirEmArvore() {
		return this.getNome()+" subindo em arvore...";
	}
	@Override
	String mostrarinfo() {
		return "A preguiça "+ getNome()+" com "+ getIdade()+" anos faz "+this.emitirsom()+subirEmArvore();
		
	}
}
