package CollectionsPackage1;

import java.util.*;

public class HashMapClass
{
    public static void main(String[] args)
    {
        Map<Integer,String> studentNames = new HashMap<Integer,String>();

        //Add Values to the map
        System.out.println("Add Student Names to the Map and print them");
        studentNames.put(0,"Surya Dheeraj");
        studentNames.put(3,"Prasad Rao");
        studentNames.put(3,"Prasad Rao1"); //Overrides existing value in the key
        studentNames.put(4,"Surya Dheeraj");
        studentNames.put(1,"Ragini");
        studentNames.put(5,"Rohit Sharma");
        studentNames.put(2,"Padmavathi");
        System.out.println(studentNames);
        System.out.println("Size of the Map : "+studentNames.size());
        System.out.println("--------------------------------------------------------------------------------");
        //Remove 1 student name from the map
        System.out.println("Remove 1 Student Name from the Map and print them");
        studentNames.remove(4);
        System.out.println(studentNames);
        System.out.println("Size of the Map : "+studentNames.size());
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(studentNames.containsKey(6)); // Prints False
        System.out.println(studentNames.containsValue("Rohit Sharma")); //Prints True
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println((studentNames.get(4))); //Since Value is removed from key 4, it returns null
        System.out.println("--------------------------------------------------------------------------------");
        //Print Values using iterators
        System.out.println("Print Index Set values in Map using Iterator");
        Iterator<Integer> i1 = studentNames.keySet().iterator();
        while(i1.hasNext())
        {
            System.out.println(i1.next());
        }
        System.out.println("Print Players in Map using Iterator");
        Iterator<String> i2 = studentNames.values().iterator();
        while(i2.hasNext())
        {
            System.out.println(i2.next());
        }
        System.out.println("-----------------------------------------------------");
        //Print Values after sorting
        System.out.println("Print Values in Set after sorting by Keys");
        Map<Integer,String> m1 = new TreeMap<>(studentNames);
        System.out.println(m1);
        System.out.println("Print Values in Set after sorting by Values");
        List<Map.Entry<Integer,String>> m2 = new ArrayList<>(studentNames.entrySet());
        m2.sort(Map.Entry.comparingByValue());
        System.out.println(m2);
        System.out.println("--------------------------------------------------------------------------------");
        //Clear the entire Map
        System.out.println("Clear the entire Map and print");
        studentNames.clear();
        System.out.println(studentNames); //Returns an empty map
        System.out.println("Size of the Map : "+studentNames.size()); // Size will be 0 for empty map

    }
}
