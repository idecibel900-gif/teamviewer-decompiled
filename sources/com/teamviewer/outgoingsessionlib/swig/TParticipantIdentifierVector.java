package com.teamviewer.outgoingsessionlib.swig;

import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class TParticipantIdentifierVector extends AbstractList<ParticipantIdentifier> implements RandomAccess {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TParticipantIdentifierVector(Iterable<ParticipantIdentifier> iterable) {
        this();
        Iterator<ParticipantIdentifier> it = iterable.iterator();
        while (it.hasNext()) {
            doAdd(it.next());
        }
    }

    private void doAdd(int i, ParticipantIdentifier participantIdentifier) {
        ParticipantManagerSWIGJNI.TParticipantIdentifierVector_doAdd__SWIG_1(this.swigCPtr, this, i, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    private int doCapacity() {
        return ParticipantManagerSWIGJNI.TParticipantIdentifierVector_doCapacity(this.swigCPtr, this);
    }

    private ParticipantIdentifier doGet(int i) {
        return new ParticipantIdentifier(ParticipantManagerSWIGJNI.TParticipantIdentifierVector_doGet(this.swigCPtr, this, i), false);
    }

    private ParticipantIdentifier doRemove(int i) {
        return new ParticipantIdentifier(ParticipantManagerSWIGJNI.TParticipantIdentifierVector_doRemove(this.swigCPtr, this, i), true);
    }

    private void doRemoveRange(int i, int i2) {
        ParticipantManagerSWIGJNI.TParticipantIdentifierVector_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private void doReserve(int i) {
        ParticipantManagerSWIGJNI.TParticipantIdentifierVector_doReserve(this.swigCPtr, this, i);
    }

    private ParticipantIdentifier doSet(int i, ParticipantIdentifier participantIdentifier) {
        return new ParticipantIdentifier(ParticipantManagerSWIGJNI.TParticipantIdentifierVector_doSet(this.swigCPtr, this, i, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier), true);
    }

    private int doSize() {
        return ParticipantManagerSWIGJNI.TParticipantIdentifierVector_doSize(this.swigCPtr, this);
    }

    public static long getCPtr(TParticipantIdentifierVector tParticipantIdentifierVector) {
        if (tParticipantIdentifierVector == null) {
            return 0L;
        }
        return tParticipantIdentifierVector.swigCPtr;
    }

    public static long swigRelease(TParticipantIdentifierVector tParticipantIdentifierVector) {
        if (tParticipantIdentifierVector != null) {
            if (tParticipantIdentifierVector.swigCMemOwn) {
                long j = tParticipantIdentifierVector.swigCPtr;
                tParticipantIdentifierVector.swigCMemOwn = false;
                tParticipantIdentifierVector.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(ParticipantIdentifier participantIdentifier) {
        ((AbstractList) this).modCount++;
        doAdd(participantIdentifier);
        return true;
    }

    public int capacity() {
        return doCapacity();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ParticipantManagerSWIGJNI.TParticipantIdentifierVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ParticipantManagerSWIGJNI.delete_TParticipantIdentifierVector(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return ParticipantManagerSWIGJNI.TParticipantIdentifierVector_isEmpty(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ParticipantIdentifier remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public void reserve(int i) {
        doReserve(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    @Override // java.util.AbstractList, java.util.List
    public ParticipantIdentifier get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public ParticipantIdentifier set(int i, ParticipantIdentifier participantIdentifier) {
        return doSet(i, participantIdentifier);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, ParticipantIdentifier participantIdentifier) {
        ((AbstractList) this).modCount++;
        doAdd(i, participantIdentifier);
    }

    private void doAdd(ParticipantIdentifier participantIdentifier) {
        ParticipantManagerSWIGJNI.TParticipantIdentifierVector_doAdd__SWIG_0(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public TParticipantIdentifierVector(ParticipantIdentifier[] participantIdentifierArr) {
        this();
        doReserve(participantIdentifierArr.length);
        for (ParticipantIdentifier participantIdentifier : participantIdentifierArr) {
            doAdd(participantIdentifier);
        }
    }

    public TParticipantIdentifierVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public TParticipantIdentifierVector() {
        this(ParticipantManagerSWIGJNI.new_TParticipantIdentifierVector__SWIG_0(), true);
    }

    public TParticipantIdentifierVector(TParticipantIdentifierVector tParticipantIdentifierVector) {
        this(ParticipantManagerSWIGJNI.new_TParticipantIdentifierVector__SWIG_1(getCPtr(tParticipantIdentifierVector), tParticipantIdentifierVector), true);
    }

    public TParticipantIdentifierVector(int i, ParticipantIdentifier participantIdentifier) {
        this(ParticipantManagerSWIGJNI.new_TParticipantIdentifierVector__SWIG_2(i, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier), true);
    }
}
