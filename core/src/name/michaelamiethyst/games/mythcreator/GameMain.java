package name.michaelamiethyst.games.mythcreator;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import name.michaelamiethyst.games.mythcreator.model.MythicPlayer;

public class GameMain extends ApplicationAdapter {
	private SpriteBatch batch;
	private MythicPlayer player;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		player = new MythicPlayer().useBatch(batch);
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
		player.render();
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		player.dispose();
	}
}
