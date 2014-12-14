import java.io.*;
import java.util.*;

public class main{
	public static void main(String[] args) {
		Node node0 = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);

		ArrayList<Node> liste_succ = new ArrayList<Node>();
		liste_succ.add(node1);liste_succ.add(node2);
		node0.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<Node>();
		liste_succ.add(node3);liste_succ.add(node4);
		node1.set_listeSucc(liste_succ);

		liste_succ = new ArrayList<Node>();
		liste_succ.add(node4);
		node2.set_listeSucc(liste_succ);

		ArrayList<Node> liste = new ArrayList<Node>();
		liste.add(node0);liste.add(node1);liste.add(node2);liste.add(node3);liste.add(node4);
		Graph graph = new Graph(liste);
		ParcoursThread parcours = new ParcoursThread(graph,node0);
	}
}