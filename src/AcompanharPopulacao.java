

public class AcompanharPopulacao {

	public static void main(String[] args) {
		Cidade montLobSP = new Cidade();
		
		montLobSP.populacao = 4123;
		
		montLobSP = doNascimento(montLobSP);
		System.out.println(montLobSP.populacao);		
	}
	
	static Cidade doNascimento (Cidade aCidade) {
		Cidade minhaCidade = new Cidade();
		minhaCidade.populacao = aCidade.populacao + 1;
		return minhaCidade;		
	}
}
