package com.eboutique.yh.entities;

import java.io.Serializable;

public class LigneCommande implements Serializable {

	private Long id;
	private Produit produit;
	private int quantite;
	private double prix;
	private Commande commande;
	
	public LigneCommande() {
		// TODO Auto-generated constructor stub
	}

	public LigneCommande(Produit produit, int quantite, double prix) {
		super();
		this.produit = produit;
		this.quantite = quantite;
		this.prix = prix;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	
	
	
}
