package com.shop.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.shop.entity.Items;
@Controller
public class ItemsController {
	@RequestMapping("/queryItems")
	public ModelAndView queryItems()throws Exception {
		List<Items> itemsList=new ArrayList<Items>();
		Items items1=new Items();
		items1.setName("aa");
		items1.setPrice("11");
		Items items2=new Items();
		items2.setName("bb");
		items2.setPrice("22");
		itemsList.add(items1);
		itemsList.add(items2);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("/WEB-INF/jsp/itemsList.jsp");
		
		return modelAndView;
	}

}
