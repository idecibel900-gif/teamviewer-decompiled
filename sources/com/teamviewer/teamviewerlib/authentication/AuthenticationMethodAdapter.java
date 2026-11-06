package com.teamviewer.teamviewerlib.authentication;

import com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl;
import java.util.ArrayList;
import kotlin.Metadata;
import o.ak7;
import o.hk0;
import o.ze4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/teamviewer/teamviewerlib/authentication/AuthenticationMethodAdapter;", "", "Result", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AuthenticationMethodAdapter {
    public static final /* synthetic */ int b = 0;
    public final long a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/teamviewer/teamviewerlib/authentication/AuthenticationMethodAdapter$Result;", "", "", "authRetVal", "", "outCommandAddresses", "", "continueWithNextMethod", "<init>", "(I[JZ)V", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Result {
        public final boolean a;
        public final ze4 b;
        public final ArrayList c;

        public Result(int i, long[] jArr, boolean z) {
            this.a = z;
            ze4.n.getClass();
            ze4 ze4Var = (ze4) ze4.f2693o.get(Integer.valueOf(i));
            if (ze4Var == null) {
                hk0.g("Invalid value.");
                throw null;
            }
            this.b = ze4Var;
            this.c = new ArrayList();
            if (jArr != null) {
                for (long j : jArr) {
                    new BCommandNativeImpl(j);
                    this.c.add(new ak7(j));
                }
            }
        }
    }

    static {
        jniInit();
    }

    public AuthenticationMethodAdapter(long j) {
        this.a = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long jniCreateByocActive(boolean z, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long jniCreatePublicKeyActive(long j, long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long jniCreateSRPActive(String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long jniCreateSRPActiveWithKeySwitch(String str, String str2, int i);

    private static final native void jniInit();

    private static final native void jniRelease(long j);

    private static final native Result nextStep(long j, long j2);

    public final Result e(BCommandNativeImpl bCommandNativeImpl) {
        return nextStep(this.a, bCommandNativeImpl != null ? bCommandNativeImpl.a : 0L);
    }

    public final void f() {
        jniRelease(this.a);
    }
}
