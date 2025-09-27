package controller;

import DAO.UsuarioDAO;
import model.Usuario;

import java.sql.SQLException;

public class UsuarioController {

    public boolean cadastrar(Usuario usuario) {
        try {
            UsuarioDAO dao = new UsuarioDAO();

            if(dao.cadastrar(usuario) == true) {
                return true;
            }

            return false;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public Usuario login(String email, String senha) {
        boolean isEmailValido = this.verificarEmail(email);

        if(isEmailValido) {
            return null;
        }

        try {
            UsuarioDAO dao = new UsuarioDAO();
            Usuario usuarioLogado =  dao.login(email, senha);

            if (usuarioLogado != null) {
                return usuarioLogado;
            } else {
                this.adicionarTentativa(email);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private boolean verificarEmail(String email) {
        try {
            UsuarioDAO dao = new UsuarioDAO();

            return dao.verificarEmail(email);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void adicionarTentativa(String email) {
        try {
            UsuarioDAO dao = new UsuarioDAO();

            dao.adicionarTentativa(email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
