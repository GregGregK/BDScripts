package resolucaolistaexercicio;
public class ResolucaoListaExercicio {
    public static void main(String[] args) {
      
        int numeroConta = 102030;
        String nomeTitular = "Greg R";
        char temDeposito = 'n';
        double valor = 0.0;
        
        if(temDeposito == 's'){
            valor = 500.00;
        }
        
        Conta greg = new Conta(numeroConta,nomeTitular, valor);
        System.out.println("Dados da Conta:");
        greg.imprimir();
        
        greg.deposito(200);
        System.out.println("Dados da Conta Atualizado:");
        greg.imprimir();
        
        greg.saque(300);
        System.out.println("Dados da Conta Atualizado:");
        greg.imprimir();
    }    
}