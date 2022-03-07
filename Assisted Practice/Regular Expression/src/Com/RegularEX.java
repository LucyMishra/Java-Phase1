package Com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEX 
{
		  public static void main(String[] args) {
		    Pattern pattern = Pattern.compile("Simplilearn", Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher("Visit Simplilearn!");
		    boolean matchFound = matcher.find();
		    if(matchFound) {
		      System.out.println("Match found");
		    } else {
		      System.out.println("Match not found");
		    }
		  }
		}


