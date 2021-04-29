class Main {  
  public static void main(String args[]) { 
	int resNu = 0, resDeno = 0, somaNu = 0, somaDeno = 0, numerador = 480, denominador = 10;
	for(int i=0; i<30; i++){
		
	   if(i%2 == 0){
			somaNu = numerador;
			somaDeno = denominador;
		}else{
			somaNu = -1 * numerador;
			somaDeno = -1 * denominador;
		}
		
		resNu += somaNu;
		resDeno += somaDeno;
		
		
		numerador -= 5;
		denominador++;
		
	}
	System.out.println(resNu + "/" + resDeno);
  } 
}