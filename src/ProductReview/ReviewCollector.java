package ProductReview;
import java.util.ArrayList;

public class ReviewCollector {
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    public ReviewCollector(){
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

    public void addReview(ProductReview prodReview){
        reviewList.add(prodReview);
        boolean hasProduct = false;

        for (String pname : productList){
            if (pname.equals(prodReview.getName())){
                hasProduct = true;
            }
        }
        
        if (!hasProduct){
            productList.add(prodReview.getName());
        }
    }

    public int getNumGoodReviews(String prodName){
        int count = 0;

        for(ProductReview review : reviewList){
            if(review.getName().equals(prodName)){
                if (review.getReview().indexOf("best") != -1){
                    count++;
                }
            }
            
        }
        return count;
    }
}