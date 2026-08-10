
Third PRD — CampusTrack: Student Academic Management System
Project Overview

CampusTrack is a beginner-friendly Java console application designed to manage and evaluate a student's academic performance.

The application collects student details, course and semester information, subject marks, attendance, assignment scores, scholarship eligibility, fee payment details, and semester-clearance status.

It processes one student at a time and generates a complete semester report. The program can also process another student using a do-while loop.

This is a console-based Java project. It does not use a database, GUI, file storage, arrays, collections, or advanced OOP concepts.

Problem Statement

Develop a Java program that collects and processes:

Student profile
Course and semester details
Marks in five subjects
Overall result, percentage and grade
Attendance information
Assignment scores
Scholarship eligibility
Semester-fee payment
Final semester-clearance status
Detailed recommendations

The application validates numeric inputs, performs the required calculations, and displays the exact reasons whenever a student does not satisfy a condition.

Features
Student profile management
Course selection using a menu
Semester validation
Five-subject mark entry
Marks validation
Total and percentage calculation
Academic result calculation
Grade classification
Attendance percentage calculation
Attendance status
Assignment score processing
Assignment average calculation
Scholarship calculation
Semester fee calculation
Fee payment and balance calculation
Final semester-clearance status
Failed-condition reporting
Personalized recommendations
Multiple-student processing
Technologies Used
Java
JDK
JVM
Scanner
Java control statements and operators
Console input/output
Concepts Used

This project demonstrates:

Variables and primitive data types
String
Scanner
Arithmetic operators
Assignment operators
Relational operators
Logical operators
Explicit type casting
if, else if, else
Nested and compound conditions
switch
Ternary operator
for loop
while loop
do-while loop
break
continue
print
println
printf
Concepts Not Used

The project does not use:

Arrays
Collections
User-defined methods
Additional user-defined classes
Constructors
Exception handling
File handling
Database connectivity
Inheritance
Advanced OOP
Streams
Lambda expressions
GUI
Web development

All program logic can be written inside the main method.

Input Details
Student Profile
Field	Data Type	Validation
Student ID	String	Required
Full Name	String	Complete-line input
Age	int	15–35
Email	String	Required
Course Choice	int	1–5
Semester	int	1–8
Career Goal	String	Complete-line input
Course Options
Choice	Course	Base Semester Fee
1	BCA	₹35,000
2	B.Sc Computer Science	₹30,000
3	B.E/B.Tech	₹50,000
4	MCA	₹45,000
5	Other	₹25,000
Subjects

The application accepts marks for five subjects:

Java
SQL
Web Technology
Aptitude
Communication

Each mark must be between 0 and 100.

Validation Rules
Age
Minimum age: 15
Maximum age: 35
Course
Valid choices: 1–5
Semester
Valid semesters: 1–8
Subject Marks
Valid marks: 0–100
Attendance
Total classes: 1–300
Classes attended cannot be greater than classes conducted.
Assignments
Number of assignments: 1–10
Assignment score: 0–10
-1 finishes assignment entry early.
Invalid scores are skipped using continue.
Fee Payment
Amount paid cannot be negative.
Amount paid cannot exceed the final payable fee.
Academic Result Rules

The minimum passing mark for every subject is 35.

The student passes the academic criteria only when:

Java >= 35
AND SQL >= 35
AND Web Technology >= 35
AND Aptitude >= 35
AND Communication >= 35
AND Percentage >= 40

A high overall percentage cannot hide a failed subject.

Percentage
Total Marks = Java + SQL + Web Technology + Aptitude + Communication

Percentage = (double) Total Marks / 5

The percentage is displayed with two decimal places.

Grade Rules
Condition	Grade
Academic criteria failed	F
Percentage >= 85	A+
Percentage >= 75	A
Percentage >= 65	B
Percentage >= 50	C
Percentage >= 40	D

Grade classification is performed only after checking the academic result.

Attendance Rules

Attendance percentage is calculated using:

Attendance Percentage =
((double) Classes Attended / Total Classes Conducted) * 100

The attendance criteria is passed when:

Attendance Percentage >= 75

Attendance status:

REGULAR

or

SHORTAGE

The status is assigned using the ternary operator.

Assignment Rules

The program accepts between 1 and 10 assignment entries.

Each score must be between 0 and 10.

Special input:

-1 = Finish assignment entry early

Rules:

-1 uses break.
Invalid values use continue.
Valid scores are added to the assignment total.
Only valid scores increase the valid-assignment count.
Invalid scores do not affect the average.
If there are no valid assignments, the average is 0.00.
Assignment Average
Assignment Average =
(double) Total Assignment Score / Valid Assignment Count

The assignment criteria is passed when:

Valid assignment count > 0
AND
Assignment average >= 5

Assignment status:

SATISFACTORY

