package ObjectOrientedProgramming;

public class Player {

	private String name;
	private String position;
	private String specialty;
	
	public Player(String name, String position, String specialty) {
		this.name = name;
		this.position = position;
		this.specialty = specialty;
	}
	
	public void describe() {
		System.out.println("Player: " + name + "\n" + "Position: " + position + "\n" + "specialty: " + specialty + "\n" + "------------------------");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSpeacialty() {
		return specialty;
	}

	public void setSpeacialty(String speacialty) {
		this.specialty = speacialty;
	}
}
