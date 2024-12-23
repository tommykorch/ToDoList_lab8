package com.bignerdranch.android.todolist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0003\u0015\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0012\u0010\u0003\u001a\u00060\u0004R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/bignerdranch/android/todolist/TaskListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/bignerdranch/android/todolist/TaskListFragment$TaskAdapter;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "taskListViewModel", "Lcom/bignerdranch/android/todolist/TaskListViewModel;", "getTaskListViewModel", "()Lcom/bignerdranch/android/todolist/TaskListViewModel;", "taskListViewModel$delegate", "Lkotlin/Lazy;", "SwipeToDel", "", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "TaskAdapter", "TaskHolder", "app_debug"})
public final class TaskListFragment extends androidx.fragment.app.Fragment {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.bignerdranch.android.todolist.TaskListFragment.TaskAdapter adapter;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy taskListViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.bignerdranch.android.todolist.TaskListFragment.Companion Companion = null;
    
    public TaskListFragment() {
        super();
    }
    
    private final com.bignerdranch.android.todolist.TaskListViewModel getTaskListViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void SwipeToDel() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/bignerdranch/android/todolist/TaskListFragment$Companion;", "", "()V", "newInstance", "Lcom/bignerdranch/android/todolist/TaskListFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.bignerdranch.android.todolist.TaskListFragment newInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0014\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/bignerdranch/android/todolist/TaskListFragment$TaskAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bignerdranch/android/todolist/TaskListFragment$TaskHolder;", "Lcom/bignerdranch/android/todolist/TaskListFragment;", "tasks", "", "Lcom/bignerdranch/android/todolist/Task;", "(Lcom/bignerdranch/android/todolist/TaskListFragment;Ljava/util/List;)V", "getTasks", "()Ljava/util/List;", "setTasks", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateTasks", "newTasks", "", "app_debug"})
    final class TaskAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.bignerdranch.android.todolist.TaskListFragment.TaskHolder> {
        @org.jetbrains.annotations.NotNull
        private java.util.List<com.bignerdranch.android.todolist.Task> tasks;
        
        public TaskAdapter(@org.jetbrains.annotations.NotNull
        java.util.List<com.bignerdranch.android.todolist.Task> tasks) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.bignerdranch.android.todolist.Task> getTasks() {
            return null;
        }
        
        public final void setTasks(@org.jetbrains.annotations.NotNull
        java.util.List<com.bignerdranch.android.todolist.Task> p0) {
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public com.bignerdranch.android.todolist.TaskListFragment.TaskHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull
        com.bignerdranch.android.todolist.TaskListFragment.TaskHolder holder, int position) {
        }
        
        public final void updateTasks(@org.jetbrains.annotations.NotNull
        java.util.List<com.bignerdranch.android.todolist.Task> newTasks) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/bignerdranch/android/todolist/TaskListFragment$TaskHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/bignerdranch/android/todolist/TaskListFragment;Landroid/view/View;)V", "task", "Lcom/bignerdranch/android/todolist/Task;", "task_circle", "Landroid/widget/FrameLayout;", "task_content", "Landroid/widget/TextView;", "task_num", "bind", "", "app_debug"})
    final class TaskHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.bignerdranch.android.todolist.Task task;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView task_content = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.FrameLayout task_circle = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView task_num = null;
        
        public TaskHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.bignerdranch.android.todolist.Task task) {
        }
    }
}