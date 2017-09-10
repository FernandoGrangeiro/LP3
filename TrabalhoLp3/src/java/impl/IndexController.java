package impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Controller.AbstractController;
import Entities.Conta;

public class IndexController extends AbstractController {

    public void execute() {
        try {
            List contas = new ArrayList<Conta>();
            contas.add(new Conta(123, 1000));
            contas.add(new Conta(124, 500));
            this.setReturnPage("/index.jsp");
            this.getRequest().setAttribute("lista_contas", contas);
        } catch (Exception ex) {
            Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
