package models;

public class Administrator {
	private Long adminId;
	private String name;
	private String password;
	private String userName;
	private String email;
	
	public Long getAdminId() { return adminId; }
	   public void setAdminId(Long adminId) { this.adminId = adminId; }

	   public String getName() { return name; }
	   public void setName(String name) { this.name = name; }

	   public String getEmail() { return email; }
	   public void setEmail(String email) { this.email = email; }

	   public String getUserName() { return userName; }
	   public void setUserName(String userName) { this.userName = userName; }

	   public String getPassword() { return password; }
	   public void setPassword(String password) { this.password = password; }

public 	Administrator () {}

private Administrator (Builder builder) {
	this.adminId = builder.adminId;
	this.email= builder.email;
	this.name= builder.name;
	this.password = builder.password;
	this.userName = builder.userName; 	
}
public static class Builder{
	 private Long adminId;
     private String name;
     private String email;
     private String userName;
     private String password;
     
     public Builder withAdminId(Long adminId) { this.adminId =adminId; return this; }
     public Builder withName(String name) { this.name = name; return this;}
     public Builder withEmail(String email) {this.email =email;return this;}
     public Builder withUserName(String userName) {this.userName=userName; return this;}
     public Builder withPassword(String password) {this.password=password;return this;}
     
   public Administrator build() {
	   if (userName == null || password == null)
       throw new IllegalArgumentException("Username y password son obligatorios");
   return new Administrator(this);
   
   }
     
   
}
     
}

    
	
