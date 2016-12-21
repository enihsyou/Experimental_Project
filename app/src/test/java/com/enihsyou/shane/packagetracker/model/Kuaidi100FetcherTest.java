package com.enihsyou.shane.packagetracker.model;

import com.enihsyou.shane.packagetracker.helper.Kuaidi100Fetcher;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Kuaidi100FetcherTest {
    private Kuaidi100Fetcher fetcher;


    @Before
    public void setUp() throws Exception {
        fetcher = new Kuaidi100Fetcher();
    }

    @Test
    public void companyResult() throws Exception {
        String number = "560522058285";
        CompanyAutoSearchResult result = fetcher.companyResult(number);
        assertNotNull(result);
        assertEquals("单号一致性", result.getNumber(), number);
    }

    @Test
    public void packageResult() throws Exception {
        String number = "560522058285";
        String company = "yuantong";
        PackageTrafficSearchResult result = fetcher.packageResult(number, company);
        assertNotNull(result);
        assertEquals("单号一致性", result.getNumber(), number);
        assertEquals("快递公司一致性", result.getCompanyCode(), company);
    }


    @Test
    public void networkResult() throws Exception {
        String area = "上海 - 上海市";
        String keyword = "";
        String offset = "0";
        String size = "8";
        NetworkSearchResult result = fetcher.networkResult(area, keyword, offset, size);
        assertNotNull(result);
        assertEquals("成功获取", result.getStatus(), 200);
        assertTrue("获取到列表", result.getNetLists().size() > 0);
    }
}
