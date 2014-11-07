package com.eboutique.yh;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eboutique.yh.entities.Categorie;
import com.eboutique.yh.entities.Produit;
import com.eboutique.yh.metier.IAdminCategoriesMetier;

public class TestJPA {
	ClassPathXmlApplicationContext context;
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
	}
		

	@Test
	public void test1() {
		try {
	
					
			IAdminCategoriesMetier metier = 
					(IAdminCategoriesMetier) context.getBean("metier");
		List<Categorie> cts1 = metier.listCategories();
		metier.ajouterCategorie(new Categorie("Ordinateurs","Ordinateur1",null,"image1.jpg"));
		metier.ajouterCategorie(new Categorie("Imprimantes","imprimante1",null,"image2.jpg"));
		List<Categorie> cts2 = metier.listCategories();
		assertTrue(cts1.size()+2==cts2.size());
		} catch (Exception e) {
			assertTrue(e.getMessage(),false);
		}
	}
	
	
	
	@Test
	public void test2() {
		try {
			
			IAdminCategoriesMetier metier = 
					(IAdminCategoriesMetier) context.getBean("metier");
		List<Produit> prods = metier.listproduits();
	    metier.ajouterProduit(new Produit("hp45", "hpmini", 500, true, "image1.jpg", 50), 1L);
	    metier.ajouterProduit(new Produit("azerty", "hpmaxi", 500, true, "image2.jpg", 50), 1L);
	    List<Produit> prods2 = metier.listproduits();
		assertTrue(prods.size()+2==prods2.size());
		} catch (Exception e) {
			assertTrue(e.getMessage(),false);
		}
	}

}
