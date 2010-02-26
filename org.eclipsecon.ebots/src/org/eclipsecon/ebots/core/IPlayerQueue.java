package org.eclipsecon.ebots.core;

import java.util.List;

public interface IPlayerQueue extends IGameObject {
	/**
	 * Provides an unmodifiable list containing the names of all the players
	 * currently waiting to play the game, ordered by precedence.
	 * 
	 * @return an unmodifiable list of player names mapped to their wait times
	 */
	public List<String> getPlayerQueue();
}
