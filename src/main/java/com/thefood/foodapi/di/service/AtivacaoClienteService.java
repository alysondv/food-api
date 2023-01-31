package com.thefood.foodapi.di.service;

import org.springframework.stereotype.Component;

import com.thefood.foodapi.di.modelo.Cliente;
import com.thefood.foodapi.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	private Notificador notificador;

	public AtivacaoClienteService(Notificador notificador) {
		super();
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService " + notificador);
	}

	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro está ativo!");
	}
	
}
