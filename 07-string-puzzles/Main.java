class Main {

	
	public static void main(String[] args) {
		
		System.out.println(conCat("abc","fox"));
		
		
	}
	
	
	public static String conCat(String s1 , String s2){
		
		String tmp = s1+s2;
		
		if(s1.length()>0 && s2.length()>0){
			if(s1.charAt(s1.length()-1)==s2.charAt(0)){
			
				tmp =  s1+s2.substring(1);
			}
		}
		
		return tmp;
	}
}






class Main {

  public static void main(String[] args) {
    System.out.println(countHi("hihihihi"));  
  }
  
  public static  int countHi(String str) {
    int count = 0;
    
    for(int i = 0; i <= str.length() - 2; i++) {
        if(str.substring(i, i + 2).equals("hi")) {
            count++;
        }
    } //end for loop
    return count;
  } //end of countHi mehtod
}
// public static String firstHalf(String) 
