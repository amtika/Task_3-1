public class Application {
	private String appName;
	private int appSize;
	
	public Application (String appName, int appSize) {
		this.appName = appName;
		this.appSize = appSize;
		
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppName() {
		return appName;
	}
	
	public void setAppSize() {
		this.appSize = appSize;
	}
	
	public int getAppSize() {
		return appSize;
	}
	
	public String toString() {
		return "Application Nama : "+appName+", with size : "+" Mb";
	}
	
	
}
