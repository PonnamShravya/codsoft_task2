 import java.util.Scanner;
 class StudentGradeCalculator
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Student grade calculator");
        System.out.println("Enter no of subjects");
        int nS=sc.nextInt();
        int total=0;
        for(int i=0;i<nS;i++){
            System.out.println("Enter marks obtained in "+i+": ");
            int marks=sc.nextInt();
            total+=marks;
        }
double averp=(double)total/nS;
char grade;
if(averp>=90){
    grade='o';
}else if(averp>=80){
    grade='A';
}else if(averp>=70){
    grade='B';
}else if(averp>=60){
    grade='C';
}else if(averp>=50){
    grade='D';
}
else if(averp>=40){
    grade='E';
}else{
    grade='F';
}
System.out.println("Total marks scored is "+total);
System.out.println("Average percentage gained is "+averp+"%");
System.out.println("grade :"+grade);
        
    }
}