
public class Cachorro extends Animal {

@Override
public String emitirsom() {
	return "Au au au au au au.";
}
public String Correr() {
	return this.getNome()+" correndo...";
}
@Override
String mostrarinfo() {
	// TODO Auto-generated method stub
	return "O cachorro "+ getNome()+" com "+ getIdade()+" anos faz "+this.emitirsom()+Correr();
	
}
}
