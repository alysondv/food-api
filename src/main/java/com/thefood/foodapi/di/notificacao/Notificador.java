package com.thefood.foodapi.di.notificacao;

import com.thefood.foodapi.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}