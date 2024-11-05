package CollectionsPackage1;

import java.util.*;

public class SetClass
{
    public static void main(String[] args)
    {
        Set<String> s1 = new HashSet();
        Set<String> s2 = new HashSet();
        Set<Integer> s3 = new HashSet();

        s1.add("Rohit Sharma");
        s1.add("Rohit Sharma"); //Duplicate Value - Even though entered, it is not added in the Set
        s1.add("Virat Kohli");
        s1.add("MS Dhoni");
        s2.add("Sourav Ganguly");
        s2.add("Rahul Dravid");
        s2.add("Sachin Tendulkar");
        s2.add("Virendar Sehwag");
        s3.add(45);
        s3.add(18);
        s3.add(10);
        s3.add(99);
        s3.add(0);

        System.out.println("-----------------------------------------------------");
        System.out.println("Print Values in Set after adding");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //System.out.println(s1.getClass()); Prints class name class java.util.HashSet
        System.out.println("-----------------------------------------------------");

        //Removing
        s1.remove("Virat Kohli");
        s2.remove("Sourav Ganguly");
        s3.remove(99);
        s3.remove(0);
        System.out.println("Print Values in Set after removing");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("-----------------------------------------------------");
        //Print Values using iterators
        System.out.println("Print Players in List using Iterator");
        Iterator<String> i1 =  s1.iterator();
        while(i1.hasNext())
        {
            System.out.println(i1.next());
        }
        Iterator<String> i2 =  s2.iterator();
        while(i2.hasNext())
        {
            System.out.println(i2.next());
        }
        Iterator<Integer> i3 =  s3.iterator();
        while(i3.hasNext())
        {
            System.out.println(i3.next());
        }
        System.out.println("-----------------------------------------------------");
        //Print Values after sorting
        System.out.println("Print Values in Set after sorting");
        List<String> l1 = new ArrayList<String>(s1);
        List<String> l2 = new ArrayList<String>(s2);
        List<Integer> l3 = new ArrayList<Integer>(s3);
        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println("-----------------------------------------------------");
        //Clear the entire Set
        s1.clear();
        s2.clear();
        s3.clear();
        System.out.println("Print Values in Set after clearing");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
