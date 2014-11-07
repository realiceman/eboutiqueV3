package com.eboutique.yh.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.eboutique.yh.dao.IboutiqueDao;
import com.eboutique.yh.entities.Categorie;
import com.eboutique.yh.entities.Client;
import com.eboutique.yh.entities.Commande;
import com.eboutique.yh.entities.Panier;
import com.eboutique.yh.entities.Produit;
import com.eboutique.yh.entities.Role;
import com.eboutique.yh.entities.User;
@Transactional
public class BoutiqueMetierImpl implements IAdminCategoriesMetier {

	private IboutiqueDao dao;
	
	public void setDao(IboutiqueDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		// TODO Auto-generated method stub
		return dao.ajouterProduit(p, idCat);
	}

	@Override
	public void supprimerProduit(Long idP) {
		// TODO Auto-generated method stub
       dao.supprimerProduit(idP);
	}

	@Override
	public void modifierProduit(Produit p) {
		// TODO Auto-generated method stub
      dao.modifierProduit(p);
	}

	@Override
	public List<Categorie> listCategories() {
		// TODO Auto-generated method stub
		return dao.listCategories();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return dao.getCategorie(idCat);
	}

	@Override
	public List<Produit> listproduits() {
		// TODO Auto-generated method stub
		return dao.listproduits();
	}

	@Override
	public List<Produit> produitsParMotCle(String mc) {
		// TODO Auto-generated method stub
		return dao.produitsParMotCle(mc);
	}

	@Override
	public List<Produit> produitsParCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return dao.produitsParCategorie(idCat);
	}

	@Override
	public List<Produit> produitsSelectionnes() {
		// TODO Auto-generated method stub
		return dao.produitsSelectionnes();
	}

	@Override
	public Produit getProduit(Long idP) {
		// TODO Auto-generated method stub
		return dao.getProduit(idP);
	}

	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		// TODO Auto-generated method stub
		return dao.enregistrerCommande(p, c);
	}

	@Override
	public Long ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		return dao.ajouterCategorie(c);
	}

	@Override
	public void supprimerCategrorie(Long idcat) {
		// TODO Auto-generated method stub
        dao.supprimerCategrorie(idcat);
	}

	@Override
	public void modifierCategorie(Categorie c) {
		// TODO Auto-generated method stub
        dao.modifierCategorie(c);
	}

	@Override
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
       dao.ajouterUser(u);
	}

	@Override
	public void attribuerRole(Role r, Long userID) {
		// TODO Auto-generated method stub
       dao.attribuerRole(r, userID);
	}

}
