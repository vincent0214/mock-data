package com.zhu.mock;

import cn.hutool.core.io.FileUtil;
import cn.hutool.script.JavaScriptEngine;
import cn.hutool.script.ScriptUtil;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomValueTest {

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
    @DisplayName("随机生成一个中文名字")
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


}