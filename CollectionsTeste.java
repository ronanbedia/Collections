package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsTeste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<Collections> arrayP = new ArrayList<>();
		Collections produto1 = new Collections("Arroz", "16/06/2022", 25, 1235);
		Collections produto2 = new Collections("A�ucar", "12/12/2021", 15, 9542);

		String nome;
		String validade;
		int quantidade;
		int numLote;
		int quantosP;
		int opcao;

		arrayP.add(produto1);
		arrayP.add(produto2);

		System.out.println("Quantos produtos diferentes voc� quer cadastrar?");
		quantosP = entrada.nextInt();
		for (int i = 1; i <= quantosP; i++) {

			System.out.println("\nDigite o nome do produto:");
			nome = entrada.next();

			System.out.println("Digite a validade do lote");
			validade = entrada.next();
			entrada.nextLine();

			System.out.println("Quantos unidades tem nesse lote?");
			quantidade = entrada.nextInt();

			System.out.println("Numero do lote:");
			numLote = entrada.nextInt();

			arrayP.add(new Collections(nome, validade, quantidade, numLote));

		}

		System.out.println(
				"Deseja fazer alguma altera��o nos produtos existentes?" + "\nDigite 1 se sim" + "\nDigite 2 se n�o");
		opcao = entrada.nextInt();
		if (opcao == 1) {
			for (Collections i : arrayP) {
				System.out.println(i);
			}
			
		} else if (opcao == 2) {
			System.out.println("Sistema encerrado.");
		} else {
			System.out.println("Op��o inv�lida.");
		}

		entrada.close();
	}
}

