package inf1563.transport;

public class Marchandise {
	private double poids;
	//en kg
	private double volume;
	//en m3
	private String description;
	
	public Marchandise(double poids, double volume, String description) {
		this.poids = poids;
		this.volume = volume;
		this.description = description;
	}
	
	public double getPoids() {
		return poids;
	}

	public double getVolume() {
		return volume;
	}

	@Override
	public String toString() {
		return "Marchandise [poids=" + poids + " kg , volume=" + volume + " m3, description=" + description + "]";
	}
	
}
