                                       import java.io.*;
                                       public class file
                                       {
                                       public static void main(String arg[])throws IOException
                                      {
                                      InputStreamReader read= new InputStreamReader(System.in);
                                      BufferedReader in=new BufferedReader(read);
                                      FileWriter ab= new FileWriter("File.txt");
                                      BufferedWriter bc= new BufferedWriter(ab);
                                      PrintWriter cd= new PrintWriter(bc);
                                      int a,i,roll,c;
                                      String b;
                                      for(i=1;i<=2;i++)
                                     {
                                    System.out.println("Input roll number, name and father's name of student"+i+":");
                                    a=Integer.parseInt(in.readLine());
                                   cd.println(a);
                                   b=in.readLine();
                                   cd.println(b);
                                   b=in.readLine();
                                  cd.println(b);
                                   }
                                       cd.close();
                                       System.out.println("Input a roll number to be searched:");
                                       roll=Integer.parseInt(in.readLine());
                                       FileReader de= new FileReader("File.txt");
                                       BufferedReader ef = new BufferedReader(de);
                                       for(i=1;i<=2;i++)
                                       {
                                       c=Integer.parseInt(ef.readLine());
                                       if(roll==c)
                                       {
                                       System.out.println("Roll no.:"+ roll);
                                       b=ef.readLine();
                                       System.out.println("Name of student:"+b);
                                       b=ef.readLine();
                                       System.out.println("Father's name:"+ b);
                                       break;
                                       }
                                       b=ef.readLine();
                                      b=ef.readLine();
                                       }
                                       ef.close();
                                       }
                                       }
