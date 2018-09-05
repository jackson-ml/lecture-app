package edu.haverford.cs.squirrelfactslec;

public class SquirrelList {
    private Link mHead;

    public SquirrelList() {
        mHead = null;
    }

    public SquirrelList add(Squirrel s) {
        mHead = new Link(s, mHead);
        return this;
    }

    public Squirrel getFirst() {
        return mHead.getData();
    }

    private class Link {
        private Squirrel mSquirrel;
        private Link mNext;

        public Link(Squirrel data, Link next) {
            mSquirrel = data;
            mNext = next;
        }

        public Squirrel getData() { return mSquirrel; }
        public Link getNext() { return mNext; }
    }
}
