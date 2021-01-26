import java.util.*;
public class Test {

    static Routine r1 = new Routine();
    public static void main(String[] args) {
        commandInterface();
    }

    public static void commandInterface(){
        Scanner sc=new Scanner(System.in);
        System.out.println("A. Create Routine \nB. Show Routine \nC. List Courses with Teachers Name ");

        String input = sc.nextLine();

        if(input.equals("C")){
            r1.listCourseWithTeacherName();
        }
        else if(input.equals("A")){
            r1.createRoutine(sc.nextInt(),sc.nextInt(),sc.nextInt());
            System.out.println("Do you want to add more? Y/n");
            String checker = sc.next();
            while(checker.equals("Y") || checker.equals("y")){
                r1.createRoutine(sc.nextInt(), sc.nextInt(), sc.nextInt());
                System.out.println("Do you want to add more? Y/n");
                checker=sc.next();
            }
            commandInterface();
        }
        else if(input.equals("B")){
            r1.showRoutine();
        }
        sc.close();
        
    }
}
