package entitites;

import java.util.ArrayList;
import java.util.List;

public abstract class Carona {
    private Pessoa motorista;
    private List<Pessoa> passageiros = new ArrayList<>();
    private final Integer quantPassageiros;
    
   public Carona(Pessoa motorista, Integer quantPassageiros) {
        this.motorista = motorista;
        this.quantPassageiros = quantPassageiros;
    }

    public Pessoa getMotorista() {
        return motorista;
    }

    public List<Pessoa> getPassageiros() {
        return passageiros;
    }
    
    public Integer getQuantPassageiros() {
        return quantPassageiros;
    }

    public void addPassageiros(Pessoa passageiro) {
        passageiros.add(passageiro);
    }
    
    public abstract boolean embarque(Pessoa passageiro);
    
    public abstract Double valorTotal();
}
