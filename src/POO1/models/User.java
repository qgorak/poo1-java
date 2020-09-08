package POO1.models;
import POO1.exceptions.BadPasswordException;

public class User extends Object{
	private String login;
	private String password;
	private Group groupe;
//	private Organization orga;
	
	public User(String login, Group groupe) {
		this.login=login;
		this.groupe=groupe;

	}
	public String getLogin()	{
		return this.login;
	}
	public void setLogin(String login)	{
		this.login=login;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password, String conf) throws Exception {
		if (password.equals(conf) && !password.equals(this.password)) {
			this.password = password;
		}
		else{
		throw new BadPasswordException("bad new password");
		}
	}
	public Group getGroup() {
		return groupe;
	}
	public void setGroup(Group groupe) {
		this.groupe = groupe;
	}

	public Organization getOrganization() {
		return groupe.getOrga();
	}
//	public Organization getOrga() {
//		return orga;
//	}
//	public void setOrga(Organization orga) {
//		this.orga = orga;
//	}
	@Override
	public String toString() {
		if (groupe!=null) {
			return login+"("+password+")"+groupe;
		}
		else{
			
			return login+"("+password+")";
		}
	}
}

