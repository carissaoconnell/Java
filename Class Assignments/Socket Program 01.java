Client program : 

import java.net.*;

import java.io.*;

public class Client {
  public static void main( String args[ ] ) throws Exception
  {
     Socket sock = new Socket( "127.0.0.1", 4000);

     System.out.print("For details enter valid file name");

     BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));

     String fname = keyRead.readLine();

     OutputStream  ostream = sock.getOutputStream( );

     PrintWriter pwrite = new PrintWriter(ostream, true);

     pwrite.println(fname);

     InputStream istream = sock.getInputStream();

     BufferedReader socketRead = new BufferedReader(new InputStreamReader(istream)); 

      String str;

     while((str = socketRead.readLine())  !=  null) { 
         System.out.println(str);          
     } 

     pwrite.close(); socketRead.close(); keyRead.close();

  }

}

// Server program : 
import java.net.*;    
import java.io.*;

public class  Server {
  public static void main(String args[]) throws Exception

  { 

     ServerSocket sersock = new ServerSocket(4000);

     System.out.println("Server ready for connection");

     Socket sock = sersock.accept();

     System.out.println("Connection is successful and wating for chatting");

     InputStream istream = sock.getInputStream( );

     BufferedReader fileRead =new BufferedReader(new InputStreamReader(istream));

     String fname = fileRead.readLine( );

     BufferedReader contentRead = new BufferedReader(new FileReader(fname) );

     OutputStream ostream = sock.getOutputStream( );

     PrintWriter pwrite = new PrintWriter(ostream, true);

     String str;

     while((str = contentRead.readLine()) !=  null) {
      pwrite.println(str);
     }

     sock.close();  sersock.close(); 
     pwrite.close();  fileRead.close(); contentRead.close();

  }

}
