class Main {  
  public static void main(String args[]) { 
	double valor = 1000;
	char categoria = 'd';
	
	if(categoria == 'a'){
		double desconto = valor*0.1;
		double precoFinal = valor - desconto;
		System.out.println("Desconto de 10% e o preço final é: R$" + precoFinal);
	}else if(categoria == 'b'){
		double desconto = valor*0.15;
		double precoFinal = valor - desconto;
		System.out.println("Desconto de 15% e o preço final é: R$" + precoFinal);
	}else if(categoria == 'c'){
		double desconto = valor*0.20;
		double precoFinal = valor - desconto;
		System.out.println("Desconto de 20% e o preço final é: R$" + precoFinal);
	}else{
		double acrescimo = valor*0.05;
		double precoFinal = valor + acrescimo;
		System.out.println("Acréscimo de 5% e o preço final é: R$" + precoFinal);
	}
  } 
}