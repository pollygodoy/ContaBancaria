class ContaBancaria {

    String numerodaconta ;
    String titular;
    Double Saldo;
    Double Limitessaque;
    
    public String numerodaconta(){
        return this.numerodaconta;
    }

    public String titular(){
        return this.titular;
    }
    
    public double Saldo() {
        return this.Saldo;
    }

    public double Limitessaque() {
        return this.Limitessaque;        
    }

    public void imprimirInformacoes() {

        System.out.println("numero da conta: " + numerodaconta);
        System.out.println("titular: " + titular);
        System.out.println("saldo: " + Saldo());
        System.out.println("limites saque: " + Limitessaque());
        }    
    }

    public class Main {

        public static void main(String[] args) {
           
            double saldo = 2.250;
            double Limitessaque = 2*500;

            
            conta1.deposito(500);
            conta1.saque(200);
            conta1.imprimirInformacoes();

        }
    }