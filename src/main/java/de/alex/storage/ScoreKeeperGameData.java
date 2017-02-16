package de.alex.storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Contains player and score data to represent a score keeper game.
 */
public class ScoreKeeperGameData {

	private long id;

	private List<String> players;
	private Map<String, Long> scores;

	/**
	 * Creates a new instance of {@link ScoreKeeperGameData} with initialized
	 * but empty player and score information.
	 * 
	 * @return
	 */
	public static ScoreKeeperGameData newInstance() {
		ScoreKeeperGameData newInstance = new ScoreKeeperGameData();
		newInstance.setPlayers(new ArrayList<String>());
		newInstance.setScores(new HashMap<String, Long>());
		return newInstance;
	}

	public List<String> getPlayers() {
		return players;
	}

	public void setPlayers(List<String> players) {
		this.players = players;
	}

	public Map<String, Long> getScores() {
		return scores;
	}

	public void setScores(Map<String, Long> scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "[ScoreKeeperGameData players: " + players + "] scores: " + scores + "]";
	}
}
