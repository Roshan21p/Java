package Greedy;
import java.util.*;
public class maxMeetingsInOneRoom {
    private static class Meeting {
        int startTime;
        int finishTime;
        int meetingNumber;
        public String toString(){
            return startTime + " " + finishTime;
        }
//        Meeting(int startTime,int finishTime){
//            this.startTime= startTime;
//            this.finishTime=finishTime;
//        }
    }
    private static class MeetingComparator implements Comparator<Meeting>{
        public int compare(Meeting m1,Meeting m2){
            if(m1.finishTime > m2.finishTime) return 1;
            else if(m1.finishTime < m2.finishTime) return -1;
            else return 0;
        }
    }
    public static void main(String[] args) {
        List<Integer> start = List.of(1,3,0,5,8,5);
        List<Integer> end = List.of(2,4,6,7,9,9);
        List<Meeting> meetings = new ArrayList<>();
        for(int i=0;i< start.size();i++){
            Meeting meeting = new Meeting();
          //  meetings.add(new Meeting(start.get(i),end.get(i)));
            meeting.startTime = start.get(i);
            meeting.finishTime = end.get(i);
            meeting.meetingNumber = i+1;
            meetings.add(meeting);
        }
        meetings.sort(new MeetingComparator());
        System.out.println(meetings);
        List<Integer> result = new ArrayList<>();
        result.add(meetings.get(0).meetingNumber);
        Meeting prev = meetings.get(0);
        for(int i=1;i<meetings.size();i++){
            Meeting curr = meetings.get(i);
            if(prev.finishTime < curr.startTime){
                result.add(curr.meetingNumber);
                prev = curr;
            }
        }
        System.out.println(result);
    }
}
