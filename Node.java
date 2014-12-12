import java.io.*;
import java.util.*;

public class Node{
	// Attributs
	ArrayList<Node> liste_successeurs_;
	int identificateur_; //
	boolean visite = false;

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
}