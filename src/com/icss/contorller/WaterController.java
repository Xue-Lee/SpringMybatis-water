package com.icss.contorller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icss.dao.AdminDao;
import com.icss.dao.ClientDao;
import com.icss.entiry.Admin;
import com.icss.entiry.Client;

@Controller
public class WaterController {
	@Autowired
	private AdminDao adminDao;
	private ClientDao clientDao;
	@RequestMapping("login")
	public String login(HttpServletRequest request,Admin admin) {
		System.out.println("login..............");
		Admin ad = adminDao.findAdmin(admin);
		if(ad != null) {
			return "showClient.do";
		}else {
			return "login";
		}
		
	}
	@RequestMapping("showClient")
	public String showClient(HttpServletRequest request) {
		System.out.println("showclient...............");
		List<Client> listClient = clientDao.findClient();
		request.setAttribute("listClient", listClient);
		return "showClient";
	}
}
