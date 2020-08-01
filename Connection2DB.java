
package schoolsystem;

import java.sql.*;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class Connection2DB {

    public Connection newConnection(){
        
        Connection Con = null;
        Statement st;
        ResultSet rs;
        String path = "SchoolDatabase.mdb";
        String url = "jdbc:ucanaccess://" + path;
        try{
            Con = DriverManager.getConnection(url);
            st =Con.createStatement();
            String sql = "SELECT * FROM tblLearner";
            rs  = st.executeQuery(sql);
            while(rs.next()){
                String sName,sSurname,sDOB,pContact;
                Integer sGrade;
                sName = rs.getString("LearnerName");
                sSurname = rs.getString("LearnerSurname");
                sGrade = rs.getInt("LearnerGrade");
                sDOB = rs.getString("LearnerDOB");
                pContact = rs.getString("ParentContact");
                
            }
        }catch(Exception e){
            System.out.print(e);
        }
        return Con;
    
    } 
   public void ShowLeaner(JTable table){
       try {
           
           Connection con = newConnection();
           Statement st = con.createStatement();
           String qry = "SELECT * FROM tblLearner";
           ResultSet rs = st.executeQuery(qry);
           table.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception ex){
           System.out.println("ex");
       }
       
   }
   
   public void ShowParent(JTable table){
       try {
           
           Connection con = newConnection();
           Statement st = con.createStatement();
           String qry = "SELECT * FROM tblParent";
           ResultSet rs = st.executeQuery(qry);
           table.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception ex){
           System.out.println("ex");
       }
       
   }
   
    public void Show(JTable table){
       try {
           
           Connection con = newConnection();
           Statement st = con.createStatement();
           String qry = "SELECT * FROM tblAccepted";
           ResultSet rs = st.executeQuery(qry);
           table.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception ex){
           System.out.println("ex");
       }
       
   }
   
      public void ShowTeacher(JTable table){
       try {
           
           Connection con = newConnection();
           Statement st = con.createStatement();
           String qry = "SELECT * FROM tblTeacher";
           ResultSet rs = st.executeQuery(qry);
           table.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception ex){
           System.out.println("ex");
       }
       
   }
   
  
   }

