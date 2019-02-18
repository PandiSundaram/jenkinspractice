package java8features;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        String passwordToHash = "password";
//        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            //Add password bytes to digest
          //  md.update(passwordToHash.getBytes());
            //Get the hash's bytes
            byte[] bytes = md.digest(passwordToHash.getBytes());
            
            StringBuffer sb = new StringBuffer();
            
            System.out.println(bytes.length);
            
            for(int i=0;i<bytes.length;i++)
            {
            	sb.append(Integer.toHexString(0xFF & bytes[i]));
            }
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            
            //BigInteger b = new BigInteger(1,bytes);
       
           // String hexstring = b.toString(16);
            
            //System.out.println(hexstring.length());
            
          //  String sb = new StringBuilder();
//            while (hexstring.length() < 32) { 
//
//            	hexstring = "0" + hexstring; 
//            } 
            //Get complete hashed password in hex format
            //generatedPassword = sb.toString();
            
            System.out.println(sb.toString());
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
       
		
		
		
		
		
//		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//
//		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
//		System.out.println(squaresList);
		
//		List<String> a = new ArrayList<String>();
//		
//		
//		a.add("1");
//		a.add("");
//		a.add("3");
//		a.add("4");
//		a.add("5");
//		a.add("6");
//		
//		System.out.println(a);
//		
////		List<Integer> a1 = new ArrayList<Integer>();
////		for(Integer r : a)
////		{
////			if(r%2 == 0)
////			{
////				a1.add(r);
////			}
////		}
////		
//		
//		List<String> a1 = a.stream().filter(i -> !i.isEmpty()).collect(Collectors.toList());
//				
//		System.out.println(a1);
//		
		
	}

}
