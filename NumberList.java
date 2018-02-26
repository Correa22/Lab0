import java.util.Scanner;
import java.util.ArrayList;
public class NumberList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> List = new ArrayList<Integer>();

		while (true) {

			System.out.println("Enter command");  
			String command =sc.nextLine();  
			char c = command.charAt(0);
			String nn = ""+c;
			
			if(nn.equals("1")) {
				String number = command.substring(2, command.length());
				List.add(Integer.getInteger(number));
			}
			else if(nn.equals("2")) {
				String number = command.substring(2, command.length());
				for(Integer i: List) {
					if(i == Integer.getInteger(number)) {
						List.remove(i);
					}
				}
			}
			else if(nn.equals("3")) {
				System.out.println(List.size());
			}

		}
	}
}
