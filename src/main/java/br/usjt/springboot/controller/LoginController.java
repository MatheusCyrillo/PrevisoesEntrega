package br.usjt.springboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.springboot.model.Usuario;
import br.usjt.springboot.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@GetMapping ( value = { "/login", "/" } )
	public ModelAndView login() {
//		Pode ser feito em uma única linha
//		ModelAndView mv = new ModelAndView("login");
//		mv.addObject("usuario", new Usuario());
//		return mv;
		return new ModelAndView("login").addObject(new Usuario());
	}
	
	@PostMapping ("/logar")
	public String logar(HttpServletRequest request, Usuario usuario) {
		if(service.logar(usuario)) {
			request.getSession().setAttribute("usuarioLogado", usuario);
			return "redirect:/previsao";
		}
		return "login";
	}
	
}