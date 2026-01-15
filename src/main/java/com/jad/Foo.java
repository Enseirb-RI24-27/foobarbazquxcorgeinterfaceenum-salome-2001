package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo implements IFoo {
    private IBaz baz;                            // <-baz : IBaz
    private List<IBar> bars; // <-bars : IBar[]
    private IQux qux;
    private ICorge corge;

    // +Foo(baz : IBaz)
    public Foo(IBaz baz) {
        this.baz = baz;
        this.qux = new Qux();
        this.bars = new ArrayList<>();
    }

    public void setCorge(ICorge corge) {
        this.corge = corge;
    }
    public IBaz getBaz() {
        return this.baz;
    }
    public List<IBar> getBars() {
        return this.bars;
    }
    public IQux getQux() {
        return this.qux;
    }
    public ICorge getCorge() {
        return this.corge;
    }
    public void addBar(IBar bar) {
        this.bars.add(bar);
    }
}

