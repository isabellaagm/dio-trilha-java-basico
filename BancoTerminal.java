package banco;

import java.util.Scanner;

public class BancoTerminal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.print("Digite o número da conta: ");
		numeroConta = entrada.nextInt();

		System.out.print("Digite o número da agência com um dígito: ");
		agencia = entrada.next();

		System.out.print("Digite o seu nome: ");
		nomeCliente = entrada.next();

		System.out.print("Digite o saldo da conta: ");
		saldo = entrada.nextDouble();

		System.out.println(
				"Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia
						+ ", conta: " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque");
	}
}
