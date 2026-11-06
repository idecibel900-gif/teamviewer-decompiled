package com.teamviewer.oneapinetworklib.swig;

/* JADX INFO: loaded from: classes.dex */
public class HttpHeadersSWIGJNI {
    public static final native String HttpHeaders_Iterator_getKey(long j, HttpHeaders.Iterator iterator);

    public static final native long HttpHeaders_Iterator_getNextUnchecked(long j, HttpHeaders.Iterator iterator);

    public static final native String HttpHeaders_Iterator_getValue(long j, HttpHeaders.Iterator iterator);

    public static final native boolean HttpHeaders_Iterator_isNot(long j, HttpHeaders.Iterator iterator, long j2, HttpHeaders.Iterator iterator2);

    public static final native void HttpHeaders_Iterator_setValue(long j, HttpHeaders.Iterator iterator, String str);

    public static final native long HttpHeaders_begin(long j, HttpHeaders httpHeaders);

    public static final native void HttpHeaders_clear(long j, HttpHeaders httpHeaders);

    public static final native boolean HttpHeaders_containsImpl(long j, HttpHeaders httpHeaders, String str);

    public static final native long HttpHeaders_end(long j, HttpHeaders httpHeaders);

    public static final native long HttpHeaders_find(long j, HttpHeaders httpHeaders, String str);

    public static final native boolean HttpHeaders_isEmpty(long j, HttpHeaders httpHeaders);

    public static final native void HttpHeaders_putUnchecked(long j, HttpHeaders httpHeaders, String str, String str2);

    public static final native void HttpHeaders_removeUnchecked(long j, HttpHeaders httpHeaders, long j2, HttpHeaders.Iterator iterator);

    public static final native int HttpHeaders_sizeImpl(long j, HttpHeaders httpHeaders);

    public static final native void delete_HttpHeaders(long j);

    public static final native void delete_HttpHeaders_Iterator(long j);

    public static final native long new_HttpHeaders__SWIG_0();

    public static final native long new_HttpHeaders__SWIG_1(long j, HttpHeaders httpHeaders);
}
