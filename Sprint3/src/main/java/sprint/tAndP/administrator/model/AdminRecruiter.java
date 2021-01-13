package sprint.tAndP.administrator.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Pattern;
@Entity
@Table(name="recruiter_table")
public class AdminRecruiter 
{
	
	
@Id
@GeneratedValue
@Column(name="Recruiter_Id")
	private long id;


//@NotBlank(message=" First Name can't be empty!!")
//@Pattern(regexp="^[A-Z][a-z]{3,15}",message = "length must be in between 3 to 15")
@Column(name="Recruiter_firstName")
	private String firstName;


//@NotBlank(message=" Last Name can't be empty!!")
//@Pattern(regexp="^[A-Z][a-z]{3,15}",message = "length must be in between 3 to 15")
@Column(name="Recruiter_lastName")
	private String lastName;

//@NotBlank(message="Name can't be empty!!")
//@Pattern(regexp="^[A-Z][a-z]{3,15}",message = "length must be in between 3 to 15")
@Column(name="Recruiter_Name")
	private String username;


//@NotBlank(message="Enter password!!")
@Column(name = "Recruiter_Password")
//@Pattern(regexp="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{8,}$",message = "Enter the password containing at least one digit,one uppercase letter,one lowercase letter,special symbol,no whitespace,atleast upto 8 places")
	private String password;

//@NotBlank(message="Email_Id is mandatory!!")
@Column(name = "Recruiter_Email")
//@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z]+.[a-zA-A]+",message = "enter email in valid format")
	private String mail;

//@NotBlank(message="Campany_Name can't be empty!!!")
//@Pattern(regexp="^[A-Z][a-z]{3,15}",message = "length must be in between 3 to 15")
@Column(name="Recruiter_Company")
	private String company;



	public AdminRecruiter( String username, String password, String mail, String company,String firstName, String lastName) {
		super();
		this.firstName=firstName;
		this.lastName=lastName;
		this.username = username;
		this.password = password;
		this.mail = mail;
		this.company = company;
	}
	public AdminRecruiter(){}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Recruiter [username=" + username + ", password=" + password + ", mail=" + mail + ", company=" + company
				+ "]";
	}
	
}
