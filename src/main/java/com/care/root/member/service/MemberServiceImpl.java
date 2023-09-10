package com.care.root.member.service;

import java.util.ArrayList;

import javax.servlet.jsp.tagext.TryCatchFinally;

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
		ArrayList<MemberDTO> list = null;
		try {
			list = mm.getList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

		public MemberDTO userInfo(String id) {
			MemberDTO dto = null;
			try {
				dto = mm.userInfo(id);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return dto;
		}
		
		public int insertMember(MemberDTO dto) {
			
			try {
				return mm.insertMember(dto);
			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		}
		
		public int updateMember(MemberDTO dto) {
			try {
				return mm.updateMember(dto);
			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		}
		
		public int memberDel(String id) {
			try {
				return mm.memberDel(id);
			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		}

	

	
}
