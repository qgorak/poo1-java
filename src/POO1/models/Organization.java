package POO1.models;

import java.util.ArrayList;
import java.util.List;

public class Organization {
	private String name;
	List<User> users;
	List<Group> groups;
	
	
	public Organization(String name) {
		this.name=name;
		users=new ArrayList<User>();
		groups=new ArrayList<Group>();
		


	}
	public Organization() {
		this.name="orga";
		users=new ArrayList<User>();
		groups=new ArrayList<Group>();
		
	}
	public void addUser(User user) {
		users.add(user);
	}
	public void addGroup(Group groupe) {
		groups.add(groupe);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void showList() {
		System.out.println(users);
		System.out.println(groups);
	}
	@Override
	public String toString() {
		return "orga name =" + name;
	}

}
