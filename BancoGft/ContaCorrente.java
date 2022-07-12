package BancoGft;

public class ContaCorrente extends Conta{

    public ContaCorrente(Nome nome) {
        super(nome);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" === Extrato Conta Corrente ===");
        super.ImprimirInfosComuns();

    }
