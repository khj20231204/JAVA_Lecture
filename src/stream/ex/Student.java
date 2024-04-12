package stream.ex;

public class Student implements Comparable<Student>{
   String name;
   int ban;
   int totalScore;
   Student(String name, int ban, int totalScore){
      this.name = name;
      this.ban = ban;
      this.totalScore = totalScore;
   }

   public String toString(){
      return String.format("[%s %d %d]",name, ban, totalScore);
   }

   String getName(){
      return name;
   }

   int getBan(){
      return ban;
   }

   int getTotalScore(){
      return totalScore;
   }
   @Override
   public int compareTo(Student o) {
      return this.totalScore - o.totalScore;
   }
}
