package com.eboutique.yh.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.eboutique.yh.entities.Categorie;
import com.eboutique.yh.entities.Client;
import com.eboutique.yh.entities.Commande;
import com.eboutique.yh.entities.LigneCommande;
import com.eboutique.yh.entities.Panier;
import com.eboutique.yh.entities.Produit;
import com.eboutique.yh.entities.Role;
import com.eboutique.yh.entities.User;

public class BoutiqueDaoImpl implements IboutiqueDao{
	
	@PersistenceContext
    private EntityManager em;
    
	 
	@Override
	public Long ajouterCategorie(Categorie c) {
		em.persist(c);
		return c.getIdcategorie();
	}

	@Override
	public List<Categorie> listCategories() {
		Query req =  em.createQuery("SELECT c FROM Categorie c");
		return req.getResultList();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		
		return em.find(Categorie.class, idCat);
	}

	@Override
	public void supprimerCategrorie(Long idcat) {

         Categorie c =em.find(Categorie.class, idcat);
         em.remove(c);
		
	}

	@Override
	public void modifierCategorie(Categorie c) {

          em.merge(c);
		
	}

	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		Categorie c = getCategorie(idCat);
		p.setCategorie(c);
		em.persist(p);
		return p.getIdProduit();
	}

	@Override
	public List<Produit> listproduits() {
		Query req =  em.createQuery("SELECT p FROM Produit p");
		return req.getResultList();
	}

	@Override
	public List<Produit> produitsParMotCle(String mc) {
		Query req =  em.createQuery("SELECT p FROM Produit p WHERE p.designation LIKE :x OR p.description LIKE :x");
		req.setParameter("x", "%"+mc+"%");
		return req.getResultList();
	}

	@Override
	public List<Produit> produitsParCategorie(Long idCat) {
		Query req =  em.createQuery("SELECT p FROM Produit p WHERE p.categorie.idcategorie= :x");
		req.setParameter("x",idCat);
		return req.getResultList();
	}

	@Override
	public List<Produit> produitsSelectionnes() {
		Query req =  em.createQuery("SELECT p FROM Produit p WHERE p.selected=true");
		return req.getResultList();
	}

	@Override
	public Produit getProduit(Long idP) {
		return em.find(Produit.class, idP);
	}

	@Override
	public void supprimerProduit(Long idP) {
		Produit p = getProduit(idP);
		em.remove(p);
	}

	@Override
	public void modifierProduit(Produit p) {
		em.merge(p);
	}

	@Override
	public void ajouterUser(User u) {
		em.persist(u);
	}

	@Override
	public void attribuerRole(Role r, Long userID) {
		User u = em.find(User.class, userID);
		u.getRoles().add(r);
		em.persist(r);
	}

	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		em.persist(c);
		Commande cmd = new Commande();
		cmd.setDateCommande(new Date());
		cmd.setItems(p.getitems());
		for(LigneCommande lc : p.getitems()){
			em.persist(lc);
		}
		em.persist(cmd);
		return cmd;
	}

}
