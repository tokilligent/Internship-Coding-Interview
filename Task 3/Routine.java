import java.util.LinkedList;

public class Routine{
    
    String subjects[]={"English Grammer","Mathematics","Physics","Chemistry","Biology"};
    String teachers[]={"John Smith","Lara Gilbert","Johanna Kabir","Danniel Robertson","Larry Cooper"};
    LinkedList <String> routine_list = new LinkedList<String>();
    
    public void createRoutine(int day, int hour, int subject_no){
        routine_list.add(Integer.toString(day)+" "+Integer.toString(hour)+" "+subjects[subject_no]);
    }

    public void showRoutine(){
        for(int i=0; i<routine_list.size(); i++){
            System.out.println(routine_list.get(i));
        }
    }

    public void listCourseWithTeacherName(){
        for(int i=0;i<subjects.length;i++){
            System.out.println(subjects[i]+", "+teachers[i]);
        }
    }
}