package edu.haverford.cs.squirrelfactslec;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Iterator;

public class SquirrelList implements Iterable<Squirrel> {
    private Link mHead;

    public SquirrelList() {
        mHead = null;
    }

    public SquirrelList add(Squirrel s) {
        mHead = new Link(s, mHead);
        return this;
    }

    public Squirrel getFirst() {
        if (mHead == null) {
            return null;
        } else {
            return mHead.getData();
        }
    }

    public ArrayList<Squirrel> asArrayList() {
        ArrayList<Squirrel> al = new ArrayList<Squirrel>();
        Iterator<Squirrel> i = iterator();
        while (i.hasNext()) {
            al.add(i.next());
        }
        return al;
    }

    public int size() {
        Iterator<Squirrel> i = iterator();
        int n = 0;
        while (i.hasNext()) {
            n++;
            i.next();
        }
        return n;
    }

    /**
     * Get an iterator over the list of squirrel
     * @return An Iterator<Squirrel> over the collection.
     */
    @NonNull
    @Override
    public Iterator<Squirrel> iterator() {
        return new SquirrelIterator(mHead);
    }

    private class SquirrelIterator implements Iterator<Squirrel> {
        // The "current" index into the list
        private Link mCurr;

        SquirrelIterator(Link head) {
            mCurr = head;
        }

        @Override
        public boolean hasNext() {
            return mCurr != null;
        }

        /**
         * Get the next element of the collection, and advance the pointer
         *
         * Precondition: hasNext() returns true.
         * @return Reference to the next Squirrel in the collection, and advance the pointer.
         */
        @Override
        public Squirrel next() {
            Squirrel s = mCurr.getData();
            mCurr = mCurr.getNext();
            return s;
        }
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
