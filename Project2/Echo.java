package project2;

import java.util.LinkedList;

public class Echo extends ActionBase {

	@Override
	public void action(LinkedList<String> list) {

		if (list.peekFirst().startsWith("-")) {

			String parm = list.removeFirst();
			iter = list.iterator();

			switch (parm.charAt(1)) {
			case 'u':
				while (iter.hasNext()) {
					System.out.print((iter.next().toUpperCase() + " "));
				}
				System.out.println();
				break;
			case 'l':
				while (iter.hasNext()) {
					System.out.print((iter.next().toLowerCase() + " "));
				}
				System.out.println();
				break;
			case 'm':
				System.out.println(this.manual());
				break;
			default:
				System.out.println("Unknown parameter...see man page '-m'");
				break;
			}

		} else {
			iter = list.iterator();
			while (iter.hasNext()) {
				System.out.print(iter.next()+ " ");
			}
			System.out.println();
		}
	}

	@Override
	public String manual() {
		return "This command prints the typed text following the keyword echo, or cat.\n" +
				"Parameters\n-u -- prints string in all uppercase\n-l -- prints " +
				"string in all lowercase\n -- wc -l filename will count the number of" +
				"in a file. Do not forget to type the address of the file name!";
	}
}
