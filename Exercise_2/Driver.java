public class Drive2 {

    public static void main(String[] args) {
        StartUp stp = new StartUp();
        Member m = new Member("Atika");
        stp.addMember(m);
        m.setSpecialization("Programmer");
        Member m1 = new Member("Renes");
        stp.addMember(m1);
        Member m2 = new Member("Nanon");
        stp.addMember(m2);
        Member m3 = new Member("Yuri");
        stp.addMember(m3);
        Member m4 = new Member("Akbar");
        stp.addMember(m4);
        stp.createNewProject("project1");
        stp.createNewProject("project2");
        Project p = stp.getProject(0);
        Member m5 = stp.getMember(0);
        Member m6 = stp.getMember(1);
        Member m7 = stp.getMember(3);
        stp.setProjectMember(p, m5);
        stp.setProjectMember(p, m6);
        stp.setProjectMember(p, m7);
        
        Project p2 = stp.getProject(1);
        Member mp1 = stp.getMember(1);
        Member mp2 = stp.getMember(2);
        Member mp3 = stp.getMember(3);
        Member mp4 = stp.getMember(4);
        stp.setProjectMember(p2, mp1);
        stp.setProjectMember(p2, mp2);
        stp.setProjectMember(p2, mp3);
        stp.setProjectMember(p2, mp4);
        
        stp.releaseProject( stp.getProject( 1) ); 
        System.out.println( stp.getMember( 0 ).toString() ); 
        System.out.println( stp.getProject( 0 ).toString() ); 
    }
}

