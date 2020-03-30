package DataStructure;

import java.util.*;

public class DataStructure {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] studentName;
        int studentNum = 3;

        //System.out.println("Enter how many student: ");
        // studentNum= input.nextInt();
        //input.nextLine();
        studentName = new String[studentNum];
        System.out.println("Enter the 3 student names :");
        for (int i = 0; i < studentNum; i++) {
            System.out.println("Enter student names : "+(i+1));
            studentName[i] = input.nextLine();

        }
        System.out.println("\nArray: --------------");

        for (int i = 0; i < studentNum; i++) {
            System.out.println("Student name is : " + studentName[i]);

        }


        //ARAYLIST

        List<String> list = new ArrayList<>();
        list.add(studentName[0]);
        list.add(studentName[1]);
        list.add(studentName[2]);

        System.out.println("\nArrayList:--------------");
        for(String x: list) {
            System.out.println("From Arraylist: ="+x);
        }


        //LINKLIST
        System.out.println("\nLinkList:--------------");


        List <Integer> ls = new LinkedList<>();


        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);


        Iterator it = ls.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }


        System.out.println("\nStack:--------------");

        Stack <Integer>st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);


    for (int x: st)
    {
        System.out.println(x);
    }

        System.out.println("\nStack:---------poping 1 items: "+st.pop());

        System.out.println("\nStack:-----using pop methods");

        Iterator it2 =ls.listIterator();

        while (it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println("\nStack:---------peak: "+st.peek());


        System.out.println("\nQueue:--------------");

        Queue <String> qu= new LinkedList<>();

        qu.add(studentName[0]);
        qu.add(studentName[1]);
        qu.add(studentName[2]);

        System.out.println(((LinkedList<String>) qu).getLast());

    

     }//end main

    }//end class

