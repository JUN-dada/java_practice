import java.nio.MappedByteBuffer;
import java.util.Scanner;
public class lianxi {
    public static void main(String[] args) {
                /*
                for (int j = 0; j<11;j++)
                {
                    for (int i = 0; i <10;i++)
                    {
                        System.out.print(i+"\t");
                    }
                    System.out.print("\n");
                }

                 */

                /*
                for (int j = 0; j <5;j++)
                {
                    for (int i = 0; i <5;i++)
                    {
                        if (j%2==1 && i%2==1 || i%2==0 && j%2==0)
                        {
                            System.out.print("#"+"\t");
                        }

                        else
                        {
                            System.out.print("*"+"\t");
                        }
                    }
                    System.out.println();
                }

                 */

                /*
                    for (int i = 0; i <6;i++)
                    {

                        for (int j = 0; j <5-i;j++)
                        {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                }
                 */

        /*
        for (int j=0;j<5;j++)
        {
            for (int i = 0; i < 5; i++)
            {
                if (j%2==1 && i%2==1|| i%2==0 && j%2==0  )
                {
                    System.out.print("*"+"\t");
                }
                else
                {
                    System.out.print("#"+"\t");
                }
            }
            System.out.println();
        }
         */

        /*
        int a;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        for (int i=0;i<=a;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print(j+1+"\t");
            }
            System.out.println();
        }
         */
        /*
        int a;
        Scanner Scanner = new Scanner(System.in);
        a= Scanner.nextInt();
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<a-i;j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }
         */

        /*
        int a;
        Scanner Scanner = new Scanner(System.in);
        a= Scanner.nextInt();
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<a;j++)
            {
                if (j>=a-i && j<=a+i)
                {
                    System.out.print("* ");
                }

                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         */

        /*
        int a;
        Scanner Scanner = new Scanner(System.in);
        a= Scanner.nextInt();
        for (int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if (j>=a-i && i<=a+i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
         */

        /*
        int a;
        Scanner Scanner = new Scanner(System.in);
        a=Scanner.nextInt();
        int sum;
      for (int i = 1; i <=a;i++)
       {
         for (int j = 1; j <= i; j++)
             {
               System.out.print(i+"*"+j+"="+i*j+"       ");
             }
       System.out.println();
       }
         */
        /*
        int a;
        Scanner Scanner = new Scanner(System.in);
        a=Scanner.nextInt();
        for (int i = 0; i <= a; i++)
        {
            for (int j = 0; j <i;j++)
            {
                char zimu = (char)(65+j);
                System.out.print(zimu+"\t");
            }
            System.out.println();
        }
         */

        /*
        int a;
        Scanner Scanner = new Scanner(System.in);
        a=Scanner.nextInt();
        int sum01=0;
        int sum02=0;
        for (int i=0;i<=a;i++)
        {
            if(i%2==0)
            {
                sum01=sum01+i;
            }
            else
            {
                sum02=sum02+i;
            }
        }
        System.out.println(sum01);
        System.out.println(sum02);
         */

        /*
        int a;
        Scanner Scanner = new Scanner(System.in);
        a=Scanner.nextInt();
        int b=0;
            for (int i=0;i<=a;i++)
            {
                if (i%5==0)
                {
                    System.out.print(i+"\t");
                    b++;
                    if (b==5)
                    {
                        System.out.println();
                        b=0;
                    }
                }
            }
            System.out.println();
        }

         */

        /*
        int a;//高
        Scanner Scanner = new Scanner(System.in);
        a=Scanner.nextInt();

        int b;//行
        Scanner = new Scanner(System.in);
        b=Scanner.nextInt();

        for (int i=1;i<=a;i++)
        {
            for (int j=1;j<=b;j++)
            {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }

         */

        /*
        int a;
        Scanner Scanner = new Scanner(System.in);
        a=Scanner.nextInt();
        for (int i=1;i<=a;i++)
        {
            for (int j=1;j<i;j++)
            {
                System.out.print(i+"*"+j+"="+i*j+"       ");
            }
            System.out.println();
        }

         */

//        int width;
//        int high;
//        Scanner scanner = new Scanner(System.in);
//        width= scanner.nextInt();
//        high=scanner.nextInt();
//        for(int i = 1;i <= high;i++)
//        {
//            for(int k =1;k <= high-i;k++)
//            {
//                System.out.print(" " + " ");
//            }
//            for(int j = 1;j <= width;j++)
//            {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("");

    }
}

