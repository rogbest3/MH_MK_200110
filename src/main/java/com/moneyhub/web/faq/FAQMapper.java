package com.moneyhub.web.faq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.moneyhub.web.pxy.PageProxy;

@Repository
public interface FAQMapper {
	public void createFAQ(HashMap<String, String> map);
	public void deleteFAQ(HashMap<String, String> map);
	public void truncateFAQ(HashMap<String, String> map);
	
	public ArrayList<FAQ> selectAll(PageProxy pager);
	public String countFAQ();
}
