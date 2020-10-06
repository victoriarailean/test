import java.util.Date;

enum Status {
	ACTIVE,
	INACTIVE,
	BLOCKED,
	NEW
}

public class User {
	private String firstname;
	private String lastname;
	private Integer age;
	private String email;
	private Status status;
	private Date timestamp;

	public User(String firstname, String lastname, Integer age, String email, Status status, Date timestamp) {
		this.firstname = firstname;
		this.lastname  = lastname;
		this.age       = age;
		this.email     = email;
		this.status    = status;
		this.timestamp = timestamp;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return this.lastname;
	}
	public void setLastname(String lastname) {
		this.firstname = lastname;
	}
	public Integer getAge() {
		return this.age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Status getStatus() {
		return this.status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Date getTimestamp() {
		return this.timestamp;
	}
	public void setEmail(Date timestamp) {
		this.timestamp = timestamp;
	}
}