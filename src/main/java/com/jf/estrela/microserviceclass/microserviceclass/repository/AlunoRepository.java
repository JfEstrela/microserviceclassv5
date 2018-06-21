package com.jf.estrela.microserviceclass.microserviceclass.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jf.estrela.microserviceclass.microserviceclass.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

	List<Aluno> findAllByNome(String nome);
	
	@Query("From Aluno a where month(a.dataNascimento) = :mes")
	List<Aluno> findByMesNascimento(Integer mes);
}
