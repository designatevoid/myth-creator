package name.michaelamiethyst.games.mythcreator;

import com.google.inject.AbstractModule;

import name.michaelamiethyst.games.mythcreator.model.MythicPlayer;

public class MythicModule extends AbstractModule {
		  @Override 
		  protected void configure() {
			  bind(MythicPlayer.class).toInstance(new MythicPlayer());
		  }
}
