package ASSIGNMENT_SET_3;

public class Salary {
    public static double[] findDetails(double[] salary){
        int len = salary.length;
        double[] res = new double[3];
        double summ = 0;
        double avg;
        double greater = 0;
        double lesser = 0;

        for(double num : salary){
            summ += num;
        }
        avg = summ/len;

        for(double num1 : salary){
            if(num1 > avg){
                greater++;
            }
            else{
                lesser++;
            }
        }
        res[0] = avg;
        res[1] = greater;
        res[2] = lesser;

        return res;

    }

    public static void main(String[] args) {
        double[] salary = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
        double[] details = findDetails(salary);

        System.out.println("Average Salary: " + details[0]);
        System.out.println("Number of Salaries greater than the average salary: " + details[1]);
        System.out.println("Number of Salaries lesser than the average salary: " + details[2]);
    }
}
