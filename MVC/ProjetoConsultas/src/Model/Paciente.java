package Model;

public class Paciente extends Pessoa {

    private String tipoSanguineo;
    private Boolean doador;
    private String convenio;

    public Paciente() {

    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Boolean getDoador() {
        return doador;
    }

    public void setDoador(Boolean doador) {
        this.doador = doador;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
}
