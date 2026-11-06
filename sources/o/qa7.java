package o;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo/qa7;", "Ljava/io/IOException;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class qa7 extends IOException {
    public final tc2 m;

    public qa7(tc2 tc2Var) {
        super("stream was reset: " + tc2Var);
        this.m = tc2Var;
    }
}
