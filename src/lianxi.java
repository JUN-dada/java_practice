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

    }
}

