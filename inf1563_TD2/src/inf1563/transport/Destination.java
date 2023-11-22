package inf1563.transport;

public class Destination {

	private String nom;
	private double distance;
	//en km
	
	public Destination(String nom, double distance) {
		this.nom = nom;
		this.distance = distance;
	}

	public double getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "Destination [nom=" + nom + " a distance=" + distance + " km ]";
	}
	
	
	
	
	
}
