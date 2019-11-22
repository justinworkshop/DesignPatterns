package com.example.builder.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Orchestration
 * Author: wei.zheng
 * Date: 2019/11/22 21:10
 * Description: 舞蹈类
 */
public class Orchestration {

    protected String name;
    protected long duration;
    protected String type;
    protected String author;

    private Orchestration() {

    }

    public static class Builder {
        Orchestration orch;

        public Builder() {
            orch = new Orchestration();
        }

        public Builder setName(String name) {
            orch.name = name;
            return this;
        }

        public Builder setDuration(long duration) {
            orch.duration = duration;
            return this;
        }

        public Builder setType(String type) {
            orch.type = type;
            return this;
        }

        public Builder setAuthor(String author) {
            orch.author = author;
            return this;
        }

        public Orchestration build() {
            return orch;
        }

    }
}
