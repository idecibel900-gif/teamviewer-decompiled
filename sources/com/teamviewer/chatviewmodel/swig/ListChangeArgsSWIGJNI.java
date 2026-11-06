package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class ListChangeArgsSWIGJNI {
    public static final native int ListChangeArgs_GetListChangeType(long j, ListChangeArgs listChangeArgs);

    public static final native long ListChangeArgs_GetNewPositions(long j, ListChangeArgs listChangeArgs);

    public static final native long ListChangeArgs_GetOldPositions(long j, ListChangeArgs listChangeArgs);

    public static final native void SizeTVector_clear(long j, SizeTVector sizeTVector);

    public static final native void SizeTVector_doAdd__SWIG_0(long j, SizeTVector sizeTVector, long j2);

    public static final native void SizeTVector_doAdd__SWIG_1(long j, SizeTVector sizeTVector, int i, long j2);

    public static final native int SizeTVector_doCapacity(long j, SizeTVector sizeTVector);

    public static final native long SizeTVector_doGet(long j, SizeTVector sizeTVector, int i);

    public static final native long SizeTVector_doRemove(long j, SizeTVector sizeTVector, int i);

    public static final native void SizeTVector_doRemoveRange(long j, SizeTVector sizeTVector, int i, int i2);

    public static final native void SizeTVector_doReserve(long j, SizeTVector sizeTVector, int i);

    public static final native long SizeTVector_doSet(long j, SizeTVector sizeTVector, int i, long j2);

    public static final native int SizeTVector_doSize(long j, SizeTVector sizeTVector);

    public static final native boolean SizeTVector_isEmpty(long j, SizeTVector sizeTVector);

    public static final native void delete_ListChangeArgs(long j);

    public static final native void delete_SizeTVector(long j);

    public static final native long new_SizeTVector__SWIG_0();

    public static final native long new_SizeTVector__SWIG_1(long j, SizeTVector sizeTVector);

    public static final native long new_SizeTVector__SWIG_2(int i, long j);
}
