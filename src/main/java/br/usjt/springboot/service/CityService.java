package br.usjt.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.springboot.model.City;
import br.usjt.springboot.model.repository.CityRepository;

public class CityService {
	
	@Autowired
	private CityRepository repo;
	
	public void salvar(City city) {
		repo.save(city);
	}
	
	public List<City> listarCidade() {
		return repo.findAll();
	}
	
	public void excluir(City city) {
		repo.delete(city);
	}
}