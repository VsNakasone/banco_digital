import java.util.List;

public class Banco {

    private Integer branch;
    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;


    public Integer getBranch() {

        return branch;
    }

    public void setBranch(Integer branch) {

        this.branch = branch;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public List<Conta> getContas() {

        return contas;
    }

    public void setConta(List<Conta> contas) {

        this.contas = contas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
