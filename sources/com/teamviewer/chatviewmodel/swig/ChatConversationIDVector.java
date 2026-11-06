package com.teamviewer.chatviewmodel.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class ChatConversationIDVector extends AbstractList<ChatConversationID> implements RandomAccess {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ChatConversationIDVector(Iterable<ChatConversationID> iterable) {
        this();
        Iterator<ChatConversationID> it = iterable.iterator();
        while (it.hasNext()) {
            doAdd(it.next());
        }
    }

    private void doAdd(int i, ChatConversationID chatConversationID) {
        IConversationListUIModelSWIGJNI.ChatConversationIDVector_doAdd__SWIG_1(this.swigCPtr, this, i, ChatConversationID.getCPtr(chatConversationID), chatConversationID);
    }

    private int doCapacity() {
        return IConversationListUIModelSWIGJNI.ChatConversationIDVector_doCapacity(this.swigCPtr, this);
    }

    private ChatConversationID doGet(int i) {
        return new ChatConversationID(IConversationListUIModelSWIGJNI.ChatConversationIDVector_doGet(this.swigCPtr, this, i), false);
    }

    private ChatConversationID doRemove(int i) {
        return new ChatConversationID(IConversationListUIModelSWIGJNI.ChatConversationIDVector_doRemove(this.swigCPtr, this, i), true);
    }

    private void doRemoveRange(int i, int i2) {
        IConversationListUIModelSWIGJNI.ChatConversationIDVector_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private void doReserve(int i) {
        IConversationListUIModelSWIGJNI.ChatConversationIDVector_doReserve(this.swigCPtr, this, i);
    }

    private ChatConversationID doSet(int i, ChatConversationID chatConversationID) {
        return new ChatConversationID(IConversationListUIModelSWIGJNI.ChatConversationIDVector_doSet(this.swigCPtr, this, i, ChatConversationID.getCPtr(chatConversationID), chatConversationID), true);
    }

    private int doSize() {
        return IConversationListUIModelSWIGJNI.ChatConversationIDVector_doSize(this.swigCPtr, this);
    }

    public static long getCPtr(ChatConversationIDVector chatConversationIDVector) {
        if (chatConversationIDVector == null) {
            return 0L;
        }
        return chatConversationIDVector.swigCPtr;
    }

    public static long swigRelease(ChatConversationIDVector chatConversationIDVector) {
        if (chatConversationIDVector != null) {
            if (chatConversationIDVector.swigCMemOwn) {
                long j = chatConversationIDVector.swigCPtr;
                chatConversationIDVector.swigCMemOwn = false;
                chatConversationIDVector.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(ChatConversationID chatConversationID) {
        ((AbstractList) this).modCount++;
        doAdd(chatConversationID);
        return true;
    }

    public int capacity() {
        return doCapacity();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        IConversationListUIModelSWIGJNI.ChatConversationIDVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IConversationListUIModelSWIGJNI.delete_ChatConversationIDVector(j);
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
        return IConversationListUIModelSWIGJNI.ChatConversationIDVector_isEmpty(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ChatConversationID remove(int i) {
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
    public ChatConversationID get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public ChatConversationID set(int i, ChatConversationID chatConversationID) {
        return doSet(i, chatConversationID);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, ChatConversationID chatConversationID) {
        ((AbstractList) this).modCount++;
        doAdd(i, chatConversationID);
    }

    private void doAdd(ChatConversationID chatConversationID) {
        IConversationListUIModelSWIGJNI.ChatConversationIDVector_doAdd__SWIG_0(this.swigCPtr, this, ChatConversationID.getCPtr(chatConversationID), chatConversationID);
    }

    public ChatConversationIDVector(ChatConversationID[] chatConversationIDArr) {
        this();
        doReserve(chatConversationIDArr.length);
        for (ChatConversationID chatConversationID : chatConversationIDArr) {
            doAdd(chatConversationID);
        }
    }

    public ChatConversationIDVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public ChatConversationIDVector() {
        this(IConversationListUIModelSWIGJNI.new_ChatConversationIDVector__SWIG_0(), true);
    }

    public ChatConversationIDVector(ChatConversationIDVector chatConversationIDVector) {
        this(IConversationListUIModelSWIGJNI.new_ChatConversationIDVector__SWIG_1(getCPtr(chatConversationIDVector), chatConversationIDVector), true);
    }

    public ChatConversationIDVector(int i, ChatConversationID chatConversationID) {
        this(IConversationListUIModelSWIGJNI.new_ChatConversationIDVector__SWIG_2(i, ChatConversationID.getCPtr(chatConversationID), chatConversationID), true);
    }
}
