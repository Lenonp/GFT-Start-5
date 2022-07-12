package BancoGft;

public class ContaPoupanca extends Conta {
    
    public contaPoupanca(){

    }

    public void gerarRendimento(){
        saldo += saldo * 0.03;
    }
}
