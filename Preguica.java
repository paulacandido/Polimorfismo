
public class Preguica extends Animal {
	
	@Override
	public String emitirsom() {
		return "Aaan aooun aan �aanh.";
	}
	public String subirEmArvore() {
		return this.getNome()+" subindo em arvore...";
	}
	@Override
	String mostrarinfo() {
		return "A pregui�a "+ getNome()+" com "+ getIdade()+" anos faz "+this.emitirsom()+subirEmArvore();
		
	}
}
