package zttc.itat.maven;
import org.junit.*;//��junit �İ�������
import static org.junit.Assert.*; //��̬�ķ�ʽ������ 

public class TestHelloMaven
{
	@Test
	public void testSayHello(){
		HelloMaven hm = new HelloMaven();
		String str = hm.sayHello("maven");
		assertEquals(str,"hello: maven");
	}
}