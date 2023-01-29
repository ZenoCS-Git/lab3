import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.

    //static variables for the server to keep track 
    String messages = ""; //one long string that track all the messages added using the url with /n between each entry 

    public String handleRequest(URI url) {

        //handles if url path has add-message?s=<some string> that adds strings to messages 

        // url.getPath() grabs the data in the url, specifyly the path exluding domain
        // note, the path is everything from / to ?, excluding the end
        if (url.getPath().equals("/add-message")) { //checks url for /add-message
            //creates an array that stores the info into two elements, the stuff before the = and after
            String[] parameters = url.getQuery().split("="); 

            //adds the string parameter to messages
            if (parameters[0].equals("s")) { //checks if before = is a s
                messages += parameters[1]; //adds the second element data to messages
                messages += "\n"; //adds spacing
                return messages;
            }
            return messages;
        }
            //default return messages
            return messages;
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
