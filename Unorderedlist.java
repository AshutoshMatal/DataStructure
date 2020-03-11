import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unorderedlist {
    public static void main(String arg[]) throws Exception {
        LinkedList list = new LinkedList();
        try{
        	  // Open the file that is the first 
        	  // command line parameter
        	String strLine1=" ";
        	  FileInputStream fstream = new FileInputStream("Test.txt");
        	  // Get the object of DataInputStream
        	  DataInputStream in = new DataInputStream(fstream);
        	  BufferedReader br = new BufferedReader(new InputStreamReader(in));
        	  String strLine;
        	  //Read File Line By Line
        	  while ((strLine = br.readLine()) != null)  
        	  {
        		  strLine1=strLine1+strLine;
        		  String words[] = strLine1.split(" ");
        	        for (int i = 0; i < words.length; i++)
        	         list.insertAtStart(words[i]);
        	        list.displayFromStart();
        	  // Print the content on the console
        	 // System.out.println (strLine);
        	        break;
        	  }
        	  //Close the input stream
        	  in.close();
        	    }catch (Exception e){
        	    	e.printStackTrace();//Catch exception if any
        	  //System.err.println("Error: " + e.getMessage());
        	  }
        	  }
        	

    
}

