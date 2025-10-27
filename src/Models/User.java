package models;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private String email;
	private Long userId;
	private String phone;
	private String userName;
	private String password;
	private List <Address> addresses;
	private List<PaymentM> paymentM;
	
	public 	User () {}
	
	private User (Builder builder) {
		this.userId=builder.userId;
		this.name=builder.name;
		this.email=builder.email;
		this.phone=builder.phone;
		this.userName=builder.userName;
		this.password=builder.password;
		this.addresses=builder.addresses;
		this.paymentM = builder.paymentM;
		
	}
		
public void addAddress (Address address) {
	if (addresses  == null) addresses =new ArrayList<>();
	addresses.add(address);
	
}
public void addPaymentM(PaymentM paymentm) {
    if (paymentM == null) paymentM = new ArrayList<>();
    paymentM.add(paymentm);
	

}

public Long getUserId() { return userId; }
public String getUserName() { return userName; }
public String getPassword() { return password; }
		
public List<Address>getAddress(){return addresses;}
public List<PaymentM> getPaymentM() { return paymentM; }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public static class Builder {
    private Long userId;
    private String name;
    private String email;
    private String phone;
    private String userName;
    private String password;
    private List<Address> addresses = new ArrayList<>();
    private List<PaymentM> paymentM = new ArrayList<>();

    public Builder withId(Long userId) { this.userId = userId; return this; }
    public Builder withName(String name) { this.name = name; return this; }
    public Builder withEmail(String email) { this.email = email; return this; }
    public Builder withPhone(String phone) { this.phone = phone; return this; }
    public Builder withUserName(String userName) { this.userName = userName; return this; }
    public Builder withPassword(String password) { this.password = password; return this; }

    public Builder addAddress(Address address) {
        this.addresses.add(address);
        return this;
    }

    public Builder addPaymentMethod(PaymentM paymentm) {
        this.paymentM.add(paymentm);
        return this;
    }

    // Validación del  constructor
    public User build() {
        if (userName == null || password == null) {
            throw new IllegalArgumentException("El usuario y la contraseña son obligatorios");
        }
        return new User(this);
    }
}
}

	
	
