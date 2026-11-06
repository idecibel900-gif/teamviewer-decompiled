package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class lm4 implements Map.Entry, su3 {
    public final /* synthetic */ byte m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f1380o;

    public lm4(Object obj, Object obj2) {
        this.m = (byte) 2;
        obj.getClass();
        this.n = obj;
        obj2.getClass();
        this.f1380o = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.m) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && im3.n(entry.getKey(), this.n) && im3.n(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.m) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.n;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.m) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f1380o;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.m) {
            case 0:
                Object obj = this.n;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.m) {
            case 0:
                return this.n + "=" + getValue();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ lm4(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f1380o = obj2;
    }
}
