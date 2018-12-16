package com.example.devde.sqlitecrud.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.devde.sqlitecrud.Model.Management;
import com.example.devde.sqlitecrud.R;

import java.util.ArrayList;

public class ManagementAdapter extends RecyclerView.Adapter<ManagementAdapter.MyViewHolder> {

    ArrayList<Management> managements = new ArrayList<>();
    Context context;

    public ManagementAdapter(ArrayList<Management> managements, Context context) {
        this.managements = managements;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.select_card_view,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Management management = managements.get(position);
        holder.branch.setText(management.getBranch());
//        holder.teacher.setText(management.getTeacher());
//        holder.subject.setText(management.getSubject());
//        holder.semester.setText(management.getSemester());
//        holder.block.setText(management.getBlock());
//        holder.teacherno.setText(management.getTeacherno());
//        holder.studentno.setText(management.getStudentno());
//        holder.time.setText(management.getTime());

    }

    @Override
    public int getItemCount() {
        return managements.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView branch,teacher,subject,semester,block,teacherno,studentno,time;
        public MyViewHolder(View itemView) {
            super(itemView);
            branch = itemView.findViewById(R.id.et_branch);
            teacher = itemView.findViewById(R.id.et_teacher);
            subject = itemView.findViewById(R.id.et_subject);
            semester = itemView.findViewById(R.id.et_semester);
            block = itemView.findViewById(R.id.et_block);
            teacherno = itemView.findViewById(R.id.et_teacher_no);
            studentno = itemView.findViewById(R.id.et_student_no);
            time = itemView.findViewById(R.id.et_time);
        }
    }
}
