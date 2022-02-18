package com.springCore.constructorInjection;

public class Certificate {
	
	 String certificateName;
	
	public Certificate(String certificateName){
		super();
		this.certificateName=certificateName;
	}

	@Override
	public String toString() {
		return "Certificate [CertificateName=" + certificateName + "]";
	}

	
}
