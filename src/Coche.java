
public class Coche {

	
	
	private String marca;
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private String color;
	
	public Coche(String marca, String color) {
	
		this.color=color;
		this.marca=marca;		
		
	}
	
}
