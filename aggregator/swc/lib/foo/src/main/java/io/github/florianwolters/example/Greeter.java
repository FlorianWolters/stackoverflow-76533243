package io.github.florianwolters.example;

/*
 * #%L
 * Example JAR Library
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

import org.jetbrains.annotations.NotNull;

import java.util.Optional;

// FIXME(2023-06-19 by wolters): Fix Checkstyle, PMD and SpotBugs warnings.

/**
 * The {@link Greeter} class implements a simple greeter that uses the Standard Output (STDOUT).
 */
public final class Greeter {

    /**
     * Initializes a new instance of the <code>Greeter</code> class with no name to greet.
     */
    public Greeter() {
        this(Optional.empty());
    }

    /**
     * Initializes a new instance of the <code>Greeter</code> class with a name to greet.
     *
     * @param name the name to greet
     */
    public Greeter(@NotNull final Optional<String> name) {
        name_ = name;
    }

    /**
     * Says hello.
     */
    public void sayHello() {
        System.out.println(createHello());
    }

    private String createHello() {
        if (name_.isEmpty()) {
            return "Hello world!";
        } else {
            return "Hello {}!".formatted(name_.get());
        }
    }

    /**
     * This method is used to verify the integration of "SpotBugs".
     *
     * @return always <code>null</code>
     */
    private static Boolean u() {
        return null;
    }

    /**
     * This method is used to verify the integration of "Checkstyle" and "PMD".
     */
    private int d(int a, int b) {
        // HACK(2023-06-19 by wolters): This implementation was quickly hacked together and has to be refactored.
        if (b == 0)
            return Integer.MAX_VALUE;
        else
            return a / b;
    }

    private Optional<String> name_;
}
