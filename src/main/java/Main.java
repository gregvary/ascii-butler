import static spark.Spark.post;
import static spark.SparkBase.port;
import static spark.SparkBase.staticFileLocation;

public class Main {

  public static void main(String[] args) {

    port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");

    post("/", (req, res) -> "{ \"color\": \"red\", "
    		+ "\"message\": \"¯\\_(ツ)_/¯\", " 
    		+ "\"notify\": true, "
    		+ "\"message_format\": \"html\"}");
    //\u00AF\\_(\u30C4)_/\u00AF\
  }

}
