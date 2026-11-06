package com.teamviewer.teamviewerlib.swig.tvaccount;

/* JADX INFO: loaded from: classes.dex */
public class IAccountAndroidSWIGJNI {
    public static final native long IAccountAndroid_GetAccountID(long j, IAccountAndroid iAccountAndroid);

    public static final native String IAccountAndroid_GetAccountPictureUrl(long j, IAccountAndroid iAccountAndroid);

    public static final native long IAccountAndroid_GetCompanyID(long j, IAccountAndroid iAccountAndroid);

    public static final native String IAccountAndroid_GetDisplayName(long j, IAccountAndroid iAccountAndroid);

    public static final native String IAccountAndroid_GetEmail(long j, IAccountAndroid iAccountAndroid);

    public static final native boolean IAccountAndroid_IsLoggedIn(long j, IAccountAndroid iAccountAndroid);

    public static final native boolean IAccountAndroid_IsSessionCommentingEnabled(long j, IAccountAndroid iAccountAndroid);

    public static final native boolean IAccountAndroid_IsSessionLoggingEnabled(long j, IAccountAndroid iAccountAndroid);

    public static final native void delete_IAccountAndroid(long j);
}
