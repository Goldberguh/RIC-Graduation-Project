/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourscheduler;

/**
 *
 * @author Calmo
 */
public class Schedule 
{
    private int CourseID;
    private String Subject;
    private int CourseNum;
    private String RoomNum;
    private String Days;
    private String TimeStart;
    private String TimeEnd;
    
    
    public Schedule(int CourseID, String Subject, int CourseNum, String RoomNum ,String Days, String TimeStart, String TimeEnd) 
    {
        this.CourseID = CourseID;
        this.Subject = Subject;
        this.CourseNum = CourseNum;
        this.RoomNum = RoomNum;
        this.Days = Days;
        this.TimeStart = TimeStart;
        this.TimeEnd = TimeEnd;
        
    }
    
    public Schedule()
    {
        
    }
    public int getID()
    {
        return CourseID;
    }
    public String getDays()
    {
        return Days;
    }
    public String getTimeStart()
    {
        return TimeStart;
    }
    public String getTimeEnd()
    {
        return TimeEnd;
    }
    
    
    
    @Override
    public String toString()
    {
        String str = "Days :" + Days + " Time Start :" + TimeStart + " Time End :" + TimeEnd;
        return str;
    }
    
}
