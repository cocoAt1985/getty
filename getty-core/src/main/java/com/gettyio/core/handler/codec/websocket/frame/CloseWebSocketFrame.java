/*
 * Copyright 2019 The Getty Project
 *
 * The Getty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.gettyio.core.handler.codec.websocket.frame;


import com.gettyio.core.handler.codec.websocket.Opcode;
import com.gettyio.core.logging.InternalLogger;
import com.gettyio.core.logging.InternalLoggerFactory;



/**
 * 关闭帧，这个帧不能主动发送。由websocket自身控制，一般用于接收判断即可
 */
public class CloseWebSocketFrame extends WebSocketFrame {

    protected static final InternalLogger LOGGER = InternalLoggerFactory.getInstance(TextWebSocketFrame.class);

    public CloseWebSocketFrame() {
        setOpcode(Opcode.CLOSE.getCode());
    }

}