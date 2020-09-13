package Compétitions;

public class Competitor {
	private String name;
	private int score;
	public Competitor(String name) {
		this.name = name;
		this.score = 0;
	}
	
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
	public void addScore(int n) {
		this.score += n;
	}
	public boolean equals(Object o) {
		Competitor c2 = (Competitor) o;
		return (c2.name == this.name);
	}
}
