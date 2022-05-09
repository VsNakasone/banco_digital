import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        Cliente vanessa = new Cliente();
        vanessa.setNome("Vanessa");

        Conta cc = new ContaCorrente (venilton);
        Conta poupanca = new ContaPoupanca(vanessa);

        contas.add(cc);
        contas.add(poupanca);
        clientes.add(venilton);
        clientes.add(vanessa);


        cc.depositar(100.00);
        cc.depositar(250.00);
        cc.sacar(25.00);
        poupanca.depositar(150.00);
        poupanca.transferir(35.00, cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        System.out.println(contas.toString());
        System.out.println(clientes.toString());
    }
}
