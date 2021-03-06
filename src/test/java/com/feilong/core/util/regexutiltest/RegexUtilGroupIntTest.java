/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.core.util.regexutiltest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.feilong.core.util.RegexUtil;

/**
 * The Class RegexUtilGroupIntTest.
 *
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 */
public class RegexUtilGroupIntTest{

    /**
     * Test group.
     */
    @Test
    public void testGroup(){
        String regexPattern = "(.*?)@(.*?)";
        String email = "venussanguodrogon@1263.com";

        assertEquals("venussanguodrogon", RegexUtil.group(regexPattern, email, 1));
        assertEquals("1263.com", RegexUtil.group(regexPattern, email, 2));
    }
}
