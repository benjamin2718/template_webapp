package coreServlets;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="numGenerator1")
@SessionScoped
public class NumGenerator1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double randomNum;
	private String nom;
	

	public double getRandomNum() {
		this.randomNum = Math.random();
		return randomNum;
	}

	public void setRandomNum(double randomNum) {
		this.randomNum = randomNum;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
