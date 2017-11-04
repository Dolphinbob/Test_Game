package dev.Dolphinbob.ppm.states;

import java.awt.Graphics;

import dev.Dolphinbob.ppm.Game;
import dev.Dolphinbob.ppm.entity.creature.Player;
import dev.Dolphinbob.ppm.tile.Tile;
import dev.Dolphinbob.ppm.worlds.World;

public class GameState extends State{
	private Player player;
	private World world;
	
	public GameState(Game game){
		super(game);
		player = new Player(game, 10, 10);
		world = new World(game, "res/worlds/world1.world");
		
	}

	public void tick() {
		world.tick();
		player.tick();
	}

	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}
}
