class Sample  
{
	private String gname;
	private int gage;
	private int groll;
		Sample(String gname,int gage,int groll){
			super();
			this.gname = gname;
			this.gage = gage;
			this.groll = groll;
		}
		Sample(){
			super();
		}
		Sample(String gname){
			super();
			this.gname = gname;
		}

	public void setName(String gname){
		 this.gname = gname;
	}
	public void setAge(int gage){
		this.gage = gage;
	}
	public void setRoll(int groll){
		this.groll = groll;
	
	}
	public String toString(){
		return gname+" "+gage+" "+groll;
	}
}
	class Geek{
		public static void main(String[]args){
			Sample s1 = new Sample("sandhya",32,23);
			System.out.println(s1);
			Sample s2 = new Sample();
			System.out.println(s2);
			Sample s3 = new Sample("Sandhya");
			System.out.println(s3);
		}
	}
			