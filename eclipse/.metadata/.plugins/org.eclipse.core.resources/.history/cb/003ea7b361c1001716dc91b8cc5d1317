package dev.Dolphinbob.ppm.entity.creature;

import dev.Dolphinbob.ppm.Game;
import dev.Dolphinbob.ppm.entity.Entity;

public abstract class Creature extends Entity{
	
	protected int health;
	protected float speed;
	protected float xMove, yMove;
	

	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}


	public static final int DEFAILT_HEALTH = 10, DEFAULT_CREATURE_WIDTH = 64, DEFAULT_CREATURE_HEIGHT = 64;
	public static final float DEFAILT_SPEED = 3f;

	
	public Creature(Game game, float x, float y, int width, int height){
		super(game, x, y, width, height);
		health = DEFAILT_HEALTH;
		speed = DEFAILT_SPEED;
	}
	
	public void move(){
		x += xMove;
		y += yMove;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public float getSpeed() {
		return speed;
	}


	public void setSpeed(float speed) {
		this.speed = speed;
	}

}
