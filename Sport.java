import java.util.ArrayList;

class Sport{
    private String season;
    private boolean school;
    public Sport(){
        season = "Summer";
        school = false;
    }
    public Sport(String inSeason, boolean inSchool){
        season = inSeason;
        school = inSchool;
    }
    public String toString(){
        return "It is a " + season + " sport. School sport: " + school;
    }
    
}
class Track extends Sport{
    private int practicePerWeek;
    public Track(){
        super();
        practicePerWeek = 0;
    }
    public Track(String inSeason, boolean inSchool, int inPracticePerWeek){
        super(inSeason, inSchool);
        practicePerWeek = inPracticePerWeek;
    }
    @Override
    public String toString() {
        return "Track practices " + practicePerWeek + " times a week. " + super.toString();
    }

}
class LongJump extends Track{
    private double distance;
    public LongJump(){
        super();
        distance = 0.0;
    }
    public LongJump(String inSeason, boolean inSchool, int inPracticePerWeek, double inDistance){
        super(inSeason, inSchool, inPracticePerWeek);
        distance = inDistance;
    }
    @Override
    public String toString() {
        return super.toString() + "Long jump distance is " + distance;
    }

}
class Main{
    public static void main(String[] args) {
        ArrayList<Sport> listOfSports = new ArrayList<Sport>();
        Sport s1 = new Sport();
        Sport s2 = new Track();
        Sport s3 = new LongJump();
        Sport s4 = s3;
        listOfSports.add(s1);
        listOfSports.add(s2);
        listOfSports.add(s3);
        listOfSports.add(s4);

    }
}