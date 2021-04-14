// Programa tem objetivo de desenhar uma escada utilizando cerquilha "#". Através
// da estrutura de repetição "for", utilizando em seus controles apenas strings.
// Arquivo: DesenhoDeEscada.java


package controle;

public class DesenhoDeDegraus {

	public static void main(String[] args) {
		
		/*
		 * Utilizando estrutura de repetição for, primeiro declara variável, depois
		 * a condição utlizando a negação e por último o incremento.
		 */
		for(String degraus = "#"; !degraus.contentEquals("#######"); degraus += "#") {
			
			System.out.println(degraus);
			
		} // fim da estrutura de controle

	} // do método main

} // fim da classe DesenhoDeDegraus
