package framework.testng.Listeners;

import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

public class Test_Reporter implements IReporter
{

	@Override  
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		
		System.out.println("Final cutomization report ");
	}

}
