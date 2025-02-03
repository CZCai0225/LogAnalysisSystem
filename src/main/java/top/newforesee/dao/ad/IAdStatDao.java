package top.newforesee.dao.ad;

import top.newforesee.bean.ad.AdStat;

import java.util.List;

/**
 * 每天各省各城市各广告的点击量操作DAO层接口
 */
public interface IAdStatDao {
    void updateBatch(List<AdStat> beans);
}
