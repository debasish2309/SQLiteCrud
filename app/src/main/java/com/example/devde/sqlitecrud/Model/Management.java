package com.example.devde.sqlitecrud.Model;

public class Management {
    private String branch;
    private String teacher;
    private String subject;
    private String semester;
    private String block;
    private String teacherno;
    private String studentno;
    private String time;

    public Management() {
    }

    public Management(String branch, String teacher, String subject, String semester, String block, String teacherno, String studentno, String time) {
        this.branch = branch;
        this.teacher = teacher;
        this.subject = subject;
        this.semester = semester;
        this.block = block;
        this.teacherno = teacherno;
        this.studentno = studentno;
        this.time = time;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getTeacherno() {
        return teacherno;
    }

    public void setTeacherno(String teacherno) {
        this.teacherno = teacherno;
    }

    public String getStudentno() {
        return studentno;
    }

    public void setStudentno(String studentno) {
        this.studentno = studentno;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
