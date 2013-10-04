package controleatleta;

import java.util.ArrayList;

public class Nadador extends Atleta {

    private char categoria; // J=Jovem M=Master
    private ArrayList<Premiacao> premiacoes;
    private Double envergadura; // Em cm
    private int pes;//Lutas
    private int idade;//Vitorias
    private int totalCompeticoesParticipadas;//Nocaute
    private int totalMedalhasOuro;//Empate
    private int totalMedalhasPrata;//Derrotas
    private int totalMedalhasBronze;//Desistencias

    public Nadador(String nome) {
        super(nome);
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }

    public Double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(Double envergadura) {
        this.envergadura = envergadura;
    }

    public int getPes() {
        return pes;
    }

    public void setPes(int Pes) {
        this.pes = Pes;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTotalCompeticoesParticipadas() {
        return totalCompeticoesParticipadas;
    }

    public void setTotalCompeticoesParticipadas(int totalCompeticoesParticipadas) {
        this.totalCompeticoesParticipadas = totalCompeticoesParticipadas;
    }

    public int getTotalMedalhasOuro() {
        return totalMedalhasOuro;
    }

    public void setTotalMedalhasOuro(int totalMedalhasOuro) {
        this.totalMedalhasOuro = totalMedalhasOuro;
    }

    public int getTotalMedalhasPrata() {
        return totalMedalhasPrata;    
    }

    public void setTotalMedalhasPrata(int totalMedalhasPrata) {
        this.totalMedalhasPrata = totalMedalhasPrata;
    }

    public int getTotalMedalhasBronze() {
        return totalMedalhasBronze;
    }

    public void setTotalMedalhasBronze(int totalMedalhasBronze) {
        this.totalMedalhasBronze = totalMedalhasBronze;
    }

  

    public String obterCategoriaIdade() {
        return obterCategoriaIdade(this.getCategoria(), this.getIdade());
    }

    public static String obterCategoriaIdade(char categoria, int idade) {
        if (categoria == 'J') {
            return obterCategoriaIdadeJovem(idade);
        } else if (categoria == 'M') {
            return obterCategoriaIdadeMaster(idade);
        } else {
            return "";
        }
    }

    private static String obterCategoriaIdadeJovem(int idade) {
        if (idade <= 8) {
            return "Pré-Mirim";
        } else if (idade <= 10) {
            return "Mirim";
        } else if (idade <= 12) {
            return "Petiz";
        } else if (idade <= 14) {
            return "Infantil";
        } else if (idade <= 16) {
            return "Juvenil";
        } else if (idade <= 19) {
            return "Junior";
        } else {
            return "Sênior";
        }
    }

    private static String obterCategoriaIdadeMaster(int idade) {
        if (idade <= 24) {
            return "Pré-Master";
        } else if (idade <= 29) {
            return "Master 25+";
        } else if (idade <= 34) {
            return "Master 30+";
        } else if (idade <= 39) {
            return "Master 35+";
        } else if (idade <= 44) {
            return "Master 40+";
        } else if (idade <= 49) {
            return "Master 45+";
        } else if (idade <= 54) {
            return "Master 50+";
        } else if (idade <= 59) {
            return "Master 55+";
        } else if (idade <= 64) {
            return "Master 60+";
        } else if (idade <= 69) {
            return "Master 65+";
        } else if (idade <= 74) {
            return "Master 70+";
        } else if (idade <= 79) {
            return "Master 75+";
        } else if (idade <= 84) {
            return "Master 80+";
        } else if (idade <= 89) {
            return "Master 85+";
        } else if (idade <= 94) {
            return "Master 90+";
        } else if (idade <= 99) {
            return "Master 95+";
        } else {
            return "Imortal";
        }
    }
}