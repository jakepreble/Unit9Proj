import java.util.ArrayList;

class Track{
    private String season;
    private int practicePerWeek;
    public Track(){
        this.season = "Summer";
        this.practicePerWeek = 0;
    }
    public Track(String inSeason, int inPractice){
        this.season = inSeason;
        this.practicePerWeek = inPractice;
    }
    public String toString(){
        return "Track is a " + season + " sport. It practices " + practicePerWeek + " times a week.";
    }
    public String getSeason(){
        return season;
    }
    public void setSeason(String inSeason){
        this.season = inSeason;
    }
    public int getPractices(){
        return practicePerWeek;
    }
    public void setPractice(int inPractice){
        this.practicePerWeek = inPractice;
    }
    public boolean equals(Object obj)
    {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Track track = (Track) obj;
        if (practicePerWeek != track.practicePerWeek) {
            return false;
        }
        if (season == null) {
            return track.season == null;
        } else {
            return season.equals(track.season);
        }

    }
    public void practiceCancelled(){
        this.practicePerWeek--;
    }

    public void saturdayPractice(){
        this.practicePerWeek++;
    }
  
    
}
class LongJump extends Track{
    private int board;
    public LongJump(){
        super();
        this.board = 8;
    }
    public LongJump(String inSeason, int inPractice, int inBoard){
        super(inSeason, inPractice);
        this.board = inBoard;
    }
    public int getBoard(){
        return board;
    }
    public void setBoard(int inBoard){
        this.board = inBoard;
    }
    @Override
    public String toString() {
        return super.toString() + " Long Jump is starting at the " + board + " foot board. ";
    }

    public void saturdayPractice(){
        System.out.println("Cannot attend practice on saturday. Leg is injured from Long Jump.");
    }
    public void skilledLongJumper(){
        board = 12;
    }
    public void tripleJump(){
        System.out.println("Long Jump is better");
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        LongJump lj = (LongJump) obj;
        if (board != lj.board) {
            return false;
        } else {
            return true;
        }
        
    }


}
class LongJumper extends LongJump{
    private double distance;
    public LongJumper(){
        super();
        this.distance = 0.0;
    }
    public LongJumper(String inSeason, int inPractice, int inBoard, double inDistance){
        super(inSeason, inPractice, inBoard);
        this.distance = inDistance;
    }
    @Override
    public String toString() {
        return super.toString() + " Measured distance is " + distance + " feet.";
    }
    public double getDistance(){
        return distance;
    }
    public void setDistance(double inDistance){
        this.distance = inDistance;
    }
}
class Main{
    public static void main(String[] args) {
        ArrayList<Track> listOfSports = new ArrayList<Track>();
        Track s1 = new Track();
        Track s2 = new LongJump();
        Track s3 = new LongJumper();
        Track s4 = s3;
        listOfSports.add(s1);
        listOfSports.add(s2);
        listOfSports.add(s3);
        listOfSports.add(s4);

    }
}