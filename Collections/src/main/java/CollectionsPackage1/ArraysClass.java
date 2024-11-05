package CollectionsPackage1;

import java.util.*;

public class ArraysClass
{
    public static void main(String[] args)
    {
        String[] names = {"RohitSharma","ViratKohli","SachinTendulkar","MSDhoni","SuryaDheeraj"};
        for (String s : names) {
            System.out.println(s);
        }
        System.out.println("-----------------------------------------------------");
        //Print Values after sorting
        System.out.println("Print Values in List after sorting");
        Arrays.sort(names);
        for (String s : names) {
            System.out.println(s);
        }
    }
}
