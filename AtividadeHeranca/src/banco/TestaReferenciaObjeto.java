/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author lucyv
 */
public class TestaReferenciaObjeto {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Cliente cli = new Cliente();
        c1.setCliente(cli);
        
        cli.setNome("Ryan Pereira Mendes");
        c1.deposita(10000);
        System.out.println(c1.getSaldo());
    }
}
