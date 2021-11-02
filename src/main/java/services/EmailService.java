package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.EmailRepository;

@Service //Bean do Spring do tipo Service
public class EmailService {

	/*criando um ponto de injeção (@Autowired) e criando os
	 * métodos para fazer a persistência com o banco*/
	@Autowired
	EmailRepository emailRepository;
}
