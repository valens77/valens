package test.annotation.table;

@DBTable(name = "memeber")
public class Member {

	@SQLString(value = 30, constrains = @Constrains(allowNull = false))
	private String firstName;
	@SQLString(10)
	private String lastName;
	@SQLInteger
	private int age;
	@SQLString(value = 10, constrains = @Constrains(primaryKey = true, unique = true))
	private String handle;
	@SQLInteger
	private int level;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}