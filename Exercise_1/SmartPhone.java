public class SmartPhone {
	private Application[] appList=new Application[10];
	private int totalApp;
	private int memory;
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public void addApplication(AppStore appStore, int appId) {
		Application app = appStore.getApp(appId);
        if (app.getAppSize() < getRemainingSize()) {
            appList[totalApp]=app;
            totalApp++;
        }
    }

    public Application getApp(int id) {
        return appList[id];
    }

    public int getTotalApp() {
        return totalApp;
    }

    public int getRemainingSize() {
        int m=memory;
        int i=0;
        while (appList[i]!=null) {
            m=m-appList[i].getAppSize();
            i++;
        }
        return m;
    }

    @Override
    public String toString() {
        return "memory size " + memory + " MB, " + getTotalApp() + " application installed, remaining memory size: " + getRemainingSize() + " MB";
    }
}
