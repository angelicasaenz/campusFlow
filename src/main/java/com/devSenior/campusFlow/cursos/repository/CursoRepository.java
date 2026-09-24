package com.devSenior.campusFlow.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSenior.campusFlow.cursos.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {


}
