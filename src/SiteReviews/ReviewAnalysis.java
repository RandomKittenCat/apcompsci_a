package SiteReviews;
import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    public ReviewAnalysis(){
        /*not shown*/
    }

    public double getAverageRating(){
        double avg = 0.0;
        for (Review r : allReviews){
            avg+=r.getRating();
        }
        avg/= allReviews.length;
        return avg;
    }

    public ArrayList<String> collectComments(){
        ArrayList<String> commentLi = new ArrayList<>();

        for (Review r : allReviews){
            int index = r.getComment().length();
            String end = r.getComment().substring(index-1, index);
            if (end.equals(".") || end.equals("!")){
                commentLi.add(r.getRating() + "-" + r.getComment());
            }else{
                commentLi.add(r.getRating() + "-" + r.getComment() + ".");
            }
        }
        return commentLi;
    }
}
