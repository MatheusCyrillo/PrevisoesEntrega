package br.usjt.weatherforecastspringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.usjt.springboot.model.City;
import br.usjt.springboot.model.repository.CityRepository;

@RunWith (SpringRunner.class)
@SpringBootTest
public class CidadeTest {
	
	@Autowired
	private CityRepository repo;
	
	private String msgErro = "City não encontrada";
	
	@Test
	public void findByLatitudeAndLongitudeTest() {
		City city = repo.findByLatitudeAndLongitude("", "");
		System.out.println(city != null ? city.toString() : msgErro);
	}
	
	@Test
	public void findByNomeTest() {
		City city = repo.findByNome("São Paulo");
		System.out.println(city != null ? city.toString() : msgErro);
	}
	
	@Test
	public void findByNomeIgnoreCaseTest() {
		City city = repo.findByNomeIgnoreCase("SÃO PAULO");
		System.out.println(city != null ? city.toString() : msgErro);
	}
	
}