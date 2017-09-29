package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class Team<T extends Player> {

	String name;
	int played, won, lost, tied;
	ArrayList<T> members;
	
	{ 
		members = new ArrayList<>();
	}

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

	public ArrayList<T> getMembers() {
		return members;
	}
	
	public void AddPlayer(T p){
		Boolean  identiek = false;
		for (int i = 0; i< members.size(); i++){
			if (p.equals(members.get(i)))
				identiek = true;
		}
		if (!identiek)
		members.add(p);
	}
	
	public int numberOfPlayers() {
		return members.size();
	}
	
	public void matchResult(Team<T> opponent, int ourScore, int theirScore){
		if(ourScore > theirScore){
			this.won ++;
		}
		else {
			if(ourScore < theirScore){
				this.lost ++;
				
			}
			else{
			this.tied ++;
			}
			
		}
		this.played ++;
		if(opponent !=null)
		opponent.matchResult(null, theirScore, ourScore);
	}
	
	public int ranking(){
		return this.won*3 + this.tied;
	}
	}
