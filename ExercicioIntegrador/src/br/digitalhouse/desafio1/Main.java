package br.digitalhouse.desafio1;

public class Main {
    public static void main(String[] args) {
        DigitalHouseManager dhManager = new DigitalHouseManager();
        dhManager.registrarCurso("FullStack",200001,3);
        dhManager.registrarCurso("Android", 20002,2);
        dhManager.registrarProfessorAdjunto("joao","Jason", 1234,20);
        dhManager.registrarProfessorTitular("Vinicius","da Massa",321,"Mitar");
        dhManager.excluirCurso(200001);
        dhManager.matricularAluno("Rafael","Marangoni",123);
        dhManager.matricularAluno(123,200001);
        dhManager.alocarProfessores(200001,321,1234);

    }
}
