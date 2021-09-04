
public class StringBufBasicOpenra {
	
															//stringbuff Basic method demonstration
	public static void main(String[] args) {
		
															// TODO Auto-generated method stub
		StringBuffer stringBuffer=new StringBuffer();		//Creates character buffer variables
		
															//lnitialize variables stringbuffer
		stringBuffer=new StringBuffer("This program shows the method of StringBuffer.");
		
		System.out.println(stringBuffer);					//output stringbuffer
		
															//capacity of the output string buffer variable
		System.out.println("stringbuffer.capacity()="+stringBuffer.capacity());
		
															//length of the output string buffer variable
		System.out.println("stringbuffer.length()="+stringBuffer.length());
		
		stringBuffer.setCharAt(32, '!'); 					//sets the string at the specified index position
		
		System.out.println("stringbuffer="+stringBuffer);	//output StringBuffer
		
															//Output a string at the apecified index posifion
		System.out.println("stringbuffer.charAt(5)="+stringBuffer.charAt(5));
		
		stringBuffer.setCharAt(5, 'p'); 					//sets the string at the specified index position
		
		System.out.println("stringbuffer="+stringBuffer);	//output StringBuffer
		
		char char1[]=new char[10];							//Creating a Character Array
		
		stringBuffer.getChars(5, 8, char1, 0); 				//gets an array of characters at the specified index position
		
		System.out.println("stringbuffer="+stringBuffer);	//output StringBuffer
		
		System.out.println("char1[0]="+char1[0]); 			//print the first character
		
		stringBuffer.delete(5, 11); 						//Deletes the specified index position character
		
		stringBuffer.deleteCharAt(5); 						//Deletes the specified index position character
		
		System.out.println("stringbuffer.deleteCharAt(5)="+stringBuffer);				//output StringBuffer
		
		stringBuffer.replace(0, 4, "That"); 				//Replaces the specified position string
		
															//Output the replaced string
		System.out.println("stringbuffer.replace(0,4,that)="+stringBuffer);
		
															//output ten specified index position character
		System.out.println("stringbuffer.substring(6,12)="+stringBuffer.substring(6,12));
		
															//Output the index of the specified string position
		System.out.println("stringbuffer.infexOf(\"of\")="+stringBuffer.indexOf("of"));
		
		stringBuffer.reverse();								//String buffer in reverse order
		
		System.out.println("stringBuffer.reverse()="+stringBuffer);	//output in reverse order
		
		
	}

}
