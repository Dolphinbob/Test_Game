package dev.Dolphinbob.ppm.tile;

import java.awt.image.BufferedImage;

import dev.Dolphinbob.ppm.gfx.Assets;

public class RockTile extends Tile{

	public RockTile(int id) {
		super(Assets.grass, id);
	}
	
	@Override
	public boolean idSolid(){
		return false;
	}
	

}
