package File;

import model.*;
import java.io.*;
import java.util.Scanner;

public class FileIO {

    public static void loadFromFile(Student[] students, Result[] results) {

        try {
            Scanner sc = new Scanner(new File("./File/data.txt"));

            while (sc.hasNextLine()) {

                String line = sc.nextLine();
                String[] data = line.split(";");

                int index = Integer.parseInt(data[0]);
                String id = data[1];
                String name = data[2];
                String email = data[3];
                String dept = data[4];
                String batch = data[5];

                students[index] = new Student(id, name, email, dept, batch);
                results[index] = new Result(id, 5);
            }
            sc.close();

            sc = new Scanner(new File("./File/marks.txt"));

            while (sc.hasNextLine()) {

                String line = sc.nextLine();
                String[] data = line.split(";");

                int sIdx = Integer.parseInt(data[0]);
                int pos = Integer.parseInt(data[1]);
                String code = data[2];
                String title = data[3];
                double credit = Double.parseDouble(data[4]);
                double marks = Double.parseDouble(data[5]);

                if (results[sIdx] != null) {
                    Subject sub = new Subject(code, title, credit);
                    sub.setMarks(marks);
                    results[sIdx].insertSubject(pos, sub);
                }
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void saveChangesInFile(Student[] students, Result[] results) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("./File/data.txt"));

            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {

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

            bw = new BufferedWriter(new FileWriter("./File/marks.txt"));

            for (int i = 0; i < results.length; i++) {

                if (results[i] != null) {

                    Subject[] subs = results[i].getAllSubjects();

                    for (int j = 0; j < subs.length; j++) {
                        if (subs[j] != null) {

                            String line = i + ";" + j + ";" +
                                    subs[j].getCode() + ";" +
                                    subs[j].getTitle() + ";" +
                                    subs[j].getCredit() + ";" +
                                    subs[j].getMarks();

                            bw.write(line);
                            bw.newLine();
                        }
                    }
                }
            }
            bw.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
