package week03HW;

import java.util.Scanner;

public class Task05_HTTPProtocol {
	public static void main(String[] args) {
		
//		HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
//	    Some of the codes and their meanings are listed below:
//	            status code:
//	                200, OK
//	                201, Created
//	                202, Accepted
//	                301, Moved Permanently
//	                303, See Other
//	                304, Not Modified
//	                307, Temporary Redirect
//	                400, Bad Request
//	                401, Unauthorized
//	                403, Forbidden
//	                404, Not Found
//	                410, Gone
//	                500, Internal Server Error
//	                503, Service Unavailable
//	         declare an int variable called StatusCode, write a switch that prints out, on a line by itself, the appropriate label from the above list based on status.
//	                    Example:
//	                        if status code = 200
//	                    output:
//	                        ok
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello, please eneter HTTP protocol");
		int numCode = keyboard.nextInt();
		String meaning = "";
		switch (numCode) {
		
		case 200:
			meaning = "OK";
			break;
		case 201:
			meaning = "Created";
			break;
		case 202:
			meaning = "Accepted";
			break;
		case 301:
			meaning = "Moved Permanently";
			break;
		case 303:
			meaning = "See Other";
			break;
		case 304:
			meaning = "Not Modified";
			break;
		case 307:
			meaning = "Temporary Redirect";
			break;
		case 400:
			meaning = "Bad Request";
			break;
		case 401:
			meaning = "Unauthorized";
			break;
		case 403:
			meaning = "Forbidden";
			break;
		case 404:
			meaning = "Not Found";
			break;
		case 410:
			meaning = "Gone";
			break;
		case 500:
			meaning = "Internal Server Error";
			break;
		case 503:
			meaning = "Service Unavailable";
			break;
		default:
			System.out.println("Invalid status code!!!");
		}
		
		System.out.println(meaning);

			
		
		keyboard.close();
	}

}
