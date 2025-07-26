package mid.Assingment4;

public class Student{
  String id="";
  double cg=0;;
  String[] course= new String[4];
  int count=0;

  public Student(String i){
    id=i;
    System.out.println("A student with ID "+id+" has been created.");
  }

  //new
    public Student(int i) {
    this(String.valueOf(i));

  }

  public Student(String i,double c){
    id=i;
    cg=c;
  }
//  New int, double constructor
  public Student(int i, double c) {
    this(String.valueOf(i), c);
  }

  public void storeID(String i){
    id=i;
  }
    public void storeID(int i) {
    id = String.valueOf(i);
  }
  
  public void storeCG(double c){
    cg=c;
  }
  public void addCourse(String c){
    if(cg==0){
      System.out.println("Failed to add "+c+"\nSet CG first");
    }else if(cg>3){
      if(count<4){
      course[count]=c;
      count++;
      }else{
        System.out.println("Maximum 4 courses allowed.");
      }
    }else{
      if(count<3){
        course[count]=c;
        count++;
      }else{
        System.out.println("Failed to add "+c);
        System.out.println("CG is low. Can't add more than 3 courses.");
      }
    }
   }

  public void showAdvisee(){
    System.out.println("Student ID: "+id+", CGPA: "+cg);
    System.out.println("Added Courses are:");
    if(count==0){
      System.out.println("No courses added.");
    }else{
    for(int i=0;i<course.length;i++){
      if(course[i] != null){
        System.out.println(course[i]+" " );
      }
    }
  }
}

  public void addCourse(String c[]){
    for(int i=0;i<c.length;i++){
      addCourse(c[i]);
      if(count>=4){
        break;
      }
    }
  }

  public void removeAllCourse(){
    String [] temp=new String[4];
    course=temp;
    count=0;
  }
}



// package mid.Assingment4;

// public class Student {
//   int id = 0;
//   double cg = 0;
//   String[] course = new String[4];
//   int count = 0;

//   // Constructor with int ID only
//   public Student(int i) {
//     id = i;
//     System.out.println("A student with ID " + id + " has been created.");
//   }

//   // Constructor with int ID and double CG
//   public Student(int i, double c) {
//     id = i;
//     cg = c;
//     System.out.println("A student with ID " + id + " and cgpa " + cg + " has been created.");
//   }

//   public void storeID(int i) {
//     id = i;
//   }

//   public void storeCG(double c) {
//     cg = c;
//   }

//   public void addCourse(String c) {
//     if (cg == 0) {
//       System.out.println("Failed to add " + c + "\nSet CG first");
//     } else if (cg > 3) {
//       if (count < 4) {
//         course[count] = c;
//         count++;
//       } else {
//         System.out.println("Failed to add " + c);
//         System.out.println("Maximum 4 courses allowed.");
//       }
//     } else {
//       if (count < 3) {
//         course[count] = c;
//         count++;
//       } else {
//         System.out.println("Failed to add " + c);
//         System.out.println("CG is low. Can't add more than 3 courses.");
//       }
//     }
//   }

//   public void addCourse(String[] c) {
//     for (int i = 0; i < c.length; i++) {
//       addCourse(c[i]);
//       if (count >= 4) {
//         break;
//       }
//     }
//   }

//   public void showAdvisee() {
//     System.out.println("Student ID: " + id + ", CGPA: " + cg);
//     System.out.println("Added Courses are:");
//     if (count == 0) {
//       System.out.println("No courses added.");
//     } else {
//       for (int i = 0; i < count; i++) {
//         if (course[i] != null) {
//           System.out.print(course[i] + " ");
//         }
//       }
//       System.out.println();
//     }
//   }

//   public void removeAllCourse() {
//     course = new String[4];
//     count = 0;
//   }
// }
