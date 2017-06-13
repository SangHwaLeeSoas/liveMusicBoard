package org.soas.persistence;

import org.soas.domain.Videos;

public interface VideoDAO {

	
	public void create(Videos videos);
	
	public Videos read(Integer video_idx);
	
	public void update(Videos videos);
	
	public void delete(Integer video_idx);
	
}
