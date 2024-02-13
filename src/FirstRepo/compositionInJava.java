package FirstRepo;

import java.util.List;

class Home{
	
	public String roomName;
	public int roomNo;
	
	Home(String name, int num){
		
		this.roomName = name;
		this.roomNo = num;
	}
}
 
 
 class House{
	 public List<Home> room;
	 
	 House(List<Home> room){
		 
		 this.room = room;
	 }
	 
	 
	 public List<Home> getTotalRooms(){
		return room;
		 
	 }
 }
public class compositionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String s1= "STR";
		 * 
		 * StringBuffer s2 = new StringBuffer(); s2.append(s1);
		 * 
		 * System.out.println(s2);
		 * 
		 * s2.toString(); System.out.println(s2);
		 */
		
	}

}
