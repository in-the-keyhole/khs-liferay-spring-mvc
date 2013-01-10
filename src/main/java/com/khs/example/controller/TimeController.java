package com.khs.example.controller;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.context.PortletConfigAware;

import com.khs.example.model.Contact;

@Controller(value = "time")
@RequestMapping(value = "VIEW")
@SessionAttributes({ "time" })
public class TimeController implements PortletConfigAware {

	// /** Utilities **/
	@ModelAttribute("contact")
	protected Contact createContact(ModelMap modelMap) {
		return new Contact();
	}

	/** default renderer **/
	@RenderMapping
	public String show(@ModelAttribute("contact") Contact contact, RenderResponse renderResponse, RenderRequest request, Model model) {

		String userid = request.getRemoteUser();
		// User liferayUser = UserLocalServiceUtil.getUserByEmailAddress(company.getCompanyId(), userid);
		model.addAttribute("time", new Date());
		model.addAttribute("contact", contact);
		return "time/time";
	}

	@ActionMapping(params = "action=save")
	public void save(@ModelAttribute("contact") Contact contact, ActionRequest request, ActionResponse response, ModelMap model) throws IOException {
		// save form model...

	}

	@Override
	public void setPortletConfig(PortletConfig portletConfig) {
		// TODO Auto-generated method stub

	}

}
