package Streaming;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Musiquelmpl m1=new Musiquelmpl("Hello", "Adele","NA", "Pop");
		Musiquelmpl m2=new Musiquelmpl("Humble", "KL", "RAS", "Hip Hop");
		m1.AfficherMusique();
		m2.AfficherMusique();
		m1.RessemblanceMusique(m1, m2);
		ArrayList<Musiquelmpl> Liste = new ArrayList<>() ;
		PlayListlmpl pl1=new PlayListlmpl("Paul", "Hip Hop", 3, Liste);
		pl1.AjouterMusique(m1);
		pl1.AjouterMusique(m2);
		pl1.AfficherPlaylist();

	}

}