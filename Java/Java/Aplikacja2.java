import java.io.*;

public class Aplikacja2 
{
    public static void main(String[] args) throws IOException
    {
        String tekst = 
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,\r\n" +
        "when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into\r\n" +
        "electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,\r\n" +
        "and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\r\n";

        BufferedWriter pisarz = null;
        try
        {
            pisarz = new BufferedWriter(new FileWriter("lorem.txt"));
            pisarz.write(tekst);
        }
        catch(IOException ex)
        {
            System.err.format("Błąd WE/WY: %s%n", ex);
        }
        finally
        {
            if (pisarz != null)
            {
                pisarz.close();
            }
        }
    }    
}
