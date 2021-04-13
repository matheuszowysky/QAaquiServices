package br.theus.zowysky.QAaqui.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/QAaqui")
public class ProjetoController {
	@RequestMapping("/start")
	public String exibir() {
		return "Welcome to QAaqui Corporation !";
	}

}
