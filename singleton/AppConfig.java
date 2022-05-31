package singleton;

public class AppConfig {
	
	private AppConfig() {
		
	}
	
//	private static AppConfig obj = new AppConfig();
	
	private static AppConfig obj = null;
	
	public static AppConfig getInstace() {
		if(obj == null) {
			obj = new AppConfig();
		}
		return obj;
	}

}
