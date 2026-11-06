package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class j1 implements Iterator, su3 {
    public final /* synthetic */ byte m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f1120o;

    public j1(hc2 hc2Var) {
        this.m = (byte) 2;
        this.f1120o = hc2Var;
        this.n = hc2Var.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.m;
        Object obj = this.f1120o;
        switch (b) {
            case 0:
                return this.n < ((m1) obj).a();
            case 1:
                return this.n < ((Object[]) obj).length;
            case 2:
                return this.n > 0;
            case 3:
                return this.n < ((byte[]) obj).length;
            case 4:
                return this.n < ((int[]) obj).length;
            case 5:
                return this.n < ((long[]) obj).length;
            case 6:
                return this.n < ((short[]) obj).length;
            default:
                return this.n < ((ViewGroup) obj).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.m;
        Object obj = this.f1120o;
        switch (b) {
            case 0:
                if (!hasNext()) {
                    yq4.p();
                    return null;
                }
                int i = this.n;
                this.n = i + 1;
                return ((m1) obj).get(i);
            case 1:
                try {
                    int i2 = this.n;
                    this.n = i2 + 1;
                    return ((Object[]) obj)[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.n--;
                    an4.j(e.getMessage());
                    return null;
                }
            case 2:
                hc2 hc2Var = (hc2) obj;
                int i3 = hc2Var.c;
                int i4 = this.n;
                this.n = i4 - 1;
                return hc2Var.e[i3 - i4];
            case 3:
                int i5 = this.n;
                byte[] bArr = (byte[]) obj;
                if (i5 < bArr.length) {
                    this.n = i5 + 1;
                    return new m68(bArr[i5]);
                }
                an4.j(String.valueOf(i5));
                return null;
            case 4:
                int i6 = this.n;
                int[] iArr = (int[]) obj;
                if (i6 < iArr.length) {
                    this.n = i6 + 1;
                    return new u68(iArr[i6]);
                }
                an4.j(String.valueOf(i6));
                return null;
            case 5:
                int i7 = this.n;
                long[] jArr = (long[]) obj;
                if (i7 < jArr.length) {
                    this.n = i7 + 1;
                    return new z68(jArr[i7]);
                }
                an4.j(String.valueOf(i7));
                return null;
            case 6:
                int i8 = this.n;
                short[] sArr = (short[]) obj;
                if (i8 < sArr.length) {
                    this.n = i8 + 1;
                    return new g78(sArr[i8]);
                }
                an4.j(String.valueOf(i8));
                return null;
            default:
                int i9 = this.n;
                this.n = i9 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i9);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.f1120o;
                int i = this.n - 1;
                this.n = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public j1(Object[] objArr) {
        this.m = (byte) 1;
        objArr.getClass();
        this.f1120o = objArr;
    }

    public /* synthetic */ j1(Object obj, byte b) {
        this.m = b;
        this.f1120o = obj;
    }
}
