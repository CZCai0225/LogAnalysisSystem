package top.newforesee.dao.common;

import scala.Int;
import top.newforesee.bean.Task;

/**
 * xxx 2024/11/27
 */
public interface ITaskDao {
    Task findTaskById(int taskId);
}
