package yeti.dreambot.aio.framework.task;

/**
 *
 * Last link in a classic tree structure.
 *
 * @author Deki on 09.10.2020
 * @project dreambot-aio-aio
 **/
public interface Task {

  /**
   * Whether or not this task should be executed
   * @return
   */
  boolean validate();

  /**
   * Actual execution of the task
   */
  int execute();

}
