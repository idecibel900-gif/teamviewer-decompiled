package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lo/tq3;", "Lo/nq6;", "Lo/jq3;", "Lo/rq3;", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class tq3 extends nq6 {
    public final String m;

    public tq3(String str) {
        super(str);
        this.m = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.m;
    }
}
