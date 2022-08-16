package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	public List<User> loadusers(){
	List<User> l = new ArrayList<User>();
	l.add (new User());
	
	return l;
	}
	private List<User> listofusers=loadusers();
	
	public List<User> getallusers(){
		return listofusers;
	}
	
	public String addusers(User user){
		listofusers.add(user);
		return "user added";
	}
	
	public String updateUser(User user) {
		boolean resourceFound=false;
		for(User currentuser: listofusers) {
			if(currentuser.getUserId() == user.getUserId()) {
				resourceFound=true;
				currentuser.setName(user.getName());
				currentuser.setEmailId(user.getEmailId());
			}
		}
		if(!resourceFound) {
			listofusers.add(user);
			return "User added successfully";

		}
		return "User updated successfully";
	
	}
}