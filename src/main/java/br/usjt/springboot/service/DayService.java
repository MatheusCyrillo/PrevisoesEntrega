package br.usjt.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.springboot.model.Day;
import br.usjt.springboot.model.repository.DayRepository;

public class DayService {
	
	@Autowired
	private DayRepository repo;
	
	public void salvar(Day day) {
		repo.save(day);
	}
	
	public List<Day> listarDias() {
		return repo.findAll();
	}
	
	public void excluir(Day day) {
		repo.delete(day);
	}
}