package project2;
import java.util.LinkedList;
import java.io.*;


public class Wc extends ActionBase {
	
	int totalLines = 0;

	@Override
	public void action(LinkedList<String> list) {
		String parm = list.removeFirst();
				
		//System.out.println("In Cat.java.");
		String filename = list.removeFirst();
		iter = list.iterator();
		
		// opens and read the file the file
		FileReader fr = null;
		try {
			fr = new FileReader( filename );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// reads from the file reader
		BufferedReader br = new BufferedReader( fr );
		try {
			do
			{
				// read one line and stores it in the string
				String str = "";
				try {
					str = br.readLine();
					
					// counts the total lines in the file
					totalLines++;
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// prints out the line that was read in
				switch (parm.charAt(1))
				{
					case 'l':
					{
						str = str.toLowerCase();
						break;
					}
					case 'm':
					{
						System.out.println(this.manual());
						break;
					}
					default:
					{
						System.out.println("Unknown parameter...see man page '-m'");
						break;
					}
				}
				// print the total lines
				System.out.println( totalLines );				
			}
			while( br.read()!=-1);
		}
			catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	@Override
	public String manual() {
		return "This command prints the typed text following the keyword echo, or cat.\n" +
				"Parameters\n-u -- prints string in all uppercase\n-l -- prints " +
				"string in all lowercase\n -- wc -l filename will count the number of" +
				"in a file. Do not forget to type the address of the file name!";
	}
} // end of public class Cat extends ActionBase
