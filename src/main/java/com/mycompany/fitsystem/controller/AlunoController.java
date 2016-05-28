/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitsystem.controller;

import com.mycompany.fitsystem.model.Aluno;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author raque
 */
@Named(value = "alunoController")
@Dependent
public class AlunoController {

    /**
     * Creates a new instance of AlunoController
     */
    private Aluno aluno;
    public AlunoController() {
        this.aluno = new Aluno();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
    
}
