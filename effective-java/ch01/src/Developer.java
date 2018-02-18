abstract class Developer {
    private String name;
    public abstract void programming();

    public static Developer getDeveloper(String type){
        if(type == "web"){
            return new WebProgrammer();
        }
        else if(type == "apple"){
            return new AppleProgrammer();
        }
        else{
            return null;
        }
    }
}
