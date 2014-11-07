package com.eboutique.yh.metier;

import com.eboutique.yh.entities.*;

public interface IAdminCategoriesMetier extends IAdminProduitsMetier {
	
	public Long ajouterCategorie(Categorie c);
	public void supprimerCategrorie(Long idcat);
	public void modifierCategorie(Categorie c);
	public void ajouterUser(User u);
	public void attribuerRole(Role r,Long userID);

}
