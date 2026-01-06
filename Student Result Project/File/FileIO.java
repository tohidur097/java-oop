package File;

import model.*;
import java.io.*;
import java.util.Scanner;

public class FileIO {

    public static void loadFromFile(Student[] students, Result[] results) {
        try {
            // ===== Load students =====
            Scanner sc = new Scanner(new File("./File/students.txt"));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.trim().isEmpty()) continue;

                String[] data = line.split(";");
                int index = Integer.parseInt(data[0]);

                String id = data[1];
                String name = data[2];
                String email = data[3];
                String dept = data[4];
                String batch = data[5];

                students[index] = new Student(id, name, email, dept, batch);
                results[index].setStudentId(id);
            }
            sc.close();

            // ===== Load results/subjects =====
            File f = new File("./File/results.txt");
            if (!f.exists()) return; // results file না থাকলেও run হবে

            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.trim().isEmpty()) continue;

                String[] data = line.split(";");

                int studentIndex = Integer.parseInt(data[0]);
                int pos = Integer.parseInt(data[1]);

                String code = data[2];
                String title = data[3];
                double credit = Double.parseDouble(data[4]);
                double marks = Double.parseDouble(data[5]);

                Subject sub = new Subject(code, title, credit);
                sub.setMarks(marks);

                results[studentIndex].insertSubject(pos, sub);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void saveChangesInFile(Student[] students, Result[] results) {
        try {
            // ===== Save students =====
            BufferedWriter bw = new BufferedWriter(new FileWriter("./File/students.txt"));

            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    // index;id;name;email;dept;batch
                    String line = i + ";" +
                            students[i].getId() + ";" +
                            students[i].getName() + ";" +
                            students[i].getEmail() + ";" +
                            students[i].getDept() + ";" +
                            students[i].getBatch();
                    bw.write(line);
                    bw.newLine();
                }
            }
            bw.close();

            // ===== Save results/subjects =====
            bw = new BufferedWriter(new FileWriter("./File/results.txt"));

            for (int i = 0; i < results.length; i++) {
                if (students[i] != null && results[i] != null) {
                    Subject[] subs = results[i].getAllSubjects(); // তুমি add করেছিলে
                    for (int pos = 0; pos < subs.length; pos++) {
                        if (subs[pos] != null) {
                            // studentIndex;subjectPos;code;title;credit;marks
                            String line = i + ";" + pos + ";" +
                                    subs[pos].getCode() + ";" +
                                    subs[pos].getTitle() + ";" +
                                    subs[pos].getCredit() + ";" +
                                    subs[pos].getMarks();
                            bw.write(line);
                            bw.newLine();
                        }
                    }
                }
            }

            bw.close();

        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }
    }
}
