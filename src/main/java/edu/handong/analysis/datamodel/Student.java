package edu.handong.analysis.datamodel;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
   private String studentId;
   private ArrayList<Course> courseTaken;
   private HashMap<String,Integer> semestersByYearAndSemester;
   
   public Student(String studentId) { //constructor
      this.studentId = studentId;
      courseTaken = new ArrayList<Course>();
      semestersByYearAndSemester = new HashMap<String,Integer>();
   }
   
   public void addCourse(Course newRecord) {
      courseTaken.add(newRecord);
   }
   public HashMap<String,Integer> getSemesterByYearAndSemester(){
      HashMap<String,Integer> myHashmap = new HashMap<String,Integer>();
      int num = 1;
      for (Course cour : courseTaken)
      {         
         if (!myHashmap.containsKey(studentId))
         {
            myHashmap.put(studentId, num);
            num++;
         }
      }
      
      return myHashmap;
   }
   public int getNumCourseInNthSementer(int semester) {
      int count = 1;
      String key = null;
      for(Course cour : courseTaken) {
         key += cour.getYearTaken();
         key += "-";
         key += cour.getSemesterCourseTaken();
   
      }
      
      return count;
   }
}