// Gérard Tio Nogueras - INFO2 - 000333083
// Info-f-202
// Projet Java: Parcours graph

import java.io.*;
import java.util.*;

public class ParcoursNode extends Node{
	// Attributs
	private boolean visite_ = false;
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


	// Problématique:
	// 2 threads: 1er prend la main sur visite_ (get) ensuite le 2ème
	// le premier prend ensuite la main sur set()
	// Donc alors que le premier veut set_verified 
	// car si en même temps 2 threads testent la condition alors qu'elle aura changé juste après


	//Solution 2 étapes en 1 pour résoudre le problème en utilisant les propriétés de la synchronisation
	public synchronized boolean test(){
		if(visite_ == true){
			return true;
		}else{
			visite_ = true;
			return false;
		}
	}

	public synchronized boolean get_visite(){
		return visite_;
	}

	// pour éviter des problème
	public void set_visite(boolean etat){
		visite_ = etat;
	}

	public synchronized int get_ordreTraitement(){
		return ordre_traitement_;
	}

	public int get_nombreExaminations(){
		return nombre_examinations_;
	}

	public void set_ordreTraitement(int ordre){
		ordre_traitement_ = ordre;
	}

	public  synchronized void set_nombreExaminations(int nombre){
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