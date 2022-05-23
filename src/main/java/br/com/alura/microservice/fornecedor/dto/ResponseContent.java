package br.com.alura.microservice.fornecedor.dto;

import org.springframework.http.HttpStatus;

public class ResponseContent<T> {
	
	private HttpStatus status;
	private String cause;
	private T content;
	
	public HttpStatus getResponse() {
		return status;
	}
	public void setResponse(HttpStatus status) {
		this.status = status;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public T getContent() {
		return content;
	}
	public void setContent(T content) {
		this.content = content;
	}

}
