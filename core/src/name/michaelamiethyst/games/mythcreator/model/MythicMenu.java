package name.michaelamiethyst.games.mythcreator.model;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Main player charactor.
 * 
 * @author desig
 */
public class MythicMenu implements Renderable<MythicMenu> {
	
	/**
	 * Filename for the player's sprite.
	 */
	private static final String ASSET_FILENAME = "the-god-emperor-of-man.jpg";
	
	/**
	 * The player's Icon.
	 */
	private Texture img;
	
	public MythicMenu() {
		img = new Texture(ASSET_FILENAME);
	}

	/**
	 * @see ApplicationAdapter#render();
	 * @return this object for method chaining.
	 */
	public MythicMenu render(SpriteBatch batch) {
		if (batch == null) {
			throw new UnsupportedOperationException();
		}
		
		batch.draw(img, 0, 0, 1024, 64);
		int height = Gdx.graphics.getHeight();
		if (height != 1024 && height != 873) {
			throw new RuntimeException(Integer.toString(height));
		}
		batch.draw(img, 0, 512 - 64, 1024, 64);
		return this;
	}

	/**
	 * @see ApplicationAdapter#dispose().
	 * @return this object for method chaining.
	 */
	public MythicMenu dispose() {
		if (img != null) {
			img.dispose();
		}
		return this;
	}
	
}
