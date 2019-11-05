                                             import java.util.*;
                                             class Spiral_matrix
                                             {
                                             public static void main()
                                             {
                                             Scanner in = new Scanner(System.in);
                                             int n,lr,ur,lc,uc,i,j,c=1,arr[][];
                                             System.out.println("Enter the size of the square matrix");
                                             n=in.nextInt();
                                             arr=new int[n][n];
                                             lr=0;ur=n-1;
                                             lc=0;uc=n-1;
                                             while(c<=n*n)
                                             {
                                             for(i=lc;i<=uc;i++)
                                             {
                                             arr[lr][i]=c;
                                             c++;
                                             }
                                             lr++; 

                                           for(i=lr;i<=ur;i++)
                                           {
                                           arr[i][uc]=c;  
                                           c++;
                                           }
                                          uc--;
                                          for(i=uc;i>=lc;i--)
                                          {
                                          arr[ur][i]=c;
                                          c++;
                                          }
                                         ur--;
                                         for(i=ur;i>=lr;i--)
                                        {
                                        arr[i][lc]=c;
                                        c++;
                                        }
                                        lc++;
                                        }
                                        System.out.println("The spiral matrix is ::");
                                        for(i=0;i<n;i++)
                                       {
                                       for(j=0;j<n;j++)
                                      {
                                      System.out.print(arr[i][j]+"  ");
                                      }
                                     System.out.println();
                                     }
                                     }
                                     }
