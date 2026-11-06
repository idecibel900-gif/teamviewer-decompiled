package coil3.compose;

import kotlin.Metadata;
import o.bd2;
import o.im3;
import o.sx;
import o.ud5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"coil3/compose/AsyncImagePainter$State$Error", "Lo/sx;", "Lo/ud5;", "painter", "Lo/ud5;", "a", "()Lo/ud5;", "io.coil-kt.coil3_coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsyncImagePainter$State$Error implements sx {
    public final bd2 a;
    private final ud5 painter;

    public AsyncImagePainter$State$Error(ud5 ud5Var, bd2 bd2Var) {
        this.painter = ud5Var;
        this.a = bd2Var;
    }

    @Override // o.sx
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ud5 getPainter() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImagePainter$State$Error)) {
            return false;
        }
        AsyncImagePainter$State$Error asyncImagePainter$State$Error = (AsyncImagePainter$State$Error) obj;
        return im3.n(this.painter, asyncImagePainter$State$Error.painter) && this.a.equals(asyncImagePainter$State$Error.a);
    }

    public final int hashCode() {
        ud5 ud5Var = this.painter;
        return this.a.hashCode() + ((ud5Var == null ? 0 : ud5Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.painter + ", result=" + this.a + ")";
    }
}
