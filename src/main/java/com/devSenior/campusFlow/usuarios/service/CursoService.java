package com.devSenior.campusFlow.usuarios.service;


import com.devSenior.campusFlow.usuarios.model.Curso;
import com.devSenior.campusFlow.usuarios.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository){
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> listarCursos(){
        return cursoRepository.findAll();
    }
}