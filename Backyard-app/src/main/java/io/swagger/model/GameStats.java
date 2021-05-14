package io.swagger.model;

public class GameStats {

	static int GET, POST ,DELETE;
	static double all;

	
	public GameStats() {
		
	}

	public int getGET() {
		return GET;
	}
	
	public void setGET() {
		this.GET = this.GET + 1;
		this.all = this.all + 1;
	}
	
	public int getPOST() {
		return POST;
	}
	
	public void setPOST() {
		this.POST = this.POST + 1;
		this.all = this.all + 1;
	}
	
	public int getDELETE() {
		return DELETE;
	}
	
	public void setDELETE() {
		this.DELETE= this.DELETE + 1;
		this.all = this.all + 1;
	}
	
	public double getGET_PRC() {
		if(all == 0)
		{
			return 0;
		}
		return this.GET / all;
	}
	
	public double getPOST_PRC() {
		if(all == 0)
		{
			return 0;
		}
		return this.POST / all;
	}
	
	public double getDEL_PRC() {
		if(all == 0)
		{
			return 0;
		}
		return this.DELETE / all;
	}

}
