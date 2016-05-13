package doors;

public class LookAtDoors {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 100)
		{
		System.out.println(CheckDoors.checkDoor(100, i));
		i++;
		}
	}

}
