package zttc.itat.maven;
import org.junit.*;//把junit 的包导进来
import static org.junit.Assert.*; //静态的方式导进来 

public class TestHelloMaven
{
	@Test
	public void testSayHello(){
		HelloMaven hm = new HelloMaven();
		String str = hm.sayHello("maven");
		assertEquals(str,"hello: maven");
	}
}