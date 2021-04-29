class Main {  
  public static void main(String args[]) { 
	int resultado = 0;
	int soma = 0;
	for(int i=5; i<=100; i+=5){
	   
		if(i%2 == 1){//se for impar
			soma = i;
			System.out.println(soma);
		}else{//se for par
			soma = -1 * i; //tornar o número negativo
			System.out.println(soma);
		}
		
		resultado += soma;
		//resultado = resultado + soma
	}
	System.out.println("O resultado da soma é " + resultado);
  } 
}