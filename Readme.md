# Java String
String 관련 기본 문법


## String Api
스트링 함수
1. __length__
</br>- 문자열의 길이를 리턴
``` java
String context = "String Test";
System.out.println(context.length());
//결과값 : 11
```

2. __indexOf__
</br>- 문자열의 위치를 리턴
``` java
String context = "String Test";
System.out.println(context.indexOf("Te"));
//결과값 : 7
```

3. __split-1__
</br>- 특정 구분자로 문자열 분해
```java
String context = "String/Test";
String temp[] = context.split("/"); //  String temp[] = {"String", "Test"};
for(String item : temp) {
  System.out.println(item);
}
//결과값 : String
//        Test
```

4. __split-2__
</br>- 빈 문자열로 분해시 글자 하나하나 단위로 분해
```java
String context = "String/Test";
String temp2[] = context.split("");
for(String item : temp) {
  System.out.print(item+" ");
}
//결과값 : S t r i n g / T e s t
```

5. __substring__
</br> 입력간격안에 있는 문자열을 분해
```java
String context = "String/Test";
System.out.println(context.substring(2,7));
//결과값 : ring/
```

6. __replace__
</br> 문자열 바꾸기
```java
String context = "String/Test";
System.out.println(context.replace("Te", "Px"));
//결과값 : String/Pxst
```

7. __startsWith__
</br> 특정 문자열로 시작되는지 검사
```java
String context = "String/Test";
System.out.println(context.startsWith("Str"));
//결과값 : true
```
※ startsWith같은 경우 아래와 같이 이용됨
```java
if(!address.startWith("http:")){
		address="http:"+address
}
```

8. __Buffer vs Builder__
</br> buffer / builder로 처리하면 메모리 낭비 방지 가능
</br> ※ *jdk 1.5 버전 이상부터는 일반적인 스트링 연산을 StringBuilder 로 컴파일러가 자동변환 해준다.*
 * Buffer
 </br> 속도가 빠름
 </br> 비동기에서 안정성이 보장
 * Builder
 </br> 속도 가장 빠름
 </br> 비동기에서 안정성 보장되지 않음
 </br> 다중 thread 환경에서는 StringBuilder로 변수를 사용하지 않음

 ```java
 public void builderVsBuffer() {

   String result = "안" + "녕하" + "세요"+"반갑습니다";


   // buffer
   StringBuffer buffer = new StringBuffer();
   buffer.append("안");
   //append 두번 연속 사용 가능
   buffer.append("녕하").append("세요");
   buffer.append("반갑습니다");
   //String으로 변환하여 출력 가능
   System.out.println(buffer.toString());

   // builder
   StringBuilder builder = new StringBuilder();
   builder.append("안");
   builder.append("녕하").append("세요");
   builder.append("반갑습니다");
   System.out.println(builder.toString());
 }
 ```

## 참고 문제
스트링을 활용한 예제
1. [숫자 counting 문제](https://github.com/Lee-KyungSeok/CountNumber)
2. [Anagram 알고리즘](https://github.com/Lee-KyungSeok/AnagramAlgorithm)
