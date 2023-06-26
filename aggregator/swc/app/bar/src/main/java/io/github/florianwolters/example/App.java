package io.github.florianwolters.example;

/*
 * #%L
 * Example JAR Application
 * %%
 * Copyright (C) 2023 Florian Wolters
 * %%
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
 * #L%
 */

// FIXME(2023-06-19 by wolters): Fix Checkstyle, PMD and SpotBugs warnings.

/**
 * The {@link App} <i>Utility Class</i> provides the entry-point static method {@link App#main(String[])}.
 */
public class App {
    private App() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * The entry--point function of the <code>App</code>.
     *
     * @param args the command line interface (CLI) arguments of the <code>App</code>
     */
    public static void main(final String[] args) {
        new Greeter().sayHello();
    }

    // TODO(2023-06-19 by wolters): Remove unused function.

    /**
     * Unused function for static code analysis.
     */
    private static void unusedMethod() {
        // NOOP
    }
}
