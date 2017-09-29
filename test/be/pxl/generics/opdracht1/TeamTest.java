package be.pxl.generics.opdracht1;

import org.junit.Assert;
import org.junit.Test;

public class TeamTest {

	@Test
	public void addPlayerIncreasesNumberOfPlayers() {
		Team<SoccerPlayer> soccerTeam = new Team<>("KRC Genk");
		Assert.assertEquals(0,  soccerTeam.numberOfPlayers());
		soccerTeam.AddPlayer(new SoccerPlayer("Buffel"));
		Assert.assertEquals(1,  soccerTeam.numberOfPlayers());
	}
	
	@Test
	public void addPlayerTwiceDoesNotIncreaseNumberOfPlayers() {
		Team<SoccerPlayer> soccerTeam = new Team<>("KRC Genk");
		Assert.assertEquals(0,  soccerTeam.numberOfPlayers());
		SoccerPlayer player = new SoccerPlayer("Buffel");
		soccerTeam.AddPlayer(player);
		soccerTeam.AddPlayer(player);
		Assert.assertEquals(1,  soccerTeam.numberOfPlayers());
	}
}
