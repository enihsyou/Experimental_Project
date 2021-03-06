package com.enihsyou.shane.packagetracker.enums;

public enum CompanyCodeString {
    shunfeng("顺丰"),
    jd("京东"),
    yunda("韵达"),
    shentong("申通"),
    yuantong("圆通"),
    zhongtong("中通"),
    ems("EMS"),
    dhl("DHL"),
    wanjiawuliu("万家物流"),
    emsguoji("EMS国际件"),
    ganzhongnengda("能达速递"),
    flyway("程光快递"),
    xinbangwuliu("新邦物流"),
    lianhaowuliu("联昊通"),
    southafrican("南非邮政"),
    tiandihuayu("天地华宇"),
    koreapost("韩国邮政"),
    tnt("TNT"),
    jiayiwuliu("佳怡物流"),
    youzhengguoji("邮政国际"),
    fedex("FedEx"),
    aae("AAE"),
    hkpost("香港邮政"),
    mexico("墨西哥邮政"),
    xinfengwuliu("信丰物流"),
    quanyikuaidi("全一快递"),
    minghangkuaidi("民航快递"),
    ocs("OCS"),
    aramex("Aramex"),
    chronopostfren("法国邮政"),
    annengwuliu("安能物流"),
    disifang("递四方"),
    postennorge("挪威邮政"),
    suer("速尔快递"),
    ukrpost("乌克兰邮政"),
    coe("COE"),
    tiantian("天天"),
    thailand("泰国邮政"),
    postnl("荷兰邮政"),
    hrvatska("克罗地亚邮政"),
    japanposten("日本邮政"),
    wanxiangwuliu("万象物流"),
    lianbangkuaidi("联邦快递"),
    rrs("日日顺物流"),
    shenghuiwuliu("盛辉物流"),
    usps("USPS"),
    ztky("中铁物流"),
    zhongyouwuliu("中邮物流"),
    youzhengguonei("邮政国内"),
    kuaijiesudi("快捷速递"),
    portugalctt("葡萄牙邮政"),
    youshuwuliu("优速快递"),
    jiajiwuliu("佳吉快运"),
    zhongtiewuliu("中铁快运"),
    bangsongwuliu("邦送物流"),
    ontrac("OnTrac"),
    quanchenkuaidi("全晨快递"),
    ups("UPS"),
    baishiwuliu("百世快运"),
    debangwuliu("德邦物流"),
    huitongkuaidi("百世汇通"),
    swisspost("瑞士邮政"),
    kuayue("跨越速运"),
    zhaijisong("宅急送"),
    ewe("EWE"),
    quanfengkuaidi("全峰快递"),
    guotongkuaidi("国通快递"),
    jinguangsudikuaijian("京广快递"),
    rufengda("如风达"),
    longbanwuliu("龙邦快运"),
    chuanxiwuliu("传喜物流");

    private String company;

    CompanyCodeString(String company) {
        this.company = company;
    }

    /**
     * 使用<code>valueOf()</code>方法可以从code字符串获得汉字名字
     * 比如<code>valueOf("shunfeng")</code> => <code>"顺丰"</code>
     * <p>
     * 使用toString()方法可以从Enum对象中获得汉字名字
     * 比如<code>CompanyCodeString.shunfeng</code> => <code>"顺丰"</code>
     *
     * @return 汉字名字
     */
    @Override
    public String toString() {
        return company;
    }
}
