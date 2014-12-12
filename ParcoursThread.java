public class ParcoursThread extends Thread{
	
	//Attributs
	private Graph graph_;

	//Constructeurs
	public ParcoursThread(Graph graph){
		graph_ = graph;
		this.start();
	}

	public ParcoursThread(){
		graph_ = new Graph();
	}

	//Méthodes 
	public void run(){

	}
}