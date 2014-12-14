import java.io.*;
import java.util.*;

public class Node{
	// Attributs
	ArrayList<Node> liste_successeurs_;
	int identificateur_; //
	boolean visite_ = false;

	// Constructeur
	Node(int identificateur, ArrayList<Node> liste){
		identificateur_ = identificateur;
		liste_successeurs_ = liste;
	}

	Node(int identificateur){
		identificateur_ = identificateur;
		liste_successeurs_ = new ArrayList<Node>();
	}

	Node(){
		identificateur_ = 0;
		liste_successeurs_ = new ArrayList<Node>();
	}

	// Getters / Setters
	public synchronized int get_identificateur(){
		return identificateur_;
	}

	public synchronized void set_identificateur(int new_id){
		identificateur_ = new_id;
	}

	public synchronized ArrayList<Node> get_listeSucc(){
		return liste_successeurs_;
	}

	public synchronized void set_listeSucc(ArrayList<Node> liste){
		liste_successeurs_ = liste;
	}

	public int get_sizeListeSucc(){
		return liste_successeurs_.size();
	}

	public Node get_sommetListeSucc(int index){
		return liste_successeurs_.get(index);
	}

	public void set_sommetListeSucc(int index,Node node){
		liste_successeurs_.set(index,node);
	}

	public boolean get_visite(){
		return visite_;
	}

	public void set_visite(boolean etat){
		visite_ = etat;
	}
}