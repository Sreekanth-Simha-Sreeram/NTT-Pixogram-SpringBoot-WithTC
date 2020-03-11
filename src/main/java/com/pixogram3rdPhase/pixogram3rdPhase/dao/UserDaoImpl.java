package com.pixogram3rdPhase.pixogram3rdPhase.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pixogram3rdPhase.pixogram3rdPhase.model.Content;
import com.pixogram3rdPhase.pixogram3rdPhase.model.Feedback;
import com.pixogram3rdPhase.pixogram3rdPhase.model.Followers;
import com.pixogram3rdPhase.pixogram3rdPhase.model.LogActivities;
import com.pixogram3rdPhase.pixogram3rdPhase.model.User;

@Component

public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionfactory;

	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean resetPassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getProfile(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateProfile(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteProfile(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addContent(List<Content> content, int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Content> organizeImage(int userId, List<Content> content) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Content> organizeVideo(int userId, List<Content> content) {
		// TODO Auto-generated method stub
		return null;
	}

	public Content getContent(int contentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateContent(int userId, Content content) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addComment(Feedback feedback) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean followUser(int userId, int senderId) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Followers> followList(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hideMedia(String imagePath, boolean visibility, String videoPath) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<LogActivities> activityLog(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Content> getContentByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

	

}
