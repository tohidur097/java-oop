package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.*;
import File.*;   // FileIO
// import java.util.Random; // team project এ ছিল, এখানে লাগছে না

public class StudentManagerPage extends JFrame implements ActionListener, MouseListener {

    Font font15 = new Font("Consolas", Font.BOLD, 15);

    // ===== Labels =====
    JLabel title;
    JLabel studentLabel, marksLabel;

    JLabel studentIndexLabel, studentIdLabel, studentNameLabel, studentEmailLabel, studentDeptLabel, studentBatchLabel;

    JLabel marksStudentIndexLabel, subjectPosLabel, codeLabel, subTitleLabel, creditLabel, marksValueLabel;

    // ===== Buttons =====
    JButton createStudentButton, updateStudentButton, removeStudentButton;
    JButton addSubjectButton, removeSubjectButton;

    JButton studentClearButton, subjectClearButton;

    JButton searchButton, saveChangesButton;

    // ===== TextFields =====
    JTextField studentIndexTF, studentIdTF, studentNameTF, studentEmailTF, studentDeptTF, studentBatchTF;

    JTextField marksStudentIndexTF, subjectPosTF, codeTF, subTitleTF, creditTF, marksTF;

    JTextField searchTF;

    // ===== Screen =====
    JTextArea screen;

    // ===== Data =====
    Student[] students = new Student[100];
    Result[] results = new Result[100];

    public StudentManagerPage() {

        super("Student Result Manager");
        this.setSize(900, 1080);
        this.setLocation(150, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);

        // Result array init (null crash avoid)
        for (int i = 0; i < results.length; i++) {
            results[i] = new Result();
        }

        // ✅ Load from file (Team project এর মতো)
        FileIO.loadFromFile(students, results);

        // ===== Top Bar =====
        title = createLabel(10, 0, 350, 30, "Student Result Management");

        searchTF = createTextField(380, 5, 150, 30, "");
        searchButton = createButton(540, 5, 140, 30, "Search Index");

        saveChangesButton = createButton(690, 5, 180, 30, "Save Changes");
        saveChangesButton.setBackground(Color.YELLOW);

        // ===== Student Section =====
        studentLabel = createLabel(10, 40, 220, 30, "Create / Edit Student");

        studentClearButton = createButton(250, 40, 100, 30, "Clear");
        studentClearButton.setBackground(new Color(220, 220, 220));

        studentIndexLabel = createLabel(10, 80, 150, 30, "Array Index");
        studentIndexTF = createTextField(160, 80, 190, 30, "");

        studentIdLabel = createLabel(10, 120, 150, 30, "Student ID");
        studentIdTF = createTextField(160, 120, 190, 30, "");

        studentNameLabel = createLabel(10, 160, 150, 30, "Name");
        studentNameTF = createTextField(160, 160, 190, 30, "");

        studentEmailLabel = createLabel(10, 200, 150, 30, "Email");
        studentEmailTF = createTextField(160, 200, 190, 30, "");

        studentDeptLabel = createLabel(10, 240, 150, 30, "Dept");
        studentDeptTF = createTextField(160, 240, 190, 30, "");

        studentBatchLabel = createLabel(10, 280, 150, 30, "Batch");
        studentBatchTF = createTextField(160, 280, 190, 30, "");

        createStudentButton = createButton(10, 320, 340, 30, "Create Student");

        updateStudentButton = createButton(10, 360, 165, 30, "Update");
        updateStudentButton.setBackground(new Color(66, 179, 255));
        updateStudentButton.setForeground(Color.WHITE);

        removeStudentButton = createButton(185, 360, 165, 30, "Remove");
        removeStudentButton.setBackground(Color.RED);
        removeStudentButton.setForeground(Color.WHITE);

        // ===== Marks Section =====
        marksLabel = createLabel(10, 410, 250, 30, "Subject-wise Marks");

        subjectClearButton = createButton(250, 410, 100, 30, "Clear");
        subjectClearButton.setBackground(new Color(220, 220, 220));

        marksStudentIndexLabel = createLabel(10, 450, 150, 30, "Student Index");
        marksStudentIndexTF = createTextField(160, 450, 190, 30, "");

        subjectPosLabel = createLabel(10, 490, 150, 30, "Subject Pos");
        subjectPosTF = createTextField(160, 490, 190, 30, "");

        codeLabel = createLabel(10, 530, 150, 30, "Code");
        codeTF = createTextField(160, 530, 190, 30, "");

        subTitleLabel = createLabel(10, 570, 150, 30, "Title");
        subTitleTF = createTextField(160, 570, 190, 30, "");

        creditLabel = createLabel(10, 610, 150, 30, "Credit");
        creditTF = createTextField(160, 610, 90, 30, "");

        marksValueLabel = createLabel(260, 610, 70, 30, "Marks");
        marksTF = createTextField(320, 610, 30, 30, "");

        addSubjectButton = createButton(10, 650, 165, 30, "Add/Update");
        removeSubjectButton = createButton(185, 650, 165, 30, "Remove");
        removeSubjectButton.setBackground(Color.RED);
        removeSubjectButton.setForeground(Color.WHITE);

        // ===== Screen =====
        screen = new JTextArea();
        screen.setFont(font15);
        screen.setEditable(false);
        JScrollPane sp = new JScrollPane(screen);
        sp.setBounds(370, 40, 500, 620);
        this.add(sp);

        updateScreen();
        this.setVisible(true);
    }

