import java.util.*;

/*
public class ComparatorDemo {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10> j%10)
                return 1;
                else return -1;
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums, com);
        System.out.println(nums);

    }
}
 */








/*

class Students{
    int age;
    String name;
    public Students(int age, String name){
        this.age = age;
        this.name= name;
    }
    public String toString(){
        return "Students [age="+ age +",name="+name+"]";
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
//        Comparator<Students> com = new Comparator<Students>()
//        {
//            public int compare(Students i, Students j)
//            {
//                if(i.age> j.age)
//                    return 1;
//                else
//                    return -1;
//            }
//        };
        Comparator<Students> com =(i,j) -> i.age > j.age?1:-1;
        List<Students> stud= new ArrayList<>();
        stud.add(new Students(21, "kartik"));
        stud.add(new Students(12, "khush"));
        stud.add(new Students(18, "mayank"));
        stud.add(new Students(20, "naman"));
        Collections.sort(stud, com);
       for(Students s : stud)
        System.out.println(s);

    }
}
 */

class Students implements Comparable<Students>
{
    int age;
    String name;
    public Students(int age, String name){
        this.age = age;
        this.name= name;
    }
    public String toString(){
        return "Students [age="+ age +",name="+name+"]";
    }

    public int compareTo(Students that){
        if(this.age> that.age)
            return 1;
        else
            return -1;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        /*
      Comparator<Students> com = new Comparator<Students>()
      {
        public int compare(Students i, Students j)
          {
               if(i.age> j.age)
                   return 1;
                else
                   return -1;
            }
        };

         */
        List<Students> stud= new ArrayList<>();
        stud.add(new Students(21, "kartik"));
        stud.add(new Students(12, "khush"));
        stud.add(new Students(18, "mayank"));
        stud.add(new Students(20, "naman"));
        Collections.sort(stud);
        for(Students s : stud)
            System.out.println(s);

    }
}