package javaCodeWHarry;

public class cwh_14StringMethod {
	public static void main(String[] args) {
      String name="Arvind";
      //length of the string 
      int lenstr=name.length();
      System.out.println(lenstr);
      
      //uppercase to lowercase and vice versa
      String lowername=name.toLowerCase();
      System.out.println(lowername);
      
      String uppercase=name.toUpperCase();
      System.out.println(uppercase);
      
      //to remove space leading and trailing
      String car="    *Thar* ";
      String trim = car.trim();
      System.out.println(trim);
      
      //creating a substring
      String substring=name.substring(3);
      System.out.println(substring);
      
    //creating a substring from start and end indexes
      String  indesxstring=name.substring(2, 4);
      System.out.println(indesxstring);
      
      //replacing a character in the string
      String replacechar=name.replace('r', 'p');
      System.out.println(replacechar);
      
      //Boolean
      boolean startwith= name.startsWith("Ar");
      System.out.println(startwith);
      
      boolean endswith=name.endsWith("nd") ;
      System.out.println(endswith);
      
      //finding the charater
      char as= name.charAt(2);
      System.out.println(as);
      
      int index = name.indexOf('i');
      System.out.println(index);
      
      String name1="Arrvvindd";
      
      int index1=name.indexOf("vr", 3);
      System.out.println(index1);
      
      int index2=name.lastIndexOf('i');
      System.out.println(index2);
      
      //equals method 
      boolean equal=name.equals(name1);
      System.out.println(equal);
      boolean eualignoreCase=name.equalsIgnoreCase(name1);
      System.out.println(eualignoreCase);
      
      
      
      
      
      
	}
}
