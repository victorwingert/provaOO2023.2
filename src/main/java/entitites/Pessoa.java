package entitites;

public class Pessoa {
    private String nome;
    private Telefone telefone;
    private Integer destino;
    
    public Pessoa() {        
    }

    public Pessoa(String nome, Telefone telefone, Integer destino) {
        this.nome = nome;
        this.telefone = telefone;
        this.destino = destino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Integer getDestino() {
        return destino;
    }

    public void setDestino(Integer destino) {
        this.destino = destino;
    }
    
    public void validaDestino(Telefone origem, int destino) {
        if(origem.getDdd() < 10 || origem.getDdd() > 99 || origem.getDdd() < destino) {
            throw new IllegalArgumentException("Destino invalido !");
        }
    }
}
