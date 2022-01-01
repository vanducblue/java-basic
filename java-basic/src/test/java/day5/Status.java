package day5;

public class Status {
    String statuses;

    public String getStt() {
        return statuses;
    }

    public void setStt(String stt) {
        this.statuses = stt;
    }

    enum statustestcase{
        Passed, Failed, Pending, New, Blocked, Assigned, Incomplete, Done
        }
    void printstt() {
        for(statustestcase s : statustestcase.values() ){
            System.out.println(s);
        }
    }


}
