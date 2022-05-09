import java.util.ArrayList;

public class Cliente {
    private String nome;

    public Cliente(){
    }
    public String getNome() {
        return nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
