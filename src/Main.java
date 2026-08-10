
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int processAnother = 0;

        do {
            // FR-01: Welcome Screen
            System.out.println("========================================================");
            System.out.println("                    CAMPUSTRACK");
            System.out.println("========================================================");
            System.out.println("       Student Academic Management System");
            System.out.println("--------------------------------------------------------");

            // FR-02: Student Profile
            System.out.print("Enter student ID: ");
            String studentId = sc.next();

            // Consume pending newline before reading full name
            sc.nextLine();

            System.out.print("Enter full name: ");
            String fullName = sc.nextLine();

            // Age input with validation (15-35)
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            while (age < 15 || age > 35) {
                System.out.println("Invalid age. Enter a value between 15 and 35.");
                System.out.print("Enter age: ");
                age = sc.nextInt();
            }
            System.out.println("Age accepted.");

            System.out.print("Enter email: ");
            String email = sc.next();

            // Course selection loop
            int courseChoice = 0;
            String courseName = "";
            double baseSemesterFee = 0.0;

            while (true) {
                System.out.println("\nSelect course:");
                System.out.println("1. BCA");
                System.out.println("2. B.Sc Computer Science");
                System.out.println("3. B.E/B.Tech");
                System.out.println("4. MCA");
                System.out.println("5. Other");
                System.out.print("\nEnter course choice: ");
                courseChoice = sc.nextInt();

                switch (courseChoice) {
                    case 1:
                        courseName = "BCA";
                        baseSemesterFee = 35000.00;
                        break;
                    case 2:
                        courseName = "B.Sc Computer Science";
                        baseSemesterFee = 30000.00;
                        break;
                    case 3:
                        courseName = "B.E/B.Tech";
                        baseSemesterFee = 50000.00;
                        break;
                    case 4:
                        courseName = "MCA";
                        baseSemesterFee = 45000.00;
                        break;
                    case 5:
                        courseName = "Other";
                        baseSemesterFee = 25000.00;
                        break;
                    default:
                        System.out.println("Invalid course choice. Select a value from 1 to 5.");
                }

                if (courseChoice >= 1 && courseChoice <= 5) {
                    System.out.println("Course selected: " + courseName);
                    break;
                }
            }

            System.out.print("Enter semester (1-8): ");
            int semester = sc.nextInt();

            // Consume pending newline before reading career goal
            sc.nextLine();

            System.out.print("Enter career goal: ");
            String careerGoal = sc.nextLine();

            // FR-03: Subject Marks Validation
            System.out.println();
            System.out.print("Enter Java marks: ");
            int javaMarks = sc.nextInt();
            while (javaMarks < 0 || javaMarks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
                System.out.print("Enter Java marks: ");
                javaMarks = sc.nextInt();
            }
            System.out.println("Java marks accepted.");

            System.out.print("Enter SQL marks: ");
            int sqlMarks = sc.nextInt();
            while (sqlMarks < 0 || sqlMarks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
                System.out.print("Enter SQL marks: ");
                sqlMarks = sc.nextInt();
            }

            System.out.print("Enter Web Technology marks: ");
            int webTechMarks = sc.nextInt();
            while (webTechMarks < 0 || webTechMarks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
                System.out.print("Enter Web Technology marks: ");
                webTechMarks = sc.nextInt();
            }

            System.out.print("Enter Aptitude marks: ");
            int aptitudeMarks = sc.nextInt();
            while (aptitudeMarks < 0 || aptitudeMarks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
                System.out.print("Enter Aptitude marks: ");
                aptitudeMarks = sc.nextInt();
            }

            System.out.print("Enter Communication marks: ");
            int commMarks = sc.nextInt();
            while (commMarks < 0 || commMarks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
                System.out.print("Enter Communication marks: ");
                commMarks = sc.nextInt();
            }

            // FR-04: Total and Percentage Calculations
            int totalMarks = javaMarks + sqlMarks + webTechMarks + aptitudeMarks + commMarks;
            double percentage = (double) totalMarks / 5.0;

            // FR-05: Academic Result Check
            boolean academicPassed = (javaMarks >= 35) && (sqlMarks >= 35) && (webTechMarks >= 35)
                    && (aptitudeMarks >= 35) && (commMarks >= 35) && (percentage >= 40.0);
            String academicResult = academicPassed ? "PASSED" : "FAILED";

            // FR-06: Grade Classification
            String grade;
            if (!academicPassed) {
                grade = "F";
            } else if (percentage >= 85.0) {
                grade = "A+";
            } else if (percentage >= 75.0) {
                grade = "A";
            } else if (percentage >= 65.0) {
                grade = "B";
            } else if (percentage >= 50.0) {
                grade = "C";
            } else {
                grade = "D";
            }

            // FR-07: Attendance Validation & Calculation
            System.out.println();
            System.out.print("Enter total classes conducted: ");
            int totalClasses = sc.nextInt();
            while (totalClasses < 1 || totalClasses > 300) {
                System.out.println("Invalid classes conducted. Enter a value between 1 and 300.");
                System.out.print("Enter total classes conducted: ");
                totalClasses = sc.nextInt();
            }

            System.out.print("Enter classes attended: ");
            int attendedClasses = sc.nextInt();
            while (attendedClasses < 0 || attendedClasses > totalClasses) {
                System.out.println("Invalid attendance. Attended classes cannot exceed " + totalClasses + ".");
                System.out.print("Enter classes attended: ");
                attendedClasses = sc.nextInt();
            }
            System.out.println("Attendance accepted.");

            double attendancePercentage = ((double) attendedClasses / totalClasses) * 100.0;
            String attendanceStatus = (attendancePercentage >= 75.0) ? "REGULAR" : "SHORTAGE";

            // FR-08: Assignment Scores Processing
            System.out.println();
            System.out.print("How many assignment scores do you want to enter? ");
            int numAssignments = sc.nextInt();
            while (numAssignments < 1 || numAssignments > 10) {
                System.out.println("Invalid number of assignments. Enter a value between 1 and 10.");
                System.out.print("How many assignment scores do you want to enter? ");
                numAssignments = sc.nextInt();
            }

            int validAssignmentCount = 0;
            int assignmentTotal = 0;

            for (int i = 1; i <= numAssignments; i++) {
                System.out.print("Enter score for assignment " + i + " (0-10, -1 to finish): ");
                int score = sc.nextInt();

                if (score == -1) {
                    System.out.println("Assignment entry completed early.");
                    break;
                }

                if (score < -1 || score > 10) {
                    System.out.println("Invalid score. Assignment " + i + " skipped.");
                    continue;
                }

                assignmentTotal += score;
                validAssignmentCount++;
                System.out.println("Assignment score accepted.");
            }

            double assignmentAverage = 0.0;
            if (validAssignmentCount > 0) {
                assignmentAverage = (double) assignmentTotal / validAssignmentCount;
            }

            boolean assignmentPassed = (validAssignmentCount > 0) && (assignmentAverage >= 5.0);
            String assignmentStatus = assignmentPassed ? "SATISFACTORY" : "NEEDS IMPROVEMENT";

            // FR-09: Scholarship Calculation
            int scholarshipPercentage = 0;
            if (academicPassed && percentage >= 85.0 && attendancePercentage >= 85.0) {
                scholarshipPercentage = 10;
            } else if (academicPassed && percentage >= 75.0 && attendancePercentage >= 75.0) {
                scholarshipPercentage = 5;
            }

            double scholarshipAmount = (baseSemesterFee * scholarshipPercentage) / 100.0;
            double finalPayableFee = baseSemesterFee - scholarshipAmount;

            // FR-10: Fee Payment Validation & Calculation
            System.out.println();
            System.out.printf("Final payable fee: ₹%.2f\n", finalPayableFee);
            System.out.print("Enter amount paid: ");
            double amountPaid = sc.nextDouble();
            while (amountPaid < 0 || amountPaid > finalPayableFee) {
                System.out.println("Invalid amount. Enter a value between 0 and " + finalPayableFee);
                System.out.print("Enter amount paid: ");
                amountPaid = sc.nextDouble();
            }

            double feeBalance = finalPayableFee - amountPaid;
            String feeStatus = (feeBalance == 0) ? "PAID" : "PENDING";

            // FR-11: Final Clearance Status
            boolean finalCleared = academicPassed && (attendancePercentage >= 75.0) && assignmentPassed && (feeBalance == 0);
            String clearanceStatus = finalCleared ? "CLEARED FOR NEXT SEMESTER" : "ACTION REQUIRED";

            // Display Report
            System.out.println("\n========================================================");
            System.out.println("                 STUDENT SEMESTER REPORT");
            System.out.println("========================================================");
            System.out.printf("%-27s: %s\n", "Student ID", studentId);
            System.out.printf("%-27s: %s\n", "Student Name", fullName);
            System.out.printf("%-27s: %d\n", "Age", age);
            System.out.printf("%-27s: %s\n", "Email", email);
            System.out.printf("%-27s: %s\n", "Course", courseName);
            System.out.printf("%-27s: %d\n", "Semester", semester);
            System.out.printf("%-27s: %s\n", "Career Goal", careerGoal);

            System.out.println("\n---------------- ACADEMIC SUMMARY --------------------");
            System.out.printf("%-27s: %d\n", "Java Marks", javaMarks);
            System.out.printf("%-27s: %d\n", "SQL Marks", sqlMarks);
            System.out.printf("%-27s: %d\n", "Web Technology Marks", webTechMarks);
            System.out.printf("%-27s: %d\n", "Aptitude Marks", aptitudeMarks);
            System.out.printf("%-27s: %d\n", "Communication Marks", commMarks);
            System.out.printf("%-27s: %d/500\n", "Total Marks", totalMarks);
            System.out.printf("%-27s: %.2f%%\n", "Percentage", percentage);
            System.out.printf("%-27s: %s\n", "Academic Result", academicResult);
            System.out.printf("%-27s: %s\n", "Grade", grade);

            System.out.println("\n---------------- ATTENDANCE SUMMARY ------------------");
            System.out.printf("%-27s: %d\n", "Classes Conducted", totalClasses);
            System.out.printf("%-27s: %d\n", "Classes Attended", attendedClasses);
            System.out.printf("%-27s: %.2f%%\n", "Attendance Percentage", attendancePercentage);
            System.out.printf("%-27s: %s\n", "Attendance Status", attendanceStatus);

            System.out.println("\n---------------- ASSIGNMENT SUMMARY ------------------");
            System.out.printf("%-27s: %d\n", "Valid Assignments", validAssignmentCount);
            System.out.printf("%-27s: %d\n", "Assignment Total", assignmentTotal);
            System.out.printf("%-27s: %.2f\n", "Assignment Average", assignmentAverage);
            System.out.printf("%-27s: %s\n", "Assignment Status", assignmentStatus);

            System.out.println("\n---------------- FEE SUMMARY -------------------------");
            System.out.printf("%-27s: ₹%.2f\n", "Base Semester Fee", baseSemesterFee);
            System.out.printf("%-27s: %d%%\n", "Scholarship Percentage", scholarshipPercentage);
            System.out.printf("%-27s: ₹%.2f\n", "Scholarship Amount", scholarshipAmount);
            System.out.printf("%-27s: ₹%.2f\n", "Final Payable Fee", finalPayableFee);
            System.out.printf("%-27s: ₹%.2f\n", "Amount Paid", amountPaid);
            System.out.printf("%-27s: ₹%.2f\n", "Fee Balance", feeBalance);
            System.out.printf("%-27s: %s\n", "Fee Status", feeStatus);

            System.out.println("\n---------------- FINAL STATUS ------------------------");
            System.out.printf("%-27s: %s\n", "Semester Clearance", clearanceStatus);

            // FR-12: Failed Conditions
            System.out.println("\n---------------- FAILED CONDITIONS -------------------");
            if (finalCleared) {
                System.out.println("None");
            } else {
                if (javaMarks < 35) {
                    System.out.println("- Java marks are below 35.");
                }
                if (sqlMarks < 35) {
                    System.out.println("- SQL marks are below 35.");
                }
                if (webTechMarks < 35) {
                    System.out.println("- Web Technology marks are below 35.");
                }
                if (aptitudeMarks < 35) {
                    System.out.println("- Aptitude marks are below 35.");
                }
                if (commMarks < 35) {
                    System.out.println("- Communication marks are below 35.");
                }
                if (percentage < 40.0) {
                    System.out.println("- Overall percentage is below 40%.");
                }
                if (attendancePercentage < 75.0) {
                    System.out.println("- Attendance is below 75%.");
                }
                if (validAssignmentCount == 0) {
                    System.out.println("- No valid assignment score was entered.");
                } else if (assignmentAverage < 5.0) {
                    System.out.println("- Assignment average is below 5.00.");
                }
                if (feeBalance > 0) {
                    System.out.println("- Semester fee is pending.");
                }
            }

            // FR-13: Recommendations
            System.out.println("\n---------------- RECOMMENDATIONS ---------------------");
            if (finalCleared) {
                System.out.println("Maintain the current performance in the next semester.");
            } else {
                if (javaMarks < 35 || sqlMarks < 35 || webTechMarks < 35 || aptitudeMarks < 35 || commMarks < 35) {
                    System.out.println("- Revisit the failed subject and complete additional practice.");
                }
                if (percentage < 40.0) {
                    System.out.println("- Improve overall academic performance.");
                }
                if (attendancePercentage < 75.0) {
                    System.out.println("- Attend classes regularly and clear the attendance shortage.");
                }
                if (!assignmentPassed) {
                    System.out.println("- Complete assignments consistently and maintain an average of at least 5.00.");
                }
                if (feeBalance > 0) {
                    System.out.println("- Pay the pending semester fee before clearance.");
                }
            }
            System.out.println("========================================================");

            // FR-14: Process Another Student Loop
            System.out.println("\nDo you want to process another student?");
            System.out.println("1. Yes");
            System.out.println("0. No");
            System.out.print("Enter choice: ");
            processAnother = sc.nextInt();

            while (processAnother != 0 && processAnother != 1) {
                System.out.println("Invalid choice. Enter 1 or 0.");
                System.out.print("Enter choice: ");
                processAnother = sc.nextInt();
            }

        } while (processAnother == 1);

        System.out.println("Thank you for using CampusTrack.");
        sc.close();
    }
}
