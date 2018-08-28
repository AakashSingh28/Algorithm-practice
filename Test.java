package com.practice.array;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by aasingh on 12/06/18.
 */
public class Test {

    public static void main(String[] args) {

        Employee emp1=new Employee();
        emp1.setAge(44);
        emp1.setName("Akahs");

        Employee emp2=new Employee();
        emp2.setAge(41);
        emp2.setName("zibhav");

        Employee emp3=new Employee();
        emp3.setAge(26);
        emp3.setName("AAsk");

        ArrayList arrayList=new ArrayList();
        arrayList.add(emp1);
        arrayList.add(emp2);
        arrayList.add(emp3);



        arrayList.forEach(new Consumer() {
            @Override
            public void accept(Object o) {

                Employee emp=(Employee)o;
                System.out.println("ForEach"+emp.getAge());

            }
        });


Map map=new HashMap();
map.put(1,1);
map.put(2,2);
map.put(3,3);

        Set<Map.Entry> a =   map.entrySet();

        for (Map.Entry i:a)
        {
            i.getKey();
            i.getValue();

        }


        Comparator<Employee> ageComparator=(Employee o1, Employee o2) -> {
                Employee employee1=(Employee)o1;
                Employee employee2=(Employee)o2;
                return employee1.getAge()-employee2.getAge();
        };


        Collections.sort(arrayList,ageComparator);

        System.out.println(arrayList);

        HashMap<Employee,String> hashMap=new HashMap<Employee,String>();

        hashMap.put(emp1,"ABC");
        hashMap.put(emp2,"ZCS");
        hashMap.put(emp3,"PPS");

        System.out.println(hashMap.get(emp1));


/*
        Comparator<Employee> ageComparator=new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                Employee employee1=(Employee)o1;
                Employee employee2=(Employee)o2;
                return employee1.getAge()-employee2.getAge();
            }
        };



        Collections.sort(arrayList,ageComparator);

         System.out.print(arrayList);
*/



    }
}
