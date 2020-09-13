package Compétitions;

import java.util.*;

abstract class Competition {
	final Match match;
	final List<Competitor> competiteurs;
	public Competition(List<Competitor> comp) {
		this.match = new Match();
		this.competiteurs = comp;
	}
	/**
	 * 
	 */
	public void play() {
		
	};
	
	protected abstract void play(List<Competitor> comp);
	
	protected abstract void scheduleMatch(Competitor c1,Competitor c2);
	
	public Map<Competitor,Integer> ranking(){
		Map<Competitor, Integer> rank = new HashMap<Competitor, Integer>();
		for(Competitor c : this.competiteurs) {
			rank.put(c,new Integer(c.getScore()));
		}
		
		return rank;
	};
	
}
