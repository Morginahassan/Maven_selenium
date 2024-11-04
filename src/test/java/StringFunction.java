


import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringFunction {


    String name = "Md Ashraf Siddique";
    String email = "connect.ashraf@gmail.com";
    String money = "100";
    int money1 = 100;


    @Test
    public void upperCaseLowerCase(){
        String lowerCase = name.toLowerCase();
        String upperCase = name.toUpperCase();

        //System.out.println(name.toLowerCase());
        System.out.println(upperCase);
        System.out.println(lowerCase);
        int length = name.length();
        System.out.println(length);

        System.out.println(name);
    }

    @Test
    public void charOccurrences() {
        String name = "Md Ashraf Siddique";
        String name1 = name.replace(" ", "").toLowerCase();
        Set<Character> uniqueChars = new HashSet<>(); //
        for (char c : name1.toCharArray()) {

            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
                int count = 0;
                for (char ch : name1.toCharArray()) {
                    if (ch == c) {
                        count++;
                    }
                }
                System.out.println("Character " + c + " appears " + count + " times.");
            }
        }

    }

    @Test
    public void charOccurrences1() {
        String name = "Md Ashraf Siddique";
        String name1 = name.replace(" ", "").toLowerCase();
        char [] chars = name1.toCharArray();

        Set<Character> uniqueChars = new HashSet<>();
        for (char c : chars) {
            if(!uniqueChars.contains(c)){
                uniqueChars.add(c);
                int count=0;
                for(char ch: chars)
                    if (ch == c) {
                        count++;
                    }

                System.out.println("Character " + c + " appears " + count + " times.");
            }
        }

    }


    @Test
    public void splitString(){
        String[] words = name.split(" ");
        System.out.println(Arrays.toString(words));


        //String name = "Md Ashraf Siddique Md Ashraf Siddique Md Ashraf Siddique";
        // [Md, Ashraf, Siddique, Md Ashraf Siddique Md Ashraf Siddique]


        String [] words1 = name.split(" ",2);
        System.out.println(Arrays.toString(words1));
    }

    @Test
    public void StringToInteger(){

        System.out.println(money+200);
        System.out.println(money1+200);
        
        int a = Integer.parseInt(money);
        System.out.println(a+100);
    }

    @Test
    public void purseInteger(){
        String str = "MD87ASH56RAF123";
        //String intValue = str.replaceAll("A","");
        String intValue = str.replaceAll("[^0-9]","");
        System.out.println(intValue);
        System.out.println(intValue+100);

        int result = Integer.parseInt(intValue);
        System.out.println(result);
        System.out.println(result+100);
    }

    @Test
    public void purseString(){
        String str = "MD87ASH56RAF123";
        String strValue = str.replaceAll("[^a-zA-Z]","");

        System.out.println(strValue);
       // String result = String.valueOf(strValue);
        //System.out.println(result);
    }

    @Test
    public void integerToString(){
        String str = String.valueOf(money1);

        System.out.println(str+100);
    }

    @Test
    public void reverseStringWithLoop(){

        String name = "Md Ashraf Siddique";
        System.out.println(name.charAt(3));
        // M=0, d=1,  =2, A=3,     q=15    e=17         20     19

        System.out.println(name.length());   //18 length/size     index=0,1,2,3,4,5,6
        for(int i=name.length()-1; i>=0; i--){     // i=name.length()-1=17, i=0; i<name.length()
            System.out.print(name.charAt(i));  //eu  //
        }

    }

    @Test
    public void reverseStringWithLoop1(){

        String name = "Md Ashraf Siddique";

        String reverse ="";
        for(int i=name.length()-1; i>=0; i--){
            reverse = reverse+name.charAt(i);    //reverse = reverse+e""; e = e+u; eu= eu+q
        }
        System.out.println(reverse);
    }

    @Test
    public void subString(){
        //Md Ashraf Siddique
        String middleName = name.substring(3,9); //initial index is inclusive
        System.out.println(middleName);        //ending index is exclusive
        System.out.println(middleName.length());
    }

    @Test
    public void replace(){

        String email = "connect.ashraf@gmail.com";
        String newEmail = email.replace("@","#");

        System.out.println(newEmail);

        String newEmail1 = email.replace("ashraf","asif");

        System.out.println(newEmail1);

        System.out.println(email.startsWith("c"));
        System.out.println(email.contains("ashraf"));

        if(email.startsWith("c")){
            System.out.println("ok");
        }

        if(email.endsWith("m")){
            System.out.println("OK");
        }

        if(email.contains("#")){
            System.out.println("yes");
        }
    }

    @Test
    public void palindrome(){
        String palindrome = "Kayak"; //madam, ana,   //Initial String, Reverse String,
        String reverseStr ="";
        for(int i=palindrome.length()-1; i>=0; i--){
            reverseStr=reverseStr+palindrome.charAt(i);
            //System.out.println(reverseStr);
        }
        System.out.println(reverseStr);

        System.out.println(reverseStr.equalsIgnoreCase(palindrome));

        if(reverseStr.equalsIgnoreCase(palindrome)){
            System.out.println("'"+palindrome+"'" +" is a Palindrome");
        } else{
            System.out.println(palindrome+ " Not a Palindrome");
        }
    }

    @Test
    public void pyramid(){
        for(int i=0; i<=10; i++){               //i=0, j=0,
            for(int j=0; j<=i; j++){            //i=1, j=0, j=1
                System.out.print(" *");         //i=2, j=0,1,2
            }                                   //i=3, j=0,1,2,3
            System.out.println();               //i=10, j=0,1,2,3,4,5,6,7,8,9,10
        }
    }


    @Test
    public void reversePyramid(){
        for(int i=10; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    @Test
    public void fibonacci(){  // 1,2,3,5,8,13,21,34
        int n1=0;
        int n2=1;
        int sum;
        for(int i=0; i<=10; i++){
            sum=n1+n2;
            n1=n2;
            n2=sum;
            System.out.print(sum+",");
        }
    }

    @Test
    public void stringHasVowels(){
        String country = "Bangladesh";

        String str = country.toUpperCase();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){ //A OR B     A and B
                System.out.println(c+" is a vowels");
            }
            else{
                System.out.println(c+" is not a vowels");
            }
        }
    }

}
