package edu.handong.analysis.datamodel;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
   private String studentId;
   private ArrayList<Course> courseTaken = new ArrayList<Course>();
   private HashMap<String,Integer> semestersByYearAndSemester;
   
   public Student(String studentId) { //constructor
      this.studentId = studentId;
   }
   
   public void addCourse(Course newRecord) {
      courseTaken.add(newRecord);
   }
   
   public HashMap<String,Integer> getSemesterByYearAndSemester(){
      HashMap<String,Integer> myHashmap = new HashMap<String,Integer>();
      
      int num = 1;
      for (Course courses : courseTaken)
      {         
         if (!semestersByYearAndSemester.containsKey(studentId))
         {
        	 semestersByYearAndSemester.put(studentId, num);
            num++;
         }
      }
      
      return semestersByYearAndSemester;
   }
   
   public int getNumCourseInNthSementer(int semester) {
      int count = 0;
      String key = null;
      for(Course cour : courseTaken) {
         key += cour.getYearTaken();
         key += "-";
         key += cour.getSemesterCourseTaken();
   
      }
      
      return count;
   }
}