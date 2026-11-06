package o;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class fh1 extends yz3 implements Function0 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vh1 f797o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh1(vh1 vh1Var, byte b) {
        super(0);
        this.n = b;
        this.f797o = vh1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() throws IOException {
        switch (this.n) {
            case 0:
                return ((rj2) this.f797o.j.getValue()).b;
            default:
                oj2 oj2Var = this.f797o.a;
                File canonicalFile = ((File) oj2Var.b.a()).getCanonicalFile();
                synchronized (oj2.d) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = oj2.c;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    absolutePath.getClass();
                    linkedHashSet.add(absolutePath);
                }
                return new rj2(canonicalFile, (o07) oj2Var.a.invoke(canonicalFile), new io.sentry.android.replay.a0(canonicalFile, (byte) 8));
        }
    }
}
