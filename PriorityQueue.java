
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

/*
 * Create the Student and Priorities classes here.
 */
 class Student
 {
     int id;
     String name;
     double cgpa;
     public Student(int id, String name, double cgpa)
     {
         this.id = id;
         this.name = name;
         this.cgpa = cgpa;
     }

     public int getID()
     {
         return id;
     }

     String getName()
     {
         return name;
     }

     double getCGPA()
     {
         return cgpa;
     }
 }
 class Priorities
 {
     Queue<Student> q = new PriorityQueue<Student>(Comparator
                            .comparing(Student::getCGPA).reversed()
                            .thenComparing(Student::getName)
                            .thenComparing(Student::getID)
                        );

     List<Student> getStudents(List<String> events)
     {
         for(int i = 0; i < events.size(); i++)
         {
             String[] inp = events.get(i).split(" ");

             switch(inp[0])
             {
                 case "ENTER":
                    Student s = new  Student(Integer.parseInt(inp[3]), inp[1], Double.parseDouble(inp[2]));
                    q.add(s);
                    break;
                 case "SERVED":
                    q.poll();
             }
         }

         ArrayList<Student> a = new ArrayList<Student>();

         while(q.size() > 0)
         {
             a.add(q.poll());
         }

         return a;
     }   
 }







