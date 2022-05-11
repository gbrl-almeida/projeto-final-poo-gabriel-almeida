package reservaSala;

public class Sala {
  private String nome;
  private int capacidade;
  private boolean temProjetor;

  public Sala(String nome, int capacidade, boolean temProjetor) {
    this.nome = nome;
    this.capacidade = capacidade;
    this.temProjetor = temProjetor;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String novoNome) {
    this.nome = novoNome;
  }

  public int getCapacidade() {
    return capacidade;
  }
  
  public void setCapacidade(int novaCapacidade) {
    this.capacidade = novaCapacidade;
  }

}
s