package jenkinspractice;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class JenkinsPracticeTest {

	@Test
	public void Test1Test() {
		System.out.println("Test 1Pass ");
	//change done
		String browser = System.getProperty("br");
		String url = System.getProperty("ur");
		System.out.println(browser);
		System.out.println(url);
		System.out.println("test case pass Successfull");
			
	}
}

