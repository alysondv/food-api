package com.thefood.foodapi.di.notificacao;

import org.springframework.stereotype.Component;

import com.thefood.foodapi.di.modelo.Cliente;

@Component
public class NotificadorEmail {
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do email %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
