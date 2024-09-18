package entitites;

public class CaronaIntra extends Carona {

    public CaronaIntra(Pessoa motorista) {
        super(motorista, 5);
    }

    @Override
    public boolean embarque(Pessoa passageiro) {
        if ((passageiro.getTelefone().getDdd().equals(passageiro.getDestino()))
                 && passageiro.getTelefone().getDdd().equals(getMotorista().getTelefone().getDdd())) {
            if(getPassageiros().size() < getQuantPassageiros()) {
                addPassageiros(passageiro);
                return true;
            }
        }
        return false;
    }

    @Override
    public Double valorTotal() {
        return getPassageiros().size() * 100.00;
    }
}
