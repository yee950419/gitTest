package practice;

public class MemberRegisterManager {
	
	public void regist(MemberDTO[] members) {
		
		System.out.println("회원을 등록합니다.");
		
		for(MemberDTO m : members) {
			System.out.println(m.getName() + "님을 회원 등록하셨습니다.");
		}
		
		System.out.println("총 " + members.length + "명의 회원을 등록하는데 성공하였습니다!");
	}
}
