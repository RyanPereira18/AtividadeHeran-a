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
public class ContaPoupanca extends Conta{
    
    public ContaPoupanca() {
        super();
    }
    
    public void atualiza(double taxa) {
        this.deposita(this.getSaldo() * (taxa * 3));
    }
    
}
