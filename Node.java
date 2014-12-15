import java.io.*;
import java.util.*;

public class Node{
	// Attributs
	ArrayList<Node> liste_successeurs_;
	final int identificateur_; //

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
	public int get_identificateur(){
		return identificateur_;
	}

	public ArrayList<Node> get_listeSuccNode(){
		return liste_successeurs_;
	}

	public void set_listeSuccNode(ArrayList<Node> liste){
		liste_successeurs_ = liste;
	}

	public int get_sizeListeSuccNode(){
		return liste_successeurs_.size();
	}

	public Node get_sommetListeSucc(int index){
		return liste_successeurs_.get(index);
	}

	public void set_sommetListeSucc(int index,Node node){
		liste_successeurs_.set(index,node);
	}

	
}