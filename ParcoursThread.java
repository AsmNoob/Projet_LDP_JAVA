// Gérard Tio Nogueras - INFO2 - 000333083
// Info-f-202
// Projet Java: Parcours graph

import java.io.*;
import java.util.*;
import java.util.Random;

public class ParcoursThread extends Thread{
	
	//Attributs
	static private int marqueur_ = 1;
	private Graph graph_;
	private ParcoursNode node_;

	//Constructeurs
	public ParcoursThread(Graph graph, ParcoursNode node){
		graph_ = graph;
		node_ = node;
		this.start();
	}


	public ParcoursThread(){
		graph_ = new Graph();
	}

	public synchronized void set_marqueur(int valeur){
		marqueur_ = valeur;
	}


	//Méthodes 

	public void affichage_parcours(){
		for(int i = 0; i < graph_.get_nombreSommets();i++){
			if(graph_.get_ordreSommet(i) != 0){
				System.out.println("Noeud: "+graph_.get_idSommet(i)+" | | ordre de parcours: "+graph_.get_ordreSommet(i)+" | | nombre d'examinations: "+graph_.get_examinations(i));
			}
		}
	}

	//public synchronized 

	public void run(){
		// On mélange de manière aléatoire la liste des successeurs
		if (node_.get_listeSucc() != null){
			Random randGen = new Random();

			// Boucle qui s'occupe d'échanger la place des noeuds de la liste des succésseurs de manière aléatoire

			for(int i = 0; i < node_.get_sizeListeSucc();i++){
				int randPos = randGen.nextInt(node_.get_sizeListeSucc());
				ParcoursNode noeud_temp = node_.get_sommetListeSucc(i);
				node_.set_sommetListeSucc(i,node_.get_sommetListeSucc(randPos));
				node_.set_sommetListeSucc(randPos,noeud_temp);
			}

			// Boucle qui va lancer pour chaque successeur un nouveau thread 

			for(int i = 0; i < node_.get_listeSucc().size();i++){
				if(!node_.get_sommetListeSucc(i).test()){ // test si le noeud à déjà été visité
					node_.get_sommetListeSucc(i).set_ordreTraitement(marqueur_); // ordre
					this.set_marqueur(marqueur_+1); 
					try {
						double temps_aleatoire = Math.random(); // nombre aléatoire entre 0 et 0.9999
						// System.out.println("noeud: "+node_.get_sommetListeSucc(i).get_identificateur()+" || temps: "+(int)(temps_aleatoire*1000)); // pour voir le temps aléatoire en temps réel.
				  		Thread.sleep((int)(temps_aleatoire*1000)); // temps d'attente aléatoire entre 0 et 999 ms
				  		ParcoursThread parcours = new ParcoursThread(graph_,node_.get_sommetListeSucc(i));
						parcours.join();
					} catch (InterruptedException e) {
						System.err.println("Caught InterruptedException in run(): " + e.getMessage());
					}

				}
				// en dehors de la condition de visite, on ajoute 1 examination au noeud
				node_.get_sommetListeSucc(i).set_nombreExaminations(node_.get_sommetListeSucc(i).get_nombreExaminations()+1);
			} 
		}	
	}
}