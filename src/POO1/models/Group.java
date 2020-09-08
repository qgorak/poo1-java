package POO1.models;

import java.util.ArrayList;
import java.util.List;


public class Group {
	private String name;
	List<User> users;
	private Organization orga;
	public Group(String name, Organization orga) {
		this.orga = orga;
		this.name=name;
		users=new ArrayList<User>();
	}
//	public Group() {
//		this.name="groupe";
//		users=new ArrayList<User>();
//	}
	public void addUser(User user) {
		users.add(user);
	}
	public void showList() {
		System.out.println(users);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Organization getOrga() {
		return orga;
	}
	public void setOrga(Organization orga) {
		this.orga = orga;
	}
	@Override
	public String toString() {
		return "group name =" + name;
	}

}
