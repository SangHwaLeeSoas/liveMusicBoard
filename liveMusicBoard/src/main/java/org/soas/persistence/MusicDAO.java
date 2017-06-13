package org.soas.persistence;

import org.soas.domain.Music;

public interface MusicDAO {

	
	public void create(Music music);
	
	public Music read(Integer music_idx);
	
	public void update(Music music);
	
	public void delete(Integer music_idx); 
}
