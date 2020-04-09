/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gettyio.core.handler.codec.http;

import com.gettyio.core.util.DateTimeUtil;

/**
 * HttpResponse.java
 *
 * @description:http返回值
 * @author:gogym
 * @date:2020/4/9
 * @copyright: Copyright by gettyio.com
 */
public class HttpResponse extends HttpMessage {

    private HttpResponseStatus httpResponseStatus;

    public HttpResponse() {

    }

    public HttpResponse(HttpVersion httpVersion, HttpResponseStatus httpResponseStatus) {
        super.httpVersion = httpVersion;
        this.httpResponseStatus = httpResponseStatus;
        addHeader(HttpHeaders.Names.SERVER, "getty");
        addHeader(HttpHeaders.Names.DATE, DateTimeUtil.getCurrentTime());
    }

    public HttpResponseStatus getHttpResponseStatus() {
        return httpResponseStatus;
    }

    public void setHttpResponseStatus(HttpResponseStatus httpResponseStatus) {
        this.httpResponseStatus = httpResponseStatus;
    }

}
