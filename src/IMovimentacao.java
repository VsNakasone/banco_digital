public interface IMovimentacao {

    void sacar(Double valor);

    void depositar(Double valor);

    void transferir(Double valor, IMovimentacao contaDestino);

    void imprimirExtrato();
}
