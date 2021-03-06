
package cn.felord.payment.wechat.v3.model;

import lombok.Data;

import java.util.List;

/**
 * 已实扣代金券信息
 *
 * @author felord.cn
 * @since 1.0.0.RELEASE
 */
@Data
public class ConsumeInformation {

    private String consumeMchid;

    private String consumeTime;

    private List<GoodsDetail> goodsDetail;

    private String transactionId;

}
