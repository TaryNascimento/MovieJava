package br.com.alura.CineInfinity.modelos;

public class Titulo {
    //Encapsulamento
    private String nome;
    private int anolANCAMENTO;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;   // Atalho shift + f6 altera o nome de uma variável
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnolANCAMENTO(int anolANCAMENTO) {
        this.anolANCAMENTO = anolANCAMENTO;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnolANCAMENTO() {
        if (anolANCAMENTO > 1970);
        System.out.println("Este Filme está no futuro e não existe no nosso capitulo");
        return anolANCAMENTO;
    }


    public boolean IncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("nome do filme : " + nome);
        System.out.println("Ano de lançamento: "+ anolANCAMENTO);


    }
    public  void Avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;



    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
