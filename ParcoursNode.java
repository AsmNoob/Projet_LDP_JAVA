import java.io.*;
import java.util.*;

public class ParcoursNode extends Node{
	// Attributs
	boolean visite_ = false;
	private int ordre_traitement_ = 0;
	private int nombre_examinations_ = 0;
	private ArrayList<ParcoursNode> liste_;
	// Constructeurs

	public ParcoursNode(int identificateur, ArrayList<ParcoursNode> liste){
		super(identificateur);
		liste_ = liste;
	}

	public ParcoursNode(int identificateur){
		super(identificateur);
	}

	public ParcoursNode(){
		super();
	}

	public boolean get_visite(){
		return visite_;
	}

	public void set_visite(boolean etat){
		visite_ = etat;
	}

	public int get_ordreTraitement(){
		return ordre_traitement_;
	}

	public int get_nombreExaminations(){
		return nombre_examinations_;
	}

	public void set_ordreTraitement(int ordre){
		ordre_traitement_ = ordre;
	}

	public void set_nombreExaminations(int nombre){
		nombre_examinations_ = nombre;
	}

	public void examinee(){
		nombre_examinations_+=1;
	}

	public ArrayList<ParcoursNode> get_listeSucc(){
		return liste_;
	}

	public void set_listeSucc(ArrayList<ParcoursNode> liste){
		liste_ = liste;
	}

	public ParcoursNode get_sommetListeSucc(int index){
		return liste_.get(index);
	}

	public void set_sommetListeSucc(int index,ParcoursNode node){
		liste_.set(index,node);
	}

	public int get_sizeListeSucc(){
		return liste_.size();
	}

}