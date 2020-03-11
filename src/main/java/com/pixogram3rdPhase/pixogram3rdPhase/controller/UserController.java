package com.pixogram3rdPhase.pixogram3rdPhase.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pixogram3rdPhase.pixogram3rdPhase.model.Content;
import com.pixogram3rdPhase.pixogram3rdPhase.model.Feedback;
import com.pixogram3rdPhase.pixogram3rdPhase.model.Followers;
import com.pixogram3rdPhase.pixogram3rdPhase.model.LogActivities;
import com.pixogram3rdPhase.pixogram3rdPhase.model.User;


@RestController
public class UserController {
	
	@RequestMapping(value={"/register/"}, method = RequestMethod.POST)
	public boolean register(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @RequestBody User user) 
    {	
		return false;	
    }
	
	@RequestMapping(value={"/login/{userId}"}, method = RequestMethod.GET)
    User login(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @PathVariable String userName,String password) 
    {	
		return null;	
    }
	
	@RequestMapping(value={"/resetPassword/{userId}"}, method = RequestMethod.POST)
    User resetPassword(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @PathVariable String password) 
    {	
		return null;	
    }
	
	@RequestMapping(value={"/getProfile/{userId}"}, method = RequestMethod.GET)
    User getProfile(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @PathVariable int userId) 
    {	
		return null;	
    }

	@RequestMapping(value={"/updateProfile/"}, method = RequestMethod.PUT)
	public boolean updateProfile(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @RequestBody User user) 
    {	
		return false;	
    }

	@RequestMapping(value={"/deleteProfile/{userId}"}, method = RequestMethod.DELETE)
	public boolean deleteProfile(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @PathVariable int userId) 
    {	
		return false;	
    }
	
	@RequestMapping(value={"/addContent/{userId}"}, method = RequestMethod.POST)
	public boolean addContent(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse,@RequestBody List<Content>  content,@PathVariable int userId) 
    {	
		return false;	
    }
	
	@RequestMapping(value={"/organizeImage/{userId}"}, method = RequestMethod.GET)
	List<Content> organizeImage(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse,@RequestBody List<Content>  content,@PathVariable int userId) 
    {	
		return null;	
    }
	
	@RequestMapping(value={"/organizeVideo/{userId}"}, method = RequestMethod.GET)
	List<Content> organizeVideo(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse,@RequestBody List<Content>  content,@PathVariable int userId) 
    {	
		return null;	
    }
	
	@RequestMapping(value={"/getContent/{contentId}"}, method = RequestMethod.GET)
	Content getContent(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse,@PathVariable int contentId) 
    {	
		return null;	
    }
	
	@RequestMapping(value={"/updateContent/{userId}"}, method = RequestMethod.PUT)
	public boolean updateContent(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @RequestBody Content content,@PathVariable int userId) 
    {	
		return false;	
    }
	
	@RequestMapping(value={"/addComment/"}, method = RequestMethod.POST)
	public boolean addComment(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse,@RequestBody Feedback feedback) 
    {	
		return false;	
    }
	
	@RequestMapping(value={"{senderId}/followUser/{userId}"}, method = RequestMethod.PUT)
	public boolean followUser(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse,@PathVariable int userId,int senderId) 
    {	
		return false;	
    }
	

	@RequestMapping(value={"{senderId}/followList/{userId}"}, method = RequestMethod.PUT)
	List<Followers> followList(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse,@PathVariable int userId) 
    {	
		return null;	
    }
	
	@RequestMapping(value={"{imagePath}/hideMedia/{visibility}/{videoPath}"}, method = RequestMethod.PUT)
	public boolean hideMedia(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse,@PathVariable String imagePath,boolean visibility,String videoPath) 
    {	
		return false;	
    }
	
	@RequestMapping(value={"/getUserById/{userId}"}, method = RequestMethod.GET)
    User getUserById(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @PathVariable int userId) 
    {	
		return null;	
    }
	
	@RequestMapping(value={"/getContentByUser/{userId}"}, method = RequestMethod.GET)
	List<Content> getContentByUser(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @PathVariable int userId) 
    {	
		return null;	
    }
	
	
}
