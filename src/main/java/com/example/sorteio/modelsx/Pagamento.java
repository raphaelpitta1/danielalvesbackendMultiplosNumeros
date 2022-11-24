package com.example.sorteio.modelsx;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Pagamento {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private int usuarioId;
	 private float transactionAmount;
	 private String token;
	 private String description;
	 private int installments;
	 private String paymentMethodId;
	 private String docType;
	 private String docNumber;
	private String email;
	private String status_pagamento;
	private String name;
	private String lastname;
	private String telefone;
	private String id_transacao;
	private int quantity;
	

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getNumeroComprado() {
		return numeroComprado;
	}

	public void setNumeroComprado(int numeroComprado) {
		this.numeroComprado = numeroComprado;
	}

	private int numeroComprado;
	
	
	
	public Pagamento() {
		
	}

	public Pagamento(float transactionAmount, String token,
			String description, int installments, String paymentMethodId, String docType, String docNumber,
			String email, String status_pagamento, String name, String lastname,  String telefone, String id_transacao, int quantity) {
		
		this.id = id;
		
		
		this.transactionAmount = transactionAmount;
		this.token = token;
		this.description = description;
		this.installments = installments;
		this.paymentMethodId = paymentMethodId;
		this.docType = docType;
		this.docNumber = docNumber;
		this.email = email;
		this.status_pagamento =status_pagamento;
		this.name =name;
		this.lastname =lastname;
		this.telefone = telefone;
		this.id_transacao= id_transacao;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}


	public float getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getInstallments() {
		return installments;
	}

	public void setInstallments(int installments) {
		this.installments = installments;
	}

	public String getPaymentMethodId() {
		return paymentMethodId;
	}

	public void setPaymentMethodId(String paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus_pagamento() {
		return status_pagamento;
	}

	public void setStatus_pagamento(String status_pagamento) {
		this.status_pagamento = status_pagamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getId_transacao() {
		return id_transacao;
	}

	public void setId_transacao(String id_transacao) {
		this.id_transacao = id_transacao;
	}

	public int getquantity() {
		return quantity;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}



	 
}