package io.eenhoorn;
/*
 * Copyright 2025 eenhoorn.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


public class Backoff {


    private long stop;

    private long wait;

    private long block;

    private long timeLimit;

    private long waitRetry;

    public Backoff stop(long stop) {
        this.stop = stop;
        return this;
    }

    public Backoff waitLimit(long wait) {
        this.wait = wait;
        return this;
    }

    public Backoff block(long block) {
        this.block = block;
        return this;
    }

    public Backoff timeLimit(long timeLimit) {
        this.timeLimit = timeLimit;
        return this;
    }

    public Backoff waitRetry(long waitRetry) {
        this.waitRetry = waitRetry;
        return this;
    }

    private Backoff() {
    }

    public Backoff builder() {
        return new Backoff();
    }

}
