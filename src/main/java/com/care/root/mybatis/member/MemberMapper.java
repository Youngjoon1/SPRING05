package com.care.root.mybatis.member;

import java.util.ArrayList;

import com.care.root.member.dto.MemberDTO;

public interface MemberMapper {
	public int loginCK(String id,String pw);
	
	public ArrayList<MemberDTO> getList();
	
	public MemberDTO userInfo(String id);
	
	public int insertMember(MemberDTO dto);
	
	public int updateMember(MemberDTO dto);
	
	public int memberDel(String id);
}