    // ===== Helper methods (TeamManagerPage style) =====
    JLabel createLabel(int x, int y, int w, int h, String text) {
        JLabel c = new JLabel(text);
        c.setBounds(x, y, w, h);
        c.setFont(font15);
        this.add(c);
        return c;
    }

    JTextField createTextField(int x, int y, int w, int h, String text) {
        JTextField c = new JTextField(text);
        c.setBounds(x, y, w, h);
        c.setFont(font15);
        c.addActionListener(this);
        this.add(c);
        return c;
    }

    JButton createButton(int x, int y, int w, int h, String text) {
        JButton c = new JButton(text);
        c.setBounds(x, y, w, h);
        c.setFont(font15);
        c.setBackground(new Color(66, 245, 179));
        c.addActionListener(this);
        c.addMouseListener(this);
        this.add(c);
        return c;
    }

    // ===== Screen update (Team.getTeam() style string build) =====
    public void updateScreen() {
        String all = "";
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                all += "======== Index: " + i + " ========\n";
                all += students[i].getStudent() + "\n";
                all += results[i].getResult() + "\n";
                all += "==============================\n\n";
            }
        }
        screen.setText(all);
    }

    // ===== Basic parsers =====
    private int toInt(String s) {
        try { return Integer.parseInt(s.trim()); }
        catch (Exception e) { return -1; }
    }
    private double toDouble(String s) {
        try { return Double.parseDouble(s.trim()); }
        catch (Exception e) { return -1; }
    }

    // ===== Actions =====
    @Override
    public void actionPerformed(ActionEvent e) {

        // Create Student
        if (e.getSource() == createStudentButton) {
            int idx = toInt(studentIndexTF.getText());
            String id = studentIdTF.getText().trim();
            String name = studentNameTF.getText().trim();
            String email = studentEmailTF.getText().trim();
            String dept = studentDeptTF.getText().trim();
            String batch = studentBatchTF.getText().trim();

            if (idx < 0 || idx >= students.length || id.isEmpty() || name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter valid Index, ID, Name!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (students[idx] != null) {
                JOptionPane.showMessageDialog(this, "Index already taken!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            students[idx] = new Student(id, name, email, dept, batch);
            results[idx].setStudentId(id);
            updateScreen();
        }

        // Update Student
        else if (e.getSource() == updateStudentButton) {
            int idx = toInt(studentIndexTF.getText());
            if (idx < 0 || idx >= students.length || students[idx] == null) {
                JOptionPane.showMessageDialog(this, "Student not found!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Student class এ setters থাকা লাগবে
            students[idx].setName(studentNameTF.getText().trim());
            students[idx].setEmail(studentEmailTF.getText().trim());
            students[idx].setDept(studentDeptTF.getText().trim());
            students[idx].setBatch(studentBatchTF.getText().trim());

            updateScreen();
        }

        // Remove Student
        else if (e.getSource() == removeStudentButton) {
            int idx = toInt(studentIndexTF.getText());
            if (idx < 0 || idx >= students.length || students[idx] == null) {
                JOptionPane.showMessageDialog(this, "Student not found!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (JOptionPane.showConfirmDialog(this, "Remove this student?") == JOptionPane.YES_OPTION) {
                students[idx] = null;
                results[idx] = new Result();
                updateScreen();
            }
        }

        // Add/Update Subject
        else if (e.getSource() == addSubjectButton) {
            int sIdx = toInt(marksStudentIndexTF.getText());
            int pos = toInt(subjectPosTF.getText());

            String code = codeTF.getText().trim();
            String title = subTitleTF.getText().trim();
            double credit = toDouble(creditTF.getText());
            double marks = toDouble(marksTF.getText());

            if (sIdx < 0 || sIdx >= students.length || students[sIdx] == null) {
                JOptionPane.showMessageDialog(this, "Student not found!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (pos < 0) {
                JOptionPane.showMessageDialog(this, "Invalid subject position!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (code.isEmpty() || credit < 0 || marks < 0) {
                JOptionPane.showMessageDialog(this, "Enter valid Code/Credit/Marks!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Subject sub = new Subject(code, title, credit);
            sub.setMarks(marks);

            results[sIdx].setStudentId(students[sIdx].getId());
            results[sIdx].insertSubject(pos, sub);

            updateScreen();
        }

        // Remove Subject
        else if (e.getSource() == removeSubjectButton) {
            int sIdx = toInt(marksStudentIndexTF.getText());
            int pos = toInt(subjectPosTF.getText());

            if (sIdx < 0 || sIdx >= students.length || students[sIdx] == null) {
                JOptionPane.showMessageDialog(this, "Student not found!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (JOptionPane.showConfirmDialog(this, "Remove subject?") == JOptionPane.YES_OPTION) {
                results[sIdx].removeSubject(pos);
                updateScreen();
            }
        }

        // Clear student form
        else if (e.getSource() == studentClearButton) {
            studentIndexTF.setText("");
            studentIdTF.setText("");
            studentNameTF.setText("");
            studentEmailTF.setText("");
            studentDeptTF.setText("");
            studentBatchTF.setText("");
        }

        // Clear subject form
        else if (e.getSource() == subjectClearButton) {
            marksStudentIndexTF.setText("");
            subjectPosTF.setText("");
            codeTF.setText("");
            subTitleTF.setText("");
            creditTF.setText("");
            marksTF.setText("");
        }

        // Search
        else if (e.getSource() == searchButton) {
            int idx = toInt(searchTF.getText());
            if (idx < 0 || idx >= students.length || students[idx] == null) {
                JOptionPane.showMessageDialog(this, "Not found!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            screen.setText("======== Index: " + idx + " ========\n"
                    + students[idx].getStudent() + "\n"
                    + results[idx].getResult() + "\n");
        }

        // Save Changes
        else if (e.getSource() == saveChangesButton) {
            if (JOptionPane.showConfirmDialog(this, "Save Changes?") == JOptionPane.YES_OPTION) {
                FileIO.saveChangesInFile(students, results);
                JOptionPane.showMessageDialog(this, "Saved!");
            }
        }
    }

    // ===== Mouse effects (same vibe) =====
    public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}

    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == createStudentButton) {
            createStudentButton.setBackground(new Color(66, 200, 100));
            createStudentButton.setForeground(Color.WHITE);
        }
    }

    public void mouseExited(MouseEvent me) {
        if (me.getSource() == createStudentButton) {
            createStudentButton.setBackground(new Color(66, 245, 179));
            createStudentButton.setForeground(Color.BLACK);
        }
    }
}
