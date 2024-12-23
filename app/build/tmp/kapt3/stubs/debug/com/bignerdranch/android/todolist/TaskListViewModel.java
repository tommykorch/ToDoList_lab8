package com.bignerdranch.android.todolist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/bignerdranch/android/todolist/TaskListViewModel;", "Landroidx/lifecycle/ViewModel;", "taskDao", "Ldatabase/TaskDao;", "(Ldatabase/TaskDao;)V", "tasks", "Landroidx/lifecycle/LiveData;", "", "Lcom/bignerdranch/android/todolist/Task;", "getTasks", "()Landroidx/lifecycle/LiveData;", "ts", "Landroidx/lifecycle/MutableLiveData;", "addTask", "", "content", "", "priority", "", "delTask", "task", "app_debug"})
public final class TaskListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final database.TaskDao taskDao = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.bignerdranch.android.todolist.Task>> ts = null;
    
    public TaskListViewModel(@org.jetbrains.annotations.NotNull
    database.TaskDao taskDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.android.todolist.Task>> getTasks() {
        return null;
    }
    
    public final void addTask(@org.jetbrains.annotations.NotNull
    java.lang.String content, int priority) {
    }
    
    public final void getTasks() {
    }
    
    public final void delTask(@org.jetbrains.annotations.NotNull
    com.bignerdranch.android.todolist.Task task) {
    }
}