package project01;

import entitees.*;
import mesinterfaces.iFacteur;

import java.util.ArrayList;
import java.util.List;

public class progMain {

	public static void usePersonne(Personne op) {
		System.out.println(op);
	}

	public static void useFacteur(iFacteur ifa) {
		ifa.distribuer();
	}

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		//TEST PERSONNE
		// 1 Instance AdressePostale et 1 Instance Personne
		AdressePostale adr = new AdressePostale(10, "rue", "44000", "Nantes");
		System.out.println(adr);
		Personne p1 = new Personne("Germain", "christophe", adr);

		Facteur f1 = new Facteur("Germain", "christophe", adr);

		VehiculeLaPoste vp = new VehiculeLaPoste();

    List<AdressePostale> adressePostales =new ArrayList<>();
		adressePostales.add(adr);
		System.out.println(adressePostales);

		//Instance de Personne
		usePersonne(p1);
		usePersonne(f1);
		//Instance de Ifacteur
		useFacteur(f1);
		useFacteur(vp);

		ArrayList<Facteur> facteurs = new ArrayList<>();
		facteurs.add(f1);
		System.out.println(facteurs);

	}
}

