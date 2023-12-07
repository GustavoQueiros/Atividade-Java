package atividade;

public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salarioBruto = 20000.00f; 
		float adicionalNoturno = 500.00f;
		float horaExtra = 100.00f;
		float descontos = 200.00f;
		float total = (int) (salarioBruto + adicionalNoturno + horaExtra + descontos); 
		System.out.println("Salário Líquido: "+total);
	}

}
