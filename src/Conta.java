public class Conta implements IMovimentacao{
    private static final Integer AGENCIA_PADRAO = 111;
    private static Integer SEQUENCIAL = 1;
    private Integer agencia;
    private Integer numero;
    private  Cliente cliente;
    private Double saldo;

    public Conta(Cliente cliente) {
        this.agencia =Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {

        this.agencia = agencia;
    }

    public Integer getNumero() {

        return numero;
    }

    public void setNumero(Integer numero) {

        this.numero = numero;
    }

    public Double getSaldo() {

        return saldo;
    }

    public void setSaldo(Double saldo) {

        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", cliente=" + cliente +
                ", saldo=" + saldo +
                '}';
    }
    @Override
    public void sacar(Double valor) {
     saldo -= valor;
    }

    @Override
    public void depositar(Double valor) {
    saldo += valor;
    }

    @Override
    public void transferir(Double valor, IMovimentacao contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {

    }
    protected void imprimirInfoComuns() {
        System.out.println(String.format("Titular: %s ", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
