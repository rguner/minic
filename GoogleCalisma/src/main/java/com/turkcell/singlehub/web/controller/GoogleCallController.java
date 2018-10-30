package com.turkcell.singlehub.web.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.api.client.util.Maps;
import com.google.api.services.analytics.model.GaData;
import com.turkcell.singlehub.core.service.GoogleAnalyticsService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class GoogleCallController {

	private int INTERVAL_ORDER_IN_PAGE = 3;
	
	@Autowired
	GoogleAnalyticsService googleAnalyticsService;


	@RequestMapping(value = "/google") // google.html seklinde erisilebilir..
	public ModelAndView callGoogle(HttpSession session, HttpServletRequest request) throws Exception {

		ModelAndView model = new ModelAndView("goster.jsp");

		//model.addObject("shopOrderPageManager", commonContentService.getPageLabelMap("shopOrderPageManager"));
		GaData gaData = googleAnalyticsService.getGaDataForSingleHub("/cihazlar/akilli-telefonlar/iphone-5c-32gb", "deviceDetailHelpfulReviews");
		
		model.addObject("pageTitle", "sayfa headeri set ettim");
		model.addObject("yorum",gaData.getRows().get(0).get(2));
		model.addObject("puan",gaData.getRows().get(0).get(3));
		model.addObject("selfLink",gaData.getSelfLink());
		return model;
	}
	


}