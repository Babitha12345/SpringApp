package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class postsService {

	public List<posts> loadposts(){
		List<posts> l = new ArrayList<posts>();
		l.add (new posts());
		
		return l;
		}
		private List<posts> listofposts=loadposts();
		
		public List<posts> getallposts(){
			return listofposts;
		}
		
		public String addposts(posts post){
			listofposts.add(post);
			return "post added";
		}
		
//		public String updateUsers(posts post) {
//			boolean resourceFound=false;
//			for(users currentuser: listofpost) {
//				if(currentuser.getId() == post.getId()) {
//					resourceFound=true;
//					currentuser.setName(post.getName());
//					currentuser.setPassword(post.getPassword());
//					currentuser.setEmail(post.getEmail());
//				}
//			}
//			if(!resourceFound) {
//				listofusers.add(user);
//				return "User added successfully";
//
//			}
//			return "User updated successfully";
//		
//		}
}