class Main {  
  public static void main(String args[]) { 
	int codigo = 1;
	int qtd = 1;
	double preco = 0;
	
	if(codigo == 1){
		preco = 4.00 * qtd;
	}else if(codigo == 2){
		preco = 4.50 * qtd;
	}else if(codigo == 3){
		preco = 5.00 * qtd;
	}else if(codigo == 4){
		preco = 2.00 * qtd;
	}else{
		preco = 1.50 * qtd;
	}
	
	System.out.println("Preço: R$" + preco);
  } 
}