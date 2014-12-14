import java.io.*;
import java.util.*;

public class Graph{

	// Attributs
	private ArrayList<Node> liste_sommets_;

	// Constructeur
	public Graph(ArrayList<Node> liste){
		liste_sommets_ = liste;
	}


	// Par défaut
	public Graph(){
		liste_sommets_= new ArrayList<Node>();
	}

	// Getters / Setters
	public ArrayList<Node> get_listeSommets(){
		return liste_sommets_;
	}

	public Node get_sommet(int index){
		Node node = new Node();
		try{
			node = liste_sommets_.get(index);
		}catch(IndexOutOfBoundsException e){
			System.err.println("Caught IndexOutOfBoundsException in get_sommet(): " + e.getMessage());
		}
		return node;
	}

	public void set_listeSommets(ArrayList<Node> liste){
		liste_sommets_ = liste;
	}

	public void set_sommet(int index,Node node){
		try{
			liste_sommets_.set(index,node);
		}catch(IndexOutOfBoundsException e){
			System.err.println("Caught IndexOutOfBoundsException in set_sommet(): " + e.getMessage());
		}
	}

	public ArrayList<Node> get_listeSuccSommet(int index){
		return liste_sommets_.get(index).get_listeSucc();
	}
}