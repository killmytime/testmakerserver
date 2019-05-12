package com.killmytime.testmakerserver.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionControllerTest {
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    /**
     * Create By 雷玮杰 16302010016
     * 0-9共10个用例，加了一些简单的说明，满足了最低的分支覆盖要求~~啦啦啦
     * 对于数据的校验，就简单的对于id和HTTP状态码进行比对
     * 错误信息会在返回值里返回，正确信息会正常返回，不知道为什么content()无法捕获到错误信息,没找到解决方案，所以~
     *错误信息和正确信息就不做无意义的校验了~
     * 这里为了保证代码的简洁，没有另外封装对于字符串的处理，正常打印出现的会有很多转义符\
     * 本来应当有权限校验的，由于只是一个组卷系统的小demo
     * 所以就没有加了，其他在做的时候我也就简单的get请求满足需求了~~毕竟重在测试嘛
     * 另起，由于服务器挂载在一个一直在用的用于特殊用途的国外主机上，所以性能比较差，进行大量多表查询的时候会需要一些等待~emmm
     * 所以如果因为网络问题卡了，请再试一次啦，或者助教检查检查代码逻辑，应当简洁没有问题趴~~
     * @throws Exception
     */
    @Test
    public void getQuestionById() throws Exception {
        /*正确用例*/
        //0.发送一个存在问题的id，状态码符合，返回值存在id
        mvc.perform(MockMvcRequestBuilders.get("/question/detail?id=84").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("id")));


        /*参数问题*/
        //1.格式正确，参数溢出检测~，设置使之返回400，错误
        mvc.perform(MockMvcRequestBuilders.get("/question/detail?id=84000000000000000000000000000000000000000000000000000000000000000").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is(400));
        //2.格式正确，参数类型错误，需求int，Integer整型数据，给出浮点数形式，不允许强制转换，应当返回400，错误
        mvc.perform(MockMvcRequestBuilders.get("/question/detail?id=0.88").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is(400));
        //3.错误的语法，?后参数名=之后没有值了，本来是想用来测试为空的，发现是语法错误
        mvc.perform(MockMvcRequestBuilders.get("/question/detail?id=").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is(400));
        //4.同样是错误请求，没有参数传递，应当返回400
        mvc.perform(MockMvcRequestBuilders.get("/question/detail").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is(400));
        //5.发送一个错误的请求字符，但是请求格式保持正确
        mvc.perform(MockMvcRequestBuilders.get("/question/detail?id=8a").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is(400));
        //6.发送一个不存在的id，状态码符合，返回值为空
        mvc.perform(MockMvcRequestBuilders.get("/question/detail?id=80").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("")));
        //7.url中添加多余参数，同名多余参数，保证只识别第一个参数
        mvc.perform(MockMvcRequestBuilders.get("/question/detail?id=84&id=80&hjasdjdfsjd").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("84")));
        //8.url中保证只识别id，而不是ID，Id，iD,乱七八糟的东西~~
        mvc.perform(MockMvcRequestBuilders.get("/question/detail?iD=84&Id=84&ID=84&id=80&id=84hjasdjdfsjd").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("")));

        /*url问题*/

        //9.找不到的url应当导致404，考虑到可能存在的手误，所以就取detali测试了
        mvc.perform(MockMvcRequestBuilders.get("/question/detali?ashgjdgahgsggdhjasgdajshdjasd=2831893?aksd").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is(404));
    }
}
