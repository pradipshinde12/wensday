package entity;

public class Player
{
	private int pid;
	private int jn;
	private String pname;
	private  int runs;
	 private int wickets;
	 private String tname;
	 
	 
	public Player() {
		super();
	}


	public Player(int pid, int js, String pname, int runs, int wickets, String tname)
	{
		super();
		this.pid = pid;
		this.jn = js;
		this.pname = pname;
		this.runs = runs;
		this.wickets = wickets;
		this.tname = tname;
	}


	@Override
	public String toString() {
		return "Player [pid=" + pid + ", js=" + jn + ", pname=" + pname + ", runs=" + runs + ", wickets=" + wickets
				+ ", tname=" + tname + "]";
	}
	
	
	 
	
	 

}
