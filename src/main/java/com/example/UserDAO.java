package com.example;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class UserDAO {

HibernateTemplate template;

public void setTemplate(HibernateTemplate template) {
	this.template = template;
}

// insert user 
public int insertUser(UserPOJO user) {
	int row= (int) template.save(user);
   return row;
}


// get user details
 public List<UserPOJO> getUserDetails() {
	 String sql="from UserPOJO";
		return (List<UserPOJO>) template.find(sql);
		
	}
 
 // Edit User details
 
 public void editUser(UserPOJO user) {
	    template.update(user);
	 }
 
 // Delete User
 
 public void deleteUser(UserPOJO user) {
	 template.delete(user);
     
 }
	 
 }


