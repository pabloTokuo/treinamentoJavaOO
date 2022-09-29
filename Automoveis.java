public class Automoveis {
    private String nome;
    private String placa;
    private Especificacao especificacao;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public Especificacao getEspecificacao(){
        return this.especificacao;
    }
    public void setEspecificacao(Especificacao especificacao){
        this.especificacao = especificacao;
    }
}
