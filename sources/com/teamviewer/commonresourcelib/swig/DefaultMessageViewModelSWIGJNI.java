package com.teamviewer.commonresourcelib.swig;

/* JADX INFO: loaded from: classes.dex */
public class DefaultMessageViewModelSWIGJNI {
    public static final native long DefaultMessageViewModel_GetButtons(long j, DefaultMessageViewModel defaultMessageViewModel);

    public static final native String DefaultMessageViewModel_GetText(long j, DefaultMessageViewModel defaultMessageViewModel);

    public static final native String DefaultMessageViewModel_GetTitle(long j, DefaultMessageViewModel defaultMessageViewModel);

    public static final native void IDefaultMessageButtonVector_clear(long j, IDefaultMessageButtonVector iDefaultMessageButtonVector);

    public static final native void IDefaultMessageButtonVector_doAdd__SWIG_0(long j, IDefaultMessageButtonVector iDefaultMessageButtonVector, long j2, DefaultMessageButtonViewModel defaultMessageButtonViewModel);

    public static final native void IDefaultMessageButtonVector_doAdd__SWIG_1(long j, IDefaultMessageButtonVector iDefaultMessageButtonVector, int i, long j2, DefaultMessageButtonViewModel defaultMessageButtonViewModel);

    public static final native int IDefaultMessageButtonVector_doCapacity(long j, IDefaultMessageButtonVector iDefaultMessageButtonVector);

    public static final native long IDefaultMessageButtonVector_doGet(long j, IDefaultMessageButtonVector iDefaultMessageButtonVector, int i);

    public static final native long IDefaultMessageButtonVector_doRemove(long j, IDefaultMessageButtonVector iDefaultMessageButtonVector, int i);

    public static final native void IDefaultMessageButtonVector_doRemoveRange(long j, IDefaultMessageButtonVector iDefaultMessageButtonVector, int i, int i2);

    public static final native void IDefaultMessageButtonVector_doReserve(long j, IDefaultMessageButtonVector iDefaultMessageButtonVector, int i);

    public static final native long IDefaultMessageButtonVector_doSet(long j, IDefaultMessageButtonVector iDefaultMessageButtonVector, int i, long j2, DefaultMessageButtonViewModel defaultMessageButtonViewModel);

    public static final native int IDefaultMessageButtonVector_doSize(long j, IDefaultMessageButtonVector iDefaultMessageButtonVector);

    public static final native boolean IDefaultMessageButtonVector_isEmpty(long j, IDefaultMessageButtonVector iDefaultMessageButtonVector);

    public static final native void delete_DefaultMessageViewModel(long j);

    public static final native void delete_IDefaultMessageButtonVector(long j);

    public static final native long new_DefaultMessageViewModel(long j, DefaultMessageViewModel defaultMessageViewModel);

    public static final native long new_IDefaultMessageButtonVector__SWIG_0();

    public static final native long new_IDefaultMessageButtonVector__SWIG_1(long j, IDefaultMessageButtonVector iDefaultMessageButtonVector);

    public static final native long new_IDefaultMessageButtonVector__SWIG_2(int i, long j, DefaultMessageButtonViewModel defaultMessageButtonViewModel);
}
