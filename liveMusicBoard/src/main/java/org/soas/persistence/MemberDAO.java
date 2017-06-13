package org.soas.persistence;

import org.soas.domain.Members;

public interface MemberDAO {

	
	public void create(Members members);
	
	public Members read(Integer member_idx);
	
	public void update(Members members);
	
	public void delete(Integer member_idx);
	
	
}
