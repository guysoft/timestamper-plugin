/*
 * The MIT License
 * 
 * Copyright (c) 2015 Steven G. Brown
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package hudson.plugins.timestamper;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.io.Closeables;
import com.google.common.primitives.Bytes;

/**
 * Test for the {@link TimestampNotesOutputStream} class.
 * 
 * @author Steven G. Brown
 */
public class TimestampNotesOutputStreamTest {

  private static final char NEWLINE = 0x0A;

  private ByteArrayOutputStream delegateOutputStream;

  private TimestampNotesOutputStream timestampNotesOutputStream;

  /**
   */
  @Before
  public void setUp() {
    delegateOutputStream = new ByteArrayOutputStream();
    timestampNotesOutputStream = new TimestampNotesOutputStream(
        delegateOutputStream, 0);
  }

  /**
   * @throws IOException
   */
  @After
  public void tearDown() throws IOException {
    Closeables.close(delegateOutputStream, true);
    Closeables.close(timestampNotesOutputStream, true);
  }

  /**
   * @throws Exception
   */
  @Test
  public void testWrite() throws Exception {
    byte[] line = new byte[] { 'a', (byte) NEWLINE };
    timestampNotesOutputStream.write(line);
    byte[] result = delegateOutputStream.toByteArray();

    assertThat(Bytes.asList(result), hasSize(greaterThan(line.length)));
    assertThat(Arrays.copyOfRange(result, result.length - 2, result.length),
        is(line));
  }
}
