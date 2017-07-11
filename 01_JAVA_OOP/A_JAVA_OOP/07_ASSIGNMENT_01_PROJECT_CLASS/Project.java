class Project {
    private String name;
    private String description;
    //constructors
    
    // 01 - empty project - name and description later
    public Project(){
        
    }
    
    // 02 - project with just the name
    // 02A - this alternative
    public Project(String name){
        this.name = name;
    }
    // // 02B - changed Param alternative
    // public Project(String strName){
    //     name = strName;
    // }
    
    // 03 - project with both overloads
    // 03A - this alternative
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    // 03B - changed Param alternative
    // public Project(String strName, String strDescription){
    //     name = strName;
    //     description = strDescription;
    // }
    
    // Create Instance Method called elevatorPitch()
    public String elevatorPitch(){
        String elevPitch = name + " : " + description;
        return elevPitch;
    }
    //getter - name
    public String getName(){
        return name;
    }
    //setter - name 
    public void setName(String name){
        this.name = name;
    }
    //getter - description
    public String getDescription(){
        return description;
    }
    //setter - description
    public void setDescription(String description){
        this.description = description;
    }
}