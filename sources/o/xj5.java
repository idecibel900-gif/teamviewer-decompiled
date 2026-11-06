package o;

/* JADX INFO: loaded from: classes.dex */
public final class xj5 extends bk5 {
    public yj5 s;

    @Override // o.bk5, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof zw5) {
            return super.containsKey((zw5) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof lb8) {
            return super.containsValue((lb8) obj);
        }
        return false;
    }

    @Override // o.bk5, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof zw5) {
            return (lb8) super.get((zw5) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof zw5) ? obj2 : (lb8) super.getOrDefault((zw5) obj, (lb8) obj2);
    }

    @Override // o.bk5
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final yj5 f() {
        s28 s28Var = this.f435o;
        yj5 yj5Var = this.s;
        if (s28Var != yj5Var.m) {
            this.n = new aw((byte) 27);
            yj5Var = new yj5(this.f435o, this.r);
        }
        this.s = yj5Var;
        return yj5Var;
    }

    @Override // o.bk5, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof zw5) {
            return (lb8) super.remove((zw5) obj);
        }
        return null;
    }
}
