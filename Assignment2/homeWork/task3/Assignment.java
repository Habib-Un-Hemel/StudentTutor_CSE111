package Assignment2.homeWork.task3;

public class Assignment {
    int tasks;
    String difficulty;
    boolean submission = false;

    public void printDetails(){
        System.out.println("Number of tasks: " + tasks);
        System.out.println("Difficulty level: " + difficulty);
        System.out.println("Submission required: " + submission);
    }

    public String makeOptional(){
        if (submission) {
            submission = false;
             return "Assignment  will not require submission";
        } else {
            submission = true;
            return "Submission is already  not required.";
        }
    }
}
