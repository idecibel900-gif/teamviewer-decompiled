package com.teamviewer.teamviewerlib.authentication;

import com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl;
import java.util.ArrayList;
import kotlin.Metadata;
import o.ak7;
import o.hk0;
import o.ze4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/teamviewer/teamviewerlib/authentication/AuthenticationMethodAdapterNew$Result", "", "", "authRetVal", "", "outCommandAddresses", "<init>", "(I[J)V", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AuthenticationMethodAdapterNew$Result {
    public final ArrayList a;

    public AuthenticationMethodAdapterNew$Result(int i, long[] jArr) {
        ze4.n.getClass();
        if (((ze4) ze4.f2693o.get(Integer.valueOf(i))) == null) {
            hk0.g("Invalid value.");
            throw null;
        }
        this.a = new ArrayList(1);
        if (jArr != null) {
            for (long j : jArr) {
                new BCommandNativeImpl(j);
                this.a.add(new ak7(j));
            }
        }
    }
}
