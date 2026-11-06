package com.teamviewer.remotecontrollib.authentication;

import com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0083 ¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/teamviewer/remotecontrollib/authentication/LoginHelper;", "", "", "cmdPtr", "dyngateId", "", "sessionId", "", "service", "Lo/f88;", "jniAddLoginTokenToBCommand", "(JJILjava/lang/String;)V", "RemoteControlLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class LoginHelper {
    public static void a(BCommandNativeImpl bCommandNativeImpl, long j, int i, String str) {
        jniAddLoginTokenToBCommand(bCommandNativeImpl.a, j, i, str);
    }

    private static final native void jniAddLoginTokenToBCommand(long cmdPtr, long dyngateId, int sessionId, String service);
}
