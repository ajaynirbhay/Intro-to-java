                                     import java.util.*;
                                     class encode {
                                     public static void main() {
                                     Scanner in = new Scanner(System.in);
                                     int l,i,a,b,n;
                                     String st="",st1="";
                                     char ch=' ';
                                     System.out.println("Enter a string in lower case only :");
                                     st=in.nextLine();
                                     l=st.length();
                                     System.out.println("Enter the encoding no.");
                                     n=in.nextInt();
                                     for(i=0;i<l;i++) {
                                     ch=st.charAt(i);
                                     a=(int)ch;
                                     b=a+n;
                                     if(b>122)
                                     st1=st1+(char)(b-26);
                                     else
                                     st1=st1+(char)b;  }
                                     System.out.println("The encoded string is :"+st1); }
                                    }
