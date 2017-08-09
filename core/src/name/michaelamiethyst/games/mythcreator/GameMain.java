package name.michaelamiethyst.games.mythcreator;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameMain extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private int xy = 0;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		String spriteName = "Warhammer40kSprites.png";
		img = new Texture(spriteName);
	}

	/**
	 * <p>Main Game Loop here.</p>
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, xy, xy);
		xy ++;
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
