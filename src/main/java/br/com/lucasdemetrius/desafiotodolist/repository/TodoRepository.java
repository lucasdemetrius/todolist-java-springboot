package br.com.lucasdemetrius.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucasdemetrius.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}