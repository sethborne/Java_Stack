//class
class ProjectTest {
    public static void main(String[] args){
        // 00 - uses constructor Project(){}
        // instantiate, set name set description, get done by elevPitch method, log
        
        // Project projectSpecAll = new Project();
        // projectSpecAll.setName("Project Number 01");
        // // String getProj01Name = projectSpecAll.getName();
        // projectSpecAll.setDescription("The Greatest First Project Ever");
        // // String getProj01Description = projectSpecAll.getDescription();
        // String elevPitchProj01 = projectSpecAll.elevatorPitch();
        // System.out.println(elevPitchProj01);
        
        // Expected:
        // Project Number 01 : The Greatest First Project Ever
        
        // 01 - uses constructor Project(String name){}
        // instantiate project, pass String for name, setDescription with method, get done by elev pitch, log
        // Project projectOverName = new Project("Project Number 02");
        // projectOverName.setDescription("The Second Greatest Project Ever");
        // String elevPitchProj02 = projectOverName.elevatorPitch();
        // System.out.println(elevPitchProj02);
        
        // Expected:
        // Project Number 02 : The Second Greatest Project Ever
        
        // 02 - uses constructor Project(String name, String description);
        // instaniate project, pass name and description, get with elevPitch method, log
        Project projectOverAll = new Project("Project Number 03", "The Third Greatest Project Ever");
        String elevPitchProj03 = projectOverAll.elevatorPitch();
        System.out.println(elevPitchProj03);
        // Expected:
        // Project Number 03 : The Third Greatest Project Ever
    }
}