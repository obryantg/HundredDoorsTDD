package doors;

public class CheckDoors {
	public static String checkDoor(int walkthru, int doorNum)
	{
		String str = "closed";
		int count = 0;
		//initialized a counter for each loop or walkthru of the hall of doors
		while (count <= walkthru)
		{
			//condensed all my previous if statement to one
			if (count > 0 && doorNum%count==0)
			{
				//ternary statement looks cleaner to me...
				str = str.equals("open") ? "closed" : "open";
			}
		count++;
		}
		return str;
}
}