package week3.day1;

public class Students {
	public void getStudentInfo() {
		System.out.println("----Method OverLoading----");
	}
	public void getStudentInfo(int id) {
		System.out.println("Id:"+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("New Id:"+id);
		System.out.println("Name:"+name);

	}
	public void getStudentInfo(String email,int phoneNumber) {
		System.out.println("Email:"+email);
		System.out.println("Phone Number:"+phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students details=new Students(); 
		details.getStudentInfo();
		details.getStudentInfo(7980);
		details.getStudentInfo(7986,"Divya");
		details.getStudentInfo("divyakumar349@gmail.com",984037162);

	}

}
