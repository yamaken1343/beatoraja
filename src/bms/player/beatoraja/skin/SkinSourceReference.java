package bms.player.beatoraja.skin;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import bms.player.beatoraja.MainState;

public class SkinSourceReference implements SkinSource {

	private final int id;
	
	public SkinSourceReference(int id) {
		this.id = id;
	}
	
	@Override
	public void dispose() {
	}

	@Override
	public TextureRegion getImage(long time, MainState state) {
		return state.getImage(id);
	}

	@Override
	public TextureRegion[] getImages(long time, MainState state) {
		return null;
	}

}
