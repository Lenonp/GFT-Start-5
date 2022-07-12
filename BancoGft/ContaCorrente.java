package BancoGft;

public class ContaCorrente extends Conta{

    public contaCorrente(){

    }

    public void gerarRendimento(){
        saldo += saldo * 0.03;
    }
    
}
