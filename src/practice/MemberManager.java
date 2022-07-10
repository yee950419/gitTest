package practice;

public class MemberManager {
	
	public void signUpMembers() {
		
		MemberDTO[] members = new MemberDTO[5];
		
		members[0] = new MemberDTO(1, "user01", "pass01", "홍길동", 20, '남');
		members[1] = new MemberDTO(2, "user02", "pass02", "유관순", 16, '여');
		members[2] = new MemberDTO(3, "user03", "pass03", "이순신", 40, '남');
		members[3] = new MemberDTO(4, "user04", "pass04", "심사임당", 36, '여');
		members[4] = new MemberDTO(5, "user05", "pass05", "윤봉길", 22, '남');
		
		MemberRegisterManager memberRegisterManager = new MemberRegisterManager();
		memberRegisterManager.regist(members);
	}
	
	public void printAll() {
		
		MemberDTO[] allMembers = new MemberSelectManager().selectAllMember();
		
		for(MemberDTO m : allMembers) {
			System.out.println(m.toString());
		}
	}
}
