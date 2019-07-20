package com.codepiano.tushare;

import com.codepiano.tushare.client.ResponseData;
import com.codepiano.tushare.client.TushareResponse;
import com.codepiano.tushare.constant.Constant;
import com.codepiano.tushare.models.AdjFactor;
import com.codepiano.tushare.models.Anns;
import com.codepiano.tushare.models.Balancesheet;
import com.codepiano.tushare.models.BlockTrade;
import com.codepiano.tushare.models.BoCinema;
import com.codepiano.tushare.models.BoDaily;
import com.codepiano.tushare.models.BoMonthly;
import com.codepiano.tushare.models.BoWeekly;
import com.codepiano.tushare.models.Cashflow;
import com.codepiano.tushare.models.CctvNews;
import com.codepiano.tushare.models.Concept;
import com.codepiano.tushare.models.ConceptDetail;
import com.codepiano.tushare.models.Daily;
import com.codepiano.tushare.models.DailyBasic;
import com.codepiano.tushare.models.DisclosureDate;
import com.codepiano.tushare.models.Dividend;
import com.codepiano.tushare.models.Express;
import com.codepiano.tushare.models.FilmRecord;
import com.codepiano.tushare.models.FinaAudit;
import com.codepiano.tushare.models.FinaIndicator;
import com.codepiano.tushare.models.FinaMainbz;
import com.codepiano.tushare.models.Forecast;
import com.codepiano.tushare.models.FundBasic;
import com.codepiano.tushare.models.FundCompany;
import com.codepiano.tushare.models.FundDaily;
import com.codepiano.tushare.models.FundDiv;
import com.codepiano.tushare.models.FundNav;
import com.codepiano.tushare.models.FundPortfolio;
import com.codepiano.tushare.models.FutBasic;
import com.codepiano.tushare.models.FutDaily;
import com.codepiano.tushare.models.FutHolding;
import com.codepiano.tushare.models.FutSettle;
import com.codepiano.tushare.models.FutWsr;
import com.codepiano.tushare.models.FxDaily;
import com.codepiano.tushare.models.FxObasic;
import com.codepiano.tushare.models.GgtTop10;
import com.codepiano.tushare.models.GzIndex;
import com.codepiano.tushare.models.Hibor;
import com.codepiano.tushare.models.HsConst;
import com.codepiano.tushare.models.HsgtTop10;
import com.codepiano.tushare.models.Income;
import com.codepiano.tushare.models.IndexBasic;
import com.codepiano.tushare.models.IndexClassify;
import com.codepiano.tushare.models.IndexDaily;
import com.codepiano.tushare.models.IndexDailybasic;
import com.codepiano.tushare.models.IndexMember;
import com.codepiano.tushare.models.IndexMonthly;
import com.codepiano.tushare.models.IndexWeekly;
import com.codepiano.tushare.models.IndexWeight;
import com.codepiano.tushare.models.Libor;
import com.codepiano.tushare.models.Margin;
import com.codepiano.tushare.models.MarginDetail;
import com.codepiano.tushare.models.Model;
import com.codepiano.tushare.models.Moneyflow;
import com.codepiano.tushare.models.MoneyflowHsgt;
import com.codepiano.tushare.models.Monthly;
import com.codepiano.tushare.models.Namechange;
import com.codepiano.tushare.models.NewShare;
import com.codepiano.tushare.models.News;
import com.codepiano.tushare.models.OptBasic;
import com.codepiano.tushare.models.OptDaily;
import com.codepiano.tushare.models.PledgeDetail;
import com.codepiano.tushare.models.PledgeStat;
import com.codepiano.tushare.models.Repurchase;
import com.codepiano.tushare.models.ShareFloat;
import com.codepiano.tushare.models.Shibor;
import com.codepiano.tushare.models.ShiborLpr;
import com.codepiano.tushare.models.ShiborQuote;
import com.codepiano.tushare.models.StkAccount;
import com.codepiano.tushare.models.StkAccountOld;
import com.codepiano.tushare.models.StkHoldernumber;
import com.codepiano.tushare.models.StkHoldertrade;
import com.codepiano.tushare.models.StkLimit;
import com.codepiano.tushare.models.StockBasic;
import com.codepiano.tushare.models.StockCompany;
import com.codepiano.tushare.models.Suspend;
import com.codepiano.tushare.models.TeleplayRecord;
import com.codepiano.tushare.models.TmtTwincome;
import com.codepiano.tushare.models.TmtTwincomedetail;
import com.codepiano.tushare.models.Top10Floatholders;
import com.codepiano.tushare.models.Top10Holders;
import com.codepiano.tushare.models.TopInst;
import com.codepiano.tushare.models.TopList;
import com.codepiano.tushare.models.TradeCal;
import com.codepiano.tushare.models.TradeCalFuture;
import com.codepiano.tushare.models.Weekly;
import com.codepiano.tushare.models.WzIndex;
import com.codepiano.tushare.params.AdjFactorParam;
import com.codepiano.tushare.params.AnnsParam;
import com.codepiano.tushare.params.BalancesheetParam;
import com.codepiano.tushare.params.BlockTradeParam;
import com.codepiano.tushare.params.BoCinemaParam;
import com.codepiano.tushare.params.BoDailyParam;
import com.codepiano.tushare.params.BoMonthlyParam;
import com.codepiano.tushare.params.BoWeeklyParam;
import com.codepiano.tushare.params.CashflowParam;
import com.codepiano.tushare.params.CctvNewsParam;
import com.codepiano.tushare.params.ConceptDetailParam;
import com.codepiano.tushare.params.ConceptParam;
import com.codepiano.tushare.params.DailyBasicParam;
import com.codepiano.tushare.params.DailyParam;
import com.codepiano.tushare.params.DisclosureDateParam;
import com.codepiano.tushare.params.DividendParam;
import com.codepiano.tushare.params.ExpressParam;
import com.codepiano.tushare.params.FilmRecordParam;
import com.codepiano.tushare.params.FinaAuditParam;
import com.codepiano.tushare.params.FinaIndicatorParam;
import com.codepiano.tushare.params.FinaMainbzParam;
import com.codepiano.tushare.params.ForecastParam;
import com.codepiano.tushare.params.FundBasicParam;
import com.codepiano.tushare.params.FundDailyParam;
import com.codepiano.tushare.params.FundDivParam;
import com.codepiano.tushare.params.FundNavParam;
import com.codepiano.tushare.params.FundPortfolioParam;
import com.codepiano.tushare.params.FutBasicParam;
import com.codepiano.tushare.params.FutDailyParam;
import com.codepiano.tushare.params.FutHoldingParam;
import com.codepiano.tushare.params.FutSettleParam;
import com.codepiano.tushare.params.FutWsrParam;
import com.codepiano.tushare.params.FxDailyParam;
import com.codepiano.tushare.params.FxObasicParam;
import com.codepiano.tushare.params.GgtTop10Param;
import com.codepiano.tushare.params.GzIndexParam;
import com.codepiano.tushare.params.HiborParam;
import com.codepiano.tushare.params.HsConstParam;
import com.codepiano.tushare.params.HsgtTop10Param;
import com.codepiano.tushare.params.IncomeParam;
import com.codepiano.tushare.params.IndexBasicParam;
import com.codepiano.tushare.params.IndexClassifyParam;
import com.codepiano.tushare.params.IndexDailyParam;
import com.codepiano.tushare.params.IndexDailybasicParam;
import com.codepiano.tushare.params.IndexMemberParam;
import com.codepiano.tushare.params.IndexMonthlyParam;
import com.codepiano.tushare.params.IndexWeeklyParam;
import com.codepiano.tushare.params.IndexWeightParam;
import com.codepiano.tushare.params.LiborParam;
import com.codepiano.tushare.params.MarginDetailParam;
import com.codepiano.tushare.params.MarginParam;
import com.codepiano.tushare.params.MoneyflowHsgtParam;
import com.codepiano.tushare.params.MoneyflowParam;
import com.codepiano.tushare.params.MonthlyParam;
import com.codepiano.tushare.params.NamechangeParam;
import com.codepiano.tushare.params.NewShareParam;
import com.codepiano.tushare.params.NewsParam;
import com.codepiano.tushare.params.OptBasicParam;
import com.codepiano.tushare.params.OptDailyParam;
import com.codepiano.tushare.params.PledgeDetailParam;
import com.codepiano.tushare.params.PledgeStatParam;
import com.codepiano.tushare.params.RepurchaseParam;
import com.codepiano.tushare.params.ShareFloatParam;
import com.codepiano.tushare.params.ShiborLprParam;
import com.codepiano.tushare.params.ShiborParam;
import com.codepiano.tushare.params.ShiborQuoteParam;
import com.codepiano.tushare.params.StkAccountOldParam;
import com.codepiano.tushare.params.StkAccountParam;
import com.codepiano.tushare.params.StkHoldernumberParam;
import com.codepiano.tushare.params.StkHoldertradeParam;
import com.codepiano.tushare.params.StkLimitParam;
import com.codepiano.tushare.params.StockBasicParam;
import com.codepiano.tushare.params.StockCompanyParam;
import com.codepiano.tushare.params.SuspendParam;
import com.codepiano.tushare.params.TeleplayRecordParam;
import com.codepiano.tushare.params.TmtTwincomeParam;
import com.codepiano.tushare.params.TmtTwincomedetailParam;
import com.codepiano.tushare.params.Top10FloatholdersParam;
import com.codepiano.tushare.params.Top10HoldersParam;
import com.codepiano.tushare.params.TopInstParam;
import com.codepiano.tushare.params.TopListParam;
import com.codepiano.tushare.params.TradeCalFutureParam;
import com.codepiano.tushare.params.TradeCalParam;
import com.codepiano.tushare.params.TushareRequestParam;
import com.codepiano.tushare.params.WeeklyParam;
import com.codepiano.tushare.params.WzIndexParam;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-08 00:50
 */
public class Tushare {

    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static final String TUSHARE_API_BASE = "http://api.waditu.com";

    private OkHttpClient client;
    private ObjectMapper mapper;
    private String token;


    public static void main(String[] args) throws IOException {
        System.out.println(LocalDateTime.now().toString());
        Tushare tushare = new Tushare("replace your token");
        System.out.println(tushare.stockBasic("", "", "", StockBasic.FIELDS));
    }

    public Tushare(String token) {
        client = new OkHttpClient.Builder().build();
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.token = token;
    }

