package yeti.dreambot.aio.framework.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * Modules contains clusters of tasks, each validated and executed
 * in the order they were put in. Modules are also tasks themselves
 * and therefore allow for a tree structure with multiple chained branches.
 *
 * @author Deki on 09.10.2020
 * @project dreambot-aio-aio
 **/
public abstract class Module implements Task {

  /**
   * List of tasks belonging to this module
   */
  private List<Task> tasks = new ArrayList<>();

  /**
   * Execute the first valid task
   */
  @Override
  public int execute() {
    for (Task task : tasks) {
      if (task.validate()) {
        return task.execute();
      }
    }
    //no task was valid, let's not eat up the cpu though
    return 1000;
  }

  /**
   * Add a task
   * @param task
   */
  public void addTask(Task task) {
    getTasks().add(task);
  }

  /**
   * Add multiple tasks
   * @param tasks
   */
  public void addTasks(Task... tasks) {
    Collections.addAll(getTasks(), tasks);
  }

  public List<Task> getTasks() {
    return tasks;
  }
}
