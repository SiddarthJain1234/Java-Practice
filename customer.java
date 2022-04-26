//package capAssignment;


public class customer{
	String userId;
	String emailId;
	String password;
	String firstName;
	String lastName;
	String city;
	String gender;
	String phoneNumber;
	
	
	public customer(String uI,String eI, String p, String fN, String lN, String c, String gender,String pN,Address address,ServiceDetails serviceDeatails) {
		userId=uI;
		emailId=eI;
		password=p;
		firstName=fN;
		lastName=lN;
		city=c;
		this.gender=gender;
		phoneNumber=pN;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return return "Customer[uderId="+this.userId+",emailId="+this.emailId+",password="+this.password+",firstName="+this.firstName+",lastName="+this.lastName+",city="+this.city+",gender="+this.gender+",phoneNumber="+this.phoneNumber+",";
	}
	
	public String getCity() {
		return city;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getGender() {
		return gender;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPassword() {
		return password;
	} 
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public static void main(String[] args){
	Address address=new Address("Banglore","Karnataka",123456,"india");
	ServiceDetails serviceDeatils=new ServiceDetails("SID1001","BUS001","10/01/2022","15/01/2022","Banglore","Delhi","2500","9","70");
	
		customer Customer=new customer("1001","admin@gmail.com","Password","Raj","Kumar","Banglore","Male","1234567890",address,serviceDeatils);
		
		System.out.print(Customer.toString()+"address="+address.toString()+"serviceDeatails="+serviceDeatils.toString());
	}
	
	
}

class Address {

	String city;
	String state;
	int zip;
	String country;

	public Address(String c,String s, int zip, String country) {
		// TODO Auto-generated constructor stub
		city=c;
		state=s;
		this.zip=zip;
		this.country=country;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Address[city="+this.city+",state="+this.state+",zip="+this.zip+",country="+this.country+"],";
	}
	
	
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public int getZip() {
		return zip;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
}

class ServiceDetails{
	String serviceid;
	String busid;
	String deptDateTime;
	String arrDateTime;
	String arrivalCity;
	String deptCity;
	String cost;
	String seatsLeft;
	String totalSeats;
	
	
	public ServiceDetails(String serviceid,String busid,String deptDateTime,String arrDateTime,String arrivalCity,String deptCity,String cost,String seatsLeft,String totalSeats) {
		this.serviceid=serviceid;
		this.busid=busid;
		this.deptDateTime=deptDateTime;
		this.arrDateTime=arrDateTime;
		this.arrivalCity=arrivalCity;
		this.deptCity=deptCity;
		this.cost=cost;
		this.seatsLeft=seatsLeft;
		this.totalSeats=totalSeats;
	}
	public String getArrDateTime() {
		return arrDateTime;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public String getBusid() {
		return busid;
	}
	public String getCost() {
		return cost;
	}
	public String getDeptCity() {
		return deptCity;
	}
	public String getDeptDateTime() {
		return deptDateTime;
	}
	public String getSeatsLeft() {
		return seatsLeft;
	}
	public String getServiceid() {
		return serviceid;
	}
	public String getTotalSeats() {
		return totalSeats;
	}
	public void setArrDateTime(String arrDateTime) {
		this.arrDateTime = arrDateTime;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public void setBusid(String busid) {
		this.busid = busid;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public void setDeptCity(String deptCity) {
		this.deptCity = deptCity;
	}
	public void setDeptDateTime(String deptDateTime) {
		this.deptDateTime = deptDateTime;
	}
	public void setSeatsLeft(String seatsLeft) {
		this.seatsLeft = seatsLeft;
	}
	public void setServiceid(String serviceid) {
		this.serviceid = serviceid;
	}
	public void setTotalSeats(String totalSeats) {
		this.totalSeats = totalSeats;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ServiceDetails[serviceId="+this.serviceid+",busId="+this.busid+",deptDateTime="+this.deptDateTime+",arrDateTime="+this.arrDateTime+",arrivalCity="+this.arrivalCity+",deptCity="+this.deptCity+",cost="+this.cost+",seatsLeft="+this.seatsLeft+",totalSeats="+this.totalSeats+"]]";
	}
}

