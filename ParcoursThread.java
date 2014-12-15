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

	public void set_marqueur(int valeur){
		marqueur_ = valeur;
	}


	//Méthodes 

	public void affichage_parcours(){
		for(int i = 0; i < graph_.get_nombreSommets();i++){
			System.out.println("Noeud: "+graph_.get_idSommet(i)+" ordre de parcours: "+graph_.get_ordreSommet(i)+" nombre d'examinations: "+graph_.get_examinations(i));
		}
	}

	//public synchronized 

	public void run(){
		// On mélange de manière aléatoire la liste des successeurs
		if (node_.get_listeSucc() != null){
			Random randGen = new Random();
			for(int i = 0; i < node_.get_sizeListeSucc();i++){
				int randPos = randGen.nextInt(node_.get_sizeListeSucc());
				ParcoursNode noeud_temp = node_.get_sommetListeSucc(i);
				node_.set_sommetListeSucc(i,node_.get_sommetListeSucc(randPos));
				node_.set_sommetListeSucc(randPos,noeud_temp);
			}
			/*int Min = 0;
			int Max = graph_.get_listeSommets().size()-1;
			Random rand = new Random();
			int nombreAleatoire = rand.nextInt(Max - Min + 1) + Min;
			System.out.println(nombreAleatoire);*/

			// Parcours des nodes 
		
			//System.out.println("size: "+node_.get_listeSucc().size());
			for(int i = 0; i < node_.get_listeSucc().size();i++){
				if(!node_.get_sommetListeSucc(i).get_visite()){
					node_.get_sommetListeSucc(i).set_visite(true);
					node_.get_sommetListeSucc(i).set_ordreTraitement(marqueur_);
					this.set_marqueur(marqueur_+1);
					try {
						int temps_aleatoire = (int) Math.random();
				  		Thread.sleep(temps_aleatoire); // TODO time has to become aleatory
					} catch (InterruptedException e) {
						System.err.println("Caught InterruptedException in run(): " + e.getMessage());
					}
					ParcoursThread parcours = new ParcoursThread(graph_,node_.get_sommetListeSucc(i));
				}
				node_.get_sommetListeSucc(i).set_nombreExaminations(node_.get_sommetListeSucc(i).get_nombreExaminations()+1);
			} 
		}	
	}
}