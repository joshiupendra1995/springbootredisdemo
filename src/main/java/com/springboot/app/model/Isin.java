package com.springboot.app.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "isin_mstr_tbl")
public class Isin {

	@EmbeddedId
	private IsinComposite isinComposite;

	private String isin;

	public IsinComposite getIsinComposite() {
		return isinComposite;
	}

	public void setIsinComposite(IsinComposite isinComposite) {
		this.isinComposite = isinComposite;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

}
