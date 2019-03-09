package com.hotmail.huzy8080.streamhello.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
/*@SpringBootTest*/
@EnableBinding(value = {SinkReceiverTest.SinkSender.class})
public class SinkReceiverTest {

    @Autowired
    SinkSender sinkSender;

    @Test
    public void testReceive() {
        sinkSender.output().send(MessageBuilder.withPayload("produce a message ：http://blog.didispace.com").build());
    }

    public interface SinkSender {
        String OUTPUT = "input";

        @Output(SinkSender.OUTPUT)
        MessageChannel output();

    }
}