                                        import java.util.*;
                                        class Stock
                                        {
                                        String item;
                                        double amt,qty,rate;
                                        Stock(String it,double q, double r)
                                        {
                                        item= it;
                                        qty=q;
                                        rate=r;
                                        amt=qty*rate;
                                        }
                                        void display()
                                        {
                                         System.out.println("Item:"+item+"\nQUANTITY:"+qty+"\nRATE: Rs."+rate+"\nAMOUNT:Rs."+amt);
                                         }
                                         }
                                        class purchase extends Stock
                                         {
                                         double pqty;
                                        double prate;
                                        purchase(String it,double q,double r)
                                        {
                                        super(it,q,r);
                                        }
                                        void Input(double a1,double b1)
                                        {
                                        pqty=a1;
                                        prate=b1;
                                        }
                                        void update()
                                       {
                                      qty+=pqty;
                                      if(rate!=prate)
                                      rate=prate;
                                      amt=qty*rate;
                                      }
                                      void display()
                                      {
                                       super.display();
                                       update();
                                       System.out.println("After updation");
                                       super.display();
                                       }
                                       public static void main()
                                       {
                                       String item;
                                       int q;
                                       double up,prat,pqt;
                                       Scanner in= new Scanner(System.in);
                                       System.out.println("Input previous stock details- name, quantity and unit prize of purchased item");
                                       item = in.nextLine();
                                       q=in.nextInt();
                                       up=in.nextInt();
                                       purchase ob= new purchase(item,q,up);
                                       System.out.println("Input new quantity and unit price of item");
                                       pqt=in.nextDouble();
                                      prat=in.nextDouble();
                                      ob.Input(pqt,prat);
                                      ob.display();
                                      }
                                      }


