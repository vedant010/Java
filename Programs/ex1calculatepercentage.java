//Program for calculating percentage
class CalculatePercentage {
    public static void main(String[] args) {
      
        double sub1 = 86.7;
        double sub2 = 78.0;
        double sub3 = 92.8;
        double sub4 = 88.0;
        double sub5 = 95.5;
      
        double totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;

      
        double percentage = (totalMarks / 500) * 100;

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
