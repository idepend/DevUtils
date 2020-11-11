package dev.utils;

/**
 * detail: 常量类
 * @author Ttt
 */
public final class DevFinal {

    private DevFinal() {
    }

    // 空格 字符串
    public static final String SPACE_STR       = " ";
    // TAB 字符串
    public static final String TAB_STR         = "\t";
    // 换行字符串
    public static final String NEW_LINE_STR    = System.getProperty("line.separator");
    // 换行字符串 ( 两行 )
    public static final String NEW_LINE_STR_X2 = NEW_LINE_STR + NEW_LINE_STR;
    // 空对象字符串
    public static final String NULL_STR        = "null";

    // ===============
    // = 日期格式类型 =
    // ===============

    public static final String yyyy             = "yyyy";
    public static final String yyyyMMdd         = "yyyy-MM-dd";
    public static final String yyyyMMdd2        = "yyyyMMdd";
    public static final String yyyyMMdd3        = "yyyy年MM月dd日";
    public static final String yyyyMMddHHmmss   = "yyyy-MM-dd HH:mm:ss";
    public static final String yyyyMMddHHmmss_2 = "yyyy年M月d日 HH:mm:ss";
    public static final String yyyyMMdd_HHmmss  = "yyyyMMdd_HHmmss";
    public static final String MMdd             = "MM-dd";
    public static final String MMdd2            = "MM月dd日";
    public static final String MMdd3            = "MMdd";
    public static final String HHmm             = "HH:mm";
    public static final String HHmm2            = "HHmm";
    public static final String HHmmss           = "HH:mm:ss";
    public static final String HHmmss2          = "HHmmss";
    public static final String hhmmMMDDyyyy     = "hh:mm M月d日 yyyy";
    public static final String hhmmssMMDDyyyy   = "hh:mm:ss M月d日 yyyy";

    // 一分钟 60 秒
    public static final int  MINUTE_S = 60;
    // 一小时 60 * 60 秒
    public static final int  HOUR_S   = 3600;
    // 一天 24 * 60 * 60 秒
    public static final int  DAY_S    = 86400;
    // 秒与毫秒的倍数
    public static final long SECOND   = 1000;
    // 分与毫秒的倍数
    public static final long MINUTE   = SECOND * 60;
    // 时与毫秒的倍数
    public static final long HOUR     = MINUTE * 60;
    // 天与毫秒的倍数
    public static final long DAY      = HOUR * 24;
    // 周与毫秒的倍数
    public static final long WEEK     = DAY * 7;
    // 月与毫秒的倍数
    public static final long MONTH    = DAY * 30;
    // 年与毫秒的倍数
    public static final long YEAR     = DAY * 365;

    // ===============
    // = 其他常用字段 =
    // ===============

    public static final String ID       = "id";
    public static final String UUID     = "uuid";
    public static final String DATA     = "data";
    public static final String MESSAGE  = "message";
    public static final String CODE     = "code";
    public static final String TITLE    = "title";
    public static final String OBJECT   = "object";
    public static final String PARAMS   = "params";
    public static final String TYPE     = "type";
    public static final String PAGE     = "page";
    public static final String SIZE     = "size";
    public static final String COUNT    = "count";
    public static final String URL      = "url";
    public static final String TIME     = "time";
    public static final String DATE     = "date";
    public static final String KEY      = "key";
    public static final String VALUE    = "value";
    public static final String CLIENT   = "client";
    public static final String SOURCE   = "source";
    public static final String CONFIG   = "config";
    public static final String FLAG     = "flag";
    public static final String RESULT   = "result";
    public static final String SUCCESS  = "success";
    public static final String FAIL     = "fail";
    public static final String ERROR     = "error";
    public static final String METHOD   = "method";
    public static final String TOKEN    = "token";
    public static final String TEXT     = "text";
    public static final String CONTENT  = "content";
    public static final String IMAGE    = "image";
    public static final String VIDEO    = "video";
    public static final String AUDIO    = "audio";
    public static final String LIST     = "list";
    public static final String MAP      = "map";
    public static final String ARRAY    = "array";
    public static final String GET      = "get";
    public static final String SET      = "set";
    public static final String ITEM     = "item";
    public static final String CHECK    = "check";
    public static final String STATE    = "state";
    public static final String HASH     = "hash";
    public static final String HEIGHT   = "height";
    public static final String WEIGHT   = "weight";
    public static final String CHANNEL  = "channel";
    public static final String VERSION  = "version";
    public static final String REMARK   = "remark";
    public static final String PATH     = "path";
    public static final String FILE     = "file";
    public static final String INTENT   = "intent";
    public static final String ACTIVITY = "activity";
    public static final String SORT     = "sort";
    public static final String TASK     = "task";
    public static final String ACCOUNT  = "account";
    public static final String PASSWORD = "password";
    public static final String NAME     = "name";
    public static final String KEYWORD  = "keyword";
    public static final String LIMIT    = "limit";
    public static final String MAX      = "max";
    public static final String MIN      = "min";
    public static final String TAG      = "tag";
    public static final String UNKNOWN  = "unknown";
    public static final String SCREEN   = "screen";

