package tarce.model.inventory;

import com.chad.library.adapter.base.entity.SectionEntity;

/**
 * Created by rose.zou on 2017/5/24.
 * 为了显示头部
 */

public class MainMdBean extends SectionEntity<MaterialDetailBean.ResultBean.ResDataBean> {
    public MainMdBean(boolean isHeader, String header) {
        super(isHeader, header);
    }

    public MainMdBean(MaterialDetailBean.ResultBean.ResDataBean resDataBean) {
        super(resDataBean);
    }
}
