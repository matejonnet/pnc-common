/**
 * JBoss, Home of Professional Open Source.
 * Copyright 2014-2020 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.pnc.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersTest {

    @Test
    public void longToBytesAndBack() {
        long l = 1234567890123456789L;
        byte[] bytes = Numbers.longToBytes(l);
        long longFromBytes = Numbers.bytesToLong(bytes);
        Assertions.assertEquals(l, longFromBytes);
    }

    @Test
    public void convertDecimalToBase64() {
        long decimal = 4242L;
        String base64 = Numbers.decimalToBase64(decimal);
        System.out.println(base64);
        long backToDecimal = Numbers.base64ToDecimal(base64);

        Assertions.assertEquals(decimal, backToDecimal);
    }

    @Test
    public void base64ToDecimal() {
        String base64 = "100002";
        long backToDecimal = Numbers.base64ToDecimal(base64);

        Assertions.assertEquals(3612161235L, backToDecimal);
    }
}
