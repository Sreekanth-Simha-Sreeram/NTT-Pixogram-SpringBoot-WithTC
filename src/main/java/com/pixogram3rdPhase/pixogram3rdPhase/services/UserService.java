package com.pixogram3rdPhase.pixogram3rdPhase.services;

import java.util.List;

import com.pixogram3rdPhase.pixogram3rdPhase.model.Content;
import com.pixogram3rdPhase.pixogram3rdPhase.model.Feedback;
import com.pixogram3rdPhase.pixogram3rdPhase.model.Followers;
import com.pixogram3rdPhase.pixogram3rdPhase.model.LogActivities;
import com.pixogram3rdPhase.pixogram3rdPhase.model.User;



public interface UserService {
		boolean register(User user);
		boolean login(String userName,String password);
		boolean resetPassword(String password);
		User getProfile(int userId);
		boolean updateProfile(User user);
		boolean deleteProfile(int userId);
		boolean addContent(List<Content> content,int userId);
		List<Content> organizeImage(int userId,List<Content>content);
		List<Content> organizeVideo(int userId,List<Content>content);
		Content getContent(int contentId);
		boolean updateContent(int userId,Content content);
		boolean addComment(Feedback feedback);
		boolean followUser(int userId,int senderId);
		List<Followers>followList(int userId);
		boolean  hideMedia(String imagePath,boolean visibility,String videoPath);
        List<LogActivities> activityLog(int userId);
        User getUserById(int userId);
        List<Content> getContentByUser(int userId);

}
