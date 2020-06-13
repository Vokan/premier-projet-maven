package dev;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
       // System.out.println( "Hello World!" );
    
	// On utilise par default font  standard.flf qui provient de maven artifact.

     String asciiArt = FigletFont.convertOneLine("hello");
     System.out.println(asciiArt1);
}
}
