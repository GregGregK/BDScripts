class Main {  
  public static void main(String args[]) { 
  System.out.println("\n\n");  
    double p1 = 10;
    double p2 = 1;
    double media = (p1+p2)/2;
    System.out.println("Média: " + media);
    if(media >= 6){
       System.out.println("Aprovado!");  
    }else{
       System.out.println("Exame!");

      double novaP = 5;
      double novaMedia = (media+novaP)/2;

      System.out.println("Nova Média: " + novaMedia);
      if(novaMedia >= 6){
       System.out.println("Aprovado em Exame!");  
      }else{
        System.out.println("Reprovado em Exame!");
      }
      
    }
  } 
}