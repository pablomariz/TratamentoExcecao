public class Material {
    
    private String nome;
    private int quantidade;

    public Material(String nome, int quantidade) throws QuantidadeInvalidaException{
        this.setNome(nome);
        this.setQuantidade(quantidade);
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) throws QuantidadeInvalidaException{
        
        if(quantidade<0){
        throw new QuantidadeInvalidaException("Valor menor que zero");
        }
        this.quantidade = quantidade;
    }
    
    
}
