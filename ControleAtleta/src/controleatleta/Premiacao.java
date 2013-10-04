package controleatleta;

public class Premiacao {

    private String prova;
    private int ano;
    private String medalha;
    private double tempo;//em segundos
    
    public Premiacao(String prova, int ano, String medalha, double tempo) {
        this.prova = prova;
        this.ano = ano;
        this.medalha = medalha;
        this.tempo = tempo;    
    }

    public String getProva() {
        return prova;
    }

    public void setProva(String prova) {
        this.prova = prova;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMedalha() {
        return medalha;
    }

    public void setMedalha(String medalha) {
        this.medalha = medalha;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    
    
    @Override
    public String toString() {
        return this.prova + ",medalha de " + this.medalha + " em " + this.ano + ",no tempo de " + this.tempo;
    }
}
