package Automovel;

public class Caminhao extends Automovel {
    
    @Override
    public String getCombustivel() {
        // TODO Auto-generated method stub
        return "Caminhão utiliza " + super.getCombustivel();
    }
    Caminhao(){
        this.combustivel = "Diesel";
    }
}

