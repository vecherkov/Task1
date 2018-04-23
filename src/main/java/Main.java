import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во студентов: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите кол-во времени затраченное студентами: ");
        String times = scanner.nextLine();
        String[] arrayTimes = times.split(" ");
        System.out.println(getValueOfCountStudentsFinishedDraw(arrayTimes,n));


    }

    private static long getValueOfCountStudentsFinishedDraw(String[] times, int n){
        if(times.length > n){
            System.out.println("Вы ввели слишком много элементов.");
            return 0;
        }

        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0; i < n; i++) {
            students.add(new Student((long) (i+1), Long.parseLong(times[i])));
        }
        students.sort(Student.studentComparator);
        return students.get(0).getId();
    }
}
