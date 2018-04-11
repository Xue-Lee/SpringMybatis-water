package com.icss.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icss.dao.AdminDao;
import com.icss.dao.ClientDao;
import com.icss.entity.Admin;
import com.icss.entity.Client;

@Controller
public class WaterController {
	@Autowired
	private ClientDao clientDao;
	@Autowired
	private AdminDao adminDao;
	@RequestMapping("login")
	public String login(HttpServletRequest request,Admin admin) {
		System.out.println("login..............");
		Admin ad = adminDao.findAdmin(admin);
		if(ad != null) {
			return "forward:showClient.do";
		}else {
			return "login";
		}
		
	}
	@RequestMapping("showClient")
	public String showClient(HttpServletRequest request) {
		System.out.println("showclient...............");
		List<Client> listClient = clientDao.findClient();
		System.out.println("111111111111111111111");
		request.setAttribute("listClient", listClient);
		return "showClient";
	}
}
