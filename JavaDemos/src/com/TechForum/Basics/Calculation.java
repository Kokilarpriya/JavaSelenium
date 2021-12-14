package com.TechForum.Basics;

public class Calculation {

//Variable declaration
int tamilMarks;
int englishMarks;
int mathMarks;
int scienceMarks;
int socialMarks;
int totalMarks;
double averageMark;
String studentName;

public static void main(String[] args) {
	//Create student object
	Calculation student1 = new Calculation();
	Calculation student2 = new Calculation();
	
	//Student1 score 
	student1.tamilMarks=98;
	student1.englishMarks=98;
	student1.mathMarks=100;
	student1.scienceMarks= 97;
	student1.socialMarks=98;
	
	student1.ttlMarks("Student 1");
	student1.avgMark("Student 1");
	
	System.out.println("********************************");
	//Student2 score
	student2.tamilMarks=94;
	student2.englishMarks=89;
	student2.mathMarks=100;
	student2.scienceMarks= 97;
	student2.socialMarks=88;
	
	student2.ttlMarks("Student2");
	student2.avgMark("Student2");
	System.out.println("********************************");
}


//Total marks
public void ttlMarks(String name){
	totalMarks = tamilMarks+englishMarks+mathMarks+scienceMarks+socialMarks;
	System.out.println("Total marks of "+name+" = "+totalMarks);
}

//Average 
public void avgMark(String name){
	averageMark = (totalMarks)/5;
	System.out.println("Average mark of "+name+" = "+averageMark);
}
}
