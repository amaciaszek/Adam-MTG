package com.attacomsian.parsecsv.domains;

import com.opencsv.bean.CsvBindByName;

public class Card {

	@CsvBindByName
	public String name;
	@CsvBindByName
	public String setCode;
	@CsvBindByName
	public String setName;
	@CsvBindByName(column = "numColl")
	public String numColl;
	@CsvBindByName
	public String foil;

	public Card() {
	}

	public Card(String name, String setCode, String setName, String numColl, String foil) {
		this.name = name;
		this.setCode = setCode;
		this.setName = setName;
		this.numColl = numColl;
		this.foil = foil;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getsetCode() {
		return setCode;
	}

	public void setsetCode(String setCode) {
		this.setCode = setCode;
	}

	public String getsetName() {
		return setName;
	}

	public void setsetName(String setName) {
		this.setName = setName;
	}

	public String getnumColl() {
		return numColl;
	}

	public void setnumColl(String numColl) {
		this.numColl = numColl;
	}

	public String getFoil() {
		return foil;
	}

	public void setFoil(String foil) {
		this.foil = foil;
	}

	@Override
	public String toString() {
		return "Card{" + "name=" + name + ", setCode='" + setCode + '\'' + ", setName='" + setName + '\''
				+ ", countryCode='" + numColl + '\'' + ", foil=" + foil + '}';
	}
}
