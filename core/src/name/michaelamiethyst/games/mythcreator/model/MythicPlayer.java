package name.michaelamiethyst.games.mythcreator.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MythicPlayer {
	private SpriteBatch batch;
	private Texture img;
	private int xy = 0;

	public MythicPlayer() {
		String spriteName = "primordial-chaos-full.jpg";
		img = new Texture(spriteName);
	}
	
	public MythicPlayer useBatch(SpriteBatch batch) {
		this.batch = batch;
		return this;
	}
	
	public MythicPlayer render() {
		if (batch == null) {
			throw new UnsupportedOperationException();
		}
		batch.draw(img, xy, xy);
		xy ++;
		return this;
	}

	public void dispose() {
		img.dispose();
	}
}
