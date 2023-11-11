package collegeapplication.course;

public class course {

	private String coursecode;
	private int semoryear;
	private boolean isdeclared;
	private String coursename;
	public void setcourseName(String coursename)
	{
		this.coursename=coursename;
	}
	public void setcourseCode(String coursecode)
	{
		this.coursecode=coursecode;
	}
	public void setSemorYear(int semoryear)
	{
		this.semoryear=semoryear;
	}
	public void setIsDeclared(boolean isdeclared)
	{
		this.isdeclared=isdeclared;
	}
	public String getcourseName()
	{
		return coursename!=null?coursename:new courseData().getcoursename(coursecode);
	}
	public String getcourseCode()
	{
		return coursecode;
	}
	public int getSemorYear()
	{
		return semoryear;
	}
	public boolean getIsDeclared()
	{
		return isdeclared;
	}
}
