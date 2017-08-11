package name.michaelamiethyst.games.mythcreator.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MythicLevel implements Renderable<MythicLevel> {
	public static final int TILE_SIZE_IN_PX = 64;
	private static final String BACKGROUND_TILE_FILENAME = "primordial-chaos-64x64.jpg";
	private int size = 10;
	private Texture backgroundTile;

	public MythicLevel() {
		backgroundTile = new Texture(BACKGROUND_TILE_FILENAME);
	}

	@Override
	public MythicLevel render(SpriteBatch batch) {
		for (int x = 0; x <= Gdx.graphics.getWidth(); x += TILE_SIZE_IN_PX) {
			for (int y = 0; y <= Gdx.graphics.getHeight(); y += TILE_SIZE_IN_PX) {
				batch.draw(backgroundTile, x, y);
			}
		}
		return this;
	}

	@Override
	public MythicLevel dispose() {
		backgroundTile.dispose();
		return this;
	}
}
