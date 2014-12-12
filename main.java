import java.io.*;
import java.util.*;

public class main{
	public static void main(String[] args) {
		Node node = new Node(1);
		ArrayList<Node> liste = new ArrayList<Node>();
		liste.add(node);
		Graph graph = new Graph(liste);
	}
}