    /**
     * 获取上市公司公告数据及原文文本，数据从2000年开始，内容很大，请注意数据调取节奏。
     *
     * @param tsCode    可选, 股票代码
     * @param annDate   可选, 公告日期
     * @param startDate 可选, 公告开始日期
     * @param endDate   可选, 公告结束日期
     * @param year      必填, 年度，目前接口不能跨年获取，设定一个年份即可，比如2019
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=176"
     */
    public TushareResponse<Anns> anns(String tsCode, String annDate, String startDate, String endDate, String year, List<String> fields) throws IOException {
        AnnsParam param = AnnsParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).year(year).build();
        return anns(param, fields, false);
    }


    /**
     * 获取上市公司公告数据及原文文本，数据从2000年开始，内容很大，请注意数据调取节奏。
     *
     * @param tsCode    可选, 股票代码
     * @param annDate   可选, 公告日期
     * @param startDate 可选, 公告开始日期
     * @param endDate   可选, 公告结束日期
     * @param year      必填, 年度，目前接口不能跨年获取，设定一个年份即可，比如2019
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=176"
     */
    public TushareResponse<Anns> anns(String tsCode, String annDate, String startDate, String endDate, String year, List<String> fields, boolean populate) throws IOException {
        AnnsParam param = AnnsParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).year(year).build();
        return anns(param, fields, populate);
    }

    /**
     * 获取上市公司公告数据及原文文本，数据从2000年开始，内容很大，请注意数据调取节奏。
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=176"
     */
    public TushareResponse<Anns> anns(AnnsParam param, List<String> fields) throws IOException {
        return anns(param, fields, false);
    }

    /**
     * 获取上市公司公告数据及原文文本，数据从2000年开始，内容很大，请注意数据调取节奏。
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=176"
     */
    public TushareResponse<Anns> anns(AnnsParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.ANNS).token(token).param(param).fields(fields).build();
        TushareResponse<Anns> response = (TushareResponse<Anns>) post(requestParam);
        List<Anns> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Anns anns = Anns.init(responseDataFields, item);
                    dataList.add(anns);
                }
            }
        }
        return response;
    }

    /**
     * 获取新闻联播文字稿数据，数据开始于2006年6月，超过12年历史
     *
     * @param date   必填, 日期（输入格式：YYYYMMDD 比如：20181211）
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=154"
     */
    public TushareResponse<CctvNews> cctvNews(String date, List<String> fields) throws IOException {
        CctvNewsParam param = CctvNewsParam.builder().date(date).build();
        return cctvNews(param, fields, false);
    }


    /**
     * 获取新闻联播文字稿数据，数据开始于2006年6月，超过12年历史
     *
     * @param date     必填, 日期（输入格式：YYYYMMDD 比如：20181211）
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=154"
     */
    public TushareResponse<CctvNews> cctvNews(String date, List<String> fields, boolean populate) throws IOException {
        CctvNewsParam param = CctvNewsParam.builder().date(date).build();
        return cctvNews(param, fields, populate);
    }

    /**
     * 获取新闻联播文字稿数据，数据开始于2006年6月，超过12年历史
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=154"
     */
    public TushareResponse<CctvNews> cctvNews(CctvNewsParam param, List<String> fields) throws IOException {
        return cctvNews(param, fields, false);
    }

    /**
     * 获取新闻联播文字稿数据，数据开始于2006年6月，超过12年历史
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=154"
     */
    public TushareResponse<CctvNews> cctvNews(CctvNewsParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.CCTV_NEWS).token(token).param(param).fields(fields).build();
        TushareResponse<CctvNews> response = (TushareResponse<CctvNews>) post(requestParam);
        List<CctvNews> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    CctvNews cctvNews = CctvNews.init(responseDataFields, item);
                    dataList.add(cctvNews);
                }
            }
        }
        return response;
    }

    /**
     * 获取主流新闻网站的快讯新闻数据
     *
     * @param startDate 必填, 开始日期
     * @param endDate   必填, 结束日期
     * @param src       必填, 新闻来源 见下表
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=143"
     */
    public TushareResponse<News> news(String startDate, String endDate, String src, List<String> fields) throws IOException {
        NewsParam param = NewsParam.builder().startDate(startDate).endDate(endDate).src(src).build();
        return news(param, fields, false);
    }


    /**
     * 获取主流新闻网站的快讯新闻数据
     *
     * @param startDate 必填, 开始日期
     * @param endDate   必填, 结束日期
     * @param src       必填, 新闻来源 见下表
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=143"
     */
    public TushareResponse<News> news(String startDate, String endDate, String src, List<String> fields, boolean populate) throws IOException {
        NewsParam param = NewsParam.builder().startDate(startDate).endDate(endDate).src(src).build();
        return news(param, fields, populate);
    }

    /**
     * 获取主流新闻网站的快讯新闻数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=143"
     */
    public TushareResponse<News> news(NewsParam param, List<String> fields) throws IOException {
        return news(param, fields, false);
    }

    /**
     * 获取主流新闻网站的快讯新闻数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=143"
     */
    public TushareResponse<News> news(NewsParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.NEWS).token(token).param(param).fields(fields).build();
        TushareResponse<News> response = (TushareResponse<News>) post(requestParam);
        List<News> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    News news = News.init(responseDataFields, item);
                    dataList.add(news);
                }
            }
        }
        return response;
    }

    /**
     * 获取2009年以来全国拍摄制作电视剧备案公示数据
     *
     * @param reportDate 可选, 备案月份（YYYYMM）
     * @param startDate  可选, 备案开始月份（YYYYMM）
     * @param endDate    可选, 备案结束月份（YYYYMM）
     * @param org        可选, 备案机构
     * @param name       可选, 电视剧名称
     * @param fields     字段列表
     * @see "https://tushare.pro/document/2?doc_id=180"
     */
    public TushareResponse<TeleplayRecord> teleplayRecord(String reportDate, String startDate, String endDate, String org, String name, List<String> fields) throws IOException {
        TeleplayRecordParam param = TeleplayRecordParam.builder().reportDate(reportDate).startDate(startDate).endDate(endDate).org(org).name(name).build();
        return teleplayRecord(param, fields, false);
    }


    /**
     * 获取2009年以来全国拍摄制作电视剧备案公示数据
     *
     * @param reportDate 可选, 备案月份（YYYYMM）
     * @param startDate  可选, 备案开始月份（YYYYMM）
     * @param endDate    可选, 备案结束月份（YYYYMM）
     * @param org        可选, 备案机构
     * @param name       可选, 电视剧名称
     * @param fields     字段列表
     * @param populate   是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=180"
     */
    public TushareResponse<TeleplayRecord> teleplayRecord(String reportDate, String startDate, String endDate, String org, String name, List<String> fields, boolean populate) throws IOException {
        TeleplayRecordParam param = TeleplayRecordParam.builder().reportDate(reportDate).startDate(startDate).endDate(endDate).org(org).name(name).build();
        return teleplayRecord(param, fields, populate);
    }

    /**
     * 获取2009年以来全国拍摄制作电视剧备案公示数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=180"
     */
    public TushareResponse<TeleplayRecord> teleplayRecord(TeleplayRecordParam param, List<String> fields) throws IOException {
        return teleplayRecord(param, fields, false);
    }

    /**
     * 获取2009年以来全国拍摄制作电视剧备案公示数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=180"
     */
    public TushareResponse<TeleplayRecord> teleplayRecord(TeleplayRecordParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.TELEPLAY_RECORD).token(token).param(param).fields(fields).build();
        TushareResponse<TeleplayRecord> response = (TushareResponse<TeleplayRecord>) post(requestParam);
        List<TeleplayRecord> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    TeleplayRecord teleplayRecord = TeleplayRecord.init(responseDataFields, item);
                    dataList.add(teleplayRecord);
                }
            }
        }
        return response;
    }

    /**
     * 获取周度票房数据
     *
     * @param date   必填, 日期（每周一日期，格式YYYYMMDD）
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=114"
     */
    public TushareResponse<BoWeekly> boWeekly(String date, List<String> fields) throws IOException {
        BoWeeklyParam param = BoWeeklyParam.builder().date(date).build();
        return boWeekly(param, fields, false);
    }


    /**
     * 获取周度票房数据
     *
     * @param date     必填, 日期（每周一日期，格式YYYYMMDD）
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=114"
     */
    public TushareResponse<BoWeekly> boWeekly(String date, List<String> fields, boolean populate) throws IOException {
        BoWeeklyParam param = BoWeeklyParam.builder().date(date).build();
        return boWeekly(param, fields, populate);
    }

    /**
     * 获取周度票房数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=114"
     */
    public TushareResponse<BoWeekly> boWeekly(BoWeeklyParam param, List<String> fields) throws IOException {
        return boWeekly(param, fields, false);
    }

    /**
     * 获取周度票房数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=114"
     */
    public TushareResponse<BoWeekly> boWeekly(BoWeeklyParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.BO_WEEKLY).token(token).param(param).fields(fields).build();
        TushareResponse<BoWeekly> response = (TushareResponse<BoWeekly>) post(requestParam);
        List<BoWeekly> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    BoWeekly boWeekly = BoWeekly.init(responseDataFields, item);
                    dataList.add(boWeekly);
                }
            }
        }
        return response;
    }

    /**
     * 获取电影月度票房数据
     *
     * @param date   必填, 日期（每月1号，格式YYYYMMDD）
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=113"
     */
    public TushareResponse<BoMonthly> boMonthly(String date, List<String> fields) throws IOException {
        BoMonthlyParam param = BoMonthlyParam.builder().date(date).build();
        return boMonthly(param, fields, false);
    }


    /**
     * 获取电影月度票房数据
     *
     * @param date     必填, 日期（每月1号，格式YYYYMMDD）
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=113"
     */
    public TushareResponse<BoMonthly> boMonthly(String date, List<String> fields, boolean populate) throws IOException {
        BoMonthlyParam param = BoMonthlyParam.builder().date(date).build();
        return boMonthly(param, fields, populate);
    }

    /**
     * 获取电影月度票房数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=113"
     */
    public TushareResponse<BoMonthly> boMonthly(BoMonthlyParam param, List<String> fields) throws IOException {
        return boMonthly(param, fields, false);
    }

    /**
     * 获取电影月度票房数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=113"
     */
    public TushareResponse<BoMonthly> boMonthly(BoMonthlyParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.BO_MONTHLY).token(token).param(param).fields(fields).build();
        TushareResponse<BoMonthly> response = (TushareResponse<BoMonthly>) post(requestParam);
        List<BoMonthly> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    BoMonthly boMonthly = BoMonthly.init(responseDataFields, item);
                    dataList.add(boMonthly);
                }
            }
        }
        return response;
    }

    /**
     * 获取全国电影剧本备案的公示数据
     *
     * @param annDate   可选, 公布日期 （至少输入一个参数，格式：YYYYMMDD，日期不连续，定期公布）
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=156"
     */
    public TushareResponse<FilmRecord> filmRecord(String annDate, String startDate, String endDate, List<String> fields) throws IOException {
        FilmRecordParam param = FilmRecordParam.builder().annDate(annDate).startDate(startDate).endDate(endDate).build();
        return filmRecord(param, fields, false);
    }


    /**
     * 获取全国电影剧本备案的公示数据
     *
     * @param annDate   可选, 公布日期 （至少输入一个参数，格式：YYYYMMDD，日期不连续，定期公布）
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=156"
     */
    public TushareResponse<FilmRecord> filmRecord(String annDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        FilmRecordParam param = FilmRecordParam.builder().annDate(annDate).startDate(startDate).endDate(endDate).build();
        return filmRecord(param, fields, populate);
    }

    /**
     * 获取全国电影剧本备案的公示数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=156"
     */
    public TushareResponse<FilmRecord> filmRecord(FilmRecordParam param, List<String> fields) throws IOException {
        return filmRecord(param, fields, false);
    }

    /**
     * 获取全国电影剧本备案的公示数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=156"
     */
    public TushareResponse<FilmRecord> filmRecord(FilmRecordParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FILM_RECORD).token(token).param(param).fields(fields).build();
        TushareResponse<FilmRecord> response = (TushareResponse<FilmRecord>) post(requestParam);
        List<FilmRecord> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FilmRecord filmRecord = FilmRecord.init(responseDataFields, item);
                    dataList.add(filmRecord);
                }
            }
        }
        return response;
    }

    /**
     * 获取每日各影院的票房数据
     *
     * @param date   必填, 日期(格式:YYYYMMDD)
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=116"
     */
    public TushareResponse<BoCinema> boCinema(String date, List<String> fields) throws IOException {
        BoCinemaParam param = BoCinemaParam.builder().date(date).build();
        return boCinema(param, fields, false);
    }


    /**
     * 获取每日各影院的票房数据
     *
     * @param date     必填, 日期(格式:YYYYMMDD)
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=116"
     */
    public TushareResponse<BoCinema> boCinema(String date, List<String> fields, boolean populate) throws IOException {
        BoCinemaParam param = BoCinemaParam.builder().date(date).build();
        return boCinema(param, fields, populate);
    }

    /**
     * 获取每日各影院的票房数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=116"
     */
    public TushareResponse<BoCinema> boCinema(BoCinemaParam param, List<String> fields) throws IOException {
        return boCinema(param, fields, false);
    }

    /**
     * 获取每日各影院的票房数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=116"
     */
    public TushareResponse<BoCinema> boCinema(BoCinemaParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.BO_CINEMA).token(token).param(param).fields(fields).build();
        TushareResponse<BoCinema> response = (TushareResponse<BoCinema>) post(requestParam);
        List<BoCinema> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    BoCinema boCinema = BoCinema.init(responseDataFields, item);
                    dataList.add(boCinema);
                }
            }
        }
        return response;
    }

    /**
     * 获取台湾TMT行业上市公司各类产品月度营收情况。
     *
     * @param date      可选, 报告期
     * @param item      可选, 产品代码
     * @param symbol    可选, 公司代码
     * @param startDate 可选, 报告期开始日期
     * @param endDate   可选, 报告期结束日期
     * @param source    可选, None
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=87"
     */
    public TushareResponse<TmtTwincomedetail> tmtTwincomedetail(String date, String item, String symbol, String startDate, String endDate, String source, List<String> fields) throws IOException {
        TmtTwincomedetailParam param = TmtTwincomedetailParam.builder().date(date).item(item).symbol(symbol).startDate(startDate).endDate(endDate).source(source).build();
        return tmtTwincomedetail(param, fields, false);
    }


    /**
     * 获取台湾TMT行业上市公司各类产品月度营收情况。
     *
     * @param date      可选, 报告期
     * @param item      可选, 产品代码
     * @param symbol    可选, 公司代码
     * @param startDate 可选, 报告期开始日期
     * @param endDate   可选, 报告期结束日期
     * @param source    可选, None
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=87"
     */
    public TushareResponse<TmtTwincomedetail> tmtTwincomedetail(String date, String item, String symbol, String startDate, String endDate, String source, List<String> fields, boolean populate) throws IOException {
        TmtTwincomedetailParam param = TmtTwincomedetailParam.builder().date(date).item(item).symbol(symbol).startDate(startDate).endDate(endDate).source(source).build();
        return tmtTwincomedetail(param, fields, populate);
    }

    /**
     * 获取台湾TMT行业上市公司各类产品月度营收情况。
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=87"
     */
    public TushareResponse<TmtTwincomedetail> tmtTwincomedetail(TmtTwincomedetailParam param, List<String> fields) throws IOException {
        return tmtTwincomedetail(param, fields, false);
    }

    /**
     * 获取台湾TMT行业上市公司各类产品月度营收情况。
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=87"
     */
    public TushareResponse<TmtTwincomedetail> tmtTwincomedetail(TmtTwincomedetailParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.TMT_TWINCOMEDETAIL).token(token).param(param).fields(fields).build();
        TushareResponse<TmtTwincomedetail> response = (TushareResponse<TmtTwincomedetail>) post(requestParam);
        List<TmtTwincomedetail> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    TmtTwincomedetail tmtTwincomedetail = TmtTwincomedetail.init(responseDataFields, item);
                    dataList.add(tmtTwincomedetail);
                }
            }
        }
        return response;
    }

    /**
     * 获取电影日度票房
     *
     * @param date   必填, 日期 （格式YYYYMMDD）
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=115"
     */
    public TushareResponse<BoDaily> boDaily(String date, List<String> fields) throws IOException {
        BoDailyParam param = BoDailyParam.builder().date(date).build();
        return boDaily(param, fields, false);
    }


    /**
     * 获取电影日度票房
     *
     * @param date     必填, 日期 （格式YYYYMMDD）
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=115"
     */
    public TushareResponse<BoDaily> boDaily(String date, List<String> fields, boolean populate) throws IOException {
        BoDailyParam param = BoDailyParam.builder().date(date).build();
        return boDaily(param, fields, populate);
    }

    /**
     * 获取电影日度票房
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=115"
     */
    public TushareResponse<BoDaily> boDaily(BoDailyParam param, List<String> fields) throws IOException {
        return boDaily(param, fields, false);
    }

    /**
     * 获取电影日度票房
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=115"
     */
    public TushareResponse<BoDaily> boDaily(BoDailyParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.BO_DAILY).token(token).param(param).fields(fields).build();
        TushareResponse<BoDaily> response = (TushareResponse<BoDaily>) post(requestParam);
        List<BoDaily> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    BoDaily boDaily = BoDaily.init(responseDataFields, item);
                    dataList.add(boDaily);
                }
            }
        }
        return response;
    }

    /**
     * 获取台湾TMT电子产业领域各类产品月度营收数据。
     *
     * @param date      可选, 报告期
     * @param item      必填, 产品代码
     * @param startDate 可选, 报告期开始日期
     * @param endDate   可选, 报告期结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=88"
     */
    public TushareResponse<TmtTwincome> tmtTwincome(String date, String item, String startDate, String endDate, List<String> fields) throws IOException {
        TmtTwincomeParam param = TmtTwincomeParam.builder().date(date).item(item).startDate(startDate).endDate(endDate).build();
        return tmtTwincome(param, fields, false);
    }


    /**
     * 获取台湾TMT电子产业领域各类产品月度营收数据。
     *
     * @param date      可选, 报告期
     * @param item      必填, 产品代码
     * @param startDate 可选, 报告期开始日期
     * @param endDate   可选, 报告期结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=88"
     */
    public TushareResponse<TmtTwincome> tmtTwincome(String date, String item, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        TmtTwincomeParam param = TmtTwincomeParam.builder().date(date).item(item).startDate(startDate).endDate(endDate).build();
        return tmtTwincome(param, fields, populate);
    }

    /**
     * 获取台湾TMT电子产业领域各类产品月度营收数据。
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=88"
     */
    public TushareResponse<TmtTwincome> tmtTwincome(TmtTwincomeParam param, List<String> fields) throws IOException {
        return tmtTwincome(param, fields, false);
    }

    /**
     * 获取台湾TMT电子产业领域各类产品月度营收数据。
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=88"
     */
    public TushareResponse<TmtTwincome> tmtTwincome(TmtTwincomeParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.TMT_TWINCOME).token(token).param(param).fields(fields).build();
        TushareResponse<TmtTwincome> response = (TushareResponse<TmtTwincome>) post(requestParam);
        List<TmtTwincome> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    TmtTwincome tmtTwincome = TmtTwincome.init(responseDataFields, item);
                    dataList.add(tmtTwincome);
                }
            }
        }
        return response;
    }

    /**
     * 获取各类指数成分和权重，<strong>月度数据</strong> ，如需日度指数成分和权重，请联系 <a href="mailto:waditu@163.com">waditu@163.com</a>
     *
     * @param indexCode 必填, 指数代码 (二选一)
     * @param tradeDate 必填, 交易日期 （二选一）
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=96"
     */
    public TushareResponse<IndexWeight> indexWeight(String indexCode, String tradeDate, String startDate, String endDate, List<String> fields) throws IOException {
        IndexWeightParam param = IndexWeightParam.builder().indexCode(indexCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return indexWeight(param, fields, false);
    }


    /**
     * 获取各类指数成分和权重，<strong>月度数据</strong> ，如需日度指数成分和权重，请联系 <a href="mailto:waditu@163.com">waditu@163.com</a>
     *
     * @param indexCode 必填, 指数代码 (二选一)
     * @param tradeDate 必填, 交易日期 （二选一）
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=96"
     */
    public TushareResponse<IndexWeight> indexWeight(String indexCode, String tradeDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        IndexWeightParam param = IndexWeightParam.builder().indexCode(indexCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return indexWeight(param, fields, populate);
    }

    /**
     * 获取各类指数成分和权重，<strong>月度数据</strong> ，如需日度指数成分和权重，请联系 <a href="mailto:waditu@163.com">waditu@163.com</a>
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=96"
     */
    public TushareResponse<IndexWeight> indexWeight(IndexWeightParam param, List<String> fields) throws IOException {
        return indexWeight(param, fields, false);
    }

    /**
     * 获取各类指数成分和权重，<strong>月度数据</strong> ，如需日度指数成分和权重，请联系 <a href="mailto:waditu@163.com">waditu@163.com</a>
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=96"
     */
    public TushareResponse<IndexWeight> indexWeight(IndexWeightParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.INDEX_WEIGHT).token(token).param(param).fields(fields).build();
        TushareResponse<IndexWeight> response = (TushareResponse<IndexWeight>) post(requestParam);
        List<IndexWeight> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    IndexWeight indexWeight = IndexWeight.init(responseDataFields, item);
                    dataList.add(indexWeight);
                }
            }
        }
        return response;
    }

    /**
     * 获取指数月线行情,每月更新一次
     *
     * @param tsCode    可选, TS代码
     * @param tradeDate 可选, 交易日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=172"
     */
    public TushareResponse<IndexMonthly> indexMonthly(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields) throws IOException {
        IndexMonthlyParam param = IndexMonthlyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return indexMonthly(param, fields, false);
    }


    /**
     * 获取指数月线行情,每月更新一次
     *
     * @param tsCode    可选, TS代码
     * @param tradeDate 可选, 交易日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=172"
     */
    public TushareResponse<IndexMonthly> indexMonthly(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        IndexMonthlyParam param = IndexMonthlyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return indexMonthly(param, fields, populate);
    }

    /**
     * 获取指数月线行情,每月更新一次
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=172"
     */
    public TushareResponse<IndexMonthly> indexMonthly(IndexMonthlyParam param, List<String> fields) throws IOException {
        return indexMonthly(param, fields, false);
    }

    /**
     * 获取指数月线行情,每月更新一次
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=172"
     */
    public TushareResponse<IndexMonthly> indexMonthly(IndexMonthlyParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.INDEX_MONTHLY).token(token).param(param).fields(fields).build();
        TushareResponse<IndexMonthly> response = (TushareResponse<IndexMonthly>) post(requestParam);
        List<IndexMonthly> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    IndexMonthly indexMonthly = IndexMonthly.init(responseDataFields, item);
                    dataList.add(indexMonthly);
                }
            }
        }
        return response;
    }

    /**
     * 申万行业成分
     *
     * @param indexCode 可选, 指数代码
     * @param tsCode    可选, 股票代码
     * @param isNew     可选, 是否最新（默认为“Y是”）
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=182"
     */
    public TushareResponse<IndexMember> indexMember(String indexCode, String tsCode, String isNew, List<String> fields) throws IOException {
        IndexMemberParam param = IndexMemberParam.builder().indexCode(indexCode).tsCode(tsCode).isNew(isNew).build();
        return indexMember(param, fields, false);
    }


    /**
     * 申万行业成分
     *
     * @param indexCode 可选, 指数代码
     * @param tsCode    可选, 股票代码
     * @param isNew     可选, 是否最新（默认为“Y是”）
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=182"
     */
    public TushareResponse<IndexMember> indexMember(String indexCode, String tsCode, String isNew, List<String> fields, boolean populate) throws IOException {
        IndexMemberParam param = IndexMemberParam.builder().indexCode(indexCode).tsCode(tsCode).isNew(isNew).build();
        return indexMember(param, fields, populate);
    }

    /**
     * 申万行业成分
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=182"
     */
    public TushareResponse<IndexMember> indexMember(IndexMemberParam param, List<String> fields) throws IOException {
        return indexMember(param, fields, false);
    }

    /**
     * 申万行业成分
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=182"
     */
    public TushareResponse<IndexMember> indexMember(IndexMemberParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.INDEX_MEMBER).token(token).param(param).fields(fields).build();
        TushareResponse<IndexMember> response = (TushareResponse<IndexMember>) post(requestParam);
        List<IndexMember> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    IndexMember indexMember = IndexMember.init(responseDataFields, item);
                    dataList.add(indexMember);
                }
            }
        }
        return response;
    }

    /**
     * 获取指数周线行情
     *
     * @param tsCode    可选, TS代码
     * @param tradeDate 可选, 交易日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=171"
     */
    public TushareResponse<IndexWeekly> indexWeekly(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields) throws IOException {
        IndexWeeklyParam param = IndexWeeklyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return indexWeekly(param, fields, false);
    }


    /**
     * 获取指数周线行情
     *
     * @param tsCode    可选, TS代码
     * @param tradeDate 可选, 交易日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=171"
     */
    public TushareResponse<IndexWeekly> indexWeekly(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        IndexWeeklyParam param = IndexWeeklyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return indexWeekly(param, fields, populate);
    }

    /**
     * 获取指数周线行情
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=171"
     */
    public TushareResponse<IndexWeekly> indexWeekly(IndexWeeklyParam param, List<String> fields) throws IOException {
        return indexWeekly(param, fields, false);
    }

    /**
     * 获取指数周线行情
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=171"
     */
    public TushareResponse<IndexWeekly> indexWeekly(IndexWeeklyParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.INDEX_WEEKLY).token(token).param(param).fields(fields).build();
        TushareResponse<IndexWeekly> response = (TushareResponse<IndexWeekly>) post(requestParam);
        List<IndexWeekly> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    IndexWeekly indexWeekly = IndexWeekly.init(responseDataFields, item);
                    dataList.add(indexWeekly);
                }
            }
        }
        return response;
    }

    /**
     * 获取申万行业分类，包括申万28个一级分类，104个二级分类，227个三级分类的列表信息
     *
     * @param indexCode 可选, 指数代码
     * @param level     可选, 行业分级（L1/L2/L3）
     * @param src       可选, 指数来源（SW申万）
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=181"
     */
    public TushareResponse<IndexClassify> indexClassify(String indexCode, String level, String src, List<String> fields) throws IOException {
        IndexClassifyParam param = IndexClassifyParam.builder().indexCode(indexCode).level(level).src(src).build();
        return indexClassify(param, fields, false);
    }


    /**
     * 获取申万行业分类，包括申万28个一级分类，104个二级分类，227个三级分类的列表信息
     *
     * @param indexCode 可选, 指数代码
     * @param level     可选, 行业分级（L1/L2/L3）
     * @param src       可选, 指数来源（SW申万）
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=181"
     */
    public TushareResponse<IndexClassify> indexClassify(String indexCode, String level, String src, List<String> fields, boolean populate) throws IOException {
        IndexClassifyParam param = IndexClassifyParam.builder().indexCode(indexCode).level(level).src(src).build();
        return indexClassify(param, fields, populate);
    }

    /**
     * 获取申万行业分类，包括申万28个一级分类，104个二级分类，227个三级分类的列表信息
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=181"
     */
    public TushareResponse<IndexClassify> indexClassify(IndexClassifyParam param, List<String> fields) throws IOException {
        return indexClassify(param, fields, false);
    }

    /**
     * 获取申万行业分类，包括申万28个一级分类，104个二级分类，227个三级分类的列表信息
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=181"
     */
    public TushareResponse<IndexClassify> indexClassify(IndexClassifyParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.INDEX_CLASSIFY).token(token).param(param).fields(fields).build();
        TushareResponse<IndexClassify> response = (TushareResponse<IndexClassify>) post(requestParam);
        List<IndexClassify> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    IndexClassify indexClassify = IndexClassify.init(responseDataFields, item);
                    dataList.add(indexClassify);
                }
            }
        }
        return response;
    }

    /**
     * 获取指数基础信息。
     *
     * @param market    必填, 交易所或服务商
     * @param publisher 可选, 发布商
     * @param category  可选, 指数类别
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=94"
     */
    public TushareResponse<IndexBasic> indexBasic(String market, String publisher, String category, List<String> fields) throws IOException {
        IndexBasicParam param = IndexBasicParam.builder().market(market).publisher(publisher).category(category).build();
        return indexBasic(param, fields, false);
    }


    /**
     * 获取指数基础信息。
     *
     * @param market    必填, 交易所或服务商
     * @param publisher 可选, 发布商
     * @param category  可选, 指数类别
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=94"
     */
    public TushareResponse<IndexBasic> indexBasic(String market, String publisher, String category, List<String> fields, boolean populate) throws IOException {
        IndexBasicParam param = IndexBasicParam.builder().market(market).publisher(publisher).category(category).build();
        return indexBasic(param, fields, populate);
    }

    /**
     * 获取指数基础信息。
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=94"
     */
    public TushareResponse<IndexBasic> indexBasic(IndexBasicParam param, List<String> fields) throws IOException {
        return indexBasic(param, fields, false);
    }

    /**
     * 获取指数基础信息。
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=94"
     */
    public TushareResponse<IndexBasic> indexBasic(IndexBasicParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.INDEX_BASIC).token(token).param(param).fields(fields).build();
        TushareResponse<IndexBasic> response = (TushareResponse<IndexBasic>) post(requestParam);
        List<IndexBasic> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    IndexBasic indexBasic = IndexBasic.init(responseDataFields, item);
                    dataList.add(indexBasic);
                }
            }
        }
        return response;
    }

    /**
     * 获取指数每日行情，还可以通过bar接口获取。由于服务器压力，目前规则是单次调取最多取8000行记录，可以设置start和end日期补全。指数行情也可以通过<a href="https://tushare.pro/document/2?doc_id=109"><strong>通用行情接口</strong></a>获取数据．
     * 获取南华指数每日行情，指数行情也可以通过<a href="https://tushare.pro/document/2?doc_id=109"><strong>通用行情接口</strong></a>获取数据．
     *
     * @param tsCode    必填, 指数代码
     * @param tradeDate 可选, 交易日期 （日期格式：YYYYMMDD，下同）
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=95"
     * @see "https://tushare.pro/document/2?doc_id=155"
     */
    public TushareResponse<IndexDaily> indexDaily(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields) throws IOException {
        IndexDailyParam param = IndexDailyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return indexDaily(param, fields, false);
    }


    /**
     * 获取指数每日行情，还可以通过bar接口获取。由于服务器压力，目前规则是单次调取最多取8000行记录，可以设置start和end日期补全。指数行情也可以通过<a href="https://tushare.pro/document/2?doc_id=109"><strong>通用行情接口</strong></a>获取数据．
     * 获取南华指数每日行情，指数行情也可以通过<a href="https://tushare.pro/document/2?doc_id=109"><strong>通用行情接口</strong></a>获取数据．
     *
     * @param tsCode    必填, 指数代码
     * @param tradeDate 可选, 交易日期 （日期格式：YYYYMMDD，下同）
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=95"
     * @see "https://tushare.pro/document/2?doc_id=155"
     */
    public TushareResponse<IndexDaily> indexDaily(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        IndexDailyParam param = IndexDailyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return indexDaily(param, fields, populate);
    }

    /**
     * 获取指数每日行情，还可以通过bar接口获取。由于服务器压力，目前规则是单次调取最多取8000行记录，可以设置start和end日期补全。指数行情也可以通过<a href="https://tushare.pro/document/2?doc_id=109"><strong>通用行情接口</strong></a>获取数据．
     * 获取南华指数每日行情，指数行情也可以通过<a href="https://tushare.pro/document/2?doc_id=109"><strong>通用行情接口</strong></a>获取数据．
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=95"
     * @see "https://tushare.pro/document/2?doc_id=155"
     */
    public TushareResponse<IndexDaily> indexDaily(IndexDailyParam param, List<String> fields) throws IOException {
        return indexDaily(param, fields, false);
    }

    /**
     * 获取指数每日行情，还可以通过bar接口获取。由于服务器压力，目前规则是单次调取最多取8000行记录，可以设置start和end日期补全。指数行情也可以通过<a href="https://tushare.pro/document/2?doc_id=109"><strong>通用行情接口</strong></a>获取数据．
     * 获取南华指数每日行情，指数行情也可以通过<a href="https://tushare.pro/document/2?doc_id=109"><strong>通用行情接口</strong></a>获取数据．
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=95"
     * @see "https://tushare.pro/document/2?doc_id=155"
     */
    public TushareResponse<IndexDaily> indexDaily(IndexDailyParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.INDEX_DAILY).token(token).param(param).fields(fields).build();
        TushareResponse<IndexDaily> response = (TushareResponse<IndexDaily>) post(requestParam);
        List<IndexDaily> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    IndexDaily indexDaily = IndexDaily.init(responseDataFields, item);
                    dataList.add(indexDaily);
                }
            }
        }
        return response;
    }

    /**
     * 目前只提供上证综指，深证成指，上证50，中证500，中小板指，创业板指的每日指标数据
     *
     * @param tradeDate 可选, 交易日期 （格式：YYYYMMDD，比如20181018，下同）
     * @param tsCode    可选, TS代码
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=128"
     */
    public TushareResponse<IndexDailybasic> indexDailybasic(String tradeDate, String tsCode, String startDate, String endDate, List<String> fields) throws IOException {
        IndexDailybasicParam param = IndexDailybasicParam.builder().tradeDate(tradeDate).tsCode(tsCode).startDate(startDate).endDate(endDate).build();
        return indexDailybasic(param, fields, false);
    }


    /**
     * 目前只提供上证综指，深证成指，上证50，中证500，中小板指，创业板指的每日指标数据
     *
     * @param tradeDate 可选, 交易日期 （格式：YYYYMMDD，比如20181018，下同）
     * @param tsCode    可选, TS代码
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=128"
     */
    public TushareResponse<IndexDailybasic> indexDailybasic(String tradeDate, String tsCode, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        IndexDailybasicParam param = IndexDailybasicParam.builder().tradeDate(tradeDate).tsCode(tsCode).startDate(startDate).endDate(endDate).build();
        return indexDailybasic(param, fields, populate);
    }

    /**
     * 目前只提供上证综指，深证成指，上证50，中证500，中小板指，创业板指的每日指标数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=128"
     */
    public TushareResponse<IndexDailybasic> indexDailybasic(IndexDailybasicParam param, List<String> fields) throws IOException {
        return indexDailybasic(param, fields, false);
    }

    /**
     * 目前只提供上证综指，深证成指，上证50，中证500，中小板指，创业板指的每日指标数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=128"
     */
    public TushareResponse<IndexDailybasic> indexDailybasic(IndexDailybasicParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.INDEX_DAILYBASIC).token(token).param(param).fields(fields).build();
        TushareResponse<IndexDailybasic> response = (TushareResponse<IndexDailybasic>) post(requestParam);
        List<IndexDailybasic> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    IndexDailybasic indexDailybasic = IndexDailybasic.init(responseDataFields, item);
                    dataList.add(indexDailybasic);
                }
            }
        }
        return response;
    }

    /**
     * 获取公募基金净值数据
     *
     * @param tsCode  可选, TS基金代码 （二选一）
     * @param endDate 可选, 净值日期 （二选一）
     * @param fields  字段列表
     * @see "https://tushare.pro/document/2?doc_id=119"
     */
    public TushareResponse<FundNav> fundNav(String tsCode, String endDate, List<String> fields) throws IOException {
        FundNavParam param = FundNavParam.builder().tsCode(tsCode).endDate(endDate).build();
        return fundNav(param, fields, false);
    }


    /**
     * 获取公募基金净值数据
     *
     * @param tsCode   可选, TS基金代码 （二选一）
     * @param endDate  可选, 净值日期 （二选一）
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=119"
     */
    public TushareResponse<FundNav> fundNav(String tsCode, String endDate, List<String> fields, boolean populate) throws IOException {
        FundNavParam param = FundNavParam.builder().tsCode(tsCode).endDate(endDate).build();
        return fundNav(param, fields, populate);
    }

    /**
     * 获取公募基金净值数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=119"
     */
    public TushareResponse<FundNav> fundNav(FundNavParam param, List<String> fields) throws IOException {
        return fundNav(param, fields, false);
    }

    /**
     * 获取公募基金净值数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=119"
     */
    public TushareResponse<FundNav> fundNav(FundNavParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FUND_NAV).token(token).param(param).fields(fields).build();
        TushareResponse<FundNav> response = (TushareResponse<FundNav>) post(requestParam);
        List<FundNav> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FundNav fundNav = FundNav.init(responseDataFields, item);
                    dataList.add(fundNav);
                }
            }
        }
        return response;
    }

    /**
     * 获取公募基金持仓数据，季度更新
     *
     * @param tsCode 必填, 基金代码
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=121"
     */
    public TushareResponse<FundPortfolio> fundPortfolio(String tsCode, List<String> fields) throws IOException {
        FundPortfolioParam param = FundPortfolioParam.builder().tsCode(tsCode).build();
        return fundPortfolio(param, fields, false);
    }


    /**
     * 获取公募基金持仓数据，季度更新
     *
     * @param tsCode   必填, 基金代码
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=121"
     */
    public TushareResponse<FundPortfolio> fundPortfolio(String tsCode, List<String> fields, boolean populate) throws IOException {
        FundPortfolioParam param = FundPortfolioParam.builder().tsCode(tsCode).build();
        return fundPortfolio(param, fields, populate);
    }

    /**
     * 获取公募基金持仓数据，季度更新
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=121"
     */
    public TushareResponse<FundPortfolio> fundPortfolio(FundPortfolioParam param, List<String> fields) throws IOException {
        return fundPortfolio(param, fields, false);
    }

    /**
     * 获取公募基金持仓数据，季度更新
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=121"
     */
    public TushareResponse<FundPortfolio> fundPortfolio(FundPortfolioParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FUND_PORTFOLIO).token(token).param(param).fields(fields).build();
        TushareResponse<FundPortfolio> response = (TushareResponse<FundPortfolio>) post(requestParam);
        List<FundPortfolio> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FundPortfolio fundPortfolio = FundPortfolio.init(responseDataFields, item);
                    dataList.add(fundPortfolio);
                }
            }
        }
        return response;
    }

    /**
     * 获取公募基金分红数据
     *
     * @param annDate 可选, 公告日（以下参数四选一）
     * @param exDate  可选, 除息日
     * @param payDate 可选, 派息日
     * @param tsCode  可选, 基金代码
     * @param fields  字段列表
     * @see "https://tushare.pro/document/2?doc_id=120"
     */
    public TushareResponse<FundDiv> fundDiv(String annDate, String exDate, String payDate, String tsCode, List<String> fields) throws IOException {
        FundDivParam param = FundDivParam.builder().annDate(annDate).exDate(exDate).payDate(payDate).tsCode(tsCode).build();
        return fundDiv(param, fields, false);
    }


    /**
     * 获取公募基金分红数据
     *
     * @param annDate  可选, 公告日（以下参数四选一）
     * @param exDate   可选, 除息日
     * @param payDate  可选, 派息日
     * @param tsCode   可选, 基金代码
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=120"
     */
    public TushareResponse<FundDiv> fundDiv(String annDate, String exDate, String payDate, String tsCode, List<String> fields, boolean populate) throws IOException {
        FundDivParam param = FundDivParam.builder().annDate(annDate).exDate(exDate).payDate(payDate).tsCode(tsCode).build();
        return fundDiv(param, fields, populate);
    }

    /**
     * 获取公募基金分红数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=120"
     */
    public TushareResponse<FundDiv> fundDiv(FundDivParam param, List<String> fields) throws IOException {
        return fundDiv(param, fields, false);
    }

    /**
     * 获取公募基金分红数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=120"
     */
    public TushareResponse<FundDiv> fundDiv(FundDivParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FUND_DIV).token(token).param(param).fields(fields).build();
        TushareResponse<FundDiv> response = (TushareResponse<FundDiv>) post(requestParam);
        List<FundDiv> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FundDiv fundDiv = FundDiv.init(responseDataFields, item);
                    dataList.add(fundDiv);
                }
            }
        }
        return response;
    }

    /**
     * 获取公募基金数据列表，包括场内和场外基金
     *
     * @param market 可选, 交易市场: E场内 O场外（默认E）
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=19"
     */
    public TushareResponse<FundBasic> fundBasic(String market, List<String> fields) throws IOException {
        FundBasicParam param = FundBasicParam.builder().market(market).build();
        return fundBasic(param, fields, false);
    }


    /**
     * 获取公募基金数据列表，包括场内和场外基金
     *
     * @param market   可选, 交易市场: E场内 O场外（默认E）
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=19"
     */
    public TushareResponse<FundBasic> fundBasic(String market, List<String> fields, boolean populate) throws IOException {
        FundBasicParam param = FundBasicParam.builder().market(market).build();
        return fundBasic(param, fields, populate);
    }

    /**
     * 获取公募基金数据列表，包括场内和场外基金
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=19"
     */
    public TushareResponse<FundBasic> fundBasic(FundBasicParam param, List<String> fields) throws IOException {
        return fundBasic(param, fields, false);
    }

    /**
     * 获取公募基金数据列表，包括场内和场外基金
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=19"
     */
    public TushareResponse<FundBasic> fundBasic(FundBasicParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FUND_BASIC).token(token).param(param).fields(fields).build();
        TushareResponse<FundBasic> response = (TushareResponse<FundBasic>) post(requestParam);
        List<FundBasic> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FundBasic fundBasic = FundBasic.init(responseDataFields, item);
                    dataList.add(fundBasic);
                }
            }
        }
        return response;
    }

    /**
     * 获取公募基金管理人列表
     *
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=118"
     */
    public TushareResponse<FundCompany> fundCompany(List<String> fields) throws IOException {
        return fundCompany(fields, false);
    }

    /**
     * 获取公募基金管理人列表
     *
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=118"
     */
    public TushareResponse<FundCompany> fundCompany(List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FUND_COMPANY).token(token).param(null).fields(fields).build();
        TushareResponse<FundCompany> response = (TushareResponse<FundCompany>) post(requestParam);
        List<FundCompany> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FundCompany fundCompany = FundCompany.init(responseDataFields, item);
                    dataList.add(fundCompany);
                }
            }
        }
        return response;
    }

    /**
     * 获取场内基金日线行情，类似股票日行情
     *
     * @param tsCode    可选, 基金代码（二选一）
     * @param tradeDate 可选, 交易日期（二选一）
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=127"
     */
    public TushareResponse<FundDaily> fundDaily(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields) throws IOException {
        FundDailyParam param = FundDailyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return fundDaily(param, fields, false);
    }


    /**
     * 获取场内基金日线行情，类似股票日行情
     *
     * @param tsCode    可选, 基金代码（二选一）
     * @param tradeDate 可选, 交易日期（二选一）
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=127"
     */
    public TushareResponse<FundDaily> fundDaily(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        FundDailyParam param = FundDailyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return fundDaily(param, fields, populate);
    }

    /**
     * 获取场内基金日线行情，类似股票日行情
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=127"
     */
    public TushareResponse<FundDaily> fundDaily(FundDailyParam param, List<String> fields) throws IOException {
        return fundDaily(param, fields, false);
    }

    /**
     * 获取场内基金日线行情，类似股票日行情
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=127"
     */
    public TushareResponse<FundDaily> fundDaily(FundDailyParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FUND_DAILY).token(token).param(param).fields(fields).build();
        TushareResponse<FundDaily> response = (TushareResponse<FundDaily>) post(requestParam);
        List<FundDaily> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FundDaily fundDaily = FundDaily.init(responseDataFields, item);
                    dataList.add(fundDaily);
                }
            }
        }
        return response;
    }

    /**
     * Shibor报价数据
     *
     * @param date      可选, 日期 (日期输入格式：YYYYMMDD，下同)
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param bank      可选, 银行名称 （中文名称，例如 农业银行）
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=150"
     */
    public TushareResponse<ShiborQuote> shiborQuote(String date, String startDate, String endDate, String bank, List<String> fields) throws IOException {
        ShiborQuoteParam param = ShiborQuoteParam.builder().date(date).startDate(startDate).endDate(endDate).bank(bank).build();
        return shiborQuote(param, fields, false);
    }


    /**
     * Shibor报价数据
     *
     * @param date      可选, 日期 (日期输入格式：YYYYMMDD，下同)
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param bank      可选, 银行名称 （中文名称，例如 农业银行）
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=150"
     */
    public TushareResponse<ShiborQuote> shiborQuote(String date, String startDate, String endDate, String bank, List<String> fields, boolean populate) throws IOException {
        ShiborQuoteParam param = ShiborQuoteParam.builder().date(date).startDate(startDate).endDate(endDate).bank(bank).build();
        return shiborQuote(param, fields, populate);
    }

    /**
     * Shibor报价数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=150"
     */
    public TushareResponse<ShiborQuote> shiborQuote(ShiborQuoteParam param, List<String> fields) throws IOException {
        return shiborQuote(param, fields, false);
    }

    /**
     * Shibor报价数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=150"
     */
    public TushareResponse<ShiborQuote> shiborQuote(ShiborQuoteParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.SHIBOR_QUOTE).token(token).param(param).fields(fields).build();
        TushareResponse<ShiborQuote> response = (TushareResponse<ShiborQuote>) post(requestParam);
        List<ShiborQuote> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    ShiborQuote shiborQuote = ShiborQuote.init(responseDataFields, item);
                    dataList.add(shiborQuote);
                }
            }
        }
        return response;
    }

    /**
     * Hibor利率
     *
     * @param date      可选, 日期 (日期输入格式：YYYYMMDD，下同)
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=153"
     */
    public TushareResponse<Hibor> hibor(String date, String startDate, String endDate, List<String> fields) throws IOException {
        HiborParam param = HiborParam.builder().date(date).startDate(startDate).endDate(endDate).build();
        return hibor(param, fields, false);
    }


    /**
     * Hibor利率
     *
     * @param date      可选, 日期 (日期输入格式：YYYYMMDD，下同)
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=153"
     */
    public TushareResponse<Hibor> hibor(String date, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        HiborParam param = HiborParam.builder().date(date).startDate(startDate).endDate(endDate).build();
        return hibor(param, fields, populate);
    }

    /**
     * Hibor利率
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=153"
     */
    public TushareResponse<Hibor> hibor(HiborParam param, List<String> fields) throws IOException {
        return hibor(param, fields, false);
    }

    /**
     * Hibor利率
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=153"
     */
    public TushareResponse<Hibor> hibor(HiborParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.HIBOR).token(token).param(param).fields(fields).build();
        TushareResponse<Hibor> response = (TushareResponse<Hibor>) post(requestParam);
        List<Hibor> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Hibor hibor = Hibor.init(responseDataFields, item);
                    dataList.add(hibor);
                }
            }
        }
        return response;
    }

    /**
     * 广州民间借贷利率
     *
     * @param date      可选, 日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=174"
     */
    public TushareResponse<GzIndex> gzIndex(String date, String startDate, String endDate, List<String> fields) throws IOException {
        GzIndexParam param = GzIndexParam.builder().date(date).startDate(startDate).endDate(endDate).build();
        return gzIndex(param, fields, false);
    }


    /**
     * 广州民间借贷利率
     *
     * @param date      可选, 日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=174"
     */
    public TushareResponse<GzIndex> gzIndex(String date, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        GzIndexParam param = GzIndexParam.builder().date(date).startDate(startDate).endDate(endDate).build();
        return gzIndex(param, fields, populate);
    }

    /**
     * 广州民间借贷利率
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=174"
     */
    public TushareResponse<GzIndex> gzIndex(GzIndexParam param, List<String> fields) throws IOException {
        return gzIndex(param, fields, false);
    }

    /**
     * 广州民间借贷利率
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=174"
     */
    public TushareResponse<GzIndex> gzIndex(GzIndexParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.GZ_INDEX).token(token).param(param).fields(fields).build();
        TushareResponse<GzIndex> response = (TushareResponse<GzIndex>) post(requestParam);
        List<GzIndex> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    GzIndex gzIndex = GzIndex.init(responseDataFields, item);
                    dataList.add(gzIndex);
                }
            }
        }
        return response;
    }

    /**
     * Libor拆借利率
     *
     * @param date      可选, 日期 (日期输入格式：YYYYMMDD，下同)
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param currType  可选, 货币代码 (USD美元 EUR欧元 JPY日元 GBP英镑 CHF瑞郎，默认是USD)
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=152"
     */
    public TushareResponse<Libor> libor(String date, String startDate, String endDate, String currType, List<String> fields) throws IOException {
        LiborParam param = LiborParam.builder().date(date).startDate(startDate).endDate(endDate).currType(currType).build();
        return libor(param, fields, false);
    }


    /**
     * Libor拆借利率
     *
     * @param date      可选, 日期 (日期输入格式：YYYYMMDD，下同)
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param currType  可选, 货币代码 (USD美元 EUR欧元 JPY日元 GBP英镑 CHF瑞郎，默认是USD)
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=152"
     */
    public TushareResponse<Libor> libor(String date, String startDate, String endDate, String currType, List<String> fields, boolean populate) throws IOException {
        LiborParam param = LiborParam.builder().date(date).startDate(startDate).endDate(endDate).currType(currType).build();
        return libor(param, fields, populate);
    }

    /**
     * Libor拆借利率
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=152"
     */
    public TushareResponse<Libor> libor(LiborParam param, List<String> fields) throws IOException {
        return libor(param, fields, false);
    }

    /**
     * Libor拆借利率
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=152"
     */
    public TushareResponse<Libor> libor(LiborParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.LIBOR).token(token).param(param).fields(fields).build();
        TushareResponse<Libor> response = (TushareResponse<Libor>) post(requestParam);
        List<Libor> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Libor libor = Libor.init(responseDataFields, item);
                    dataList.add(libor);
                }
            }
        }
        return response;
    }

    /**
     * 温州民间借贷利率，即温州指数
     *
     * @param date      可选, 日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=173"
     */
    public TushareResponse<WzIndex> wzIndex(String date, String startDate, String endDate, List<String> fields) throws IOException {
        WzIndexParam param = WzIndexParam.builder().date(date).startDate(startDate).endDate(endDate).build();
        return wzIndex(param, fields, false);
    }


    /**
     * 温州民间借贷利率，即温州指数
     *
     * @param date      可选, 日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=173"
     */
    public TushareResponse<WzIndex> wzIndex(String date, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        WzIndexParam param = WzIndexParam.builder().date(date).startDate(startDate).endDate(endDate).build();
        return wzIndex(param, fields, populate);
    }

    /**
     * 温州民间借贷利率，即温州指数
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=173"
     */
    public TushareResponse<WzIndex> wzIndex(WzIndexParam param, List<String> fields) throws IOException {
        return wzIndex(param, fields, false);
    }

    /**
     * 温州民间借贷利率，即温州指数
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=173"
     */
    public TushareResponse<WzIndex> wzIndex(WzIndexParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.WZ_INDEX).token(token).param(param).fields(fields).build();
        TushareResponse<WzIndex> response = (TushareResponse<WzIndex>) post(requestParam);
        List<WzIndex> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    WzIndex wzIndex = WzIndex.init(responseDataFields, item);
                    dataList.add(wzIndex);
                }
            }
        }
        return response;
    }

    /**
     * LPR贷款基础利率
     *
     * @param date      可选, 日期 (日期输入格式：YYYYMMDD，下同)
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=151"
     */
    public TushareResponse<ShiborLpr> shiborLpr(String date, String startDate, String endDate, List<String> fields) throws IOException {
        ShiborLprParam param = ShiborLprParam.builder().date(date).startDate(startDate).endDate(endDate).build();
        return shiborLpr(param, fields, false);
    }


    /**
     * LPR贷款基础利率
     *
     * @param date      可选, 日期 (日期输入格式：YYYYMMDD，下同)
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=151"
     */
    public TushareResponse<ShiborLpr> shiborLpr(String date, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        ShiborLprParam param = ShiborLprParam.builder().date(date).startDate(startDate).endDate(endDate).build();
        return shiborLpr(param, fields, populate);
    }

    /**
     * LPR贷款基础利率
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=151"
     */
    public TushareResponse<ShiborLpr> shiborLpr(ShiborLprParam param, List<String> fields) throws IOException {
        return shiborLpr(param, fields, false);
    }

    /**
     * LPR贷款基础利率
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=151"
     */
    public TushareResponse<ShiborLpr> shiborLpr(ShiborLprParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.SHIBOR_LPR).token(token).param(param).fields(fields).build();
        TushareResponse<ShiborLpr> response = (TushareResponse<ShiborLpr>) post(requestParam);
        List<ShiborLpr> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    ShiborLpr shiborLpr = ShiborLpr.init(responseDataFields, item);
                    dataList.add(shiborLpr);
                }
            }
        }
        return response;
    }

    /**
     * shibor利率
     *
     * @param date      可选, 日期 (日期输入格式：YYYYMMDD，下同)
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=149"
     */
    public TushareResponse<Shibor> shibor(String date, String startDate, String endDate, List<String> fields) throws IOException {
        ShiborParam param = ShiborParam.builder().date(date).startDate(startDate).endDate(endDate).build();
        return shibor(param, fields, false);
    }


    /**
     * shibor利率
     *
     * @param date      可选, 日期 (日期输入格式：YYYYMMDD，下同)
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=149"
     */
    public TushareResponse<Shibor> shibor(String date, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        ShiborParam param = ShiborParam.builder().date(date).startDate(startDate).endDate(endDate).build();
        return shibor(param, fields, populate);
    }

    /**
     * shibor利率
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=149"
     */
    public TushareResponse<Shibor> shibor(ShiborParam param, List<String> fields) throws IOException {
        return shibor(param, fields, false);
    }

    /**
     * shibor利率
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=149"
     */
    public TushareResponse<Shibor> shibor(ShiborParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.SHIBOR).token(token).param(param).fields(fields).build();
        TushareResponse<Shibor> response = (TushareResponse<Shibor>) post(requestParam);
        List<Shibor> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Shibor shibor = Shibor.init(responseDataFields, item);
                    dataList.add(shibor);
                }
            }
        }
        return response;
    }

    /**
     * 获取期权合约信息
     *
     * @param exchange 必填, 交易所代码 （包括上交所SSE等交易所）
     * @param callPut  可选, 期权类型
     * @param fields   字段列表
     * @see "https://tushare.pro/document/2?doc_id=158"
     */
    public TushareResponse<OptBasic> optBasic(String exchange, String callPut, List<String> fields) throws IOException {
        OptBasicParam param = OptBasicParam.builder().exchange(exchange).callPut(callPut).build();
        return optBasic(param, fields, false);
    }


    /**
     * 获取期权合约信息
     *
     * @param exchange 必填, 交易所代码 （包括上交所SSE等交易所）
     * @param callPut  可选, 期权类型
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=158"
     */
    public TushareResponse<OptBasic> optBasic(String exchange, String callPut, List<String> fields, boolean populate) throws IOException {
        OptBasicParam param = OptBasicParam.builder().exchange(exchange).callPut(callPut).build();
        return optBasic(param, fields, populate);
    }

    /**
     * 获取期权合约信息
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=158"
     */
    public TushareResponse<OptBasic> optBasic(OptBasicParam param, List<String> fields) throws IOException {
        return optBasic(param, fields, false);
    }

    /**
     * 获取期权合约信息
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=158"
     */
    public TushareResponse<OptBasic> optBasic(OptBasicParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.OPT_BASIC).token(token).param(param).fields(fields).build();
        TushareResponse<OptBasic> response = (TushareResponse<OptBasic>) post(requestParam);
        List<OptBasic> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    OptBasic optBasic = OptBasic.init(responseDataFields, item);
                    dataList.add(optBasic);
                }
            }
        }
        return response;
    }

    /**
     * 获取期权日线行情
     *
     * @param tsCode    可选, TS合约代码（输入代码或时间至少任意一个参数）
     * @param tradeDate 可选, 交易日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param exchange  可选, 交易所
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=159"
     */
    public TushareResponse<OptDaily> optDaily(String tsCode, String tradeDate, String startDate, String endDate, String exchange, List<String> fields) throws IOException {
        OptDailyParam param = OptDailyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).exchange(exchange).build();
        return optDaily(param, fields, false);
    }


    /**
     * 获取期权日线行情
     *
     * @param tsCode    可选, TS合约代码（输入代码或时间至少任意一个参数）
     * @param tradeDate 可选, 交易日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param exchange  可选, 交易所
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=159"
     */
    public TushareResponse<OptDaily> optDaily(String tsCode, String tradeDate, String startDate, String endDate, String exchange, List<String> fields, boolean populate) throws IOException {
        OptDailyParam param = OptDailyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).exchange(exchange).build();
        return optDaily(param, fields, populate);
    }

    /**
     * 获取期权日线行情
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=159"
     */
    public TushareResponse<OptDaily> optDaily(OptDailyParam param, List<String> fields) throws IOException {
        return optDaily(param, fields, false);
    }

    /**
     * 获取期权日线行情
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=159"
     */
    public TushareResponse<OptDaily> optDaily(OptDailyParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.OPT_DAILY).token(token).param(param).fields(fields).build();
        TushareResponse<OptDaily> response = (TushareResponse<OptDaily>) post(requestParam);
        List<OptDaily> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    OptDaily optDaily = OptDaily.init(responseDataFields, item);
                    dataList.add(optDaily);
                }
            }
        }
        return response;
    }

    /**
     * 获取每日结算参数数据，包括交易和交割费率等
     *
     * @param tradeDate 可选, 交易日期 （trade_date/ts_code至少需要输入一个参数）
     * @param tsCode    可选, 合约代码
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param exchange  可选, 交易所代码
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=141"
     */
    public TushareResponse<FutSettle> futSettle(String tradeDate, String tsCode, String startDate, String endDate, String exchange, List<String> fields) throws IOException {
        FutSettleParam param = FutSettleParam.builder().tradeDate(tradeDate).tsCode(tsCode).startDate(startDate).endDate(endDate).exchange(exchange).build();
        return futSettle(param, fields, false);
    }


    /**
     * 获取每日结算参数数据，包括交易和交割费率等
     *
     * @param tradeDate 可选, 交易日期 （trade_date/ts_code至少需要输入一个参数）
     * @param tsCode    可选, 合约代码
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param exchange  可选, 交易所代码
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=141"
     */
    public TushareResponse<FutSettle> futSettle(String tradeDate, String tsCode, String startDate, String endDate, String exchange, List<String> fields, boolean populate) throws IOException {
        FutSettleParam param = FutSettleParam.builder().tradeDate(tradeDate).tsCode(tsCode).startDate(startDate).endDate(endDate).exchange(exchange).build();
        return futSettle(param, fields, populate);
    }

    /**
     * 获取每日结算参数数据，包括交易和交割费率等
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=141"
     */
    public TushareResponse<FutSettle> futSettle(FutSettleParam param, List<String> fields) throws IOException {
        return futSettle(param, fields, false);
    }

    /**
     * 获取每日结算参数数据，包括交易和交割费率等
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=141"
     */
    public TushareResponse<FutSettle> futSettle(FutSettleParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FUT_SETTLE).token(token).param(param).fields(fields).build();
        TushareResponse<FutSettle> response = (TushareResponse<FutSettle>) post(requestParam);
        List<FutSettle> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FutSettle futSettle = FutSettle.init(responseDataFields, item);
                    dataList.add(futSettle);
                }
            }
        }
        return response;
    }

    /**
     * 获取仓单日报数据，了解各仓库/厂库的仓单变化
     *
     * @param tradeDate 可选, 交易日期
     * @param symbol    可选, 产品代码
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param exchange  可选, 交易所代码
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=140"
     */
    public TushareResponse<FutWsr> futWsr(String tradeDate, String symbol, String startDate, String endDate, String exchange, List<String> fields) throws IOException {
        FutWsrParam param = FutWsrParam.builder().tradeDate(tradeDate).symbol(symbol).startDate(startDate).endDate(endDate).exchange(exchange).build();
        return futWsr(param, fields, false);
    }


    /**
     * 获取仓单日报数据，了解各仓库/厂库的仓单变化
     *
     * @param tradeDate 可选, 交易日期
     * @param symbol    可选, 产品代码
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param exchange  可选, 交易所代码
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=140"
     */
    public TushareResponse<FutWsr> futWsr(String tradeDate, String symbol, String startDate, String endDate, String exchange, List<String> fields, boolean populate) throws IOException {
        FutWsrParam param = FutWsrParam.builder().tradeDate(tradeDate).symbol(symbol).startDate(startDate).endDate(endDate).exchange(exchange).build();
        return futWsr(param, fields, populate);
    }

    /**
     * 获取仓单日报数据，了解各仓库/厂库的仓单变化
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=140"
     */
    public TushareResponse<FutWsr> futWsr(FutWsrParam param, List<String> fields) throws IOException {
        return futWsr(param, fields, false);
    }

    /**
     * 获取仓单日报数据，了解各仓库/厂库的仓单变化
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=140"
     */
    public TushareResponse<FutWsr> futWsr(FutWsrParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FUT_WSR).token(token).param(param).fields(fields).build();
        TushareResponse<FutWsr> response = (TushareResponse<FutWsr>) post(requestParam);
        List<FutWsr> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FutWsr futWsr = FutWsr.init(responseDataFields, item);
                    dataList.add(futWsr);
                }
            }
        }
        return response;
    }

    /**
     * 获取期货合约列表数据
     *
     * @param exchange 必填, 交易所代码 CFFEX-中金所 DCE-大商所 CZCE-郑商所 SHFE-上期所 INE-上海国际能源交易中心
     * @param futType  可选, 合约类型 (1 普通合约 2主力与连续合约 默认取全部)
     * @param fields   字段列表
     * @see "https://tushare.pro/document/2?doc_id=135"
     */
    public TushareResponse<FutBasic> futBasic(String exchange, String futType, List<String> fields) throws IOException {
        FutBasicParam param = FutBasicParam.builder().exchange(exchange).futType(futType).build();
        return futBasic(param, fields, false);
    }


    /**
     * 获取期货合约列表数据
     *
     * @param exchange 必填, 交易所代码 CFFEX-中金所 DCE-大商所 CZCE-郑商所 SHFE-上期所 INE-上海国际能源交易中心
     * @param futType  可选, 合约类型 (1 普通合约 2主力与连续合约 默认取全部)
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=135"
     */
    public TushareResponse<FutBasic> futBasic(String exchange, String futType, List<String> fields, boolean populate) throws IOException {
        FutBasicParam param = FutBasicParam.builder().exchange(exchange).futType(futType).build();
        return futBasic(param, fields, populate);
    }

    /**
     * 获取期货合约列表数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=135"
     */
    public TushareResponse<FutBasic> futBasic(FutBasicParam param, List<String> fields) throws IOException {
        return futBasic(param, fields, false);
    }

    /**
     * 获取期货合约列表数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=135"
     */
    public TushareResponse<FutBasic> futBasic(FutBasicParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FUT_BASIC).token(token).param(param).fields(fields).build();
        TushareResponse<FutBasic> response = (TushareResponse<FutBasic>) post(requestParam);
        List<FutBasic> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FutBasic futBasic = FutBasic.init(responseDataFields, item);
                    dataList.add(futBasic);
                }
            }
        }
        return response;
    }

    /**
     * 获取每日成交持仓排名数据
     *
     * @param tradeDate 可选, 交易日期 （trade_date/symbol至少输入一个参数）
     * @param symbol    可选, 合约或产品代码
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param exchange  可选, 交易所代码
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=139"
     */
    public TushareResponse<FutHolding> futHolding(String tradeDate, String symbol, String startDate, String endDate, String exchange, List<String> fields) throws IOException {
        FutHoldingParam param = FutHoldingParam.builder().tradeDate(tradeDate).symbol(symbol).startDate(startDate).endDate(endDate).exchange(exchange).build();
        return futHolding(param, fields, false);
    }


    /**
     * 获取每日成交持仓排名数据
     *
     * @param tradeDate 可选, 交易日期 （trade_date/symbol至少输入一个参数）
     * @param symbol    可选, 合约或产品代码
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param exchange  可选, 交易所代码
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=139"
     */
    public TushareResponse<FutHolding> futHolding(String tradeDate, String symbol, String startDate, String endDate, String exchange, List<String> fields, boolean populate) throws IOException {
        FutHoldingParam param = FutHoldingParam.builder().tradeDate(tradeDate).symbol(symbol).startDate(startDate).endDate(endDate).exchange(exchange).build();
        return futHolding(param, fields, populate);
    }

    /**
     * 获取每日成交持仓排名数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=139"
     */
    public TushareResponse<FutHolding> futHolding(FutHoldingParam param, List<String> fields) throws IOException {
        return futHolding(param, fields, false);
    }

    /**
     * 获取每日成交持仓排名数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=139"
     */
    public TushareResponse<FutHolding> futHolding(FutHoldingParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FUT_HOLDING).token(token).param(param).fields(fields).build();
        TushareResponse<FutHolding> response = (TushareResponse<FutHolding>) post(requestParam);
        List<FutHolding> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FutHolding futHolding = FutHolding.init(responseDataFields, item);
                    dataList.add(futHolding);
                }
            }
        }
        return response;
    }

    /**
     * 期货日线行情数据
     *
     * @param tradeDate 可选, 交易日期
     * @param tsCode    可选, 合约代码
     * @param exchange  可选, 交易所代码
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=138"
     */
    public TushareResponse<FutDaily> futDaily(String tradeDate, String tsCode, String exchange, String startDate, String endDate, List<String> fields) throws IOException {
        FutDailyParam param = FutDailyParam.builder().tradeDate(tradeDate).tsCode(tsCode).exchange(exchange).startDate(startDate).endDate(endDate).build();
        return futDaily(param, fields, false);
    }


    /**
     * 期货日线行情数据
     *
     * @param tradeDate 可选, 交易日期
     * @param tsCode    可选, 合约代码
     * @param exchange  可选, 交易所代码
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=138"
     */
    public TushareResponse<FutDaily> futDaily(String tradeDate, String tsCode, String exchange, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        FutDailyParam param = FutDailyParam.builder().tradeDate(tradeDate).tsCode(tsCode).exchange(exchange).startDate(startDate).endDate(endDate).build();
        return futDaily(param, fields, populate);
    }

    /**
     * 期货日线行情数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=138"
     */
    public TushareResponse<FutDaily> futDaily(FutDailyParam param, List<String> fields) throws IOException {
        return futDaily(param, fields, false);
    }

    /**
     * 期货日线行情数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=138"
     */
    public TushareResponse<FutDaily> futDaily(FutDailyParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FUT_DAILY).token(token).param(param).fields(fields).build();
        TushareResponse<FutDaily> response = (TushareResponse<FutDaily>) post(requestParam);
        List<FutDaily> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FutDaily futDaily = FutDaily.init(responseDataFields, item);
                    dataList.add(futDaily);
                }
            }
        }
        return response;
    }

    /**
     * 获取各大期货交易所交易日历数据
     *
     * @param exchange  可选, 交易所 SHFE 上期所 DCE 大商所 CFFEX中金所 CZCE郑商所 INE上海国际能源交易所
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param isOpen    可选, 是否交易 0休市 1交易
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=137"
     */
    public TushareResponse<TradeCalFuture> tradeCalFuture(String exchange, String startDate, String endDate, Integer isOpen, List<String> fields) throws IOException {
        TradeCalFutureParam param = TradeCalFutureParam.builder().exchange(exchange).startDate(startDate).endDate(endDate).isOpen(isOpen).build();
        return tradeCalFuture(param, fields, false);
    }


    /**
     * 获取各大期货交易所交易日历数据
     *
     * @param exchange  可选, 交易所 SHFE 上期所 DCE 大商所 CFFEX中金所 CZCE郑商所 INE上海国际能源交易所
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param isOpen    可选, 是否交易 0休市 1交易
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=137"
     */
    public TushareResponse<TradeCalFuture> tradeCalFuture(String exchange, String startDate, String endDate, Integer isOpen, List<String> fields, boolean populate) throws IOException {
        TradeCalFutureParam param = TradeCalFutureParam.builder().exchange(exchange).startDate(startDate).endDate(endDate).isOpen(isOpen).build();
        return tradeCalFuture(param, fields, populate);
    }

    /**
     * 获取各大期货交易所交易日历数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=137"
     */
    public TushareResponse<TradeCalFuture> tradeCalFuture(TradeCalFutureParam param, List<String> fields) throws IOException {
        return tradeCalFuture(param, fields, false);
    }

    /**
     * 获取各大期货交易所交易日历数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=137"
     */
    public TushareResponse<TradeCalFuture> tradeCalFuture(TradeCalFutureParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.TRADE_CAL).token(token).param(param).fields(fields).build();
        TushareResponse<TradeCalFuture> response = (TushareResponse<TradeCalFuture>) post(requestParam);
        List<TradeCalFuture> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    TradeCalFuture tradeCal = TradeCalFuture.init(responseDataFields, item);
                    dataList.add(tradeCal);
                }
            }
        }
        return response;
    }

    /**
     * 获取股权质押统计数据
     *
     * @param tsCode 必填, 股票代码
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=110"
     */
    public TushareResponse<PledgeStat> pledgeStat(String tsCode, List<String> fields) throws IOException {
        PledgeStatParam param = PledgeStatParam.builder().tsCode(tsCode).build();
        return pledgeStat(param, fields, false);
    }


    /**
     * 获取股权质押统计数据
     *
     * @param tsCode   必填, 股票代码
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=110"
     */
    public TushareResponse<PledgeStat> pledgeStat(String tsCode, List<String> fields, boolean populate) throws IOException {
        PledgeStatParam param = PledgeStatParam.builder().tsCode(tsCode).build();
        return pledgeStat(param, fields, populate);
    }

    /**
     * 获取股权质押统计数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=110"
     */
    public TushareResponse<PledgeStat> pledgeStat(PledgeStatParam param, List<String> fields) throws IOException {
        return pledgeStat(param, fields, false);
    }

    /**
     * 获取股权质押统计数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=110"
     */
    public TushareResponse<PledgeStat> pledgeStat(PledgeStatParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.PLEDGE_STAT).token(token).param(param).fields(fields).build();
        TushareResponse<PledgeStat> response = (TushareResponse<PledgeStat>) post(requestParam);
        List<PledgeStat> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    PledgeStat pledgeStat = PledgeStat.init(responseDataFields, item);
                    dataList.add(pledgeStat);
                }
            }
        }
        return response;
    }

    /**
     * 获取融资融券每日交易汇总数据
     *
     * @param tradeDate  可选, 交易日期
     * @param exchangeId 可选, 交易所代码
     * @param startDate  可选, 开始日期
     * @param endDate    可选, 结束日期
     * @param fields     字段列表
     * @see "https://tushare.pro/document/2?doc_id=58"
     */
    public TushareResponse<Margin> margin(String tradeDate, String exchangeId, String startDate, String endDate, List<String> fields) throws IOException {
        MarginParam param = MarginParam.builder().tradeDate(tradeDate).exchangeId(exchangeId).startDate(startDate).endDate(endDate).build();
        return margin(param, fields, false);
    }


    /**
     * 获取融资融券每日交易汇总数据
     *
     * @param tradeDate  可选, 交易日期
     * @param exchangeId 可选, 交易所代码
     * @param startDate  可选, 开始日期
     * @param endDate    可选, 结束日期
     * @param fields     字段列表
     * @param populate   是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=58"
     */
    public TushareResponse<Margin> margin(String tradeDate, String exchangeId, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        MarginParam param = MarginParam.builder().tradeDate(tradeDate).exchangeId(exchangeId).startDate(startDate).endDate(endDate).build();
        return margin(param, fields, populate);
    }

    /**
     * 获取融资融券每日交易汇总数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=58"
     */
    public TushareResponse<Margin> margin(MarginParam param, List<String> fields) throws IOException {
        return margin(param, fields, false);
    }

    /**
     * 获取融资融券每日交易汇总数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=58"
     */
    public TushareResponse<Margin> margin(MarginParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.MARGIN).token(token).param(param).fields(fields).build();
        TushareResponse<Margin> response = (TushareResponse<Margin>) post(requestParam);
        List<Margin> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Margin margin = Margin.init(responseDataFields, item);
                    dataList.add(margin);
                }
            }
        }
        return response;
    }

    /**
     * 获取上市公司基础信息
     *
     * @param exchange 可选, 交易所代码 ，SSE上交所 SZSE深交所 ，默认SSE
     * @param fields   字段列表
     * @see "https://tushare.pro/document/2?doc_id=112"
     */
    public TushareResponse<StockCompany> stockCompany(String exchange, List<String> fields) throws IOException {
        StockCompanyParam param = StockCompanyParam.builder().exchange(exchange).build();
        return stockCompany(param, fields, false);
    }


    /**
     * 获取上市公司基础信息
     *
     * @param exchange 可选, 交易所代码 ，SSE上交所 SZSE深交所 ，默认SSE
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=112"
     */
    public TushareResponse<StockCompany> stockCompany(String exchange, List<String> fields, boolean populate) throws IOException {
        StockCompanyParam param = StockCompanyParam.builder().exchange(exchange).build();
        return stockCompany(param, fields, populate);
    }

    /**
     * 获取上市公司基础信息
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=112"
     */
    public TushareResponse<StockCompany> stockCompany(StockCompanyParam param, List<String> fields) throws IOException {
        return stockCompany(param, fields, false);
    }

    /**
     * 获取上市公司基础信息
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=112"
     */
    public TushareResponse<StockCompany> stockCompany(StockCompanyParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.STOCK_COMPANY).token(token).param(param).fields(fields).build();
        TushareResponse<StockCompany> response = (TushareResponse<StockCompany>) post(requestParam);
        List<StockCompany> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    StockCompany stockCompany = StockCompany.init(responseDataFields, item);
                    dataList.add(stockCompany);
                }
            }
        }
        return response;
    }

    /**
     * 获取股权质押明细数据
     *
     * @param tsCode 必填, 股票代码
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=111"
     */
    public TushareResponse<PledgeDetail> pledgeDetail(String tsCode, List<String> fields) throws IOException {
        PledgeDetailParam param = PledgeDetailParam.builder().tsCode(tsCode).build();
        return pledgeDetail(param, fields, false);
    }


    /**
     * 获取股权质押明细数据
     *
     * @param tsCode   必填, 股票代码
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=111"
     */
    public TushareResponse<PledgeDetail> pledgeDetail(String tsCode, List<String> fields, boolean populate) throws IOException {
        PledgeDetailParam param = PledgeDetailParam.builder().tsCode(tsCode).build();
        return pledgeDetail(param, fields, populate);
    }

    /**
     * 获取股权质押明细数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=111"
     */
    public TushareResponse<PledgeDetail> pledgeDetail(PledgeDetailParam param, List<String> fields) throws IOException {
        return pledgeDetail(param, fields, false);
    }

    /**
     * 获取股权质押明细数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=111"
     */
    public TushareResponse<PledgeDetail> pledgeDetail(PledgeDetailParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.PLEDGE_DETAIL).token(token).param(param).fields(fields).build();
        TushareResponse<PledgeDetail> response = (TushareResponse<PledgeDetail>) post(requestParam);
        List<PledgeDetail> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    PledgeDetail pledgeDetail = PledgeDetail.init(responseDataFields, item);
                    dataList.add(pledgeDetail);
                }
            }
        }
        return response;
    }

    /**
     * 获取沪深两市每日融资融券明细
     *
     * @param tradeDate 可选, 交易日期
     * @param tsCode    可选, TS代码
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=59"
     */
    public TushareResponse<MarginDetail> marginDetail(String tradeDate, String tsCode, String startDate, String endDate, List<String> fields) throws IOException {
        MarginDetailParam param = MarginDetailParam.builder().tradeDate(tradeDate).tsCode(tsCode).startDate(startDate).endDate(endDate).build();
        return marginDetail(param, fields, false);
    }


    /**
     * 获取沪深两市每日融资融券明细
     *
     * @param tradeDate 可选, 交易日期
     * @param tsCode    可选, TS代码
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=59"
     */
    public TushareResponse<MarginDetail> marginDetail(String tradeDate, String tsCode, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        MarginDetailParam param = MarginDetailParam.builder().tradeDate(tradeDate).tsCode(tsCode).startDate(startDate).endDate(endDate).build();
        return marginDetail(param, fields, populate);
    }

    /**
     * 获取沪深两市每日融资融券明细
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=59"
     */
    public TushareResponse<MarginDetail> marginDetail(MarginDetailParam param, List<String> fields) throws IOException {
        return marginDetail(param, fields, false);
    }

    /**
     * 获取沪深两市每日融资融券明细
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=59"
     */
    public TushareResponse<MarginDetail> marginDetail(MarginDetailParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.MARGIN_DETAIL).token(token).param(param).fields(fields).build();
        TushareResponse<MarginDetail> response = (TushareResponse<MarginDetail>) post(requestParam);
        List<MarginDetail> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    MarginDetail marginDetail = MarginDetail.init(responseDataFields, item);
                    dataList.add(marginDetail);
                }
            }
        }
        return response;
    }

    /**
     * 获取全市场（包含A/B股和基金）每日涨跌停价格，包括涨停价格，跌停价格等
     *
     * @param tsCode    可选, 股票代码
     * @param tradeDate 可选, 交易日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=183"
     */
    public TushareResponse<StkLimit> stkLimit(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields) throws IOException {
        StkLimitParam param = StkLimitParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return stkLimit(param, fields, false);
    }


    /**
     * 获取全市场（包含A/B股和基金）每日涨跌停价格，包括涨停价格，跌停价格等
     *
     * @param tsCode    可选, 股票代码
     * @param tradeDate 可选, 交易日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=183"
     */
    public TushareResponse<StkLimit> stkLimit(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        StkLimitParam param = StkLimitParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return stkLimit(param, fields, populate);
    }

    /**
     * 获取全市场（包含A/B股和基金）每日涨跌停价格，包括涨停价格，跌停价格等
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=183"
     */
    public TushareResponse<StkLimit> stkLimit(StkLimitParam param, List<String> fields) throws IOException {
        return stkLimit(param, fields, false);
    }

    /**
     * 获取全市场（包含A/B股和基金）每日涨跌停价格，包括涨停价格，跌停价格等
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=183"
     */
    public TushareResponse<StkLimit> stkLimit(StkLimitParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.STK_LIMIT).token(token).param(param).fields(fields).build();
        TushareResponse<StkLimit> response = (TushareResponse<StkLimit>) post(requestParam);
        List<StkLimit> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    StkLimit stkLimit = StkLimit.init(responseDataFields, item);
                    dataList.add(stkLimit);
                }
            }
        }
        return response;
    }

    /**
     * 获得上市公司主营业务构成，分地区和产品两种方式
     *
     * @param tsCode    必填, 股票代码
     * @param period    可选, 报告期(每个季度最后一天的日期,比如20171231表示年报)
     * @param type      可选, 类型：P按产品 D按地区（请输入大写字母P或者D）
     * @param startDate 可选, 报告期开始日期
     * @param endDate   可选, 报告期结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=81"
     */
    public TushareResponse<FinaMainbz> finaMainbz(String tsCode, String period, String type, String startDate, String endDate, List<String> fields) throws IOException {
        FinaMainbzParam param = FinaMainbzParam.builder().tsCode(tsCode).period(period).type(type).startDate(startDate).endDate(endDate).build();
        return finaMainbz(param, fields, false);
    }


    /**
     * 获得上市公司主营业务构成，分地区和产品两种方式
     *
     * @param tsCode    必填, 股票代码
     * @param period    可选, 报告期(每个季度最后一天的日期,比如20171231表示年报)
     * @param type      可选, 类型：P按产品 D按地区（请输入大写字母P或者D）
     * @param startDate 可选, 报告期开始日期
     * @param endDate   可选, 报告期结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=81"
     */
    public TushareResponse<FinaMainbz> finaMainbz(String tsCode, String period, String type, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        FinaMainbzParam param = FinaMainbzParam.builder().tsCode(tsCode).period(period).type(type).startDate(startDate).endDate(endDate).build();
        return finaMainbz(param, fields, populate);
    }

    /**
     * 获得上市公司主营业务构成，分地区和产品两种方式
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=81"
     */
    public TushareResponse<FinaMainbz> finaMainbz(FinaMainbzParam param, List<String> fields) throws IOException {
        return finaMainbz(param, fields, false);
    }

    /**
     * 获得上市公司主营业务构成，分地区和产品两种方式
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=81"
     */
    public TushareResponse<FinaMainbz> finaMainbz(FinaMainbzParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FINA_MAINBZ).token(token).param(param).fields(fields).build();
        TushareResponse<FinaMainbz> response = (TushareResponse<FinaMainbz>) post(requestParam);
        List<FinaMainbz> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FinaMainbz finaMainbz = FinaMainbz.init(responseDataFields, item);
                    dataList.add(finaMainbz);
                }
            }
        }
        return response;
    }

    /**
     * 获取上市公司定期财务审计意见数据
     *
     * @param tsCode    必填, 股票代码
     * @param annDate   可选, 公告日期
     * @param startDate 可选, 公告开始日期
     * @param endDate   可选, 公告结束日期
     * @param period    可选, 报告期(每个季度最后一天的日期,比如20171231表示年报)
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=80"
     */
    public TushareResponse<FinaAudit> finaAudit(String tsCode, String annDate, String startDate, String endDate, String period, List<String> fields) throws IOException {
        FinaAuditParam param = FinaAuditParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).period(period).build();
        return finaAudit(param, fields, false);
    }


    /**
     * 获取上市公司定期财务审计意见数据
     *
     * @param tsCode    必填, 股票代码
     * @param annDate   可选, 公告日期
     * @param startDate 可选, 公告开始日期
     * @param endDate   可选, 公告结束日期
     * @param period    可选, 报告期(每个季度最后一天的日期,比如20171231表示年报)
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=80"
     */
    public TushareResponse<FinaAudit> finaAudit(String tsCode, String annDate, String startDate, String endDate, String period, List<String> fields, boolean populate) throws IOException {
        FinaAuditParam param = FinaAuditParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).period(period).build();
        return finaAudit(param, fields, populate);
    }

    /**
     * 获取上市公司定期财务审计意见数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=80"
     */
    public TushareResponse<FinaAudit> finaAudit(FinaAuditParam param, List<String> fields) throws IOException {
        return finaAudit(param, fields, false);
    }

    /**
     * 获取上市公司定期财务审计意见数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=80"
     */
    public TushareResponse<FinaAudit> finaAudit(FinaAuditParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FINA_AUDIT).token(token).param(param).fields(fields).build();
        TushareResponse<FinaAudit> response = (TushareResponse<FinaAudit>) post(requestParam);
        List<FinaAudit> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FinaAudit finaAudit = FinaAudit.init(responseDataFields, item);
                    dataList.add(finaAudit);
                }
            }
        }
        return response;
    }

    /**
     * 获取港股通每日成交数据，其中包括沪市、深市详细数据
     *
     * @param tsCode     可选, 股票代码（二选一）
     * @param tradeDate  可选, 交易日期（二选一）
     * @param startDate  可选, 开始日期
     * @param endDate    可选, 结束日期
     * @param marketType 可选, 市场类型 2：港股通（沪） 4：港股通（深）
     * @param fields     字段列表
     * @see "https://tushare.pro/document/2?doc_id=49"
     */
    public TushareResponse<GgtTop10> ggtTop10(String tsCode, String tradeDate, String startDate, String endDate, String marketType, List<String> fields) throws IOException {
        GgtTop10Param param = GgtTop10Param.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).marketType(marketType).build();
        return ggtTop10(param, fields, false);
    }


    /**
     * 获取港股通每日成交数据，其中包括沪市、深市详细数据
     *
     * @param tsCode     可选, 股票代码（二选一）
     * @param tradeDate  可选, 交易日期（二选一）
     * @param startDate  可选, 开始日期
     * @param endDate    可选, 结束日期
     * @param marketType 可选, 市场类型 2：港股通（沪） 4：港股通（深）
     * @param fields     字段列表
     * @param populate   是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=49"
     */
    public TushareResponse<GgtTop10> ggtTop10(String tsCode, String tradeDate, String startDate, String endDate, String marketType, List<String> fields, boolean populate) throws IOException {
        GgtTop10Param param = GgtTop10Param.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).marketType(marketType).build();
        return ggtTop10(param, fields, populate);
    }

    /**
     * 获取港股通每日成交数据，其中包括沪市、深市详细数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=49"
     */
    public TushareResponse<GgtTop10> ggtTop10(GgtTop10Param param, List<String> fields) throws IOException {
        return ggtTop10(param, fields, false);
    }

    /**
     * 获取港股通每日成交数据，其中包括沪市、深市详细数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=49"
     */
    public TushareResponse<GgtTop10> ggtTop10(GgtTop10Param param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.GGT_TOP10).token(token).param(param).fields(fields).build();
        TushareResponse<GgtTop10> response = (TushareResponse<GgtTop10>) post(requestParam);
        List<GgtTop10> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    GgtTop10 ggtTop10 = GgtTop10.init(responseDataFields, item);
                    dataList.add(ggtTop10);
                }
            }
        }
        return response;
    }

    /**
     * 分红送股数据
     *
     * @param tsCode     可选, TS代码
     * @param annDate    可选, 公告日
     * @param recordDate 可选, 股权登记日期
     * @param exDate     可选, 除权除息日
     * @param impAnnDate 可选, 实施公告日
     * @param fields     字段列表
     * @see "https://tushare.pro/document/2?doc_id=103"
     */
    public TushareResponse<Dividend> dividend(String tsCode, String annDate, String recordDate, String exDate, String impAnnDate, List<String> fields) throws IOException {
        DividendParam param = DividendParam.builder().tsCode(tsCode).annDate(annDate).recordDate(recordDate).exDate(exDate).impAnnDate(impAnnDate).build();
        return dividend(param, fields, false);
    }


    /**
     * 分红送股数据
     *
     * @param tsCode     可选, TS代码
     * @param annDate    可选, 公告日
     * @param recordDate 可选, 股权登记日期
     * @param exDate     可选, 除权除息日
     * @param impAnnDate 可选, 实施公告日
     * @param fields     字段列表
     * @param populate   是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=103"
     */
    public TushareResponse<Dividend> dividend(String tsCode, String annDate, String recordDate, String exDate, String impAnnDate, List<String> fields, boolean populate) throws IOException {
        DividendParam param = DividendParam.builder().tsCode(tsCode).annDate(annDate).recordDate(recordDate).exDate(exDate).impAnnDate(impAnnDate).build();
        return dividend(param, fields, populate);
    }

    /**
     * 分红送股数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=103"
     */
    public TushareResponse<Dividend> dividend(DividendParam param, List<String> fields) throws IOException {
        return dividend(param, fields, false);
    }

    /**
     * 分红送股数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=103"
     */
    public TushareResponse<Dividend> dividend(DividendParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.DIVIDEND).token(token).param(param).fields(fields).build();
        TushareResponse<Dividend> response = (TushareResponse<Dividend>) post(requestParam);
        List<Dividend> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Dividend dividend = Dividend.init(responseDataFields, item);
                    dataList.add(dividend);
                }
            }
        }
        return response;
    }

    /**
     * 获取沪股通、深股通、港股通每日资金流向数据，每次最多返回300条记录，总量不限制。
     *
     * @param tradeDate 可选, 交易日期 (二选一)
     * @param startDate 可选, 开始日期 (二选一)
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=47"
     */
    public TushareResponse<MoneyflowHsgt> moneyflowHsgt(String tradeDate, String startDate, String endDate, List<String> fields) throws IOException {
        MoneyflowHsgtParam param = MoneyflowHsgtParam.builder().tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return moneyflowHsgt(param, fields, false);
    }


    /**
     * 获取沪股通、深股通、港股通每日资金流向数据，每次最多返回300条记录，总量不限制。
     *
     * @param tradeDate 可选, 交易日期 (二选一)
     * @param startDate 可选, 开始日期 (二选一)
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=47"
     */
    public TushareResponse<MoneyflowHsgt> moneyflowHsgt(String tradeDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        MoneyflowHsgtParam param = MoneyflowHsgtParam.builder().tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return moneyflowHsgt(param, fields, populate);
    }

    /**
     * 获取沪股通、深股通、港股通每日资金流向数据，每次最多返回300条记录，总量不限制。
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=47"
     */
    public TushareResponse<MoneyflowHsgt> moneyflowHsgt(MoneyflowHsgtParam param, List<String> fields) throws IOException {
        return moneyflowHsgt(param, fields, false);
    }

    /**
     * 获取沪股通、深股通、港股通每日资金流向数据，每次最多返回300条记录，总量不限制。
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=47"
     */
    public TushareResponse<MoneyflowHsgt> moneyflowHsgt(MoneyflowHsgtParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.MONEYFLOW_HSGT).token(token).param(param).fields(fields).build();
        TushareResponse<MoneyflowHsgt> response = (TushareResponse<MoneyflowHsgt>) post(requestParam);
        List<MoneyflowHsgt> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    MoneyflowHsgt moneyflowHsgt = MoneyflowHsgt.init(responseDataFields, item);
                    dataList.add(moneyflowHsgt);
                }
            }
        }
        return response;
    }

    /**
     * 获取A股月线数据
     *
     * @param tsCode    可选, TS代码 （ts_code,trade_date两个参数任选一）
     * @param tradeDate 可选, 交易日期 （每月最后一个交易日日期，YYYYMMDD格式）
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=145"
     */
    public TushareResponse<Monthly> monthly(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields) throws IOException {
        MonthlyParam param = MonthlyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return monthly(param, fields, false);
    }


    /**
     * 获取A股月线数据
     *
     * @param tsCode    可选, TS代码 （ts_code,trade_date两个参数任选一）
     * @param tradeDate 可选, 交易日期 （每月最后一个交易日日期，YYYYMMDD格式）
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=145"
     */
    public TushareResponse<Monthly> monthly(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        MonthlyParam param = MonthlyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return monthly(param, fields, populate);
    }

    /**
     * 获取A股月线数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=145"
     */
    public TushareResponse<Monthly> monthly(MonthlyParam param, List<String> fields) throws IOException {
        return monthly(param, fields, false);
    }

    /**
     * 获取A股月线数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=145"
     */
    public TushareResponse<Monthly> monthly(MonthlyParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.MONTHLY).token(token).param(param).fields(fields).build();
        TushareResponse<Monthly> response = (TushareResponse<Monthly>) post(requestParam);
        List<Monthly> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Monthly monthly = Monthly.init(responseDataFields, item);
                    dataList.add(monthly);
                }
            }
        }
        return response;
    }

    /**
     * 获取沪股通、深股通每日前十大成交详细数据
     *
     * @param tsCode     可选, 股票代码（二选一）
     * @param tradeDate  可选, 交易日期（二选一）
     * @param startDate  可选, 开始日期
     * @param endDate    可选, 结束日期
     * @param marketType 可选, 市场类型（1：沪市 3：深市）
     * @param fields     字段列表
     * @see "https://tushare.pro/document/2?doc_id=48"
     */
    public TushareResponse<HsgtTop10> hsgtTop10(String tsCode, String tradeDate, String startDate, String endDate, String marketType, List<String> fields) throws IOException {
        HsgtTop10Param param = HsgtTop10Param.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).marketType(marketType).build();
        return hsgtTop10(param, fields, false);
    }


    /**
     * 获取沪股通、深股通每日前十大成交详细数据
     *
     * @param tsCode     可选, 股票代码（二选一）
     * @param tradeDate  可选, 交易日期（二选一）
     * @param startDate  可选, 开始日期
     * @param endDate    可选, 结束日期
     * @param marketType 可选, 市场类型（1：沪市 3：深市）
     * @param fields     字段列表
     * @param populate   是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=48"
     */
    public TushareResponse<HsgtTop10> hsgtTop10(String tsCode, String tradeDate, String startDate, String endDate, String marketType, List<String> fields, boolean populate) throws IOException {
        HsgtTop10Param param = HsgtTop10Param.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).marketType(marketType).build();
        return hsgtTop10(param, fields, populate);
    }

    /**
     * 获取沪股通、深股通每日前十大成交详细数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=48"
     */
    public TushareResponse<HsgtTop10> hsgtTop10(HsgtTop10Param param, List<String> fields) throws IOException {
        return hsgtTop10(param, fields, false);
    }

    /**
     * 获取沪股通、深股通每日前十大成交详细数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=48"
     */
    public TushareResponse<HsgtTop10> hsgtTop10(HsgtTop10Param param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.HSGT_TOP10).token(token).param(param).fields(fields).build();
        TushareResponse<HsgtTop10> response = (TushareResponse<HsgtTop10>) post(requestParam);
        List<HsgtTop10> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    HsgtTop10 hsgtTop10 = HsgtTop10.init(responseDataFields, item);
                    dataList.add(hsgtTop10);
                }
            }
        }
        return response;
    }

    /**
     * 获取A股周线行情
     *
     * @param tsCode    可选, TS代码 （ts_code,trade_date两个参数任选一）
     * @param tradeDate 可选, 交易日期 （每周五日期，YYYYMMDD格式）
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=144"
     */
    public TushareResponse<Weekly> weekly(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields) throws IOException {
        WeeklyParam param = WeeklyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return weekly(param, fields, false);
    }


    /**
     * 获取A股周线行情
     *
     * @param tsCode    可选, TS代码 （ts_code,trade_date两个参数任选一）
     * @param tradeDate 可选, 交易日期 （每周五日期，YYYYMMDD格式）
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=144"
     */
    public TushareResponse<Weekly> weekly(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        WeeklyParam param = WeeklyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return weekly(param, fields, populate);
    }

    /**
     * 获取A股周线行情
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=144"
     */
    public TushareResponse<Weekly> weekly(WeeklyParam param, List<String> fields) throws IOException {
        return weekly(param, fields, false);
    }

    /**
     * 获取A股周线行情
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=144"
     */
    public TushareResponse<Weekly> weekly(WeeklyParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.WEEKLY).token(token).param(param).fields(fields).build();
        TushareResponse<Weekly> response = (TushareResponse<Weekly>) post(requestParam);
        List<Weekly> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Weekly weekly = Weekly.init(responseDataFields, item);
                    dataList.add(weekly);
                }
            }
        }
        return response;
    }

    /**
     * 历史名称变更记录
     *
     * @param tsCode    可选, TS代码
     * @param startDate 可选, 公告开始日期
     * @param endDate   可选, 公告结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=100"
     */
    public TushareResponse<Namechange> namechange(String tsCode, String startDate, String endDate, List<String> fields) throws IOException {
        NamechangeParam param = NamechangeParam.builder().tsCode(tsCode).startDate(startDate).endDate(endDate).build();
        return namechange(param, fields, false);
    }


    /**
     * 历史名称变更记录
     *
     * @param tsCode    可选, TS代码
     * @param startDate 可选, 公告开始日期
     * @param endDate   可选, 公告结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=100"
     */
    public TushareResponse<Namechange> namechange(String tsCode, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        NamechangeParam param = NamechangeParam.builder().tsCode(tsCode).startDate(startDate).endDate(endDate).build();
        return namechange(param, fields, populate);
    }

    /**
     * 历史名称变更记录
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=100"
     */
    public TushareResponse<Namechange> namechange(NamechangeParam param, List<String> fields) throws IOException {
        return namechange(param, fields, false);
    }

    /**
     * 历史名称变更记录
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=100"
     */
    public TushareResponse<Namechange> namechange(NamechangeParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.NAMECHANGE).token(token).param(param).fields(fields).build();
        TushareResponse<Namechange> response = (TushareResponse<Namechange>) post(requestParam);
        List<Namechange> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Namechange namechange = Namechange.init(responseDataFields, item);
                    dataList.add(namechange);
                }
            }
        }
        return response;
    }

    /**
     * 龙虎榜机构成交明细
     *
     * @param tradeDate 必填, 交易日期
     * @param tsCode    可选, TS代码
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=107"
     */
    public TushareResponse<TopInst> topInst(String tradeDate, String tsCode, List<String> fields) throws IOException {
        TopInstParam param = TopInstParam.builder().tradeDate(tradeDate).tsCode(tsCode).build();
        return topInst(param, fields, false);
    }


    /**
     * 龙虎榜机构成交明细
     *
     * @param tradeDate 必填, 交易日期
     * @param tsCode    可选, TS代码
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=107"
     */
    public TushareResponse<TopInst> topInst(String tradeDate, String tsCode, List<String> fields, boolean populate) throws IOException {
        TopInstParam param = TopInstParam.builder().tradeDate(tradeDate).tsCode(tsCode).build();
        return topInst(param, fields, populate);
    }

    /**
     * 龙虎榜机构成交明细
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=107"
     */
    public TushareResponse<TopInst> topInst(TopInstParam param, List<String> fields) throws IOException {
        return topInst(param, fields, false);
    }

    /**
     * 龙虎榜机构成交明细
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=107"
     */
    public TushareResponse<TopInst> topInst(TopInstParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.TOP_INST).token(token).param(param).fields(fields).build();
        TushareResponse<TopInst> response = (TushareResponse<TopInst>) post(requestParam);
        List<TopInst> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    TopInst topInst = TopInst.init(responseDataFields, item);
                    dataList.add(topInst);
                }
            }
        }
        return response;
    }

    /**
     * 获取业绩预告数据
     *
     * @param tsCode    可选, 股票代码(二选一)
     * @param annDate   可选, 公告日期 (二选一)
     * @param startDate 可选, 公告开始日期
     * @param endDate   可选, 公告结束日期
     * @param period    可选, 报告期(每个季度最后一天的日期，比如20171231表示年报)
     * @param type      可选, 预告类型(预增/预减/扭亏/首亏/续亏/续盈/略增/略减)
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=45"
     */
    public TushareResponse<Forecast> forecast(String tsCode, String annDate, String startDate, String endDate, String period, String type, List<String> fields) throws IOException {
        ForecastParam param = ForecastParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).period(period).type(type).build();
        return forecast(param, fields, false);
    }


    /**
     * 获取业绩预告数据
     *
     * @param tsCode    可选, 股票代码(二选一)
     * @param annDate   可选, 公告日期 (二选一)
     * @param startDate 可选, 公告开始日期
     * @param endDate   可选, 公告结束日期
     * @param period    可选, 报告期(每个季度最后一天的日期，比如20171231表示年报)
     * @param type      可选, 预告类型(预增/预减/扭亏/首亏/续亏/续盈/略增/略减)
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=45"
     */
    public TushareResponse<Forecast> forecast(String tsCode, String annDate, String startDate, String endDate, String period, String type, List<String> fields, boolean populate) throws IOException {
        ForecastParam param = ForecastParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).period(period).type(type).build();
        return forecast(param, fields, populate);
    }

    /**
     * 获取业绩预告数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=45"
     */
    public TushareResponse<Forecast> forecast(ForecastParam param, List<String> fields) throws IOException {
        return forecast(param, fields, false);
    }

    /**
     * 获取业绩预告数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=45"
     */
    public TushareResponse<Forecast> forecast(ForecastParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FORECAST).token(token).param(param).fields(fields).build();
        TushareResponse<Forecast> response = (TushareResponse<Forecast>) post(requestParam);
        List<Forecast> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Forecast forecast = Forecast.init(responseDataFields, item);
                    dataList.add(forecast);
                }
            }
        }
        return response;
    }

    /**
     * 龙虎榜每日交易明细
     *
     * @param tradeDate 必填, 交易日期
     * @param tsCode    可选, 股票代码
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=106"
     */
    public TushareResponse<TopList> topList(String tradeDate, String tsCode, List<String> fields) throws IOException {
        TopListParam param = TopListParam.builder().tradeDate(tradeDate).tsCode(tsCode).build();
        return topList(param, fields, false);
    }


    /**
     * 龙虎榜每日交易明细
     *
     * @param tradeDate 必填, 交易日期
     * @param tsCode    可选, 股票代码
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=106"
     */
    public TushareResponse<TopList> topList(String tradeDate, String tsCode, List<String> fields, boolean populate) throws IOException {
        TopListParam param = TopListParam.builder().tradeDate(tradeDate).tsCode(tsCode).build();
        return topList(param, fields, populate);
    }

    /**
     * 龙虎榜每日交易明细
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=106"
     */
    public TushareResponse<TopList> topList(TopListParam param, List<String> fields) throws IOException {
        return topList(param, fields, false);
    }

    /**
     * 龙虎榜每日交易明细
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=106"
     */
    public TushareResponse<TopList> topList(TopListParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.TOP_LIST).token(token).param(param).fields(fields).build();
        TushareResponse<TopList> response = (TushareResponse<TopList>) post(requestParam);
        List<TopList> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    TopList topList = TopList.init(responseDataFields, item);
                    dataList.add(topList);
                }
            }
        }
        return response;
    }

    /**
     * 获取上市公司业绩快报
     *
     * @param tsCode    必填, 股票代码
     * @param annDate   可选, 公告日期
     * @param startDate 可选, 公告开始日期
     * @param endDate   可选, 公告结束日期
     * @param period    可选, 报告期(每个季度最后一天的日期,比如20171231表示年报)
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=46"
     */
    public TushareResponse<Express> express(String tsCode, String annDate, String startDate, String endDate, String period, List<String> fields) throws IOException {
        ExpressParam param = ExpressParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).period(period).build();
        return express(param, fields, false);
    }


    /**
     * 获取上市公司业绩快报
     *
     * @param tsCode    必填, 股票代码
     * @param annDate   可选, 公告日期
     * @param startDate 可选, 公告开始日期
     * @param endDate   可选, 公告结束日期
     * @param period    可选, 报告期(每个季度最后一天的日期,比如20171231表示年报)
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=46"
     */
    public TushareResponse<Express> express(String tsCode, String annDate, String startDate, String endDate, String period, List<String> fields, boolean populate) throws IOException {
        ExpressParam param = ExpressParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).period(period).build();
        return express(param, fields, populate);
    }

    /**
     * 获取上市公司业绩快报
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=46"
     */
    public TushareResponse<Express> express(ExpressParam param, List<String> fields) throws IOException {
        return express(param, fields, false);
    }

    /**
     * 获取上市公司业绩快报
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=46"
     */
    public TushareResponse<Express> express(ExpressParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.EXPRESS).token(token).param(param).fields(fields).build();
        TushareResponse<Express> response = (TushareResponse<Express>) post(requestParam);
        List<Express> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Express express = Express.init(responseDataFields, item);
                    dataList.add(express);
                }
            }
        }
        return response;
    }

    /**
     * 获取上市公司现金流量表
     *
     * @param tsCode     必填, 股票代码
     * @param annDate    可选, 公告日期
     * @param startDate  可选, 公告开始日期
     * @param endDate    可选, 公告结束日期
     * @param period     可选, 报告期(每个季度最后一天的日期，比如20171231表示年报)
     * @param reportType 可选, 报告类型：见下方详细说明
     * @param compType   可选, 公司类型：1一般工商业 2银行 3保险 4证券
     * @param fields     字段列表
     * @see "https://tushare.pro/document/2?doc_id=44"
     */
    public TushareResponse<Cashflow> cashflow(String tsCode, String annDate, String startDate, String endDate, String period, String reportType, String compType, List<String> fields) throws IOException {
        CashflowParam param = CashflowParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).period(period).reportType(reportType).compType(compType).build();
        return cashflow(param, fields, false);
    }


    /**
     * 获取上市公司现金流量表
     *
     * @param tsCode     必填, 股票代码
     * @param annDate    可选, 公告日期
     * @param startDate  可选, 公告开始日期
     * @param endDate    可选, 公告结束日期
     * @param period     可选, 报告期(每个季度最后一天的日期，比如20171231表示年报)
     * @param reportType 可选, 报告类型：见下方详细说明
     * @param compType   可选, 公司类型：1一般工商业 2银行 3保险 4证券
     * @param fields     字段列表
     * @param populate   是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=44"
     */
    public TushareResponse<Cashflow> cashflow(String tsCode, String annDate, String startDate, String endDate, String period, String reportType, String compType, List<String> fields, boolean populate) throws IOException {
        CashflowParam param = CashflowParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).period(period).reportType(reportType).compType(compType).build();
        return cashflow(param, fields, populate);
    }

    /**
     * 获取上市公司现金流量表
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=44"
     */
    public TushareResponse<Cashflow> cashflow(CashflowParam param, List<String> fields) throws IOException {
        return cashflow(param, fields, false);
    }

    /**
     * 获取上市公司现金流量表
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=44"
     */
    public TushareResponse<Cashflow> cashflow(CashflowParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.CASHFLOW).token(token).param(param).fields(fields).build();
        TushareResponse<Cashflow> response = (TushareResponse<Cashflow>) post(requestParam);
        List<Cashflow> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Cashflow cashflow = Cashflow.init(responseDataFields, item);
                    dataList.add(cashflow);
                }
            }
        }
        return response;
    }

    /**
     * 获取沪股通、深股通成分数据
     *
     * @param hsType 必填, 类型SH沪股通SZ深股通
     * @param isNew  可选, 是否最新 1 是 0 否 (默认1)
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=104"
     */
    public TushareResponse<HsConst> hsConst(String hsType, String isNew, List<String> fields) throws IOException {
        HsConstParam param = HsConstParam.builder().hsType(hsType).isNew(isNew).build();
        return hsConst(param, fields, false);
    }


    /**
     * 获取沪股通、深股通成分数据
     *
     * @param hsType   必填, 类型SH沪股通SZ深股通
     * @param isNew    可选, 是否最新 1 是 0 否 (默认1)
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=104"
     */
    public TushareResponse<HsConst> hsConst(String hsType, String isNew, List<String> fields, boolean populate) throws IOException {
        HsConstParam param = HsConstParam.builder().hsType(hsType).isNew(isNew).build();
        return hsConst(param, fields, populate);
    }

    /**
     * 获取沪股通、深股通成分数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=104"
     */
    public TushareResponse<HsConst> hsConst(HsConstParam param, List<String> fields) throws IOException {
        return hsConst(param, fields, false);
    }

    /**
     * 获取沪股通、深股通成分数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=104"
     */
    public TushareResponse<HsConst> hsConst(HsConstParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.HS_CONST).token(token).param(param).fields(fields).build();
        TushareResponse<HsConst> response = (TushareResponse<HsConst>) post(requestParam);
        List<HsConst> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    HsConst hsConst = HsConst.init(responseDataFields, item);
                    dataList.add(hsConst);
                }
            }
        }
        return response;
    }

    /**
     * 获取股票每日停复牌信息
     *
     * @param tsCode      可选, 股票代码(三选一)
     * @param suspendDate 可选, 停牌日期(三选一)
     * @param resumeDate  可选, 复牌日期(三选一)
     * @param fields      字段列表
     * @see "https://tushare.pro/document/2?doc_id=31"
     */
    public TushareResponse<Suspend> suspend(String tsCode, String suspendDate, String resumeDate, List<String> fields) throws IOException {
        SuspendParam param = SuspendParam.builder().tsCode(tsCode).suspendDate(suspendDate).resumeDate(resumeDate).build();
        return suspend(param, fields, false);
    }


    /**
     * 获取股票每日停复牌信息
     *
     * @param tsCode      可选, 股票代码(三选一)
     * @param suspendDate 可选, 停牌日期(三选一)
     * @param resumeDate  可选, 复牌日期(三选一)
     * @param fields      字段列表
     * @param populate    是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=31"
     */
    public TushareResponse<Suspend> suspend(String tsCode, String suspendDate, String resumeDate, List<String> fields, boolean populate) throws IOException {
        SuspendParam param = SuspendParam.builder().tsCode(tsCode).suspendDate(suspendDate).resumeDate(resumeDate).build();
        return suspend(param, fields, populate);
    }

    /**
     * 获取股票每日停复牌信息
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=31"
     */
    public TushareResponse<Suspend> suspend(SuspendParam param, List<String> fields) throws IOException {
        return suspend(param, fields, false);
    }

    /**
     * 获取股票每日停复牌信息
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=31"
     */
    public TushareResponse<Suspend> suspend(SuspendParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.SUSPEND).token(token).param(param).fields(fields).build();
        TushareResponse<Suspend> response = (TushareResponse<Suspend>) post(requestParam);
        List<Suspend> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Suspend suspend = Suspend.init(responseDataFields, item);
                    dataList.add(suspend);
                }
            }
        }
        return response;
    }

    /**
     * 获取沪深A股票资金流向数据，分析大单小单成交情况，用于判别资金动向
     *
     * @param tsCode    可选, 股票代码 （股票和时间参数至少输入一个）
     * @param tradeDate 可选, 交易日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=170"
     */
    public TushareResponse<Moneyflow> moneyflow(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields) throws IOException {
        MoneyflowParam param = MoneyflowParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return moneyflow(param, fields, false);
    }


    /**
     * 获取沪深A股票资金流向数据，分析大单小单成交情况，用于判别资金动向
     *
     * @param tsCode    可选, 股票代码 （股票和时间参数至少输入一个）
     * @param tradeDate 可选, 交易日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=170"
     */
    public TushareResponse<Moneyflow> moneyflow(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        MoneyflowParam param = MoneyflowParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return moneyflow(param, fields, populate);
    }

    /**
     * 获取沪深A股票资金流向数据，分析大单小单成交情况，用于判别资金动向
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=170"
     */
    public TushareResponse<Moneyflow> moneyflow(MoneyflowParam param, List<String> fields) throws IOException {
        return moneyflow(param, fields, false);
    }

    /**
     * 获取沪深A股票资金流向数据，分析大单小单成交情况，用于判别资金动向
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=170"
     */
    public TushareResponse<Moneyflow> moneyflow(MoneyflowParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.MONEYFLOW).token(token).param(param).fields(fields).build();
        TushareResponse<Moneyflow> response = (TushareResponse<Moneyflow>) post(requestParam);
        List<Moneyflow> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Moneyflow moneyflow = Moneyflow.init(responseDataFields, item);
                    dataList.add(moneyflow);
                }
            }
        }
        return response;
    }

    /**
     * 获取上市公司增减持数据，了解重要股东近期及历史上的股份增减变化
     *
     * @param tsCode     可选, TS股票代码
     * @param annDate    可选, 公告日期
     * @param startDate  可选, 公告开始日期
     * @param endDate    可选, 公告结束日期
     * @param tradeType  可选, 交易类型IN增持DE减持
     * @param holderType 可选, 股东类型C公司P个人G高管
     * @param fields     字段列表
     * @see "https://tushare.pro/document/2?doc_id=175"
     */
    public TushareResponse<StkHoldertrade> stkHoldertrade(String tsCode, String annDate, String startDate, String endDate, String tradeType, String holderType, List<String> fields) throws IOException {
        StkHoldertradeParam param = StkHoldertradeParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).tradeType(tradeType).holderType(holderType).build();
        return stkHoldertrade(param, fields, false);
    }


    /**
     * 获取上市公司增减持数据，了解重要股东近期及历史上的股份增减变化
     *
     * @param tsCode     可选, TS股票代码
     * @param annDate    可选, 公告日期
     * @param startDate  可选, 公告开始日期
     * @param endDate    可选, 公告结束日期
     * @param tradeType  可选, 交易类型IN增持DE减持
     * @param holderType 可选, 股东类型C公司P个人G高管
     * @param fields     字段列表
     * @param populate   是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=175"
     */
    public TushareResponse<StkHoldertrade> stkHoldertrade(String tsCode, String annDate, String startDate, String endDate, String tradeType, String holderType, List<String> fields, boolean populate) throws IOException {
        StkHoldertradeParam param = StkHoldertradeParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).tradeType(tradeType).holderType(holderType).build();
        return stkHoldertrade(param, fields, populate);
    }

    /**
     * 获取上市公司增减持数据，了解重要股东近期及历史上的股份增减变化
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=175"
     */
    public TushareResponse<StkHoldertrade> stkHoldertrade(StkHoldertradeParam param, List<String> fields) throws IOException {
        return stkHoldertrade(param, fields, false);
    }

    /**
     * 获取上市公司增减持数据，了解重要股东近期及历史上的股份增减变化
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=175"
     */
    public TushareResponse<StkHoldertrade> stkHoldertrade(StkHoldertradeParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.STK_HOLDERTRADE).token(token).param(param).fields(fields).build();
        TushareResponse<StkHoldertrade> response = (TushareResponse<StkHoldertrade>) post(requestParam);
        List<StkHoldertrade> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    StkHoldertrade stkHoldertrade = StkHoldertrade.init(responseDataFields, item);
                    dataList.add(stkHoldertrade);
                }
            }
        }
        return response;
    }

    /**
     * 获取上市公司资产负债表
     *
     * @param tsCode     必填, 股票代码
     * @param annDate    可选, 公告日期
     * @param startDate  可选, 公告开始日期
     * @param endDate    可选, 公告结束日期
     * @param period     可选, 报告期(每个季度最后一天的日期，比如20171231表示年报)
     * @param reportType 可选, 报告类型：见下方详细说明
     * @param compType   可选, 公司类型：1一般工商业 2银行 3保险 4证券
     * @param fields     字段列表
     * @see "https://tushare.pro/document/2?doc_id=36"
     */
    public TushareResponse<Balancesheet> balancesheet(String tsCode, String annDate, String startDate, String endDate, String period, String reportType, String compType, List<String> fields) throws IOException {
        BalancesheetParam param = BalancesheetParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).period(period).reportType(reportType).compType(compType).build();
        return balancesheet(param, fields, false);
    }


    /**
     * 获取上市公司资产负债表
     *
     * @param tsCode     必填, 股票代码
     * @param annDate    可选, 公告日期
     * @param startDate  可选, 公告开始日期
     * @param endDate    可选, 公告结束日期
     * @param period     可选, 报告期(每个季度最后一天的日期，比如20171231表示年报)
     * @param reportType 可选, 报告类型：见下方详细说明
     * @param compType   可选, 公司类型：1一般工商业 2银行 3保险 4证券
     * @param fields     字段列表
     * @param populate   是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=36"
     */
    public TushareResponse<Balancesheet> balancesheet(String tsCode, String annDate, String startDate, String endDate, String period, String reportType, String compType, List<String> fields, boolean populate) throws IOException {
        BalancesheetParam param = BalancesheetParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).period(period).reportType(reportType).compType(compType).build();
        return balancesheet(param, fields, populate);
    }

    /**
     * 获取上市公司资产负债表
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=36"
     */
    public TushareResponse<Balancesheet> balancesheet(BalancesheetParam param, List<String> fields) throws IOException {
        return balancesheet(param, fields, false);
    }

    /**
     * 获取上市公司资产负债表
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=36"
     */
    public TushareResponse<Balancesheet> balancesheet(BalancesheetParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.BALANCESHEET).token(token).param(param).fields(fields).build();
        TushareResponse<Balancesheet> response = (TushareResponse<Balancesheet>) post(requestParam);
        List<Balancesheet> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Balancesheet balancesheet = Balancesheet.init(responseDataFields, item);
                    dataList.add(balancesheet);
                }
            }
        }
        return response;
    }

    /**
     * 获取上市公司财务指标数据，为避免服务器压力，现阶段每次请求最多返回60条记录，可通过设置日期多次请求获取更多数据。
     *
     * @param tsCode    必填, TS股票代码,e.g. 600001.SH/000001.SZ
     * @param annDate   可选, 公告日期
     * @param startDate 可选, 报告期开始日期
     * @param endDate   可选, 报告期结束日期
     * @param period    可选, 报告期(每个季度最后一天的日期,比如20171231表示年报)
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=79"
     */
    public TushareResponse<FinaIndicator> finaIndicator(String tsCode, String annDate, String startDate, String endDate, String period, List<String> fields) throws IOException {
        FinaIndicatorParam param = FinaIndicatorParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).period(period).build();
        return finaIndicator(param, fields, false);
    }


    /**
     * 获取上市公司财务指标数据，为避免服务器压力，现阶段每次请求最多返回60条记录，可通过设置日期多次请求获取更多数据。
     *
     * @param tsCode    必填, TS股票代码,e.g. 600001.SH/000001.SZ
     * @param annDate   可选, 公告日期
     * @param startDate 可选, 报告期开始日期
     * @param endDate   可选, 报告期结束日期
     * @param period    可选, 报告期(每个季度最后一天的日期,比如20171231表示年报)
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=79"
     */
    public TushareResponse<FinaIndicator> finaIndicator(String tsCode, String annDate, String startDate, String endDate, String period, List<String> fields, boolean populate) throws IOException {
        FinaIndicatorParam param = FinaIndicatorParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).period(period).build();
        return finaIndicator(param, fields, populate);
    }

    /**
     * 获取上市公司财务指标数据，为避免服务器压力，现阶段每次请求最多返回60条记录，可通过设置日期多次请求获取更多数据。
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=79"
     */
    public TushareResponse<FinaIndicator> finaIndicator(FinaIndicatorParam param, List<String> fields) throws IOException {
        return finaIndicator(param, fields, false);
    }

    /**
     * 获取上市公司财务指标数据，为避免服务器压力，现阶段每次请求最多返回60条记录，可通过设置日期多次请求获取更多数据。
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=79"
     */
    public TushareResponse<FinaIndicator> finaIndicator(FinaIndicatorParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FINA_INDICATOR).token(token).param(param).fields(fields).build();
        TushareResponse<FinaIndicator> response = (TushareResponse<FinaIndicator>) post(requestParam);
        List<FinaIndicator> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FinaIndicator finaIndicator = FinaIndicator.init(responseDataFields, item);
                    dataList.add(finaIndicator);
                }
            }
        }
        return response;
    }

    /**
     * 获取全部股票每日重要的基本面指标，可用于选股分析、报表展示等。
     *
     * @param tsCode    必填, 股票代码（二选一）
     * @param tradeDate 可选, 交易日期 （二选一）
     * @param startDate 可选, 开始日期(YYYYMMDD)
     * @param endDate   可选, 结束日期(YYYYMMDD)
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=32"
     */
    public TushareResponse<DailyBasic> dailyBasic(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields) throws IOException {
        DailyBasicParam param = DailyBasicParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return dailyBasic(param, fields, false);
    }


    /**
     * 获取全部股票每日重要的基本面指标，可用于选股分析、报表展示等。
     *
     * @param tsCode    必填, 股票代码（二选一）
     * @param tradeDate 可选, 交易日期 （二选一）
     * @param startDate 可选, 开始日期(YYYYMMDD)
     * @param endDate   可选, 结束日期(YYYYMMDD)
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=32"
     */
    public TushareResponse<DailyBasic> dailyBasic(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        DailyBasicParam param = DailyBasicParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return dailyBasic(param, fields, populate);
    }

    /**
     * 获取全部股票每日重要的基本面指标，可用于选股分析、报表展示等。
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=32"
     */
    public TushareResponse<DailyBasic> dailyBasic(DailyBasicParam param, List<String> fields) throws IOException {
        return dailyBasic(param, fields, false);
    }

    /**
     * 获取全部股票每日重要的基本面指标，可用于选股分析、报表展示等。
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=32"
     */
    public TushareResponse<DailyBasic> dailyBasic(DailyBasicParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.DAILY_BASIC).token(token).param(param).fields(fields).build();
        TushareResponse<DailyBasic> response = (TushareResponse<DailyBasic>) post(requestParam);
        List<DailyBasic> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    DailyBasic dailyBasic = DailyBasic.init(responseDataFields, item);
                    dataList.add(dailyBasic);
                }
            }
        }
        return response;
    }

    /**
     * 获取上市公司财务利润表数据
     *
     * @param tsCode     必填, 股票代码
     * @param annDate    可选, 公告日期
     * @param startDate  可选, 公告开始日期
     * @param endDate    可选, 公告结束日期
     * @param period     可选, 报告期(每个季度最后一天的日期，比如20171231表示年报)
     * @param reportType 可选, 报告类型： 参考下表说明
     * @param compType   可选, 公司类型：1一般工商业 2银行 3保险 4证券
     * @param fields     字段列表
     * @see "https://tushare.pro/document/2?doc_id=33"
     */
    public TushareResponse<Income> income(String tsCode, String annDate, String startDate, String endDate, String period, String reportType, String compType, List<String> fields) throws IOException {
        IncomeParam param = IncomeParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).period(period).reportType(reportType).compType(compType).build();
        return income(param, fields, false);
    }


    /**
     * 获取上市公司财务利润表数据
     *
     * @param tsCode     必填, 股票代码
     * @param annDate    可选, 公告日期
     * @param startDate  可选, 公告开始日期
     * @param endDate    可选, 公告结束日期
     * @param period     可选, 报告期(每个季度最后一天的日期，比如20171231表示年报)
     * @param reportType 可选, 报告类型： 参考下表说明
     * @param compType   可选, 公司类型：1一般工商业 2银行 3保险 4证券
     * @param fields     字段列表
     * @param populate   是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=33"
     */
    public TushareResponse<Income> income(String tsCode, String annDate, String startDate, String endDate, String period, String reportType, String compType, List<String> fields, boolean populate) throws IOException {
        IncomeParam param = IncomeParam.builder().tsCode(tsCode).annDate(annDate).startDate(startDate).endDate(endDate).period(period).reportType(reportType).compType(compType).build();
        return income(param, fields, populate);
    }

    /**
     * 获取上市公司财务利润表数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=33"
     */
    public TushareResponse<Income> income(IncomeParam param, List<String> fields) throws IOException {
        return income(param, fields, false);
    }

    /**
     * 获取上市公司财务利润表数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=33"
     */
    public TushareResponse<Income> income(IncomeParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.INCOME).token(token).param(param).fields(fields).build();
        TushareResponse<Income> response = (TushareResponse<Income>) post(requestParam);
        List<Income> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Income income = Income.init(responseDataFields, item);
                    dataList.add(income);
                }
            }
        }
        return response;
    }

    /**
     * 大宗交易
     *
     * @param tsCode    可选, TS代码（股票代码和日期至少输入一个参数）
     * @param tradeDate 可选, 交易日期（格式：YYYYMMDD，下同）
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=161"
     */
    public TushareResponse<BlockTrade> blockTrade(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields) throws IOException {
        BlockTradeParam param = BlockTradeParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return blockTrade(param, fields, false);
    }


    /**
     * 大宗交易
     *
     * @param tsCode    可选, TS代码（股票代码和日期至少输入一个参数）
     * @param tradeDate 可选, 交易日期（格式：YYYYMMDD，下同）
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=161"
     */
    public TushareResponse<BlockTrade> blockTrade(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        BlockTradeParam param = BlockTradeParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return blockTrade(param, fields, populate);
    }

    /**
     * 大宗交易
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=161"
     */
    public TushareResponse<BlockTrade> blockTrade(BlockTradeParam param, List<String> fields) throws IOException {
        return blockTrade(param, fields, false);
    }

    /**
     * 大宗交易
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=161"
     */
    public TushareResponse<BlockTrade> blockTrade(BlockTradeParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.BLOCK_TRADE).token(token).param(param).fields(fields).build();
        TushareResponse<BlockTrade> response = (TushareResponse<BlockTrade>) post(requestParam);
        List<BlockTrade> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    BlockTrade blockTrade = BlockTrade.init(responseDataFields, item);
                    dataList.add(blockTrade);
                }
            }
        }
        return response;
    }

    /**
     * 获取限售股解禁
     *
     * @param tsCode    可选, TS股票代码（至少输入一个参数）
     * @param annDate   可选, 公告日期（日期格式：YYYYMMDD，下同）
     * @param floatDate 可选, 解禁日期
     * @param startDate 可选, 解禁开始日期
     * @param endDate   可选, 解禁结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=160"
     */
    public TushareResponse<ShareFloat> shareFloat(String tsCode, String annDate, String floatDate, String startDate, String endDate, List<String> fields) throws IOException {
        ShareFloatParam param = ShareFloatParam.builder().tsCode(tsCode).annDate(annDate).floatDate(floatDate).startDate(startDate).endDate(endDate).build();
        return shareFloat(param, fields, false);
    }


    /**
     * 获取限售股解禁
     *
     * @param tsCode    可选, TS股票代码（至少输入一个参数）
     * @param annDate   可选, 公告日期（日期格式：YYYYMMDD，下同）
     * @param floatDate 可选, 解禁日期
     * @param startDate 可选, 解禁开始日期
     * @param endDate   可选, 解禁结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=160"
     */
    public TushareResponse<ShareFloat> shareFloat(String tsCode, String annDate, String floatDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        ShareFloatParam param = ShareFloatParam.builder().tsCode(tsCode).annDate(annDate).floatDate(floatDate).startDate(startDate).endDate(endDate).build();
        return shareFloat(param, fields, populate);
    }

    /**
     * 获取限售股解禁
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=160"
     */
    public TushareResponse<ShareFloat> shareFloat(ShareFloatParam param, List<String> fields) throws IOException {
        return shareFloat(param, fields, false);
    }

    /**
     * 获取限售股解禁
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=160"
     */
    public TushareResponse<ShareFloat> shareFloat(ShareFloatParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.SHARE_FLOAT).token(token).param(param).fields(fields).build();
        TushareResponse<ShareFloat> response = (TushareResponse<ShareFloat>) post(requestParam);
        List<ShareFloat> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    ShareFloat shareFloat = ShareFloat.init(responseDataFields, item);
                    dataList.add(shareFloat);
                }
            }
        }
        return response;
    }

    /**
     * 获取上市公司前十大股东数据，包括持有数量和比例等信息。
     *
     * @param tsCode    必填, TS代码
     * @param period    可选, 报告期
     * @param annDate   可选, 公告日期
     * @param startDate 可选, 报告期开始日期
     * @param endDate   可选, 报告期结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=61"
     */
    public TushareResponse<Top10Holders> top10Holders(String tsCode, String period, String annDate, String startDate, String endDate, List<String> fields) throws IOException {
        Top10HoldersParam param = Top10HoldersParam.builder().tsCode(tsCode).period(period).annDate(annDate).startDate(startDate).endDate(endDate).build();
        return top10Holders(param, fields, false);
    }


    /**
     * 获取上市公司前十大股东数据，包括持有数量和比例等信息。
     *
     * @param tsCode    必填, TS代码
     * @param period    可选, 报告期
     * @param annDate   可选, 公告日期
     * @param startDate 可选, 报告期开始日期
     * @param endDate   可选, 报告期结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=61"
     */
    public TushareResponse<Top10Holders> top10Holders(String tsCode, String period, String annDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        Top10HoldersParam param = Top10HoldersParam.builder().tsCode(tsCode).period(period).annDate(annDate).startDate(startDate).endDate(endDate).build();
        return top10Holders(param, fields, populate);
    }

    /**
     * 获取上市公司前十大股东数据，包括持有数量和比例等信息。
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=61"
     */
    public TushareResponse<Top10Holders> top10Holders(Top10HoldersParam param, List<String> fields) throws IOException {
        return top10Holders(param, fields, false);
    }

    /**
     * 获取上市公司前十大股东数据，包括持有数量和比例等信息。
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=61"
     */
    public TushareResponse<Top10Holders> top10Holders(Top10HoldersParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.TOP10_HOLDERS).token(token).param(param).fields(fields).build();
        TushareResponse<Top10Holders> response = (TushareResponse<Top10Holders>) post(requestParam);
        List<Top10Holders> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Top10Holders top10Holders = Top10Holders.init(responseDataFields, item);
                    dataList.add(top10Holders);
                }
            }
        }
        return response;
    }

    /**
     * 获取上市公司前十大流通股东数据。
     *
     * @param tsCode    必填, TS代码
     * @param period    可选, 报告期
     * @param annDate   可选, 公告日期
     * @param startDate 可选, 报告期开始日期
     * @param endDate   可选, 报告期结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=62"
     */
    public TushareResponse<Top10Floatholders> top10Floatholders(String tsCode, String period, String annDate, String startDate, String endDate, List<String> fields) throws IOException {
        Top10FloatholdersParam param = Top10FloatholdersParam.builder().tsCode(tsCode).period(period).annDate(annDate).startDate(startDate).endDate(endDate).build();
        return top10Floatholders(param, fields, false);
    }


    /**
     * 获取上市公司前十大流通股东数据。
     *
     * @param tsCode    必填, TS代码
     * @param period    可选, 报告期
     * @param annDate   可选, 公告日期
     * @param startDate 可选, 报告期开始日期
     * @param endDate   可选, 报告期结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=62"
     */
    public TushareResponse<Top10Floatholders> top10Floatholders(String tsCode, String period, String annDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        Top10FloatholdersParam param = Top10FloatholdersParam.builder().tsCode(tsCode).period(period).annDate(annDate).startDate(startDate).endDate(endDate).build();
        return top10Floatholders(param, fields, populate);
    }

    /**
     * 获取上市公司前十大流通股东数据。
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=62"
     */
    public TushareResponse<Top10Floatholders> top10Floatholders(Top10FloatholdersParam param, List<String> fields) throws IOException {
        return top10Floatholders(param, fields, false);
    }

    /**
     * 获取上市公司前十大流通股东数据。
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=62"
     */
    public TushareResponse<Top10Floatholders> top10Floatholders(Top10FloatholdersParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.TOP10_FLOATHOLDERS).token(token).param(param).fields(fields).build();
        TushareResponse<Top10Floatholders> response = (TushareResponse<Top10Floatholders>) post(requestParam);
        List<Top10Floatholders> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Top10Floatholders top10Floatholders = Top10Floatholders.init(responseDataFields, item);
                    dataList.add(top10Floatholders);
                }
            }
        }
        return response;
    }

    /**
     * 获取股票账户开户数据旧版格式数据，数据从2008年1月开始，到2015年5月29，新数据请通过<a href="https://tushare.pro/document/2?doc_id=164">股票开户数据</a>获取。
     *
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=165"
     */
    public TushareResponse<StkAccountOld> stkAccountOld(String startDate, String endDate, List<String> fields) throws IOException {
        StkAccountOldParam param = StkAccountOldParam.builder().startDate(startDate).endDate(endDate).build();
        return stkAccountOld(param, fields, false);
    }


    /**
     * 获取股票账户开户数据旧版格式数据，数据从2008年1月开始，到2015年5月29，新数据请通过<a href="https://tushare.pro/document/2?doc_id=164">股票开户数据</a>获取。
     *
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=165"
     */
    public TushareResponse<StkAccountOld> stkAccountOld(String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        StkAccountOldParam param = StkAccountOldParam.builder().startDate(startDate).endDate(endDate).build();
        return stkAccountOld(param, fields, populate);
    }

    /**
     * 获取股票账户开户数据旧版格式数据，数据从2008年1月开始，到2015年5月29，新数据请通过<a href="https://tushare.pro/document/2?doc_id=164">股票开户数据</a>获取。
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=165"
     */
    public TushareResponse<StkAccountOld> stkAccountOld(StkAccountOldParam param, List<String> fields) throws IOException {
        return stkAccountOld(param, fields, false);
    }

    /**
     * 获取股票账户开户数据旧版格式数据，数据从2008年1月开始，到2015年5月29，新数据请通过<a href="https://tushare.pro/document/2?doc_id=164">股票开户数据</a>获取。
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=165"
     */
    public TushareResponse<StkAccountOld> stkAccountOld(StkAccountOldParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.STK_ACCOUNT_OLD).token(token).param(param).fields(fields).build();
        TushareResponse<StkAccountOld> response = (TushareResponse<StkAccountOld>) post(requestParam);
        List<StkAccountOld> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    StkAccountOld stkAccountOld = StkAccountOld.init(responseDataFields, item);
                    dataList.add(stkAccountOld);
                }
            }
        }
        return response;
    }

    /**
     * 获取股票账户开户数据，统计周期为一周
     *
     * @param date      可选, 日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=164"
     */
    public TushareResponse<StkAccount> stkAccount(String date, String startDate, String endDate, List<String> fields) throws IOException {
        StkAccountParam param = StkAccountParam.builder().date(date).startDate(startDate).endDate(endDate).build();
        return stkAccount(param, fields, false);
    }


    /**
     * 获取股票账户开户数据，统计周期为一周
     *
     * @param date      可选, 日期
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=164"
     */
    public TushareResponse<StkAccount> stkAccount(String date, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        StkAccountParam param = StkAccountParam.builder().date(date).startDate(startDate).endDate(endDate).build();
        return stkAccount(param, fields, populate);
    }

    /**
     * 获取股票账户开户数据，统计周期为一周
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=164"
     */
    public TushareResponse<StkAccount> stkAccount(StkAccountParam param, List<String> fields) throws IOException {
        return stkAccount(param, fields, false);
    }

    /**
     * 获取股票账户开户数据，统计周期为一周
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=164"
     */
    public TushareResponse<StkAccount> stkAccount(StkAccountParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.STK_ACCOUNT).token(token).param(param).fields(fields).build();
        TushareResponse<StkAccount> response = (TushareResponse<StkAccount>) post(requestParam);
        List<StkAccount> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    StkAccount stkAccount = StkAccount.init(responseDataFields, item);
                    dataList.add(stkAccount);
                }
            }
        }
        return response;
    }

    /**
     * 获取财报披露计划日期
     *
     * @param tsCode     可选, TS股票代码
     * @param endDate    可选, 财报周期（比如20181231表示2018年年报，20180630表示中报)
     * @param preDate    可选, 计划披露日期
     * @param actualDate 可选, 实际披露日期
     * @param fields     字段列表
     * @see "https://tushare.pro/document/2?doc_id=162"
     */
    public TushareResponse<DisclosureDate> disclosureDate(String tsCode, String endDate, String preDate, String actualDate, List<String> fields) throws IOException {
        DisclosureDateParam param = DisclosureDateParam.builder().tsCode(tsCode).endDate(endDate).preDate(preDate).actualDate(actualDate).build();
        return disclosureDate(param, fields, false);
    }


    /**
     * 获取财报披露计划日期
     *
     * @param tsCode     可选, TS股票代码
     * @param endDate    可选, 财报周期（比如20181231表示2018年年报，20180630表示中报)
     * @param preDate    可选, 计划披露日期
     * @param actualDate 可选, 实际披露日期
     * @param fields     字段列表
     * @param populate   是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=162"
     */
    public TushareResponse<DisclosureDate> disclosureDate(String tsCode, String endDate, String preDate, String actualDate, List<String> fields, boolean populate) throws IOException {
        DisclosureDateParam param = DisclosureDateParam.builder().tsCode(tsCode).endDate(endDate).preDate(preDate).actualDate(actualDate).build();
        return disclosureDate(param, fields, populate);
    }

    /**
     * 获取财报披露计划日期
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=162"
     */
    public TushareResponse<DisclosureDate> disclosureDate(DisclosureDateParam param, List<String> fields) throws IOException {
        return disclosureDate(param, fields, false);
    }

    /**
     * 获取财报披露计划日期
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=162"
     */
    public TushareResponse<DisclosureDate> disclosureDate(DisclosureDateParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.DISCLOSURE_DATE).token(token).param(param).fields(fields).build();
        TushareResponse<DisclosureDate> response = (TushareResponse<DisclosureDate>) post(requestParam);
        List<DisclosureDate> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    DisclosureDate disclosureDate = DisclosureDate.init(responseDataFields, item);
                    dataList.add(disclosureDate);
                }
            }
        }
        return response;
    }

    /**
     * 获取概念股分类，目前只有ts一个来源，未来将逐步增加来源
     *
     * @param src    可选, 来源，默认为ts
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=125"
     */
    public TushareResponse<Concept> concept(String src, List<String> fields) throws IOException {
        ConceptParam param = ConceptParam.builder().src(src).build();
        return concept(param, fields, false);
    }


    /**
     * 获取概念股分类，目前只有ts一个来源，未来将逐步增加来源
     *
     * @param src      可选, 来源，默认为ts
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=125"
     */
    public TushareResponse<Concept> concept(String src, List<String> fields, boolean populate) throws IOException {
        ConceptParam param = ConceptParam.builder().src(src).build();
        return concept(param, fields, populate);
    }

    /**
     * 获取概念股分类，目前只有ts一个来源，未来将逐步增加来源
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=125"
     */
    public TushareResponse<Concept> concept(ConceptParam param, List<String> fields) throws IOException {
        return concept(param, fields, false);
    }

    /**
     * 获取概念股分类，目前只有ts一个来源，未来将逐步增加来源
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=125"
     */
    public TushareResponse<Concept> concept(ConceptParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.CONCEPT).token(token).param(param).fields(fields).build();
        TushareResponse<Concept> response = (TushareResponse<Concept>) post(requestParam);
        List<Concept> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Concept concept = Concept.init(responseDataFields, item);
                    dataList.add(concept);
                }
            }
        }
        return response;
    }

    /**
     * 获取股票行情数据，或通过<a href="https://tushare.pro/document/2?doc_id=109"><strong>通用行情接口</strong></a>获取数据，包含了前后复权数据．
     *
     * @param tsCode    可选, 股票代码（二选一）
     * @param tradeDate 可选, 交易日期（二选一）
     * @param startDate 可选, 开始日期(YYYYMMDD)
     * @param endDate   可选, 结束日期(YYYYMMDD)
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=27"
     */
    public TushareResponse<Daily> daily(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields) throws IOException {
        DailyParam param = DailyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return daily(param, fields, false);
    }


    /**
     * 获取股票行情数据，或通过<a href="https://tushare.pro/document/2?doc_id=109"><strong>通用行情接口</strong></a>获取数据，包含了前后复权数据．
     *
     * @param tsCode    可选, 股票代码（二选一）
     * @param tradeDate 可选, 交易日期（二选一）
     * @param startDate 可选, 开始日期(YYYYMMDD)
     * @param endDate   可选, 结束日期(YYYYMMDD)
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=27"
     */
    public TushareResponse<Daily> daily(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        DailyParam param = DailyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return daily(param, fields, populate);
    }

    /**
     * 获取股票行情数据，或通过<a href="https://tushare.pro/document/2?doc_id=109"><strong>通用行情接口</strong></a>获取数据，包含了前后复权数据．
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=27"
     */
    public TushareResponse<Daily> daily(DailyParam param, List<String> fields) throws IOException {
        return daily(param, fields, false);
    }

    /**
     * 获取股票行情数据，或通过<a href="https://tushare.pro/document/2?doc_id=109"><strong>通用行情接口</strong></a>获取数据，包含了前后复权数据．
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=27"
     */
    public TushareResponse<Daily> daily(DailyParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.DAILY).token(token).param(param).fields(fields).build();
        TushareResponse<Daily> response = (TushareResponse<Daily>) post(requestParam);
        List<Daily> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Daily daily = Daily.init(responseDataFields, item);
                    dataList.add(daily);
                }
            }
        }
        return response;
    }

    /**
     * 获取上市公司回购股票数据
     *
     * @param annDate   可选, 公告日期（任意填参数，如果都不填，单次默认返回2000条）
     * @param startDate 可选, 公告开始日期
     * @param endDate   可选, 公告结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=124"
     */
    public TushareResponse<Repurchase> repurchase(String annDate, String startDate, String endDate, List<String> fields) throws IOException {
        RepurchaseParam param = RepurchaseParam.builder().annDate(annDate).startDate(startDate).endDate(endDate).build();
        return repurchase(param, fields, false);
    }


    /**
     * 获取上市公司回购股票数据
     *
     * @param annDate   可选, 公告日期（任意填参数，如果都不填，单次默认返回2000条）
     * @param startDate 可选, 公告开始日期
     * @param endDate   可选, 公告结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=124"
     */
    public TushareResponse<Repurchase> repurchase(String annDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        RepurchaseParam param = RepurchaseParam.builder().annDate(annDate).startDate(startDate).endDate(endDate).build();
        return repurchase(param, fields, populate);
    }

    /**
     * 获取上市公司回购股票数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=124"
     */
    public TushareResponse<Repurchase> repurchase(RepurchaseParam param, List<String> fields) throws IOException {
        return repurchase(param, fields, false);
    }

    /**
     * 获取上市公司回购股票数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=124"
     */
    public TushareResponse<Repurchase> repurchase(RepurchaseParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.REPURCHASE).token(token).param(param).fields(fields).build();
        TushareResponse<Repurchase> response = (TushareResponse<Repurchase>) post(requestParam);
        List<Repurchase> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    Repurchase repurchase = Repurchase.init(responseDataFields, item);
                    dataList.add(repurchase);
                }
            }
        }
        return response;
    }

    /**
     * 获取股票复权因子，可提取单只股票全部历史复权因子，也可以提取单日全部股票的复权因子。
     *
     * @param tsCode    必填, 股票代码
     * @param tradeDate 可选, 交易日期(YYYYMMDD，下同)
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=28"
     */
    public TushareResponse<AdjFactor> adjFactor(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields) throws IOException {
        AdjFactorParam param = AdjFactorParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return adjFactor(param, fields, false);
    }


    /**
     * 获取股票复权因子，可提取单只股票全部历史复权因子，也可以提取单日全部股票的复权因子。
     *
     * @param tsCode    必填, 股票代码
     * @param tradeDate 可选, 交易日期(YYYYMMDD，下同)
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=28"
     */
    public TushareResponse<AdjFactor> adjFactor(String tsCode, String tradeDate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        AdjFactorParam param = AdjFactorParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).build();
        return adjFactor(param, fields, populate);
    }

    /**
     * 获取股票复权因子，可提取单只股票全部历史复权因子，也可以提取单日全部股票的复权因子。
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=28"
     */
    public TushareResponse<AdjFactor> adjFactor(AdjFactorParam param, List<String> fields) throws IOException {
        return adjFactor(param, fields, false);
    }

    /**
     * 获取股票复权因子，可提取单只股票全部历史复权因子，也可以提取单日全部股票的复权因子。
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=28"
     */
    public TushareResponse<AdjFactor> adjFactor(AdjFactorParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.ADJ_FACTOR).token(token).param(param).fields(fields).build();
        TushareResponse<AdjFactor> response = (TushareResponse<AdjFactor>) post(requestParam);
        List<AdjFactor> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    AdjFactor adjFactor = AdjFactor.init(responseDataFields, item);
                    dataList.add(adjFactor);
                }
            }
        }
        return response;
    }

    /**
     * 获取新股上市列表数据
     *
     * @param startDate 可选, 上网发行开始日期
     * @param endDate   可选, 上网发行结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=123"
     */
    public TushareResponse<NewShare> newShare(String startDate, String endDate, List<String> fields) throws IOException {
        NewShareParam param = NewShareParam.builder().startDate(startDate).endDate(endDate).build();
        return newShare(param, fields, false);
    }


    /**
     * 获取新股上市列表数据
     *
     * @param startDate 可选, 上网发行开始日期
     * @param endDate   可选, 上网发行结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=123"
     */
    public TushareResponse<NewShare> newShare(String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        NewShareParam param = NewShareParam.builder().startDate(startDate).endDate(endDate).build();
        return newShare(param, fields, populate);
    }

    /**
     * 获取新股上市列表数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=123"
     */
    public TushareResponse<NewShare> newShare(NewShareParam param, List<String> fields) throws IOException {
        return newShare(param, fields, false);
    }

    /**
     * 获取新股上市列表数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=123"
     */
    public TushareResponse<NewShare> newShare(NewShareParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.NEW_SHARE).token(token).param(param).fields(fields).build();
        TushareResponse<NewShare> response = (TushareResponse<NewShare>) post(requestParam);
        List<NewShare> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    NewShare newShare = NewShare.init(responseDataFields, item);
                    dataList.add(newShare);
                }
            }
        }
        return response;
    }

    /**
     * 获取基础信息数据，包括股票代码、名称、上市日期、退市日期等
     *
     * @param isHs       可选, 是否沪深港通标的，N否 H沪股通 S深股通
     * @param listStatus 可选, 上市状态： L上市 D退市 P暂停上市
     * @param exchange   可选, 交易所 SSE上交所 SZSE深交所 HKEX港交所(未上线)
     * @param fields     字段列表
     * @see "https://tushare.pro/document/2?doc_id=25"
     */
    public TushareResponse<StockBasic> stockBasic(String isHs, String listStatus, String exchange, List<String> fields) throws IOException {
        StockBasicParam param = StockBasicParam.builder().isHs(isHs).listStatus(listStatus).exchange(exchange).build();
        return stockBasic(param, fields, false);
    }


    /**
     * 获取基础信息数据，包括股票代码、名称、上市日期、退市日期等
     *
     * @param isHs       可选, 是否沪深港通标的，N否 H沪股通 S深股通
     * @param listStatus 可选, 上市状态： L上市 D退市 P暂停上市
     * @param exchange   可选, 交易所 SSE上交所 SZSE深交所 HKEX港交所(未上线)
     * @param fields     字段列表
     * @param populate   是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=25"
     */
    public TushareResponse<StockBasic> stockBasic(String isHs, String listStatus, String exchange, List<String> fields, boolean populate) throws IOException {
        StockBasicParam param = StockBasicParam.builder().isHs(isHs).listStatus(listStatus).exchange(exchange).build();
        return stockBasic(param, fields, populate);
    }

    /**
     * 获取基础信息数据，包括股票代码、名称、上市日期、退市日期等
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=25"
     */
    public TushareResponse<StockBasic> stockBasic(StockBasicParam param, List<String> fields) throws IOException {
        return stockBasic(param, fields, false);
    }

    /**
     * 获取基础信息数据，包括股票代码、名称、上市日期、退市日期等
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=25"
     */
    public TushareResponse<StockBasic> stockBasic(StockBasicParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.STOCK_BASIC).token(token).param(param).fields(fields).build();
        TushareResponse<StockBasic> response = (TushareResponse<StockBasic>) post(requestParam);
        List<StockBasic> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    StockBasic stockBasic = StockBasic.init(responseDataFields, item);
                    dataList.add(stockBasic);
                }
            }
        }
        return response;
    }

    /**
     * 获取上市公司股东户数数据，数据不定期公布
     *
     * @param tsCode    可选, TS股票代码
     * @param enddate   可选, 截止日期
     * @param startDate 可选, 公告开始日期
     * @param endDate   可选, 公告结束日期
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=166"
     */
    public TushareResponse<StkHoldernumber> stkHoldernumber(String tsCode, String enddate, String startDate, String endDate, List<String> fields) throws IOException {
        StkHoldernumberParam param = StkHoldernumberParam.builder().tsCode(tsCode).enddate(enddate).startDate(startDate).endDate(endDate).build();
        return stkHoldernumber(param, fields, false);
    }


    /**
     * 获取上市公司股东户数数据，数据不定期公布
     *
     * @param tsCode    可选, TS股票代码
     * @param enddate   可选, 截止日期
     * @param startDate 可选, 公告开始日期
     * @param endDate   可选, 公告结束日期
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=166"
     */
    public TushareResponse<StkHoldernumber> stkHoldernumber(String tsCode, String enddate, String startDate, String endDate, List<String> fields, boolean populate) throws IOException {
        StkHoldernumberParam param = StkHoldernumberParam.builder().tsCode(tsCode).enddate(enddate).startDate(startDate).endDate(endDate).build();
        return stkHoldernumber(param, fields, populate);
    }

    /**
     * 获取上市公司股东户数数据，数据不定期公布
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=166"
     */
    public TushareResponse<StkHoldernumber> stkHoldernumber(StkHoldernumberParam param, List<String> fields) throws IOException {
        return stkHoldernumber(param, fields, false);
    }

    /**
     * 获取上市公司股东户数数据，数据不定期公布
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=166"
     */
    public TushareResponse<StkHoldernumber> stkHoldernumber(StkHoldernumberParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.STK_HOLDERNUMBER).token(token).param(param).fields(fields).build();
        TushareResponse<StkHoldernumber> response = (TushareResponse<StkHoldernumber>) post(requestParam);
        List<StkHoldernumber> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    StkHoldernumber stkHoldernumber = StkHoldernumber.init(responseDataFields, item);
                    dataList.add(stkHoldernumber);
                }
            }
        }
        return response;
    }

    /**
     * 获取各大交易所交易日历数据,默认提取的是上交所
     *
     * @param exchange  可选, 交易所 SSE上交所 SZSE深交所
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param isOpen    可选, 是否交易 '0'休市 '1'交易
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=26"
     */
    public TushareResponse<TradeCal> tradeCal(String exchange, String startDate, String endDate, String isOpen, List<String> fields) throws IOException {
        TradeCalParam param = TradeCalParam.builder().exchange(exchange).startDate(startDate).endDate(endDate).isOpen(isOpen).build();
        return tradeCal(param, fields, false);
    }


    /**
     * 获取各大交易所交易日历数据,默认提取的是上交所
     *
     * @param exchange  可选, 交易所 SSE上交所 SZSE深交所
     * @param startDate 可选, 开始日期
     * @param endDate   可选, 结束日期
     * @param isOpen    可选, 是否交易 '0'休市 '1'交易
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=26"
     */
    public TushareResponse<TradeCal> tradeCal(String exchange, String startDate, String endDate, String isOpen, List<String> fields, boolean populate) throws IOException {
        TradeCalParam param = TradeCalParam.builder().exchange(exchange).startDate(startDate).endDate(endDate).isOpen(isOpen).build();
        return tradeCal(param, fields, populate);
    }

    /**
     * 获取各大交易所交易日历数据,默认提取的是上交所
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=26"
     */
    public TushareResponse<TradeCal> tradeCal(TradeCalParam param, List<String> fields) throws IOException {
        return tradeCal(param, fields, false);
    }

    /**
     * 获取各大交易所交易日历数据,默认提取的是上交所
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=26"
     */
    public TushareResponse<TradeCal> tradeCal(TradeCalParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.TRADE_CAL).token(token).param(param).fields(fields).build();
        TushareResponse<TradeCal> response = (TushareResponse<TradeCal>) post(requestParam);
        List<TradeCal> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    TradeCal tradeCal = TradeCal.init(responseDataFields, item);
                    dataList.add(tradeCal);
                }
            }
        }
        return response;
    }

    /**
     * 获取概念股分类明细数据
     *
     * @param id     可选, 概念分类ID （id来自概念股分类接口）
     * @param tsCode 可选, 股票代码 （以上参数二选一）
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=126"
     */
    public TushareResponse<ConceptDetail> conceptDetail(String id, String tsCode, List<String> fields) throws IOException {
        ConceptDetailParam param = ConceptDetailParam.builder().id(id).tsCode(tsCode).build();
        return conceptDetail(param, fields, false);
    }


    /**
     * 获取概念股分类明细数据
     *
     * @param id       可选, 概念分类ID （id来自概念股分类接口）
     * @param tsCode   可选, 股票代码 （以上参数二选一）
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=126"
     */
    public TushareResponse<ConceptDetail> conceptDetail(String id, String tsCode, List<String> fields, boolean populate) throws IOException {
        ConceptDetailParam param = ConceptDetailParam.builder().id(id).tsCode(tsCode).build();
        return conceptDetail(param, fields, populate);
    }

    /**
     * 获取概念股分类明细数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=126"
     */
    public TushareResponse<ConceptDetail> conceptDetail(ConceptDetailParam param, List<String> fields) throws IOException {
        return conceptDetail(param, fields, false);
    }

    /**
     * 获取概念股分类明细数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=126"
     */
    public TushareResponse<ConceptDetail> conceptDetail(ConceptDetailParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.CONCEPT_DETAIL).token(token).param(param).fields(fields).build();
        TushareResponse<ConceptDetail> response = (TushareResponse<ConceptDetail>) post(requestParam);
        List<ConceptDetail> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    ConceptDetail conceptDetail = ConceptDetail.init(responseDataFields, item);
                    dataList.add(conceptDetail);
                }
            }
        }
        return response;
    }

    /**
     * 获取外汇日线行情
     *
     * @param tsCode    可选, TS代码
     * @param tradeDate 可选, 交易日期（GMT，日期是格林尼治时间，比北京时间晚一天）
     * @param startDate 可选, 开始日期（GMT）
     * @param endDate   可选, 结束日期（GMT）
     * @param exchange  可选, 交易商，目前只有FXCM
     * @param fields    字段列表
     * @see "https://tushare.pro/document/2?doc_id=179"
     */
    public TushareResponse<FxDaily> fxDaily(String tsCode, String tradeDate, String startDate, String endDate, String exchange, List<String> fields) throws IOException {
        FxDailyParam param = FxDailyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).exchange(exchange).build();
        return fxDaily(param, fields, false);
    }


    /**
     * 获取外汇日线行情
     *
     * @param tsCode    可选, TS代码
     * @param tradeDate 可选, 交易日期（GMT，日期是格林尼治时间，比北京时间晚一天）
     * @param startDate 可选, 开始日期（GMT）
     * @param endDate   可选, 结束日期（GMT）
     * @param exchange  可选, 交易商，目前只有FXCM
     * @param fields    字段列表
     * @param populate  是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=179"
     */
    public TushareResponse<FxDaily> fxDaily(String tsCode, String tradeDate, String startDate, String endDate, String exchange, List<String> fields, boolean populate) throws IOException {
        FxDailyParam param = FxDailyParam.builder().tsCode(tsCode).tradeDate(tradeDate).startDate(startDate).endDate(endDate).exchange(exchange).build();
        return fxDaily(param, fields, populate);
    }

    /**
     * 获取外汇日线行情
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=179"
     */
    public TushareResponse<FxDaily> fxDaily(FxDailyParam param, List<String> fields) throws IOException {
        return fxDaily(param, fields, false);
    }

    /**
     * 获取外汇日线行情
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=179"
     */
    public TushareResponse<FxDaily> fxDaily(FxDailyParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FX_DAILY).token(token).param(param).fields(fields).build();
        TushareResponse<FxDaily> response = (TushareResponse<FxDaily>) post(requestParam);
        List<FxDaily> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FxDaily fxDaily = FxDaily.init(responseDataFields, item);
                    dataList.add(fxDaily);
                }
            }
        }
        return response;
    }

    /**
     * 获取海外外汇基础信息，目前只有FXCM交易商的数据
     *
     * @param exchange 可选, 交易商
     * @param classify 可选, 分类
     * @param tsCode   可选, TS代码
     * @param fields   字段列表
     * @see "https://tushare.pro/document/2?doc_id=178"
     */
    public TushareResponse<FxObasic> fxObasic(String exchange, String classify, String tsCode, List<String> fields) throws IOException {
        FxObasicParam param = FxObasicParam.builder().exchange(exchange).classify(classify).tsCode(tsCode).build();
        return fxObasic(param, fields, false);
    }


    /**
     * 获取海外外汇基础信息，目前只有FXCM交易商的数据
     *
     * @param exchange 可选, 交易商
     * @param classify 可选, 分类
     * @param tsCode   可选, TS代码
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=178"
     */
    public TushareResponse<FxObasic> fxObasic(String exchange, String classify, String tsCode, List<String> fields, boolean populate) throws IOException {
        FxObasicParam param = FxObasicParam.builder().exchange(exchange).classify(classify).tsCode(tsCode).build();
        return fxObasic(param, fields, populate);
    }

    /**
     * 获取海外外汇基础信息，目前只有FXCM交易商的数据
     *
     * @param param  请求参数对象
     * @param fields 字段列表
     * @see "https://tushare.pro/document/2?doc_id=178"
     */
    public TushareResponse<FxObasic> fxObasic(FxObasicParam param, List<String> fields) throws IOException {
        return fxObasic(param, fields, false);
    }

    /**
     * 获取海外外汇基础信息，目前只有FXCM交易商的数据
     *
     * @param param    请求参数对象
     * @param fields   字段列表
     * @param populate 是否将返回数据包装为 pojo
     * @see "https://tushare.pro/document/2?doc_id=178"
     */
    public TushareResponse<FxObasic> fxObasic(FxObasicParam param, List<String> fields, boolean populate) throws IOException {
        TushareRequestParam requestParam = TushareRequestParam.builder().apiName(Constant.FX_OBASIC).token(token).param(param).fields(fields).build();
        TushareResponse<FxObasic> response = (TushareResponse<FxObasic>) post(requestParam);
        List<FxObasic> dataList = new ArrayList<>();
        response.setDataList(dataList);
        if (response.getCode() == 0) {
            if (populate) {
                ResponseData responseData = response.getData();
                String[] responseDataFields = responseData.getFields();
                Object[][] items = responseData.getItems();
                for (Object[] item : items) {
                    FxObasic fxObasic = FxObasic.init(responseDataFields, item);
                    dataList.add(fxObasic);
                }
            }
        }
        return response;
    }

    private TushareResponse<? extends Model> post(TushareRequestParam param) throws IOException {
        String json = mapper.writeValueAsString(param);
        RequestBody requestBody = RequestBody.create(json, JSON);
        Request request = new Request.Builder().url(TUSHARE_API_BASE).post(requestBody).build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                ResponseBody body = response.body();
                if (body != null) {
                    return mapper.readValue(body.string(), TushareResponse.class);
                }
                throw new IllegalArgumentException();
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

}
