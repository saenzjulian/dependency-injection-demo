package com.mitocode.repo;

import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepoImpl implements IPersonaRepo{
	/**
	 * Con la anotación @Repository estoy didiendole a Spring IoC Container
	 * que cree y gestione instancias de una objeto. Ahora, mediante la
	 * anotación @Autowired estoy llamando esa instancias que IoC tiene. 
	 */

	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.print("Hola Julian");
		
	}

}
