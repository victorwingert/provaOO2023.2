package entitites;

public class CaronaInter extends Carona{

    public CaronaInter(Pessoa motorista) {
        super(motorista, 3);
    }

    @Override
    public boolean embarque(Pessoa passageiro) {
        Integer origemPassageiro = passageiro.getTelefone().getDdd();
        Integer destinoPassageiro = passageiro.getDestino();
        
        Integer origemMotorista = getMotorista().getTelefone().getDdd();
        Integer destinoMotorista = getMotorista().getDestino();
        
        boolean origemDestinoDiferentes = !origemPassageiro.equals(destinoPassageiro);
        
        boolean dentroDoIntervalo = origemPassageiro >= origemMotorista || destinoPassageiro <= destinoMotorista;
        
        boolean dentroDoLimite = getPassageiros().size() < getQuantPassageiros();
        
        if (origemDestinoDiferentes && dentroDoIntervalo && dentroDoLimite) {
            addPassageiros(passageiro);
            return true;
        }
        return false;
    }

    @Override
    public Double valorTotal() {
        double total = 0;
        
        for (Pessoa passageiro : getPassageiros()) {
            Integer origemPassageiro = passageiro.getTelefone().getDdd();
            Integer destinoPassageiro = passageiro.getDestino();            
            double valor = (destinoPassageiro - origemPassageiro + 1) * 50;            
            total += valor;
        }        
        return total;
    }
    
}
