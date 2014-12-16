// Gérard Tio Nogueras - INFO2 - 000333083
// Info-f-202
// Projet Java: Parcours graph

import java.io.*;
import java.util.*;

public class main{
	public static void main(String[] args) {
		ParcoursNode node0 = new ParcoursNode(0);
		ParcoursNode node1 = new ParcoursNode(1);
		ParcoursNode node2 = new ParcoursNode(2);
		ParcoursNode node3 = new ParcoursNode(3);
		ParcoursNode node4 = new ParcoursNode(4);
		ParcoursNode node5 = new ParcoursNode(5);
		ParcoursNode node6 = new ParcoursNode(6);
		ParcoursNode node7 = new ParcoursNode(7);
		ParcoursNode node8 = new ParcoursNode(8);
		ParcoursNode node9 = new ParcoursNode(9);
		ParcoursNode node10 = new ParcoursNode(10);
		ParcoursNode node11 = new ParcoursNode(11);
		ParcoursNode node12 = new ParcoursNode(12);
		ParcoursNode node13 = new ParcoursNode(13);
		ParcoursNode node14 = new ParcoursNode(14);
		ParcoursNode node15 = new ParcoursNode(15);
		ParcoursNode node16 = new ParcoursNode(16);
		ParcoursNode node17 = new ParcoursNode(17);
		ParcoursNode node18 = new ParcoursNode(18);
		ParcoursNode node19 = new ParcoursNode(19);
		ParcoursNode node20 = new ParcoursNode(20);
		ParcoursNode node21 = new ParcoursNode(21);
		ParcoursNode node22 = new ParcoursNode(22);
		ParcoursNode node23 = new ParcoursNode(23);
		ParcoursNode node24 = new ParcoursNode(24);

		ArrayList<ParcoursNode> liste_succ = new ArrayList<ParcoursNode>();


		liste_succ.add(node1);liste_succ.add(node2);liste_succ.add(node6);
		node0.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<ParcoursNode>();
		liste_succ.add(node3);liste_succ.add(node4);
		node1.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<ParcoursNode>();
		liste_succ.add(node4);liste_succ.add(node16);liste_succ.add(node6);liste_succ.add(node7);liste_succ.add(node14);
		node2.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<ParcoursNode>();
		liste_succ.add(node12);liste_succ.add(node20);
		node3.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<ParcoursNode>();
		liste_succ.add(node8);
		node4.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<ParcoursNode>();
		liste_succ.add(node0);liste_succ.add(node17);liste_succ.add(node18);
		node5.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<ParcoursNode>();
		liste_succ.add(node15);liste_succ.add(node14);
		node7.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<ParcoursNode>();
		liste_succ.add(node14);liste_succ.add(node9);
		node8.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<ParcoursNode>();
		liste_succ.add(node21);liste_succ.add(node22);liste_succ.add(node23);liste_succ.add(node24);liste_succ.add(node13);
		node9.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<ParcoursNode>();
		liste_succ.add(node13);
		node10.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<ParcoursNode>();
		liste_succ.add(node4);liste_succ.add(node1);liste_succ.add(node8);
		node11.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<ParcoursNode>();
		liste_succ.add(node10);
		node14.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<ParcoursNode>();
		liste_succ.add(node14);
		node15.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<ParcoursNode>();
		liste_succ.add(node15);
		node16.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<ParcoursNode>();
		liste_succ.add(node6);
		node17.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<ParcoursNode>();
		liste_succ.add(node19);liste_succ.add(node20);
		node18.set_listeSucc(liste_succ);

		ArrayList<ParcoursNode> liste = new ArrayList<ParcoursNode>();
		liste.add(node0);liste.add(node1);liste.add(node2);liste.add(node3);liste.add(node4);liste.add(node5);liste.add(node6);liste.add(node7);liste.add(node8);liste.add(node9);liste.add(node10);liste.add(node11);liste.add(node12);liste.add(node13);liste.add(node14);liste.add(node15);liste.add(node16);liste.add(node17);liste.add(node18);liste.add(node19);liste.add(node20);liste.add(node21);liste.add(node22);liste.add(node23);liste.add(node24);
		Graph graph = new Graph(liste);
		try{
			System.out.println(" Test Multiple avec le même noeud");
			System.out.println("Parcours à partir du noeud 8, n°1\n");
			ParcoursThread parcours = new ParcoursThread(graph,node8);
			parcours.join();
			parcours.affichage_parcours();
			graph.reinitialiser_graph();
			parcours.set_marqueur(1);


			System.out.println("\n//-----------------------------------------------------------------------------------//\n");

			System.out.println("Parcours à partir du noeud 8, n°2\n");
			parcours = new ParcoursThread(graph,node8);
			parcours.join();
			parcours.affichage_parcours();
			graph.reinitialiser_graph();
			parcours.set_marqueur(1);


			System.out.println("\n//-----------------------------------------------------------------------------------//\n");

			System.out.println("Parcours à partir du noeud 8, n°3\n");
			parcours = new ParcoursThread(graph,node8);
			parcours.join();
			parcours.affichage_parcours();
			graph.reinitialiser_graph();
			parcours.set_marqueur(1);


			System.out.println("\n//-----------------------------------------------------------------------------------//\n");

			System.out.println("Parcours à partir du noeud 0\n");
			parcours = new ParcoursThread(graph,node0);
			parcours.join();
			parcours.affichage_parcours();
			graph.reinitialiser_graph();
			parcours.set_marqueur(1);

			System.out.println("\n//-----------------------------------------------------------------------------------//\n");

			System.out.println("Parcours à partir du noeud 2\n");
			parcours = new ParcoursThread(graph,node2);
			parcours.join();
			parcours.affichage_parcours();
			graph.reinitialiser_graph();
			parcours.set_marqueur(1);


		}catch(InterruptedException e){
			System.err.println("Caught InterruptedException in parcours: " + e.getMessage());
		}
	}
}