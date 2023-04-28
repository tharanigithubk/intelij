public class Battingavg {
    public static void main(String[] args) {
        int TotalMatches=100,TotalRuns=2000,Innings=70,NotOut=2;
        double avg;
        avg=TotalRuns/(Innings-NotOut);
        System.out.println("Batting Average is="+avg);
    }
}
