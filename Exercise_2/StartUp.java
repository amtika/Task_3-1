public class StartUp {
	private Member[] member = new Member[50];
	private Project[] projectList = new Project[50];
	private int nTeam=0;
	private int nProject =0;
	   
    public void addMember(Member m) {
        member[nTeam] = m;
        nTeam++;
    }    
    
    public Member getMember(int id) {
        return member[id];
    }
    
    public void createNewProject(String projectName) {
        Project p = new Project(projectName);
        projectList[nProject] = p;
        nProject++;
    }
    
    public Project getProject(int id) {
        return projectList[id];
    }
    
    public void setProjectMember(Project p, Member m) {
        int x = m.getProjectWorked();      
        p.addMember(m);        
        m.setProjectWorked(x);
    }
    
    public void releaseProject(Project p) {
        p.releaseApp();
    }
    
    public int getNumReleasedProject() {
        return nProject;
    }
}

