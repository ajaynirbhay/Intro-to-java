                                    import java.util.*;
                                    class banking
                                    {
                                    public static void main()
                                    {
                                    Scanner in = new Scanner(System.in);
                                    long rup,b,tot=0;
                                    int n,i=0,d;
                                   String st="";
                                    long a[]={2000,500,200,100,50,20,10,5,2,1};
                                   String dig[]={"Zero","One","Two","Three","Four","Five","Six",
                                   "Seven","Eight","Nine"};
                                   System.out.println("Enter the amount");
                                   rup=in.nextLong();
                                   b=rup;
                                  while(b!=0)
                                  {
                                  d=(int)(b%10);
                                  st=dig[d]+" "+st;
                                  b=b/10;
                                  }
                                 System.out.println("AMOUNT IN WORDS::");
                                 System.out.println(st);
                                 System.out.println("DENOMINATION");
                                 b=rup;
                                while(b!=0)
                                {
                                n=(int)(b/a[i]);
                                if(n!=0)
                                {
                                System.out.println(a[i]+"x"+n+"=Rs."+(a[i]*n));
                                tot=tot+n;
                                }
                               b=b%a[i];
                                i=i+1;
                               } 
                              System.out.println("TOTAL = Rs."+rup);
                              System.out.println("TOTAL NO. OF NOTES="+tot);
                              }
                              }



