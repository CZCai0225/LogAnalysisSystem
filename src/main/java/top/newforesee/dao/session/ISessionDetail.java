package top.newforesee.dao.session;

import top.newforesee.bean.session.SessionDetail;

/**
 * session明细数据数据访问层接口
 * xxx 2024/11/28
 */
public interface ISessionDetail {
    void saveToDB(SessionDetail bean);
}
