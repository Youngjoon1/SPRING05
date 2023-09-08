package com.care.root.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.member.dto.MemberDTO;
import com.care.root.mybatis.member.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired MemberMapper mm;
	public int loginCK(String id, String pw) {
		int result = 0;
		for(int i=0; i < mm.getList().size(); i++) {
			if(mm.getList().get(i).getId().equals(id) && mm.getList().get(i).getPw().equals(pw)) {
				
				result = 1;
			}
		}
		return result;
	}
	
		public ArrayList<MemberDTO> getList() {
		ArrayList<MemberDTO> list = mm.getList();
		return list;
	}

		public MemberDTO userInfo(String id) {
			MemberDTO dto = mm.userInfo(id);
			return dto;
		}
		
		public int insertMember(MemberDTO dto) {
			return mm.insertMember(dto);
		}
		
		public int updateMember(MemberDTO dto) {
			return mm.updateMember(dto);
		}
		
		public int memberDel(String id) {
			return mm.memberDel(id);
		}

	

	
}