or

NEEDS IMPROVEMENT
Scholarship Rules

Scholarship is calculated using academic performance and attendance.

Condition	Scholarship
Academic passed, Percentage >= 85, Attendance >= 85	10%
Academic passed, Percentage >= 75, Attendance >= 75	5%
All other cases	0%

The 10% condition must be checked first.

Scholarship Amount
Scholarship Amount =
Base Semester Fee * Scholarship Percentage / 100
Final Payable Fee
Final Payable Fee =
Base Semester Fee - Scholarship Amount
Fee Rules

The amount paid must be between:

0

and

Final Payable Fee
Fee Balance
Fee Balance =
Final Payable Fee - Amount Paid
Fee Status
Fee Balance == 0 ? "PAID" : "PENDING"

All monetary values are displayed with two decimal places.

Final Semester Clearance

The student is cleared for the next semester only when all conditions are satisfied:

Academic criteria passed
AND Attendance >= 75%
AND Assignment criteria passed
AND Fee balance == 0

Final status:

CLEARED FOR NEXT SEMESTER

or

ACTION REQUIRED

Each condition is checked independently so that every failure can be reported.

Failed Conditions

When the final status is ACTION REQUIRED, the program displays every applicable reason.

Possible reasons include:

Java marks are below 35.
SQL marks are below 35.
Web Technology marks are below 35.
Aptitude marks are below 35.
Communication marks are below 35.
Overall percentage is below 40%.
Attendance is below 75%.
Assignment average is below 5.00.
No valid assignment score was entered.
Semester fee is pending.
Recommendations
Failed Condition	Recommendation
Subject below 35	Revisit the failed subject and complete additional practice.
Percentage below 40	Improve overall academic performance.
Attendance below 75%	Attend classes regularly and clear the attendance shortage.
Assignment criteria failed	Complete assignments consistently and maintain an average of at least 5.00.
Fee pending	Pay the pending semester fee before clearance.
All conditions passed	Maintain the current performance in the next semester.

If multiple conditions fail, all relevant recommendations are displayed.

Application Flow
START
   |
   v
Display Welcome Screen
   |
   v
Read Student Profile
   |
   v
Select Course
   |
   v
Read Semester
   |
   v
Read Five Subject Marks
   |
   v
Calculate Total and Percentage
   |
   v
Check Academic Result and Grade
   |
   v
Read Attendance
   |
   v
Calculate Attendance Percentage
   |
   v
Process Assignments
   |
   v
Calculate Assignment Average
   |
   v
Calculate Scholarship
   |
   v
Calculate Final Payable Fee
   |
   v
Read Amount Paid
   |
   v
Calculate Fee Balance
   |
   v
Check Final Clearance
   |
   v
Display Failed Conditions
   |
   v
Display Recommendations
   |
   v
Display Student Report
   |
   v
Process Another Student?
   |
  / \
Yes  No
 |    |
 v    v
Repeat  End
Pseudocode
START

Create Scanner object

Display CampusTrack heading

DO

    Read student ID
    Read full name

    Read age

    WHILE age is outside 15 to 35
        Display error
        Read age again
    END WHILE

    Read email

    DO
        Display course menu
        Read course choice
        Use switch to assign course name and base semester fee
    WHILE course choice is invalid

    Read semester
    Validate semester from 1 to 8

    Consume pending newline
    Read career goal

    Read and validate five subject marks

    Calculate total marks
    Calculate percentage using explicit casting

    Check every subject pass condition
    Check overall academic criteria
    Determine grade

    Read and validate total classes
    Read and validate attended classes

    Calculate attendance percentage
    Determine attendance status

    Read number of assignment entries

    Set assignment total = 0
    Set valid assignment count = 0

    FOR every requested assignment

        Read assignment score

        IF score == -1
            BREAK
        END IF

        IF score is invalid
            CONTINUE
        END IF

        Add score to assignment total
        Increase valid assignment count

    END FOR

    IF valid assignment count > 0
        Calculate assignment average
    ELSE
        Set assignment average = 0
    END IF

    Determine assignment status

    Determine scholarship percentage
    Calculate scholarship amount
    Calculate final payable fee

    Read and validate amount paid

    Calculate fee balance
    Determine fee status

    Check academic condition
    Check attendance condition
    Check assignment condition
    Check fee condition

    Determine final clearance status

    Display complete student report
    Display failed conditions
    Display recommendations

    Ask whether another student should be processed

WHILE choice is 1

Display closing message

Close Scanner

STOP
Sample Input
Enter student ID: STU101
Enter full name: Ananya Rao
Enter age: 20
Enter email: ananya@gmail.com

Select course:
1. BCA
2. B.Sc Computer Science
3. B.E/B.Tech
4. MCA
5. Other

