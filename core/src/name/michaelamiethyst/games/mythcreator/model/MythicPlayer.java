package name.michaelamiethyst.games.mythcreator.model;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Main player charactor.
 * 
 * @author desig
 */
public class MythicPlayer {
	
	/**
	 * Filename for the player's sprite.
	 */
	private static final String ASSET_FILENAME = "primordial-chaos-full.jpg";
	
	/**
	 * The batch of pictures that this player's icon is a part of.
	 */
	private SpriteBatch batch;
	
	/**
	 * The player's Icon.
	 */
	private Texture img;
	
	/**
	 * The current x and y position (diagonal moves only).
	 */
	private int xy = 0;

	public MythicPlayer() {
		img = new Texture(ASSET_FILENAME);
	}

	/**
	 * Use this SpriteBatch for rendering.
	 * 
	 * @param batch The sprite batch to use to draw.
	 * @return this object for method chaining.
	 */
	public MythicPlayer useBatch(SpriteBatch batch) {
		this.batch = batch;
		return this;
	}

	/**
	 * @see ApplicationAdapter#render();
	 * @return this object for method chaining.
	 */
	public MythicPlayer render() {
		if (batch == null) {
			throw new UnsupportedOperationException();
		}
		batch.draw(img, xy, xy);
		xy++;
		return this;
	}

	/**
	 * @see ApplicationAdapter#dispose().
	 * @return this object for method chaining.
	 */
	public MythicPlayer dispose() {
		if (img != null) {
			img.dispose();
		}
		return this;
	}
}
