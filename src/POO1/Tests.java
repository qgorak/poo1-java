package POO1;

import POO1.exceptions.BadPasswordException;
import POO1.models.Group;
import POO1.models.Organization;
import POO1.models.User;

public class Tests {

	public static void main(String[] args)  {
		Organization o = new Organization("organization");
		Group g=new Group("testgroupe",o);
		User u=new User("no login", g);
		User v=new User("no login",g);
		

		v.setLogin("logintest");
		v.setGroup(g);
		g.addUser(v);
		u.setLogin("qgorak");
		u.setGroup(g);
		g.addUser(u);
		o.addUser(u);
		o.addGroup(g);
		g.setOrga(o);
		   
		try {
		u.setPassword("test", "test");
		}
		
		catch(Exception e) {
			if(e instanceof BadPasswordException) {
				System.out.println("mauvais mot de passe ");
			}

		}
		//o.showList();
		System.out.println("oraganization du user q.gorak="+u.getOrganization());

	}

}
