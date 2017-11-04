package dev.Dolphinbob.ppm.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	private static final int width = 32, height = 32;
	public static BufferedImage player, grass;
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
		player = sheet.crop(0, 0, width, height);
		grass = sheet.crop(32, 0, width, height);
	}
}
