package ObjectOrientedProgramming;

public interface Logger {
	
	//define the method that you want to have but we are not going to define the bodies and what the actually do.
	
	//take the following abstract methods, implement them and we will have different levels of logging
	public void info(String info);
	public void warning(String warning);
	public void error(String error);
	public void fatal(String fatal);
	public void close();
}
