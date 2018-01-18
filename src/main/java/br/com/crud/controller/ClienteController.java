package br.com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.crud.model.Cliente;
import br.com.crud.service.ClienteService;

@Controller

public class ClienteController {

	@Autowired
	private ClienteService service;
//post
	public void save(Cliente cliente) {
		service.save(cliente);
	}

	public void delete(Long cliente) {
		service.delete(cliente);

	}

	@GetMapping("listar")
	public List<Cliente> listar() {
		return service.listar();
	}

	public Cliente buscarPorId(Long idCliente) {
		return service.buscaPoriD(idCliente);

	}
//post
	public void update(Cliente cliente) {
		service.update(cliente);
	}

}
