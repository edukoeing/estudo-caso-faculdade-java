public class contaCorrente{
	   private String nomeCliente;
	   private int numeroConta;
	   private int numeroAgencia;
	   private double saldoConta;
	
	   public contaCorrente(String titular, int nconta, double saldo){
	      this.nomeCliente = titular;
	      this.numeroConta = nconta;
	      this.saldoConta = saldo;	   
	   }

	   public void depositar(double valorDeposito){
	      saldoConta = saldoConta + valorDeposito;
	   }

	   public void sacar(double valorSaque){
              if (valorSaque <= saldoConta)
		saldoConta = saldoConta - valorDeposito;
	      else
		System.out.println("Saldo insuficiente!");

	   }
	
	   public void mostrarStatus(){
	      System.out.println(nomeCliente);
	      System.out.println(numeroConta);
	      System.out.println("R$ " + saldoConta);
	   }
	}