package cn.jiajixin.nuwa

import org.gradle.api.Task
import org.gradle.api.execution.TaskExecutionListener
import org.gradle.api.tasks.TaskState

class NuwaTaskExecutionListener implements TaskExecutionListener {

    @Override
    void beforeExecute(Task task) {
        System.out.println("TaskExecutionListener beforeExecute");

    }

    @Override
    void afterExecute(Task task, TaskState state) {
        System.out.println("TaskExecutionListener afterExecute");

    }
}