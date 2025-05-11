package entity;

import exceptions.EmptyValueException;
import exceptions.ArrayListEmptyValue;

import java.util.ArrayList;

public class TeamMember {
    private String name;
    private  Paper paper;
    private ArrayList<Task> taskList;

    public TeamMember(){}

    public TeamMember(String name) {
        setName(name);
        setPaper(paper);
        this.taskList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        if(name == null || name.trim().isEmpty()){
            throw new EmptyValueException("nome");
        }
        this.name = name;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper){
        this.paper = paper;
    }

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public void addTask(Task task){
        taskList.add(task);
        System.out.println("Tarefa adicionada");
    }

    public String listTasks(){
        if(taskList.isEmpty()){
            throw new ArrayListEmptyValue();
        }
        for(Task task : taskList){
            return task.getDescription();
        }
        return null;
    }


}
