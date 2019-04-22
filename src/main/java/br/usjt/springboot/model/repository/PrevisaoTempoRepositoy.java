package br.usjt.springboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.springboot.model.PrevisaoTempo;

public interface PrevisaoTempoRepositoy extends JpaRepository<PrevisaoTempo, Long> {
	
}