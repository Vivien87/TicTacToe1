


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.vivi.controller.GameController;
import com.vivi.model.GameModel;


@WebServlet("/play")
public class Servlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
    static final String DB_URL="jdbc:mysql://localhost/mydb";
    Connection connection = null;
    Statement statement = null;


    static final String USER = "root";
    static final String PASS = "12091989";
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	  

		
		String btn = null;
		GameController gc = new GameController();
		
		GameModel gm = (GameModel) request.getSession().getAttribute("GameModel");
	
		if(gm == null){
			gm = new GameModel();
			gm.setqMove(1);
			request.getSession().setAttribute("GameModel", gm);
		}
		
		gm = (GameModel) request.getSession().getAttribute("GameModel");
		
		String move = request.getParameter("move");
		
		
		if(move.equals("end")){
			
			request.getSession().invalidate();
			
		}else{
		
			gm.setNumberButton(Integer.parseInt(move));
		    gm = gc.VerifButton(gm);
		}
		
		
		if(gm.getFlag() != null){
			
			int qPlayer = gm.getqMove();
			
			
			btn = gm.getFlag();
			
		
			String wPlayer = gc.verifplayer(qPlayer);
			gm.setPlayer(wPlayer);
			
			gm = gc.SetPosicaoModel(gm);
			
			int sPlayed = qPlayer + 1;
			gm.setqMove(sPlayed);
			
			
	        System.out.println("Registering JDBC driver...");

	        try {
	        	Class.forName(JDBC_DRIVER);
	        	//Class.forName("org.hsqldb.jdbc.JDBCDriver");
	        	
            connection =DriverManager.getConnection(DB_URL, USER, PASS);
            //connection=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA", "12091989");
	        System.out.println("Creating database connection...");
	       
			
				
				statement=connection.createStatement(); 
				String query = "INSERT INTO mydb.tictactoe (id,name,position) " + 
				           "VALUES (" + qPlayer + ", '" + wPlayer + "', '" + btn + "')";
				
				           /*String query= "INSERT INTO tictactoe (id, name,position)"+
				"VALUES (qPlayer, wPlayer, btn )";*/
				statement.executeUpdate(query);
			
				statement.close();
				connection.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			 }catch(Exception e){
		         
		         e.printStackTrace();
		      }
			request.getSession().setAttribute("result", gc.VerifWinner(gm));
		
			
		
			request.getSession().setAttribute(btn, wPlayer);
		}
		
		
	
		
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}
}
