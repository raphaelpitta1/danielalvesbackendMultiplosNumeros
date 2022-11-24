package com.example.sorteio.forms;

import com.example.sorteio.modelsx.Pagamento;

public class PagamentoForms {
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
	



	
	












	public String getId_transacao() {
		return id_transacao;
	}






	public void setId_transacao(String id_transacao) {
		this.id_transacao = id_transacao;
	}






	public String getTelefone() {
		return telefone;
	}






	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}






	public String getName() {
		return name;
	}






	public String getLastname() {
		return lastname;
	}





	private int usuarioId;
	
	
	
	
	
	
	public String getStatus_pagamento() {
		return status_pagamento;
	}






	public void setStatus_pagamento(String status_pagamento) {
		this.status_pagamento = status_pagamento;
	}






	public int getusuarioId() {
		return usuarioId;
	}






	public void setusuarioId(int idUsuario) {
		usuarioId = usuarioId;
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

	public String getstatus_pagamento() {
		return status_pagamento;
	}






	public void setstatus_pagamento(String status_pagamento) {
		this.status_pagamento = status_pagamento;
	}


	


	public void setName(String name) {
		this.name = name;
	}






	public void setLastname(String lastname) {
		this.lastname = lastname;
	}






	public  Pagamento converter() {
		// TODO Auto-generated method stub
		return new Pagamento(transactionAmount, token, description ,installments ,paymentMethodId ,docType ,docNumber ,email, status_pagamento,name,lastname,telefone,id_transacao);
	}

}