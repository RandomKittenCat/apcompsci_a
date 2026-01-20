package SchoolClub;
import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList = new ArrayList<MemberInfo>();

    public void addMembers(String[] names, int gradYear){
        for (String name : names){
            MemberInfo newm = new MemberInfo(name, gradYear, true);
            memberList.add(newm);
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year){
        ArrayList<MemberInfo> returnLi = new ArrayList<MemberInfo>();
        for (int i = 0; i <memberList.size(); i++){
            if(memberList.get(i).getGradYear()<=year){
                if(memberList.get(i).inGoodStanding()){
                    returnLi.add(memberList.remove(i));
                    i--;
                }else{
                    memberList.remove(i);
                    i--;
                }
            }
        }
        return returnLi;
    }
}