    // ===========
    // = 常量数组 =
    // ===========

    // 用于建立十六进制字符的输出的小写字符数组
    public static final char[] HEX_DIGITS       = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
    };
    // 用于建立十六进制字符的输出的大写字符数组
    public static final char[] HEX_DIGITS_UPPER = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    // 0123456789
    public static final char[] NUMBERS = {
            48, 49, 50, 51, 52, 53, 54, 55, 56, 57
    };

    // abcdefghijklmnopqrstuvwxyz
    public static final char[] LOWER_CASE_LETTERS = {
            97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109,
            110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122
    };

    // ABCDEFGHIJKLMNOPQRSTUVWXYZ
    public static final char[] CAPITAL_LETTERS = {
            65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
            81, 82, 83, 84, 85, 86, 87, 88, 89, 90
    };

    // abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ
    public static final char[] LETTERS = {
            97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110,
            111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 65, 66,
            67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83,
            84, 85, 86, 87, 88, 89, 90
    };

    // 0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ
    public static final char[] NUMBERS_AND_LETTERS = {
            48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102,
            103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115,
            116, 117, 118, 119, 120, 121, 122, 65, 66, 67, 68, 69, 70, 71, 72,
            73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90
    };

    // ==================
    // = ValidatorUtils =
    // ==================

    // 正则表达式: 空格
    public static final String REGEX_SPACE = "\\s";

    // 正则表达式: 验证数字
    public static final String REGEX_NUMBER = "^[0-9]*$";

    // 正则表达式: 验证数字或包含小数点
    public static final String REGEX_NUMBER_OR_DECIMAL = "^[0-9]*[.]?[0-9]*$";

    // 正则表达式: 验证是否包含数字
    public static final String REGEX_CONTAIN_NUMBER = ".*\\d+.*";

    // 正则表达式: 验证是否数字或者字母
    public static final String REGEX_NUMBER_OR_LETTER = "^[A-Za-z0-9]+$";

    // 正则表达式: 验证是否全是字母
    public static final String REGEX_LETTER = "^[A-Za-z]+$";

    // 正则表达式: 不能输入特殊字符 ^[\u4E00-\u9FA5A-Za-z0-9]+$ 或 ^[\u4E00-\u9FA5A-Za-z0-9]{2,20}$
    public static final String REGEX_SPECIAL = "^[\\u4E00-\\u9FA5A-Za-z0-9]+$";

    // 正则表达式: 验证微信号 ^[a-zA-Z]{1}[-_a-zA-Z0-9]{5,19}+$
    public static final String REGEX_WX = "^[a-zA-Z]{1}[-_a-zA-Z0-9]{5,19}+$";

    // 正则表达式: 验证真实姓名 ^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$
    public static final String REGEX_REALNAME = "^[\\u4e00-\\u9fa5]+(•[\\u4e00-\\u9fa5]*)*$|^[\\u4e00-\\u9fa5]+(·[\\u4e00-\\u9fa5]*)*$";

    // 正则表达式: 验证昵称
    public static final String REGEX_NICKNAME = "^[\\u4E00-\\u9FA5A-Za-z0-9_]+$";

    // 正则表达式: 验证用户名 ( 不包含中文和特殊字符 ) 如果用户名使用手机号码或邮箱 则结合手机号验证和邮箱验证
    public static final String REGEX_USERNAME = "^[a-zA-Z]\\w{5,17}$";

    // 正则表达式: 验证密码 ( 不包含特殊字符 )
    public static final String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,18}$";

    // 正则表达式: 验证邮箱
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    // 正则表达式: 验证 URL
    public static final String REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?";

    // 正则表达式: 验证 IP 地址
    public static final String REGEX_IP_ADDRESS = "(2[5][0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})";

    // 正则表达式: 验证汉字
    public static final String REGEX_CHINESE = "^[\u4e00-\u9fa5]+$";

    // 正则表达式: 验证汉字 ( 含双角符号 )
    public static final String REGEX_CHINESE_ALL = "^[\u0391-\uFFE5]+$";

    // 正则表达式: 验证汉字 ( 含双角符号 )
    public static final String REGEX_CHINESE_ALL2 = "[\u0391-\uFFE5]";
}