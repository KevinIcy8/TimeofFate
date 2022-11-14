public class TimeOfFate {
    private String classInLife;

    public TimeOfFate(String classInLife){
        this.classInLife = classInLife;
    }

    public TimeOfFate(){
        int random = (int)(Math.random()*3)+1;
        if(random == 1){
            classInLife = "Royalty";
        }
        else if(random == 1){
            classInLife = "Commoner";
        }
        else{
            classInLife = "Peasant";
        }
    }

    public String classAttribute(){
        if(classInLife == "Royalty"){
            return "You are royalty!";
        }
        else{
            return "you suck";
        }
    }
    int currentYear = 1880;
    public void rewindTime(int year) throws InterruptedException {
        int ms = 1000;
        for(int i = currentYear; i>=year; i--){
            System.out.println("Year: " + i);
            Thread.sleep(ms);
            if(ms>100){
                ms = ms - 100;
            }
        }

    }
}

