package CollectionsPackage1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListClass
{
    public  static void main(String[] args)
    {
        List<String> charNames = new ArrayList<String> ();
        List<Integer> serialNo = new ArrayList<Integer>();

        //add
        charNames.add("Rohit Sharma");
        charNames.add("Virat Kohli");
        charNames.add("Sachin Tendulkar");
        charNames.add("MS Dhoni");
        serialNo.add(0,45);
        serialNo.add(1,18);
        serialNo.add(2,10);

        //Print Size of the List and values based on index
        System.out.println();
        System.out.println("Print Size of the List and values based on index");
        System.out.println("Size of Players in List : "+charNames.size());
        System.out.println("Size of SerialNo in SerialNo : "+serialNo.size());
        System.out.println("CharName Value in Index 1 : "+charNames.get(1)); //fetch items based on index position
        System.out.println("SerialNo Value in Index 0 : "+serialNo.get(0)); //fetch items based on index position
        System.out.println("-----------------------------------------------------");
        //Remove values from list and print values of same index & size of the list
        System.out.println("Remove values from list and print values of same index & size of the list");
        charNames.remove("Virat Kohli");
        serialNo.remove(2);
        System.out.println("Size of Players in List after removing : "+charNames.size());
        System.out.println("Size of SerialNo in List after removing : "+serialNo.size());
        System.out.println("CharName Value in Index 1 : "+charNames.get(1)); //fetch items based on index position
        System.out.println("SerialNo Value in Index 0 : "+serialNo.get(0)); //fetch items based on index position
        System.out.println("-----------------------------------------------------");
        System.out.println("Search a string value which is not in the List");
        if(charNames.contains("Surya Dheeraj"))
        {
            System.out.println("Surya Dheeraj is Present in the List");
        }
        else
        {
            System.out.println("Surya Dheeraj is not Present in the List");
        }
        System.out.println("-----------------------------------------------------");
        charNames.add("Surya Dheeraj"); //Add the Same string to the list
        System.out.println("Add the same string value and search it  in the List");
        if(charNames.contains("Surya Dheeraj")) //
        {
            System.out.println("Surya Dheeraj is Present in the List");
        }
        else
        {
            System.out.println("Surya Dheeraj is not Present in the List");
        }
        System.out.println("Size of Players in List after adding new player : "+charNames.size());
        System.out.println("-----------------------------------------------------");
        //Print Values using iterators
        System.out.println("Print Players in List using Iterator");
        Iterator<String> i = charNames.iterator();
            while (i.hasNext())
            {
                System.out.println(i.next());
            }
        System.out.println("-----------------------------------------------------");
        //Print Values after sorting
        System.out.println("Print Values in List after sorting");
        Collections.sort(charNames);
        System.out.println(charNames);
        // Clear the Entire List
        System.out.println("-----------------------------------------------------");
        charNames.clear();
        System.out.println("Print Values in List after clearing");
        System.out.println(charNames);
    }
}
