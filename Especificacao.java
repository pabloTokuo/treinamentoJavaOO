public class Especificacao {
    private String cor;
    private int ano;
    private String uso;
    private Titular titular;


    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getUso(){
        return this.uso;
    }

    public void setUso(String uso){
        this.uso = uso;
    }

    public Titular getTitular(){
        return this.titular;
    }

    public void setTitular(Titular titular){
        this.titular = titular;
    }

}
