package Automovel;

public class Esportivo extends Automovel {
    
    @Override
    public String getCombustivel() {
        // TODO Auto-generated method stub
        return "Exportivo utiliza " + super.getCombustivel();
    }
    Esportivo(){
        this.combustivel = "Gasolina";
    }
}
