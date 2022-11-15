public class TimeOfFate {
    private String classInLife;
    private int wealth;
    private int happiness;
    public TimeOfFate(String classInLife){
        this.classInLife = classInLife;
    }

    public TimeOfFate(int randomClass){
        int random = (int)(Math.random()*3)+1;
        if(random == 1){
            classInLife = "Royalty";
        }
        else if(random == 2){
            classInLife = "Commoner";
        }
        else{
            classInLife = "Peasant";
        }
    }

    public void classAttribute(){
        if(classInLife == "Royalty"){
            wealth = 1000000;
            happiness = 100;
        }
        else if (classInLife == "Commoner"){
            wealth = 1000;
            happiness = 80;
        }
        else{
            wealth = 10;
            happiness = 60;
        }
    }

    public String getCurrentAttribute(){
        return "Class: " + classInLife + "\nHappiness: " + happiness + "\nWealth: " + wealth;
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

