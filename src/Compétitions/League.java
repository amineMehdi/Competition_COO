package Compétitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class League extends Competition{

	public League(List<Competitor> comp) {
		super(comp);
	}


	protected void play(List<Competitor> comp) {
		for(Competitor c1 : comp) {
			for(Competitor c2 : comp) {
				if(!c1.equals(c2)){
					this.scheduleMatch(c1, c2);
					Competitor compWin = this.match.playMatch();
					if(compWin == null) {
						c1.addScore(1);
						c2.addScore(1);
					}
					compWin.addScore(1);
				}
			}
		}
	}

	protected void scheduleMatch(Competitor c1, Competitor c2) {
		this.match.setCompetitors(c1, c2);
	}

}
