
package schoolsystem;

import java.sql.*;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class Connection2DB {

    public Connection newConnection() throws SQLException, ClassNotFoundException{
        
        Connection Con = null;
        Statement st;
        ResultSet rs;
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "zaynab", "09031992");
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "zaynab", "09031992");
            st =Con.createStatement();
            String sql = "SELECT * FROM learners";
            rs  = st.executeQuery(sql);
            while(rs.next()){
                String sName,sSurname,sDOB,pContact;
                Integer sGrade;
                sName = rs.getString("student_name");
                sSurname = rs.getString("student_surname");
                sGrade = rs.getInt("student_grade");
                sDOB = rs.getString("student_dob");
                pContact = rs.getString("parent_number");
                
                
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
           String qry = "SELECT * FROM learners";
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
           String qry = "SELECT * FROM parents";
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
           String qry = "SELECT * FROM teachers";
           ResultSet rs = st.executeQuery(qry);
           table.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception ex){
           System.out.println("ex");
       }
       
   }
   
  
   }

