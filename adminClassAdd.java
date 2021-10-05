/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourscheduler;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author frylo
 */



public class adminClassAdd extends javax.swing.JFrame {

    int scheduleSize;
    /**
     * Creates new form adminClassAdd
     */
    public adminClassAdd() {
        initComponents();
    }
    public adminClassAdd(int ID) 
    {
        
        initComponents();
        uIDLabel.setText(String.valueOf(ID));
        //int tempID = Integer.parseInt(uIDLabel.getText());
        this.scheduleSize = getScheduleSize(ID);
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        uIDLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        searchBar.setText("Enter class ID or name...");
        searchBar.setToolTipText("");
        searchBar.setDragEnabled(true);
        searchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBarMouseClicked(evt);
            }
        });
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course_Num", "Subject", "Course Name", "Room", "Professor Name", "Days", "Start Time",
                "End Time", "Date Start", "Date End", "Credits"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jTable1.setFocusable(false);
    jTable1.setGridColor(new java.awt.Color(0, 0, 0));
    jTable1.setRowHeight(32);
    jTable1.setSelectionBackground(new java.awt.Color(102, 102, 255));
    jTable1.getTableHeader().setReorderingAllowed(false);
    jTable1.setShowGrid(true);
    jScrollPane2.setViewportView(jTable1);

    jButton2.setText("Add Selected Class");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    jPanel1.setBackground(new java.awt.Color(133, 1, 1));
    jPanel1.setForeground(new java.awt.Color(254, 234, 119));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(254, 234, 119));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Admin Class Add");

    jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jButton3.setText("Logout");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
        }
    });

    jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jButton4.setText("Return");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
        }
    });

    uIDLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    uIDLabel.setText("Id...");

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel2.setText("User ID:");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(uIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4)
                    .addGap(18, 18, 18)
                    .addComponent(jButton3)))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(26, 26, 26))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1)
                .addComponent(jButton2))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Search Button
        Connection conn = databaseQuery.getConnection();
        PreparedStatement psID = null;
        PreparedStatement psName = null;
        PreparedStatement psSubject = null;

        ResultSet rs;
        ResultSet rs2;
        ResultSet rs3;
        int courseID;
        int courseNum;
        String subject;
        String courseName;
        String roomNum;
        String profLName;
        String days;
        String timeStart;
        String timeEnd;
        String dateStart;
        String dateEnd;
        Double credits;

        int tempCount = 0;

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);

        try
        {
            int tryID = Integer.parseInt(searchBar.getText());
            psID = conn.prepareStatement("SELECT * FROM `course` WHERE `course`.`Course_Num` = ?");
            psID.setInt(1, tryID);

            rs = psID.executeQuery();

            while(rs.next())
            {
                courseID = rs.getInt("Course_ID");
                courseNum = rs.getInt("Course_Num");
                subject = rs.getString("Subject");
                courseName = rs.getString("Course_Name");
                roomNum = rs.getString("Room_Num");
                profLName = rs.getString("prof_LName");
                days = rs.getString("Days");
                timeStart = rs.getString("Time_Start");
                timeEnd = rs.getString("Time_End");
                dateStart = rs.getString("Date_Start");
                dateEnd = rs.getString("Date_End");
                credits = rs.getDouble("Credits");

                Object[] row = {courseID, courseNum, subject, courseName, roomNum, profLName, days, timeStart, timeEnd, dateStart, dateEnd, credits};

                model.addRow(row);

            }

        }
        catch (SQLException ex)
        {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException e)
        {

        }

        try
        {

            psName = conn.prepareStatement("SELECT * FROM `course` WHERE `course`.`Course_Name` LIKE ?;");

            psName.setString(1, "%" + searchBar.getText() + "%");

            rs3 = psName.executeQuery();

            while(rs3.next())
            {
                courseID = rs3.getInt("Course_ID");
                courseNum = rs3.getInt("Course_Num");
                subject = rs3.getString("Subject");
                courseName = rs3.getString("Course_Name");
                roomNum = rs3.getString("Room_Num");
                profLName = rs3.getString("prof_LName");
                days = rs3.getString("Days");
                timeStart = rs3.getString("Time_Start");
                timeEnd = rs3.getString("Time_End");
                dateStart = rs3.getString("Date_Start");
                dateEnd = rs3.getString("Date_End");
                credits = rs3.getDouble("Credits");

                Object[] row = {courseID, courseNum, subject, courseName, roomNum, profLName, days, timeStart, timeEnd, dateStart, dateEnd, credits};

                model.addRow(row);
                tempCount++;
            }

        }
        catch (SQLException ex)
        {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (tempCount == 0)
        {
            try
            {
                psSubject = conn.prepareStatement("SELECT * FROM `course` WHERE `course`.`Subject` LIKE ?;");

                psSubject.setString(1, "%" + searchBar.getText() + "%");

                rs2 = psSubject.executeQuery();

                while(rs2.next())
                {
                    courseID = rs2.getInt("Course_ID");
                    courseNum = rs2.getInt("Course_Num");
                    subject = rs2.getString("Subject");
                    courseName = rs2.getString("Course_Name");
                    roomNum = rs2.getString("Room_Num");
                    profLName = rs2.getString("prof_LName");
                    days = rs2.getString("Days");
                    timeStart = rs2.getString("Time_Start");
                    timeEnd = rs2.getString("Time_End");
                    dateStart = rs2.getString("Date_Start");
                    dateEnd = rs2.getString("Date_End");
                    credits = rs2.getDouble("Credits");

                    Object[] row = {courseID, courseNum, subject, courseName, roomNum, profLName, days, timeStart, timeEnd, dateStart, dateEnd, credits};

                    model.addRow(row);

                }

            }
            catch (SQLException ex)
            {
                Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    //Prints a Joption pane of users prereq classes
    
    //returns an schedule array of current courses for a student
    public Schedule[] ScheduleReturn(int ID)
    {
        Connection conn = databaseQuery.getConnection();
        Schedule[] studentCourses = new Schedule[scheduleSize];
        
        PreparedStatement psID = null;
        PreparedStatement psName = null;
        ResultSet rs;
        ResultSet rs2;
        
        int count = 0;
        int courseID;
        String subject;
        int courseNum;
        String roomNum;
        String days;
        String timeStart;
        String timeEnd;
        
         
        try
        {
            int studentID = ID;
            psID = conn.prepareStatement("SELECT `course`.`Course_ID`,`course`.`Subject`,`course`.`Course_Num`,`course`.`Room_Num`,`course`.`Days`,`course`.`Time_Start`, `course`.`Time_End` FROM `course` WHERE `course`.Course_ID in(SELECT `current_course`.`Course_ID` FROM `current_course` WHERE `current_course`.`Student_ID` = ?);");
            psID.setInt(1, studentID);
            
            rs = psID.executeQuery(); 
            
            while(rs.next())
            {
                courseID = rs.getInt("Course_ID"); 
                subject = rs.getString("Subject");
                courseNum = rs.getInt("Course_Num");
                roomNum = rs.getString("Room_Num");
                days = rs.getString("Days");
                timeStart = rs.getString("Time_Start");
                timeEnd = rs.getString("Time_End");
                
                studentCourses[count] = new Schedule(courseID, subject, courseNum, roomNum, days, timeStart, timeEnd); 
                count++;
            }

        }
        catch (SQLException ex)
        {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return studentCourses;
    }
    //returns a schdule object of the course that is wanted too be added
    public Schedule CourseReturn(int ID)
    {
        Connection conn = databaseQuery.getConnection();
        Schedule studentCourse = new Schedule();
        
        PreparedStatement psID = null;
        PreparedStatement psName = null;
        ResultSet rs;
        ResultSet rs2;
        
        int courseID;
        String subject;
        int courseNum;
        String roomNum;
        String days;
        String timeStart;
        String timeEnd;
        
         
        try
        {
            int CID = ID;
            psID = conn.prepareStatement("SELECT `course`.`Course_ID`,`course`.`Subject`,`course`.`Course_Num`,`course`.`Room_Num`,`course`.`Days`,`course`.`Time_Start`, `course`.`Time_End` FROM `course` WHERE `course`.Course_ID = ?;");
            psID.setInt(1, CID);
            
            rs = psID.executeQuery(); 
            
            while(rs.next())
            {
                courseID = rs.getInt("Course_ID"); 
                subject = rs.getString("Subject");
                courseNum = rs.getInt("Course_Num");
                roomNum = rs.getString("Room_Num");
                days = rs.getString("Days");
                timeStart = rs.getString("Time_Start");
                timeEnd = rs.getString("Time_End");
                
                studentCourse = new Schedule(courseID, subject, courseNum, roomNum, days, timeStart, timeEnd); 
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return studentCourse;
    }
    
    //Checks if user has schedule conflicts
    public boolean courseCheck(Schedule courses[], Schedule courseAdd)
    {
       boolean ret = true;
       
       if(timeConflicts(courses, courseAdd) == true)
       {
           
       }
       else
       {
           return false;
       }         
                
        return ret;
    }
    //Check for time conflicts when adding a course
    public boolean timeConflicts(Schedule courses[], Schedule courseAdd)
    {
        boolean ret  = true;
        int i = scheduleSize;
        
        System.out.println("Size" + i);
            for(int z = 0; z < i; z++)
            {   
                if(courses[z].getDays().equals("Async") || courseAdd.getDays().equals("Async"))
                {
                }
                else
                {   
                        Scanner scan = new Scanner(courses[z].getDays()).useDelimiter("-");
                        Scanner scan2 = new Scanner(courseAdd.getDays()).useDelimiter("-");
                        int tempCount =0;
                        String temp = scan.next();
                        String temp2 = scan2.next();
                        while(scan.hasNext() || scan2.hasNext() && tempCount != 0)
                        {
                           
                                System.out.println("here");
                                
                                if(scan.hasNext() && tempCount != 0)
                                {
                                    temp = scan.next();
                                }
                                if(scan2.hasNext() && tempCount != 0)
                                {
                                    temp2 = scan.next();
                                }
                                
                               
                                
                               
                                System.out.println(temp);
                                System.out.println(temp2);
                                if(temp2.equals(temp))
                                {
                                    System.out.println("here 2 ");
                                    Scanner addTime = new Scanner(courseAdd.getTimeStart()).useDelimiter(":");
                                     System.out.println(courseAdd.getTimeStart() + "new Time start");
                                    Scanner addTimeEnd = new Scanner(courseAdd.getTimeEnd()).useDelimiter(":");
                                     System.out.println(courseAdd.getTimeEnd()+ "new Time start end");
                                    Scanner compareTime = new Scanner(courses[z].getTimeStart()).useDelimiter(":");
                                     System.out.println(courses[z].getTimeStart());
                                    Scanner compareTimeEnd = new Scanner(courses[z].getTimeEnd()).useDelimiter(":");
                                     System.out.println(courses[z].getTimeEnd());

                                    int addTimeStartHour = Integer.parseInt(addTime.next());
                                    int addTimeStartMin = Integer.parseInt(addTime.next());

                                    int addTimeEndHour = Integer.parseInt(addTimeEnd.next());
                                    int addTimeEndMin = Integer.parseInt(addTimeEnd.next());


                                    int compareStartHour = Integer.parseInt(compareTime.next());
                                    int compareStartMin = Integer.parseInt(compareTime.next());

                                    int compareTimeEndHour = Integer.parseInt(compareTimeEnd.next());
                                    int compareTimeEndMin = Integer.parseInt(compareTimeEnd.next());
                                    System.out.println(addTimeStartHour);
                                    System.out.println(compareStartHour);


                                    if(addTimeStartHour < compareStartHour && addTimeEndHour < compareStartHour)
                                    {

                                    }
                                    else if(addTimeStartHour > compareStartHour && addTimeStartHour < compareTimeEndHour )
                                    {
                                        JOptionPane.showMessageDialog(null,"Scheduling error");
                                        return false;
                                    }
                                    else if(addTimeEndHour == compareTimeEndHour && addTimeEndMin == compareTimeEndMin)
                                    {
                                        JOptionPane.showMessageDialog(null,"Scheduling error");
                                        return false;
                                    }
                                    else if(addTimeStartHour == compareStartHour && compareStartMin == addTimeStartMin)
                                    {
                                        JOptionPane.showMessageDialog(null,"Scheduling error");
                                        return false;
                                    }
                                    else if(addTimeStartHour == compareTimeEndHour  && addTimeStartMin < compareTimeEndMin)
                                    {
                                        JOptionPane.showMessageDialog(null,"Scheduling error");
                                        return false;
                                    }
                                    else if(addTimeStartHour == compareStartHour)
                                    {
                                        JOptionPane.showMessageDialog(null,"Scheduling error");
                                        return false;
                                    }
                                    else if(addTimeStartHour == compareStartHour)
                                    {
                                        JOptionPane.showMessageDialog(null,"Scheduling error");
                                        return false;
                                    }
                                         
                                }
                                else
                                {

                                }
                                tempCount++;
                          
                        }
                }
            }      
        
        return ret;
    }
    
    
    
    private void searchBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBarMouseClicked
        // Mouse click in searchBar
        searchBar.setText("");
    }//GEN-LAST:event_searchBarMouseClicked

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // Search Bar Code

    }//GEN-LAST:event_searchBarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Add Selected Course
        Connection conn = databaseQuery.getConnection();

        int row = jTable1.getSelectedRow();
        int column = 0;
        int studentID = Integer.parseInt(uIDLabel.getText());
        if(row == -1)
        {
            JOptionPane.showMessageDialog(null, "Select a class first");
        }
        else
        {
            int response = JOptionPane.showConfirmDialog(this, "Are you sure you wish to add this class?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (response == JOptionPane.YES_OPTION)
            {
                int addID = (int) jTable1.getModel().getValueAt(row, column);

                if(scheduleSize < 5)
                {
                    System.out.println("You made it past the jOption!");
                    if(courseCheck(ScheduleReturn(studentID),CourseReturn(addID)) == true)
                    {
                        System.out.println("You made it past the coursecheck if statement!");
                        Schedule[] studentCourses = new Schedule[scheduleSize];
                        studentCourses = ScheduleReturn(studentID);
                        
                        int stuID = Integer.parseInt(uIDLabel.getText());

                        PreparedStatement psAdd = null;
                        ResultSet rs;

                        try
                        {
                            psAdd = conn.prepareStatement("INSERT INTO `current_course` (`Cur_Course_ID`, `Student_ID`, `Course_ID`, `GPA`, `Term`) VALUES (NULL, ?, ?, NULL, '') ");

                            psAdd.setInt(1, stuID);
                            psAdd.setInt(2, addID);
                            psAdd.executeUpdate();

                            scheduleSize++;

                            JOptionPane.showMessageDialog(null,"Course added Sucessfully");
                        }
                        catch (SQLException ex)
                        {
                            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Cannot add course");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Schedule at max capicity");
                }

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        LoginFrame log = new LoginFrame();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Return Button
        int ID = Integer.parseInt(uIDLabel.getText());
        adminStuSched sched = new adminStuSched(ID);
        sched.setVisible(true);
        sched.pack();
        sched.setLocationRelativeTo(null);
        sched.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private int getScheduleSize(int ID)
{
    int schedSize = 0;
    Connection conn = databaseQuery.getConnection();
    PreparedStatement psSize = null;
    ResultSet rs = null;
    try
    {
        psSize = conn.prepareStatement("SELECT `current_course`.`Course_ID` FROM `current_course` WHERE `current_course`.`Student_ID` = ?;");
        psSize.setInt(1, ID);
        
        rs = psSize.executeQuery(); 
        
        while(rs.next())
        {
            schedSize++;
        }
    }
    catch (SQLException ex)
    {
        Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return schedSize;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminClassAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminClassAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminClassAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminClassAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminClassAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField searchBar;
    private javax.swing.JLabel uIDLabel;
    // End of variables declaration//GEN-END:variables
}
