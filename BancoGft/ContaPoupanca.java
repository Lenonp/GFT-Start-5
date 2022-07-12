package BancoGft;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Nome nome) {
        super(nome);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" === Extrato Conta Poupança ===");
        super.ImprimirInfosComuns();
    }

}