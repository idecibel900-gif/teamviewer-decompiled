package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ew7 extends fw7 {
    @Override // o.fw7, o.sj5
    /* JADX INFO: renamed from: n */
    public final fw7 f() {
        super.f();
        this.g = null;
        return this;
    }

    public final String toString() {
        String str = this.f ? "/>" : ">";
        ly lyVar = this.g;
        if (lyVar == null || lyVar.size() <= 0) {
            return "<" + o() + str;
        }
        return "<" + o() + " " + this.g.toString() + str;
    }
}
