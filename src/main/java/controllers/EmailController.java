package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import services.EmailService;

@RestController //Bean do Spring do tipo Controller
public class EmailController {

	/*criando um ponto de injeção (@Autowired) e criando os
	 * métodos para fazer a persistência com o banco*/
	@Autowired
	EmailService emailService;
}
