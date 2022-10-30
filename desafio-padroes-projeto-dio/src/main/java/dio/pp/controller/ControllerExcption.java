package dio.pp.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import dio.pp.exception.CepNaoEncontradoException;
import dio.pp.exception.ClienteNaoEncontradoException;
import dio.pp.exception.RespostaError;

@RestControllerAdvice
public class ControllerExcption {
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(CepNaoEncontradoException.class)
	public RespostaError handleCep(CepNaoEncontradoException ex) {
		RespostaError respostaError = new RespostaError(
				LocalDateTime.now(),
				HttpStatus.NOT_FOUND.toString(),
				"Erro ao buscar o cep", 
				ex.getMessage());
				
		return respostaError;
	}
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(ClienteNaoEncontradoException.class)
	public RespostaError handleCliente(ClienteNaoEncontradoException ex) {
		RespostaError respostaError = new RespostaError(
				LocalDateTime.now(),
				HttpStatus.NOT_FOUND.toString(),
				"Erro ao buscar o cliente", 
				ex.getMessage());
				
		return respostaError;
	}
}