package controller;

import DAO.GenericDAO;
import DAO.PacienteDAO;
import model.Paciente;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteController {

    public String insert(Paciente produto) throws Exception {
        GenericDAO dao = new PacienteDAO();
        boolean isCadastro = dao.insert(produto);

        if (isCadastro) {
            return "Cadastro realizado com sucesso!";
        } else {
            return "Erro ao cadastrar";
        }
    }

    public List<Paciente> getAll() throws Exception {
        List<Paciente> pacienteList = new ArrayList<>();
        GenericDAO dao = new PacienteDAO();

        List<Object> listaGenerica = dao.getAll();

        for (Object objetoGenerico : listaGenerica) {
           pacienteList.add( (Paciente) objetoGenerico);
        }

        return pacienteList;
    }

    public Paciente getById(int id) throws Exception {
        GenericDAO dao = new PacienteDAO();

        return (Paciente) dao.getById(id);
    }

    public void delete(int id) throws Exception {
        Paciente paciente = this.getById(id);

        if (paciente == null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Paciente não encontrado com o código " + id
            );
        } else {
            GenericDAO dao = new PacienteDAO();

            dao.delete(id);

            JOptionPane.showMessageDialog(
                    null,
                    "Paciente excluído com sucesso!\n" +
                            "\nCódigo: " + paciente.getId() +
                            "\nDescrição: " + paciente.getNome()
            );
        }
    }

    public void update(Paciente paciente) throws Exception {
        GenericDAO dao = new PacienteDAO();

        if (dao.update(paciente) == true) {
            JOptionPane.showMessageDialog(null, paciente.getNome() + " foi atualizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o produto");
        }

    }


}
