package com.dngeorgiev.iteration;

public class ReverseIterator implements Iterator {
    private final Iterator _iterator;

    public ReverseIterator(Iterator iterator) {
        assert iterator != null : "iterator can't be null.";
        _iterator = iterator;
    }

    @Override
    public void first() {
        _iterator.last();
    }

    @Override
    public void last() {
        _iterator.first();
    }

    @Override
    public boolean isDone() {
        return _iterator.isDone();
    }

    @Override
    public void next() {
        _iterator.previous();
    }

    @Override
    public void previous() {
        _iterator.next();
    }

    @Override
    public Object current() throws IteratorOutOfBoundsException {
        return _iterator.current();
    }
}
