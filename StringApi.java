
/**
 * 
 * @author Kyung
 * 스트링 Api 공부
 * 
 */
public class StringApi {
	
	public void text() {
		
		String a = "String/Test";
		
		// 길이
		System.out.println(a.length());
		
		// 위치검색
		System.out.println(a.indexOf("Test"));
		
		// 특정 구분자로 문자열 분해 (문자열 배열이 리턴)
		String temp[] = a.split("/");
		// 결과 :  String temp[] = {"String", "Test"};
		for(String item : temp) {
			System.out.println(item);
		}
		
		// 빈 문자열로 자르면 글자 하나 단위로 쪼개준다.
		String temp2[] = a.split("");
		
		// 문자열 자르기
		System.out.println(a.substring(2,7));
		
		// 문자열 바꾸기
		System.out.println(a.replace("Te", "Px"));
		
		//  특정 문자열로 시작되는지 검사, 시작되면 true값 반환
		System.out.println(a.startsWith("Str"));
		/*
		 * ex> if(!address.startWith("http:")){
		 * 			address="http:"+address
		 * }
		 * 와 같이 사용
		 */
	}
	
	public void builderVsBuffer() {
		// jdk 1.5 버전 이상부터는 일반적인 스트링 연산을 StringBuilder 로 컴파일러가 자동변환 해준다.
		String result = "안" + "녕하" + "세요"+"반갑습니다";
		
		//buffer / builder로 처리하면 메모리 낭비 방지 가능
		
		// 속도가 빠름
		// 비동기에서 안정성이 보장된다.
		// 서버 개발시 사용
		StringBuffer buffer = new StringBuffer();
		buffer.append("안");
		buffer.append("녕하").append("세요");
		buffer.append("반갑습니다");
		System.out.println(buffer.toString());
		
		// 속도 가장 빠름
		// 비동기에서 안정성 보장되지 않는다.
		// 다중 thread 환경에서는 StringBuilder로 변수를 사용하지 않는다.
		StringBuilder builder = new StringBuilder();
		builder.append("안");
		builder.append("녕하").append("세요");
		builder.append("반갑습니다");
		System.out.println(builder.toString());
	}
	
	//최근에 contant pool 위치가 바뀜(2017년) 생각할 것
	public void stringConstantPool() {
		String a = "안녕하세요";
		String b = "안녕하세요";
		
		System.out.println(a==b); //주소 체크
		System.out.println(a.equals(b)); //값 체크

		// 이는 constant pool에 들어가지 않고 다른 객체로 생성되어
		// a와 c를 비교하면 다르다고 나온다.(a와 b를 비교하면 같다)
		String c = new String("안녕하세요");
		// new로 만들어진 객체를 constant pool로 이동시킨다. 
		//이때 비교 시 같다고 나온다. 
		String d = c.intern(); 
		
		
	}
}
