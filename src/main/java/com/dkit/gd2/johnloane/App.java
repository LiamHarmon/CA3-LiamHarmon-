package com.dkit.gd2.johnloane;

import java.util.*;

/**
 * OOP CA3
 * @author Liam Harmon SD2b
 */
public class App 
{
    public static void main( String[] args )
    {
        //Question 1
        //questionOnePartA();
        //questionOnePartB();
        //questionOnePartC();
        //questionOnePartD();

        //Question 2
        //questionTwoPartA();
        //questionTwoPartB();
        //questionTwoPartC();
        //questionTwoPartD();

        //Question 3
        List<String> oneHundredStrings = new ArrayList<>();
        populateOneHundredStrings(oneHundredStrings);
        //questionThreePartA(oneHundredStrings);
        //questionThreePartB();

        //Question 4
        compareTwoStudents();
        //questionFourPartA();
        //questionFourPartB();
        //questionFourPartC();
    }

    public static void questionOnePartA()
    {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Liam", 20));
        studentList.add(new Student(2, "James", 21));
        studentList.add(new Student(3, "David", 22));
        studentList.add(new Student(4, "Sean", 23));

        for(Student s : studentList)
        {
            System.out.println(s + ", ");
        }

    }

    public static void questionOnePartB()
    {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Liam", 20));
        studentList.add(new Student(2, "James", 21));
        studentList.add(new Student(3, "David", 22));
        studentList.add(new Student(4, "Sean", 23));

        Collections.sort(studentList, Collections.reverseOrder());

        for(Student s : studentList)
        {
            System.out.println(s + ", ");
        }
    }

    public static void questionOnePartC()
    {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Liam", 20));
        studentList.add(new Student(2, "James", 21));
        studentList.add(new Student(3, "David", 22));
        studentList.add(new Student(4, "Sean", 23));

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(studentList);
        }
    }

    public static void questionTwoPartA()
    {
        Map<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(1, new Employee("Liam", "Harmon"));
        employeeMap.put(2, new Employee("Sean", "Kevitt"));
        employeeMap.put(3, new Employee("James", "O'Mara"));
        employeeMap.put(4, new Employee("Nathan", "Reilly"));
        employeeMap.put(5, new Employee("Sarah", "Boyle"));

        Collection<Employee> values = employeeMap.values(); // get all the values
        for (Employee e : values) {
            System.out.println(e + ", ");
        }

        pickLuckyWinner(employeeMap);
    }

    public static void pickLuckyWinner(Map<Integer, Employee> employeeMap)
    {
        System.out.println("\n");
        Scanner kb = new Scanner(System.in);
        System.out.println("\nEnter a Key(1-5) to search for a Lucky Employee");
        int key = kb.nextInt();
        Employee employee = employeeMap.get(key);
        if(employee != null)
        {
            System.out.println(key + " is the Luck Winner " + employee + "\n");
        }else{
            System.out.println("The key: " + key + " could not be found." + "\n");
        }
    }

    public static void questionTwoPartB()
        {
            Set<Employee> toyNames = new HashSet<>();

            toyNames.add(new Employee("Liam", "Harmon"));
            toyNames.add(new Employee("Sean", "Kevitt"));
            toyNames.add(new Employee("James", "O'Mara"));
            toyNames.add(new Employee("Nathan", "Reilly"));
            toyNames.add(new Employee("Sarah", "Boyle"));

            printUniqueNames(toyNames);

        }

        public static void printUniqueNames(Set<Employee> toyNames)
        {
            for (Employee e : toyNames) {
                System.out.println(e.getFirstName());
            }
        }

        public static void questionTwoPartC()
        {
            ArrayList<Employee> employeesList = new ArrayList<>();

            employeesList.add(new Employee("Liam", "Harmon"));
            employeesList.add(new Employee("Sean", "Kevitt"));
            employeesList.add(new Employee("James", "O'Mara"));
            employeesList.add(new Employee("Nathan", "Reilly"));
            employeesList.add(new Employee("Liam", "Boyle"));

            printNameAndCount(employeesList);
        }

        public static void printNameAndCount(ArrayList<Employee> employeesList)
        {
            int count = 0;
            for(Employee e : employeesList)
            {
                if(e.getFirstName().equals(e.getFirstName()))
                {
                    count++;
                    System.out.println("Most popular Name = " + e.getFirstName() + " it appeared " + count + " times.");
                }
            }
        }

        public static void questionTwoPartD()
        {
            Queue<Employee> queueEmployee = new LinkedList<>();

            queueEmployee.add(new Employee("Liam", "Harmon"));
            queueEmployee.add(new Employee("Sean", "Kevitt"));
            queueEmployee.add(new Employee("James", "O'Mara"));
            queueEmployee.add(new Employee("Nathan", "Reilly"));
            queueEmployee.add(new Employee("Sarah", "Boyle"));

            getNextOnWaitingList(queueEmployee);
        }

        public static void getNextOnWaitingList(Queue<Employee> queueEmployee)
        {
            queueEmployee.remove();
            System.out.println(queueEmployee.peek());

        }

        public static void questionThreePartA(List<String> oneHundredStrings)
        {
            for(String s : oneHundredStrings)
            {
                if (!oneHundredStrings.contains(s)) {
                    System.out.println(s);

                    // The forloop loops through the words if one of the words is in the string then it is removed
                    // and is then outputted
                }
            }
        }


    //The method below relates to Question 4
    private static void compareTwoStudents()
    {
        Student alex1 = new Student(1, "Alex", 22);
        Student alex2 = new Student(1, "Alex", 22);
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));

        // (a) The method returns false as both the hash codes for Alex1 and Alex2 are different
        // (b) Hash code is different for both of them as there wasn't a hash code generated in the Player Class and the
        // method is using just .hashCode which ill generate a unique hashcode for that object.
    }

    //This is just a helper method to populate the list of strings for question 3. You do not need to read it to answer any of the questions in the CA
    private static void populateOneHundredStrings(List<String> oneHundredStrings)
    {
        for(int i=0; i < 100; i++)
        {
            if(i / 10 == 0)
            {
                oneHundredStrings.add("Java");
            }
            else if(i / 10 == 1)
            {
                oneHundredStrings.add("Python");
            }
            else if(i / 10 == 2)
            {
                oneHundredStrings.add("C++");
            }
            else if(i / 10 == 3)
            {
                oneHundredStrings.add("Javascript");
            }
            else if(i / 10 == 4)
            {
                oneHundredStrings.add("Ruby");
            }
            else if(i / 10 == 5)
            {
                oneHundredStrings.add("Golang");
            }
            else if(i / 10 == 6)
            {
                oneHundredStrings.add("C#");
            }
            else if(i / 10 == 7)
            {
                oneHundredStrings.add("C");
            }
            else if(i / 10 == 8)
            {
                oneHundredStrings.add("R");
            }
            else if(i / 10 == 9)
            {
                oneHundredStrings.add("Swift");
            }
        }
    }
}
