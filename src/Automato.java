import java.util.Scanner;

public class Automato {
	int CONT; //contador
	char PALAVRA []; // palavra 


	public static void main(String[] args) {
		Automato AUTOMATO = new Automato();
		String SENTENCA;
		
		//ler a entrada(sentença) 
		//usa procedimentos(maneira mais fácil e visual)
		Scanner ENTRADA = new Scanner(System.in);
		System.out.println("Entre com a sentença:");
		SENTENCA = ENTRADA.nextLine();
		AUTOMATO.PALAVRA = SENTENCA.toCharArray();
		AUTOMATO.iniciar();
	}
	
	//iniciar o autômato em q0
	public void iniciar() {
		CONT = 0;
		q0();
	}
	
	//estado q0
	public void q0() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'o') {
				CONT++;
				q1(); //vai para o estado q1 (caminho cor preta)
			}
			else if (PALAVRA[CONT] == 'f') {
				q6(); //vai para o estado q6 (caminho cor Branca)
			}
			else {
				qerro(); ////erro palavra não aceita
			}
		}
	}
	//estado q0
	public void q1() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'o') {
				CONT++;
				q2();
			}
			else {
				qerro();
			}
		}
		
	}
	public void q2() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'o') {
				CONT++;
				q3(); //vai para o estado q3 (caminho cor preta)
			}
			else if (PALAVRA[CONT] == 'f') {
				q11(); //vai para o estado q1 (caminho cor Ciano)
			}
			else {
				qerro();
			}
		}	
	}
	public void q3() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'o') {
				CONT++;
				q4(); //vai para o estado q4 (caminho cor preta)
			}
			else if (PALAVRA[CONT] == 'f') {
				q14(); //vai para o estado q14 (caminho cor Magenta)
			}
			else {
				qerro();
			}
		}	
	}
	public void q4() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'o') {
				CONT++;
				q5(); //vai para o estado q5 (caminho cor preta)
			}
			else if (PALAVRA[CONT] == 'f') {
				q16(); //vai para o estado q16 (caminho cor Azul)
			}
			else {
				qerro();
			}
		}	
	}
	public void q5() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'o') {
				CONT++;
				qPreto(); //vai para o estado qPreto (caminho cor preta)
			}
			else {
				qerro();
			}
		}	
    }
	
	public void qPreto() {
		System.err.println("Palavra aceita");
		System.err.println("Automato Preta");
	}
	
	
	public void q6() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'f') {
				CONT++;
				q7(); //vai para o estado q7 (caminho cor Branca)
			}
			else {
				qerro();
			}
		}
		
	}
	public void q7() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'f') {
				CONT++;
				q8(); //vai para o estado q8 (caminho cor Branca)
			}
			else if (PALAVRA[CONT] == 'o') {
				q17(); //vai para o estado q17 (caminho cor Vermelha)
			}
			else {
				qerro();
			}
		}	
	}
	public void q8() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'f') {
				CONT++;
				q9(); //vai para o estado q9 (caminho cor Branca)
			}
			else if (PALAVRA[CONT] == 'o') {
				q20(); //vai para o estado q20 (caminho cor Verde)
			}
			else {
				qerro();
			}
		}	
	}
	public void q9() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'f') {
				CONT++;
				q10(); //vai para o estado q10 (caminho cor Branca)
			}
			else {
				qerro();
			}
		}	
	}
	public void q10() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'f') {
				CONT++;
				qBranco(); //vai para o estado qBranco (caminho cor Branca)
			}
			else {
				qerro();
			}
		}	
	}
	public void qBranco() {
		System.err.println("Palavra aceita");
		System.err.println("Automato Branco");
	}
	
	
	public void q11() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'f') {
				CONT++;
				q12(); //vai para o estado q12 (caminho cor Ciano)
			}
			else {
				qerro();
			}
		}	
	}
	public void q12() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'f') {
				CONT++;
				q13(); //vai para o estado q13 (caminho cor Ciano)
			}
			else {
				qerro();
			}
		}	
	}
	
	public void q13() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'f') {
				CONT++;
				qCyan(); //vai para o estado qCyan (caminho cor Ciano)
			}
			else {
				qerro();
			}
		}	
	}
	public void qCyan() {
		System.err.println("Palavra aceita");
		System.err.println("Automato Ciano");
	}
	
	
	public void q14() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'f') {
				CONT++;
				q15(); //vai para o estado q15 (caminho cor Magenta)
			}
			else {
				qerro();
			}
		}	
	}
	public void q15() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'f') {
				CONT++;
				qMagenta(); //vai para o estado qMagenta (caminho cor Magenta)
			}
			else {
				qerro();
			}
		}	
	}
	public void qMagenta() {
		System.err.println("Palavra aceita");
		System.err.println("Automato Magenta");
	}
	
	
	public void q16() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'f') {
				CONT++;
				qAzul(); //vai para o estado qAzul (caminho cor Azul)
			}
			else {
				qerro();
			}
		}	
	}
	public void qAzul() {
		System.err.println("Palavra aceita");
		System.err.println("Automato Azul");
	}
	
	
	public void q17() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'o') {
				CONT++;
				q18(); //vai para o estado q18 (caminho cor Vermelha)
			}
			else {
				qerro();
			}
		}	
	}
	public void q18() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'o') {
				CONT++;
				q19(); //vai para o estado q19 (caminho cor Vermelha)
			}
			else {
				qerro();
			}
		}	
	}
	
	public void q19() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'o') {
				CONT++;
				qVermelho(); //vai para o estado qVermelho (caminho cor Vermelha)
			}
			else {
				qerro();
			}
		}	
	}
	public void qVermelho() {
		System.err.println("Palavra aceita");
		System.err.println("Automato Vermelho");
	}
	
	
	public void q20() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'o') {
				CONT++;
				q21(); //vai para o estado q21 (caminho cor Verde)
			}
			else {
				qerro();
			}
		}	
	}
	public void q21() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'o') {
				CONT++;
				qVerde(); //vai para o estado qVerde (caminho cor Verde)
			}
			else {
				qerro();
			}
		}	
	}
	public void qVerde() {
		System.err.println("Palavra aceita");
		System.err.println("Automato Verde");
	}
	
	
	//erro palavra não aceita 
	public void qerro() {
		System.err.println("Palavra Rejeitada");
	}

}
