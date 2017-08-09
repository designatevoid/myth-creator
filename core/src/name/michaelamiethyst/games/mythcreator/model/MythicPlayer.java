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
public class MythicPlayer implements Renderable<MythicPlayer> {
	
	/**
	 * Filename for the player's sprite.
	 */
	private static final String ASSET_FILENAME = "the-god-emperor-of-man.jpg";
	
	/**
	 * The batch of pictures that this player's icon is a part of.
	 */
	private SpriteBatch batch;
	
	/**
	 * The player's Icon.
	 */
	private Texture img;
	
	/**
	 * The current x position in tiles.
	 */
	private int x = 5;
	
	/**
	 * The currents y position in tiles.
	 */
	private int y = 5;
	
	public MythicPlayer() {
		img = new Texture(ASSET_FILENAME);
	}

	/**
	 * @see ApplicationAdapter#render();
	 * @return this object for method chaining.
	 */
	public MythicPlayer render(SpriteBatch batch) {
		if (batch == null) {
			throw new UnsupportedOperationException();
		}
		
		processInput();
		batch.draw(img, x * 64, y * 64);
		return this;
	}

	private void processInput() {
		boolean movingLeft = Gdx.input.isKeyJustPressed(Input.Keys.LEFT);
		if (movingLeft) {
			x--;
		}
		boolean movingRight = Gdx.input.isKeyJustPressed(Input.Keys.RIGHT);
		if (movingRight) {
			x++;
		}
		
		boolean movingUp = Gdx.input.isKeyJustPressed(Input.Keys.UP);
		if (movingUp) {
			y++;
		}
		
		boolean movingDown = Gdx.input.isKeyJustPressed(Input.Keys.DOWN);
		if (movingDown) {
			y--;
		}
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
