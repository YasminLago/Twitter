package twitterjavagt;
import java.util.List;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
/**
 *
 * @author ylagorebollar
 */
public class TwitterJavaGT {

    public static void main(String[] args) throws TwitterException {
       Twitter miTwitter = new TwitterFactory().getInstance();
    
       /**
        * Via twitter4j.properties
        */
   
        
        /**
         * Acceso-->Codigo de ejemplos-->Status
         */
        Status miStatus = miTwitter.updateStatus("Prueba status");
        System.out.println(miStatus.getText());
        
        /**
         * Acceso-->Codigo de ejemplos-->Timeline
         */
        List <Status> statuses = miTwitter.getHomeTimeline();
        System.out.println("Ejemplo timeline.");
        for (Status status : statuses){
            System.out.println(status.getUser().getName() + ":" + status.getText());
        }
        
        /**
         * Acceso-->Codigo de ejemplos-->Query
         */
        Query query = new Query ("Todos");
        QueryResult result = miTwitter.search(query);
        for(Status status : result.getTweets()){
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
        }
    }
  
}
