
/**
 * 
 * @author Kyung
 * ��Ʈ�� Api ����
 * 
 */
public class StringApi {
	
	public void text() {
		
		String a = "String/Test";
		
		// ����
		System.out.println(a.length());
		
		// ��ġ�˻�
		System.out.println(a.indexOf("Test"));
		
		// Ư�� �����ڷ� ���ڿ� ���� (���ڿ� �迭�� ����)
		String temp[] = a.split("/");
		// ��� :  String temp[] = {"String", "Test"};
		for(String item : temp) {
			System.out.println(item);
		}
		
		// �� ���ڿ��� �ڸ��� ���� �ϳ� ������ �ɰ��ش�.
		String temp2[] = a.split("");
		
		// ���ڿ� �ڸ���
		System.out.println(a.substring(2,7));
		
		// ���ڿ� �ٲٱ�
		System.out.println(a.replace("Te", "Px"));
		
		//  Ư�� ���ڿ��� ���۵Ǵ��� �˻�, ���۵Ǹ� true�� ��ȯ
		System.out.println(a.startsWith("Str"));
		/*
		 * ex> if(!address.startWith("http:")){
		 * 			address="http:"+address
		 * }
		 * �� ���� ���
		 */
	}
	
	public void builderVsBuffer() {
		// jdk 1.5 ���� �̻���ʹ� �Ϲ����� ��Ʈ�� ������ StringBuilder �� �����Ϸ��� �ڵ���ȯ ���ش�.
		String result = "��" + "����" + "����"+"�ݰ����ϴ�";
		
		//buffer / builder�� ó���ϸ� �޸� ���� ���� ����
		
		// �ӵ��� ����
		// �񵿱⿡�� �������� ����ȴ�.
		// ���� ���߽� ���
		StringBuffer buffer = new StringBuffer();
		buffer.append("��");
		buffer.append("����").append("����");
		buffer.append("�ݰ����ϴ�");
		System.out.println(buffer.toString());
		
		// �ӵ� ���� ����
		// �񵿱⿡�� ������ ������� �ʴ´�.
		// ���� thread ȯ�濡���� StringBuilder�� ������ ������� �ʴ´�.
		StringBuilder builder = new StringBuilder();
		builder.append("��");
		builder.append("����").append("����");
		builder.append("�ݰ����ϴ�");
		System.out.println(builder.toString());
	}
	
	//�ֱٿ� contant pool ��ġ�� �ٲ�(2017��) ������ ��
	public void stringConstantPool() {
		String a = "�ȳ��ϼ���";
		String b = "�ȳ��ϼ���";
		
		System.out.println(a==b); //�ּ� üũ
		System.out.println(a.equals(b)); //�� üũ

		// �̴� constant pool�� ���� �ʰ� �ٸ� ��ü�� �����Ǿ�
		// a�� c�� ���ϸ� �ٸ��ٰ� ���´�.(a�� b�� ���ϸ� ����)
		String c = new String("�ȳ��ϼ���");
		// new�� ������� ��ü�� constant pool�� �̵���Ų��. 
		//�̶� �� �� ���ٰ� ���´�. 
		String d = c.intern(); 
		
		
	}
}
