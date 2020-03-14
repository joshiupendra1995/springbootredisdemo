package com.springboot.app.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class IsinComposite implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9141382033036408987L;

	private int secCode;

	private int secType;

	public int getSecCode() {
		return secCode;
	}

	public void setSecCode(int secCode) {
		this.secCode = secCode;
	}

	public int getSecType() {
		return secType;
	}

	public void setSecType(int secType) {
		this.secType = secType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + secCode;
		result = prime * result + secType;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IsinComposite other = (IsinComposite) obj;
		if (secCode != other.secCode)
			return false;
		if (secType != other.secType)
			return false;
		return true;
	}

}
