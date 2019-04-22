package br.usjt.springboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.springboot.model.Day;

public interface DayRepository extends JpaRepository<Day, Long>{

}