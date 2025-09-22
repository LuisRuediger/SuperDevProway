package Controller;

import DAO.GenericDAO;
import DAO.PacienteDAO;
import Model.Paciente;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PacienteController {

    public String insert(Paciente paciente) throws Exception {
        GenericDAO dao = new PacienteDAO();
        boolean isCadastro = dao.insert(paciente);

        if (isCadastro) {
            return "Cadastro realizado com sucesso!";
        } else {
            return "Erro ao cadastrar paciente";
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

    public void printFormatedList(List<Paciente> lista) {

        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Nenhum paciente cadastrado"
            );
        }

        StringBuilder listaImprimir = new StringBuilder();

        listaImprimir.append("*** Lista de Pacientes ***\n\n");

        for (Paciente produto : lista) {
            listaImprimir.append(produto.getId());
            listaImprimir.append(" - ");
            listaImprimir.append(produto.getNome());
            listaImprimir.append(" - ");
            listaImprimir.append(produto.getIdade());
            listaImprimir.append(" - ");
            listaImprimir.append(produto.getTelefone());
            listaImprimir.append(" - ");
            listaImprimir.append(produto.getTipoSanguineo());
            listaImprimir.append(" - ");
            listaImprimir.append(produto.getDoador());
            listaImprimir.append(" - ");
            listaImprimir.append(produto.getConvenio());
            listaImprimir.append("\n");
        }

        JOptionPane.showMessageDialog(null, listaImprimir.toString());
    }

}
