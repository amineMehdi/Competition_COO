package Compétitions;

import java.util.*;

abstract class Competition {
	public Competition(List<Competitor> comp) {
		final Match match;
		final List<Competitor> competiteur = comp;
	}
	
	public void play() {
		
	};
	
	protected abstract void play(List<Competitor> comp);
	
	protected abstract void scheduleMatch(Competitor c1,Competitor c2);
	
	public abstract Map<Competitor,Integer> ranking();
	
}
