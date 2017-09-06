package name.michaelamiethyst.games.mythcreator.model;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

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
		ShapeRenderer shapes = new ShapeRenderer();
		shapes.begin(ShapeType.Filled);
		shapes.setColor(0, 0, 0, 1);
		int width = Gdx.graphics.getWidth();
		int height = Gdx.graphics.getHeight();
		if (height != 1024 && height != 873) {
			throw new RuntimeException(Integer.toString(height));
		}
		
		// draw top and bottom letterboxes
		int cellHeight = 138;
		int halfCellHeight = cellHeight / 2;
		shapes.rect(0, height - halfCellHeight, width, cellHeight);
		shapes.rect(0, 0, width, cellHeight);
		shapes.end();
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
