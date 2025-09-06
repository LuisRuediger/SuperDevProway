package controller;

import DAO.GenericDAO;
import DAO.ProdutoDAO;
import model.Produto;

public class ProdutoController {

    public String insert(Produto produto) throws Exception {
        GenericDAO dao = new ProdutoDAO();
        boolean isCadastro = dao.insert(produto);

        if (isCadastro) {
            return "Cadastro realizado com sucesso!";
        } else {
            return "Erro ao cadastro produto";
        }


    }
}
