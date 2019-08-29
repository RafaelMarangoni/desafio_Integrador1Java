package br.digitalhouse.desafio1;

public class ProfessorAdjunto extends Professor {

    private Integer hrsMonitoria;

    public ProfessorAdjunto(String nome, String sobreNome, Integer codigoProfessorAdjunto, Integer codigoProfessor) {
        super(nome, sobreNome, codigoProfessor);
    }

    public Integer getHrsMonitoria() {
        return hrsMonitoria;
    }

    public void setHrsMonitoria(Integer hrsMonitoria) {
        this.hrsMonitoria = hrsMonitoria;
    }
}
