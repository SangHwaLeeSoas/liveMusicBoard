package org.soas.persistence;

import org.soas.domain.Replies;

public interface ReplyDAO {
	
	
	public void create(Replies replies);
	
	public Replies read(Integer reply_idx);
	
	public void update(Replies replies);
	
	public void delete(Integer reply_idx);

}
