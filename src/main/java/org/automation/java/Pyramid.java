package org.automation.java;

public class Pyramid {
    //1 2 3 4
    //5 6 7
    //8 9
    //10
    int K=1;
    public void createPyramid()
    {
        for(int i = 0; i<=4; i++)
        {
            for(int j=1; j<=4-i; j++)
            {
                System.out.print(K);
                K++;
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
