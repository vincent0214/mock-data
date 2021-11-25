## 关于Mock-data
Mock-data的是一个调用easymock.js生成随机数据的一个工具

## 个别使用案例
```java
import cn.hutool.core.io.FileUtil;
import cn.hutool.script.JavaScriptEngine;
import cn.hutool.script.ScriptUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test; 

public class RandomValueTest {
	@Test
    @DisplayName("测试读js代码执行")
    public void testEval() throws Exception {
        JavaScriptEngine scriptEngine = ScriptUtil.getJavaScriptEngine();
        String scriptString = FileUtil.readUtf8String("js/mock-min.js");
        scriptEngine.eval(scriptString);
        Object eval = scriptEngine.eval("Mock.Random.boolean()");
        System.out.println(eval);
    }

    @Test
    @DisplayName("测试随机生成一个中文名字")
    public void testGetChineseName() {
        String chineseName = RandomValue.getChineseName();
        System.out.println("chineseName = " + chineseName);
    }

    @Test
    @DisplayName("测试随机生成一个常见的中文姓名")
    public void testCname() throws Exception {
        String chineseName = RandomValue.cname();
        System.out.println("chineseName = " + chineseName);
    }

    @Test
    @DisplayName("测试生成随机日期")
    public void testGetDate() throws Exception {
        String result = RandomValue.date();
        System.out.println("result = " + result);
    }

    @Test
    @DisplayName("测试生成随机日期时间戳")
    public void testGetDateTime() throws Exception {
        String result = RandomValue.datetime();
        System.out.println("result = " + result);
    }

    @Test
    @DisplayName("测试生成随机数字")
    public void testGetId() {
        String result = RandomValue.getNumber(2);
        System.out.println("result = " + result);
    }
}
```

