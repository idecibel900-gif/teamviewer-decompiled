package com.teamviewer.corelib.logging;

import kotlin.Metadata;
import o.a65;
import o.fi7;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/teamviewer/corelib/logging/NativeLogger;", "", "CoreLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NativeLogger {
    public int a = 4;

    public NativeLogger(fi7 fi7Var, String str, String str2) {
        yq4 yq4Var = new yq4((byte) 3);
        a65 a65Var = new a65((byte) 13);
        a65Var.f302o = yq4Var;
        a65Var.H0(fi7Var, "logging");
        SetNativeLogOptions(false);
        InitNativeLogging(str, str2);
    }

    private static final native void InitNativeLogging(String str, String str2);

    private static final native void LogNative(int i, String str, String str2);

    private static final native void SetNativeLogLevel(int i);

    private static final native void SetNativeLogOptions(boolean z);

    public final void a(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        if (i >= this.a) {
            LogNative(i, str, str2);
        }
    }

    public final void b(int i) {
        this.a = i;
        SetNativeLogLevel(i);
    }
}
