import java.util.Scanner;

public class Automato {
	int CONT;
	char PALAVRA [];


	public static void main(String[] args) {
		Automato AUTOMATO = new Automato();
		String SENTENCA;
		Scanner ENTRADA = new Scanner(System.in);
		System.out.println("Entre com a sentença:");
		SENTENCA = ENTRADA.nextLine();
		AUTOMATO.PALAVRA = SENTENCA.toCharArray();
		AUTOMATO.iniciar();
	}
	
	
	public void iniciar() {
		CONT = 0;
		q0();
	}
	
	public void q0() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'o') {
				CONT++;
				q1();
			}
			else if (PALAVRA[CONT] == 'f') {
				q6();
			}
			else {
				qerro();
			}
		}
	}
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
				q3();
			}
			else if (PALAVRA[CONT] == 'f') {
				q11();
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
				q4();
			}
			else if (PALAVRA[CONT] == 'f') {
				q14();
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
				q5();
			}
			else if (PALAVRA[CONT] == 'f') {
				q16();
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
				qPreto();
			}
			else {
				qerro();
			}
		}	
    }
	
	public void qPreto() {
		System.err.println("Palavra aceita");
		System.err.println("Automato Branco");
	}
	
	
	public void q6() {
		if (CONT < PALAVRA.length) {
			if (PALAVRA[CONT] == 'f') {
				CONT++;
				q7();
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
				q8();
			}
			else if (PALAVRA[CONT] == 'o') {
				q17(); //foooo
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
				q9();
			}
			else if (PALAVRA[CONT] == 'c') {
				q20();//ajeitar
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
				q10();
			}
			else if (PALAVRA[CONT] == 'c') {
				q3();//ajeitar
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
				qBranco();
			}
			else if (PALAVRA[CONT] == 'c') {
				q3();//ajeitar
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
				q12();
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
				q13();
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
				qCyan();
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
				q15();
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
				qMagenta();
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
				qAzul();
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
				q18();
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
				q19();
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
				qVermelho();
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
				q21();
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
				qVerde();
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
	
	
	
	public void qerro() {
		System.err.println("Palavra Rejeitada");
	}

}
