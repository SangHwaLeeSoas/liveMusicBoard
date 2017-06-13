package org.soas.persistence;

import org.soas.domain.Images;

public interface ImageDAO {

	
	public void create(Images images);
	
	public Images read(Integer image_idx);
	
	public void update(Images images);
	
	public void delete(Integer image_idx);
	
}
