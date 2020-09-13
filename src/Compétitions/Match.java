package Compétitions;
import java.util.*;
public class Match {
	private Competitor comp1;
	private Competitor comp2;
	private Random rand;
	//private HashMap<Competitor,Integer> Competitors; 
	public Match() {
		this.rand = new Random();
	}
	public void setCompetitors(Competitor c1,Competitor c2) {
		this.comp1 = c1;
		this.comp2 = c2;
	}
	public void removeCompetitors() {
		this.comp1 = null;
		this.comp2 = null;
	}
	public Competitor getFirstCompetitor() {
		return this.comp1;
	}
	public Competitor getSecondCompetitor() {
		return this.comp2;
	}
	public Competitor playMatch() {
		int alea = rand.nextInt(3);
		if(alea == 0) {
			return null;
		}
		else if(alea > 1) {
			return this.comp1;
		}else {
			return this.comp2;
		}
		
	}
}