Enter course choice: 3
Enter semester: 4
Enter career goal: Become a Java backend developer

Enter Java marks: 88
Enter SQL marks: 82
Enter Web Technology marks: 79
Enter Aptitude marks: 76
Enter Communication marks: 80

Enter total classes conducted: 120
Enter classes attended: 102

How many assignment scores do you want to enter? 5
Enter score for assignment 1: 8
Enter score for assignment 2: 9
Enter score for assignment 3: 7
Enter score for assignment 4: 8
Enter score for assignment 5: 9

Final payable fee: ₹47500.00
Enter amount paid: 47500
Sample Output
========================================================
                 STUDENT SEMESTER REPORT
========================================================
Student ID                 : STU101
Student Name               : Ananya Rao
Age                        : 20
Email                      : ananya@gmail.com
Course                     : B.E/B.Tech
Semester                   : 4
Career Goal                : Become a Java backend developer

---------------- ACADEMIC SUMMARY --------------------
Java Marks                 : 88
SQL Marks                  : 82
Web Technology Marks       : 79
Aptitude Marks             : 76
Communication Marks        : 80
Total Marks                : 405/500
Percentage                 : 81.00%
Academic Result            : PASSED
Grade                      : A

---------------- ATTENDANCE SUMMARY ------------------
Classes Conducted          : 120
Classes Attended           : 102
Attendance Percentage      : 85.00%
Attendance Status          : REGULAR

---------------- ASSIGNMENT SUMMARY ------------------
Valid Assignments          : 5
Assignment Total           : 41
Assignment Average        : 8.20
Assignment Status          : SATISFACTORY

---------------- FEE SUMMARY -------------------------
Base Semester Fee          : ₹50000.00
Scholarship Percentage     : 5%
Scholarship Amount         : ₹2500.00
Final Payable Fee          : ₹47500.00
Amount Paid                : ₹47500.00
Fee Balance                : ₹0.00
Fee Status                 : PAID

---------------- FINAL STATUS ------------------------
Semester Clearance         : CLEARED FOR NEXT SEMESTER

---------------- FAILED CONDITIONS -------------------
None

---------------- RECOMMENDATIONS ---------------------
Maintain the current performance in the next semester.
========================================================
Test Cases
Test Case 1 — All Conditions Passed
Marks: 88, 82, 79, 76, 80
Attendance: 102/120
Assignments: 8, 9, 7, 8, 9
Course: B.E/B.Tech
Amount Paid: ₹47,500

Expected:

Academic Result     : PASSED
Grade               : A
Attendance Status   : REGULAR
Assignment Status   : SATISFACTORY
Fee Status          : PAID
Semester Clearance  : CLEARED FOR NEXT SEMESTER
Test Case 2 — Failed Subject
Java: 90
SQL: 90
Web Technology: 90
Aptitude: 30
Communication: 90

Expected:

Percentage      : 78.00%
Academic Result : FAILED
Grade           : F

Failed condition:

Aptitude marks are below 35.
Test Case 3 — Boundary Values
All subject marks: 40
Attendance: 75/100
Assignment scores: 5, 5, 5
Fee: Fully paid

Expected:

Percentage             : 40.00%
Academic Result        : PASSED
Grade                  : D
Attendance Percentage  : 75.00%
Attendance Status      : REGULAR
Assignment Average     : 5.00
Assignment Status      : SATISFACTORY
Semester Clearance     : CLEARED FOR NEXT SEMESTER
Test Case 4 — Attendance Shortage and Pending Fee
Attendance: 70/100
Assignment Average: 7.00
Final Payable Fee: ₹35,000
Amount Paid: ₹20,000

Expected:

Attendance Percentage : 70.00%
Attendance Status     : SHORTAGE
Fee Balance           : ₹15000.00
Fee Status            : PENDING
Semester Clearance    : ACTION REQUIRED
Test Case 5 — Assignment break and continue
Assignment 1: 8
Assignment 2: 15
Assignment 3: 6
Assignment 4: -1

Expected:

Valid Assignments  : 2
Assignment Total   : 14
Assignment Average : 7.00
Assignment Status  : SATISFACTORY

This verifies:

continue for invalid input
break for -1
Test Case 6 — No Valid Assignment
Assignment 1: 15
Assignment 2: 12
Assignment 3: -1

Expected:

Valid Assignments  : 0
Assignment Total   : 0
Assignment Average : 0.00
Assignment Status  : NEEDS IMPROVEMENT

The program must not divide by zero.




Repository Structure
Third-PRD/
│
├── README.md
│
├── src/
│   └── Main.java
│
├── pseudocode/
│   └── pseudocode.txt
│
└── output/
    ├── test-case-1.txt
    ├── test-case-2.txt
    ├── test-case-3.txt
    ├── test-case-4.txt
    └── test-case-5.txt
