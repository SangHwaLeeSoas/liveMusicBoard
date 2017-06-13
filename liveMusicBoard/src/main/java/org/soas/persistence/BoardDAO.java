package org.soas.persistence;

import org.soas.domain.Boards;

public interface BoardDAO {

	
	public void create(Boards boards);
	
	public Boards read(Integer board_idx);
	
	public void update(Boards boards);
	
	public void delete(Integer board_idx);
	
	public void upLikeCount(Integer board_idx);
	
	public void downLikeCount(Integer board_idx);
	
	public void upViewCount(Integer board_idx);
	
}
