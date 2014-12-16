// Gérard Tio Nogueras - INFO2 - 000333083
// Info-f-202
// Projet Java: Parcours graph


import java.io.*;
import java.util.*;

public class Graph{

	// Attributs
	private ArrayList<ParcoursNode> liste_sommets_;

	// Constructeur
	public Graph(ArrayList<ParcoursNode> liste){
		liste_sommets_ = liste;
	}


	// Par défaut
	public Graph(){
		liste_sommets_= new ArrayList<ParcoursNode>();
	}

	// Getters / Setters
	public ArrayList<ParcoursNode> get_listeSommets(){
		return liste_sommets_;
	}

	public int get_nombreSommets(){
		return liste_sommets_.size();
	}

	public int get_idSommet(int index){
		return liste_sommets_.get(index).get_identificateur();
	}

	public int get_ordreSommet(int index){
		return liste_sommets_.get(index).get_ordreTraitement();
	}

	public int get_examinations(int index){
		return liste_sommets_.get(index).get_nombreExaminations();
	}

	public ParcoursNode get_sommet(int index){
		ParcoursNode node = new ParcoursNode();
		try{
			node = liste_sommets_.get(index);
		}catch(IndexOutOfBoundsException e){
			System.err.println("Caught IndexOutOfBoundsException in get_sommet(): " + e.getMessage());
		}
		return node;
	}

	public void set_listeSommets(ArrayList<ParcoursNode> liste){
		liste_sommets_ = liste;
	}

	public void set_sommet(int index,ParcoursNode node){
		try{
			liste_sommets_.set(index,node);
		}catch(IndexOutOfBoundsException e){
			System.err.println("Caught IndexOutOfBoundsException in set_sommet(): " + e.getMessage());
		}
	}

	public ArrayList<ParcoursNode> get_listeSuccSommet(int index){
		return liste_sommets_.get(index).get_listeSucc();
	}

	public void reinitialiser_graph(){
		for(int i = 0; i < liste_sommets_.size();i++){
			this.get_sommet(i).set_ordreTraitement(0);
			this.get_sommet(i).set_nombreExaminations(0);
			this.get_sommet(i).set_visite(false);
		}
	}
}