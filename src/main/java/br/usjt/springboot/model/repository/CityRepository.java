package br.usjt.springboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.springboot.model.City;

public interface CityRepository extends JpaRepository<City, Long> {
	
	public City findByLatitudeAndLongitude(String latitude, String longitude);
	
	public City findByNome(String nome);
	
	public City findByNomeIgnoreCase(String nome);
}