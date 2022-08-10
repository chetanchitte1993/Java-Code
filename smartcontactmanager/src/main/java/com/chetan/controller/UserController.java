package com.chetan.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.chetan.dao.ContactRepository;
import com.chetan.dao.UserRepository;
import com.chetan.entities.Contact;
import com.chetan.entities.User;
import com.chetan.helper.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ContactRepository contactRepository;
	
	// method for adding common data to response
	
	@ModelAttribute
	public void addCommonData(Model model, Principal principal)
	{
		String userName = principal.getName();
		System.out.println("USERNAME " + userName);
		
		
		User user = userRepository.getUserByUserName(userName);
		
		System.out.println("USER "+user);
		
		model.addAttribute("user", user);
		
		
	}
	
	// dashboard home
	
	@RequestMapping("/index")
	public String dashboard(Model model, Principal principal)
	{
		
		model.addAttribute("title", "User Dashborad");
		return "normal/user_dashboard";
	}
	
	//open add form handler
	
	@GetMapping("add_contact")
	public String openAddContactFrom(Model model)
	{
		model.addAttribute("title", "Add Contact");
		model.addAttribute("contact", new Contact());
		return "normal/add_contact_form";
	}
	
	//processing add contact form
	@PostMapping("/process-contact")
	public String processContact(@ModelAttribute Contact contact,
								 @RequestParam("profileImage")MultipartFile file,
								 Principal principal, HttpSession session)
	{
		try {
		String name = principal.getName();
		User user = this.userRepository.getUserByUserName(name);
		
		// processing and uploading file
		
		
		if(file.isEmpty())

		{
			// if the file is empty then try our massage
			
			System.out.println("File is empty");
		}
		else
		{
			// file the file to folder and update the name tom contact
			
			contact.setImage(file.getOriginalFilename());
			
			File saveFile = new ClassPathResource("static/img").getFile();
			
			Path path = Paths.get(saveFile.getAbsolutePath()+File.separator+file.getOriginalFilename());
			
			Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
			
			System.out.println("Image is Uploaded");
		}
		
		user.getContacts().add(contact);
		
		contact.setUser(user);
		
		this.userRepository.save(user);
		
		System.out.println("DATA "+contact);
		
		System.out.println("Added to data base");
		
		//message success......
		
		session.setAttribute("message", new Message("Your contact is added !! add more...","success"));
		}
		catch (Exception e) {
			System.out.println("ERROR "+e.getMessage());
			e.printStackTrace();
			
		//message error.....
			
	    session.setAttribute("message", new Message("Some went wrong !! Try again..","danger"));
			
		}
		
		return "normal/add_contact_form";
	}
	
	//show contact handler
	//per page =5[n]
	//current page =0[page]
	
	@GetMapping("/show-contacts/{page}")
	public String showContacts(@PathVariable("page") Integer page, Model m, Principal principal)
	{
		m.addAttribute("title","Show User Contacts");
		//contact list pass
		
		/** String userName = principal.getName();
		
		User user = this.userRepository.getUserByUserName(userName);
		List<Contact> contacts =  user.getContacts();***/
	 	String userName = principal.getName();
	 	User user = this.userRepository.getUserByUserName(userName);
	 	
	 	Pageable pageable = PageRequest.of(page, 5);
	 	 
		Page<Contact> contacts = this.contactRepository.findContacsByUser(user.getId(), pageable);
		
		m.addAttribute("contacts", contacts);
		m.addAttribute("currentPages", page);
		m.addAttribute("totalPages", contacts.getTotalPages());
		
		return "normal/show_contacts";
	}
}

