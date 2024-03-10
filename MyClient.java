// A Java program for a Client

// import java.io.*; 
// import java.net.*;

// public class MyClient {

// 	public static void main(String[] args) { 

// 		try{      

// 			Socket s=new Socket("localhost",6666);

// 			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  

// 			dout.writeUTF("Hello Server");

// 			dout.flush();

// 			dout.close();

// 			s.close();

// 		}
		
// 		catch(Exception e){
			
// 			System.out.println(e);
		
// 		}  


// 	}


// }  


import java.net.*;  

import java.io.*; 


class MyClient{  
	public static void main(String args[])throws Exception{  

		Socket s = new Socket("localhost",3333);  

		DataInputStream din = new DataInputStream(s.getInputStream());  

		DataOutputStream dout = new DataOutputStream(s.getOutputStream());  

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		
		String str = "",str2 = ""; 

		while(!str.equals("stop")){  

			str = br.readLine();  

			dout.writeUTF(str);  

			dout.flush();  

			str2 = din.readUTF();  
			
			System.out.println("Server says: " + str2);  

		}  
		
		dout.close();  

		s.close();  

	}

}  
