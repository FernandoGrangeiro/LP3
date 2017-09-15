package mack.controllers.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Controller.AbstractController;
import bancodao.Conta;
import java.math.BigDecimal;


public class IndexController extends AbstractController {

    public void execute() {
        try {
            List contas = new ArrayList<Conta>();
            contas.add(new Conta(123,  new BigDecimal(56666)));
            contas.add(new Conta(124, new BigDecimal(56666)));
            this.setReturnPage("/index.jsp");
            this.getRequest().setAttribute("lista_contas", contas);
        } catch (Exception ex) {
            Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
