import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;


public class Juego1 {
	
	//Complements
	
	private String mentira;
	private String verdad;
	
	//Constructor
	public Juego1(String mentira, String verdad) {
		super();
		this.mentira = mentira;
		this.verdad = verdad;
	}

	//Getters and setters
	
	public String getMentira() {
		return mentira;
	}


	public void setMentira(String mentira) {
		this.mentira = mentira;
	}


	public String getVerdad() {
		return verdad;
	}


	public void setVerdad(String verdad) {
		this.verdad = verdad;
	}


	@Override
	public String toString() {
		return "Juego1 [mentira=" + mentira + ", verdad=" + verdad + "]";
	}
	
}
