package Exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno> alunos;

    public Turma(){this.alunos = new ArrayList<>();}

    public void adicionarAlunos(Aluno aluno){this.alunos.add(aluno);}

    public double calcularMediaTurma(){
        double contAluno = 0.0;
        double somaNota = 0.0;

        for(Aluno aluno: alunos){
            somaNota += aluno.getNota();
            contAluno++;
        }
        return somaNota/contAluno;
    }
}
