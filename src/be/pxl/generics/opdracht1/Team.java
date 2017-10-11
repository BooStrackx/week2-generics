package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class Team<T extends Player> {

	private String name;
	private int played;
	private int won;
	private int lost;
	private int tied;
	private ArrayList<T> members = new ArrayList<>();

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPlayed() {
		return played;
	}

	public int getWon() {
		return won;
	}

	public int getLost() {
		return lost;
	}

	public int getTied() {
		return tied;
	}

	public ArrayList<T> getArrayList() {
		return members;
	}

	public void addPlayer(T player) {
		if (members.contains(player)) {
			System.out.println(player.getName() + " is already on this team.");
			return;
		}
		members.add(player);
		System.out.println(player.getName() + " picked for team " + name);
	}

	public int numberOfPlayers() {
		return members.size();
	}

	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
		if (ourScore > theirScore) {
			won++;
		} else if (ourScore == theirScore) {
			tied++;
		} else {
			lost++;
		}
		played++;
		if (opponent != null) { //invullen van de gegevens vd opponent
			opponent.matchResult(null, theirScore, ourScore);
		}
	}

	public int ranking() {
		int total = (won * 3) + tied;
		return total;
	}

}
